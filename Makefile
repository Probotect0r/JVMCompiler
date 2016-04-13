ANTLR = ./lib/antlr-4.5.2-complete.jar
JASMIN = ./lib/jasmin.jar
CP = $(ANTLR):$(JASMIN):.

all:
	java -jar $(ANTLR) -no-listener -no-visitor *.g4
	javac -cp $(CP) *.java

run:
	java -cp $(CP) Main < sample.src > sample.j
	java -jar $(JASMIN) sample.j
	java -cp . MyApp

clean:
	rm -f Simple*.java *.tokens *.class *.j
