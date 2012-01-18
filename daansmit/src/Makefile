ANTLR=../lib/antlr-3.4-complete.jar


all: Main.class

Main.class: Main.java SAFLexer.java SAFParser.java SAFChecker.java
	javac -cp .:$(ANTLR) Main.java SAFLexer.java SAFParser.java SAFChecker.java

%Lexer.java %Parser.java: SAF.g SAFTree.class
	java -jar $(ANTLR) $*.g

SAFChecker.java: SAFChecker.g SAFException.class
	java -jar $(ANTLR) SAFChecker.g

%Tree.class %Exception.class: SAF.java
	javac -cp .:$(ANTLR) $*.java


clean:
	rm -rf *.class *~ *.tokens *.dot *.pdf SAFLexer.java SAFParser.java SAFChecker.java
