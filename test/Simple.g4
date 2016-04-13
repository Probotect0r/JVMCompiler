grammar Simple;

@members {
    SymbolTable sym = new SymbolTable();
    public void printCode(Code c) {
        System.out.println(".class public MyApp");
        System.out.println(".super java/lang/Object");
        System.out.println(".method public <init>()V");
        System.out.println("aload_0");
        System.out.println("invokenonvirtual java/lang/Object/<init>()V");
        System.out.println("return");
        System.out.println(".end method");

        System.out.println(".method public static main([Ljava/lang/String;)V");
        System.out.println(".limit stack 10");
        System.out.println(".limit locals 10");

        for(String i : c) {
            System.out.println(i);
        }

        System.out.println("return");
        System.out.println(".end method");
    }
}

start
    : program { printCode($program.code); }
    ;

program returns [Code code]
    @init {
        $code = new Code();
    }
    : block { $code.extend($block.code); }
    ;

block returns [Code code]
    @init { $code = new Code(); }
    : (
        stmt { $code.extend($stmt.code); }
      )+
    ;

stmt returns [Code code]
    : assignStmt { $code = $assignStmt.code; }
    | printStmt  { $code = $printStmt.code; }
    | repeatStmt { $code = $repeatStmt.code; }
    ;

assignStmt returns [Code code]
    : 'let' ID '=' expr
      { int register = sym.resolve($ID.text, true);
        $code = new Code()
                    .extend($expr.code)
                    .append(I.ISTORE(register));

      }
    ;

printStmt returns [Code code]
    @init { $code = new Code(); }
    : 'print' '(' ((e1=expr {
                         $code.append(I.GetPrintStream());
                         $code.extend($e1.code);
                         $code.append(I.invokePrintln());
                         }) ',')*
                    e2=expr {
                         $code.append(I.GetPrintStream());
                         $code.extend($e2.code);
                         $code.append(I.invokePrintln());
                         } ')'
    ;

repeatStmt returns [Code code]
    : 'repeat' expr '{' block '}'
      {
        String counter = Code.newCounter();
        String repnum = Code.newCounter();
        int countreg = sym.resolve(counter, true);
        int repreg = sym.resolve(repnum, true);
        String start = Code.newLabel();
        String end = Code.newLabel();
        $code = new Code()
                    .extend($expr.code)
                    .append(I.ISTORE(repreg))
                    .append(I.LDC("0"))
                    .append(I.ISTORE(countreg))
                    .append(I.Label(start))
                    .append(I.ILOAD(repreg))
                    .append(I.ILOAD(countreg))
                    .append(I.ISUB())
                    .append(I.IFZERO(end))
                    .append(I.INC(countreg, 1))
                    .extend($block.code)
                    .append(I.GOTO(start))
                    .append(I.Label(end));

      }
    ;

exprList returns [Code code]
  @init { $code = new Code(); }
  : ((e1=expr { $code.extend($e1.code); }) ',')* (e2=expr { $code.extend($e2.code); })
  ;

expr returns [Code code]
    : ID    {  int register = sym.resolve($ID.text, false);
                $code = new Code();
                if(register < 0)
                    $code.append(I.LDC(0));
                else
                    $code.append(I.ILOAD(register));
            }
    | Num   {   $code = new Code().append(I.LDC($Num.text));
            }
    | '(' e1=expr {
                $code = $e1.code;
            } ')'
    | e1=expr OP e2=expr
            {
                $code = new Code()
                            .extend($e1.code)
                            .extend($e2.code)
                            .append(I.Op($OP.text));
            }
    ;

Num : [0-9]+;
ID  : [a-z]+;
OP  : '+' | '-' | '*' | '/';
WS  : [ \t\r\n]+ {skip();};
