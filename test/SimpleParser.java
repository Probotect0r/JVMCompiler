// Generated from Simple.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Num=10, ID=11, OP=12, WS=13;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_block = 2, RULE_stmt = 3, RULE_assignStmt = 4, 
		RULE_printStmt = 5, RULE_repeatStmt = 6, RULE_exprList = 7, RULE_expr = 8;
	public static final String[] ruleNames = {
		"start", "program", "block", "stmt", "assignStmt", "printStmt", "repeatStmt", 
		"exprList", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'let'", "'='", "'print'", "'('", "')'", "'repeat'", "'{'", "'}'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "Num", "ID", 
		"OP", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program;
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			((StartContext)_localctx).program = program();
			 printCode(((StartContext)_localctx).program.code); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public Code code;
		public BlockContext block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);

		        ((ProgramContext)_localctx).code =  new Code();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			((ProgramContext)_localctx).block = block();
			 _localctx.code.extend(((ProgramContext)_localctx).block.code); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Code code;
		public StmtContext stmt;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		 ((BlockContext)_localctx).code =  new Code(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				((BlockContext)_localctx).stmt = stmt();
				 _localctx.code.extend(((BlockContext)_localctx).stmt.code); 
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Code code;
		public AssignStmtContext assignStmt;
		public PrintStmtContext printStmt;
		public RepeatStmtContext repeatStmt;
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public RepeatStmtContext repeatStmt() {
			return getRuleContext(RepeatStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(40);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				((StmtContext)_localctx).assignStmt = assignStmt();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).assignStmt.code; 
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				((StmtContext)_localctx).printStmt = printStmt();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).printStmt.code; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				((StmtContext)_localctx).repeatStmt = repeatStmt();
				 ((StmtContext)_localctx).code =  ((StmtContext)_localctx).repeatStmt.code; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStmtContext extends ParserRuleContext {
		public Code code;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			((AssignStmtContext)_localctx).ID = match(ID);
			setState(44);
			match(T__1);
			setState(45);
			((AssignStmtContext)_localctx).expr = expr(0);
			 int register = sym.resolve((((AssignStmtContext)_localctx).ID!=null?((AssignStmtContext)_localctx).ID.getText():null), true);
			        ((AssignStmtContext)_localctx).code =  new Code()
			                    .extend(((AssignStmtContext)_localctx).expr.code)
			                    .append(I.ISTORE(register));

			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public Code code;
		public ExprListContext exprList;
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printStmt);
		 ((PrintStmtContext)_localctx).code =  new Code(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__2);
			setState(49);
			match(T__3);
			{
			setState(50);
			((PrintStmtContext)_localctx).exprList = exprList();

			                              _localctx.code.append(I.GetPrintStream());
			                              _localctx.code.extend(((PrintStmtContext)_localctx).exprList.code);
			                              _localctx.code.append(I.invokePrintln());


			                              
			}
			setState(53);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatStmtContext extends ParserRuleContext {
		public Code code;
		public ExprContext expr;
		public BlockContext block;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RepeatStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStmt; }
	}

	public final RepeatStmtContext repeatStmt() throws RecognitionException {
		RepeatStmtContext _localctx = new RepeatStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeatStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__5);
			setState(56);
			((RepeatStmtContext)_localctx).expr = expr(0);
			setState(57);
			match(T__6);
			setState(58);
			((RepeatStmtContext)_localctx).block = block();
			setState(59);
			match(T__7);

			        String counter = Code.newCounter();
			        String repnum = Code.newCounter();
			        int countreg = sym.resolve(counter, true);
			        int repreg = sym.resolve(repnum, true);
			        String start = Code.newLabel();
			        String end = Code.newLabel();
			        ((RepeatStmtContext)_localctx).code =  new Code()
			                    .extend(((RepeatStmtContext)_localctx).expr.code)
			                    .append(I.ISTORE(repreg))
			                    .append(I.LDC("0"))
			                    .append(I.ISTORE(countreg))
			                    .append(I.Label(start))
			                    .append(I.ILOAD(repreg))
			                    .append(I.ILOAD(countreg))
			                    .append(I.ISUB())
			                    .append(I.IFZERO(end))
			                    .append(I.IINC(countreg, 1))
			                    .extend(((RepeatStmtContext)_localctx).block.code)
			                    .append(I.GOTO(start))
			                    .append(I.Label(end));

			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public Code code;
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprList);
		 ((ExprListContext)_localctx).code =  new Code(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(62);
					((ExprListContext)_localctx).e1 = expr(0);
					 _localctx.code.extend(((ExprListContext)_localctx).e1.code); 
					}
					setState(65);
					match(T__8);
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			{
			setState(72);
			((ExprListContext)_localctx).e2 = expr(0);
			 _localctx.code.extend(((ExprListContext)_localctx).e2.code); 
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Code code;
		public ExprContext e1;
		public Token ID;
		public Token Num;
		public Token OP;
		public ExprContext e2;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode Num() { return getToken(SimpleParser.Num, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP() { return getToken(SimpleParser.OP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(76);
				((ExprContext)_localctx).ID = match(ID);
				  int register = sym.resolve((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), false);
				                ((ExprContext)_localctx).code =  new Code();
				                if(register < 0)
				                    _localctx.code.append(I.LDC(0));
				                else
				                    _localctx.code.append(I.ILOAD(register));
				            
				}
				break;
			case Num:
				{
				setState(78);
				((ExprContext)_localctx).Num = match(Num);
				   ((ExprContext)_localctx).code =  new Code().append(I.LDC((((ExprContext)_localctx).Num!=null?((ExprContext)_localctx).Num.getText():null)));
				            
				}
				break;
			case T__3:
				{
				setState(80);
				match(T__3);
				setState(81);
				((ExprContext)_localctx).e1 = expr(0);

				                ((ExprContext)_localctx).code =  ((ExprContext)_localctx).e1.code;
				            
				setState(83);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.e1 = _prevctx;
					_localctx.e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(87);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(88);
					((ExprContext)_localctx).OP = match(OP);
					setState(89);
					((ExprContext)_localctx).e2 = expr(2);

					                          ((ExprContext)_localctx).code =  new Code()
					                                      .extend(((ExprContext)_localctx).e1.code)
					                                      .extend(((ExprContext)_localctx).e2.code)
					                                      .append(I.Op((((ExprContext)_localctx).OP!=null?((ExprContext)_localctx).OP.getText():null)));
					                      
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17d\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\6\4\36\n\4\r\4\16\4\37\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5+\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7\tF\n\t\f\t\16"+
		"\tI\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nX\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\n\2\3\22\13\2\4\6\b\n\f"+
		"\16\20\22\2\2a\2\24\3\2\2\2\4\27\3\2\2\2\6\35\3\2\2\2\b*\3\2\2\2\n,\3"+
		"\2\2\2\f\62\3\2\2\2\169\3\2\2\2\20G\3\2\2\2\22W\3\2\2\2\24\25\5\4\3\2"+
		"\25\26\b\2\1\2\26\3\3\2\2\2\27\30\5\6\4\2\30\31\b\3\1\2\31\5\3\2\2\2\32"+
		"\33\5\b\5\2\33\34\b\4\1\2\34\36\3\2\2\2\35\32\3\2\2\2\36\37\3\2\2\2\37"+
		"\35\3\2\2\2\37 \3\2\2\2 \7\3\2\2\2!\"\5\n\6\2\"#\b\5\1\2#+\3\2\2\2$%\5"+
		"\f\7\2%&\b\5\1\2&+\3\2\2\2\'(\5\16\b\2()\b\5\1\2)+\3\2\2\2*!\3\2\2\2*"+
		"$\3\2\2\2*\'\3\2\2\2+\t\3\2\2\2,-\7\3\2\2-.\7\r\2\2./\7\4\2\2/\60\5\22"+
		"\n\2\60\61\b\6\1\2\61\13\3\2\2\2\62\63\7\5\2\2\63\64\7\6\2\2\64\65\5\20"+
		"\t\2\65\66\b\7\1\2\66\67\3\2\2\2\678\7\7\2\28\r\3\2\2\29:\7\b\2\2:;\5"+
		"\22\n\2;<\7\t\2\2<=\5\6\4\2=>\7\n\2\2>?\b\b\1\2?\17\3\2\2\2@A\5\22\n\2"+
		"AB\b\t\1\2BC\3\2\2\2CD\7\13\2\2DF\3\2\2\2E@\3\2\2\2FI\3\2\2\2GE\3\2\2"+
		"\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5\22\n\2KL\b\t\1\2L\21\3\2\2\2MN\b"+
		"\n\1\2NO\7\r\2\2OX\b\n\1\2PQ\7\f\2\2QX\b\n\1\2RS\7\6\2\2ST\5\22\n\2TU"+
		"\b\n\1\2UV\7\7\2\2VX\3\2\2\2WM\3\2\2\2WP\3\2\2\2WR\3\2\2\2X`\3\2\2\2Y"+
		"Z\f\3\2\2Z[\7\16\2\2[\\\5\22\n\4\\]\b\n\1\2]_\3\2\2\2^Y\3\2\2\2_b\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2a\23\3\2\2\2b`\3\2\2\2\7\37*GW`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}