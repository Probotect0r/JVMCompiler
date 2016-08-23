# JVMCompiler

This is a compiler that compiles source code into bytecode for the Java Virtual Machine. It uses the [ANTLR](http://www.antlr.org/) parser library
and the [jasmin assembler](http://jasmin.sourceforge.net/) to convert source code for a fictional language into code for the JVM.

### Language Syntax
Following are some of the examples of the simple syntax of the language.

#### Variable declaration
`let x = 50`
`let y = 3`

#### Math expressions
`let c = x + y`
`let c = x - y`
`let c = x * y`
`let c = x / y`
You can use numbers or variables when doing math.

#### Printing
`let i = 9`
`let d = 3`
`print(i)`
`print(i, d)`
`print(5)`
Prints to the console.

#### Repeat statements
```
let a = 0
repeat 10 {
  let a = a + 1
  print(a)
  print(a + 10)
}
```
