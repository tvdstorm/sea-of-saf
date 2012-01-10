ANTLR=../lib/antlr-3.4-complete.jar


all: SAF

SAF: SAF.java SAFLexer.java SAFParser.java
	javac -cp .:$(ANTLR) SAF.java SAFLexer.java SAFParser.java

%Lexer.java %Parser.java: SAF.g
	java -jar $(ANTLR) $*.g

clean:
	rm -rf *.class *~ *.tokens SAFLexer.java SAFParser.java
