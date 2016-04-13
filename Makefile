ANTLR = lib/antlr-4.5.2-complete.jar
JASMIN = lib/jasmin.jar
CP = -cp .:$(ANTLR)

all : g4 classes test

g4:
	java -jar $(ANTLR) -no-visitor -no-listener *.g4

classes:
	javac $(CP) *.java

test:
	java $(CP) Main < sample.src > sample.j
	java -jar $(JASMIN) sample.j
	java MyApp

clean:
	rm -f Simple*.java *.tokens *.class *.j
