VERSION_NUMBER  = 0.2
GRAMMAR         = src/SAF.g
SOURCES         = src/Main.java src/SafTreeClasses.java src/SafFighter.java src/SafArena.java build/SAFParser.java build/SAFLexer.java
TARGETS         = build/*

ANTLR_LIB       = lib/antlrworks-1.4.3.jar
TESTNG_LIB      = lib/testng-6.3.1.jar

JCC             = javac -d build
JFLAGS          = -g -cp .:$(ANTLR_LIB)
ANTLR           = java -cp .:$(ANTLR_LIB) org.antlr.Tool -fo build

RM              = rm -f

all: grammar parser

grammar: $(GRAMMAR)
	java -cp .:$(ANTLR_LIB) org.antlr.Tool -fo build $(GRAMMAR)

parser: $(SOURCES)
	$(JCC) $(JFLAGS) $(SOURCES)

clean: $(OBJECTS)
	$(RM) $(TARGETS)

