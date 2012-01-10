$ANTLR=../lib/antlr-3.4-complete.jar

all: SAF

SAF: SAF.java SAF.g
	javac -cp .:$(ANTLR) SAF.java

grammar: SAF.g
	java -jar $(ANTLR) SAF.g
	javac -cp $(ANTLR) SAFLexer.java SAFParser.java

clean:
	rm -rf *.class *~ *.tokens