ANTLR=../lib/antlr-3.4-complete.jar


all: SAF.class

SAF.class: SAF.java SAFLexer.java SAFParser.java
	javac -cp .:$(ANTLR) SAF.java SAFLexer.java SAFParser.java

%Lexer.java %Parser.java: SAF.g SAFClasses.class
	java -jar $(ANTLR) $*.g

SAFClasses.class: SAFClasses.java
	javac -cp .:$(ANTLR) SAFClasses.java


clean:
	rm -rf *.class *~ *.tokens SAFLexer.java SAFParser.java
