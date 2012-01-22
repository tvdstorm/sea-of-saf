ANTLR=../lib/antlr-3.4-complete.jar
JUNIT=../lib/junit-4.10.jar



all: Main.class

Main.class: Main.java SAFLexer.java SAFParser.java SAFChecker.java
	javac -cp .:$(ANTLR) SAFLexer.java SAFParser.java SAFChecker.java Main.java

%Lexer.java %Parser.java: SAF.g SAFTree.class
	java -cp .:$(ANTLR) org.antlr.Tool $*.g

SAFChecker.java: SAFChecker.g SAFException.class
	java -cp .:$(ANTLR) org.antlr.Tool SAFChecker.g

%Tree.class %Exception.class: SAF.java
	javac -cp .:$(ANTLR) $*.java

clean:
	rm -rf *.class *~ *.tokens *.dot *.pdf SAFLexer.java SAFParser.java SAFChecker.java

test: SAFTest.java
	javac -cp .:$(ANTLR):$(JUNIT) SAFTest.java
