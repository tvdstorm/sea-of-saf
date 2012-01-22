VERSION_NUMBER  = 0.2

GRAMMAR         = src/SAF.g
SOURCES         = src/Main.java src/SafTreeClasses.java src/SafFighter.java src/SafArena.java build/SAFParser.java build/SAFLexer.java
TESTS           = tests/ParseTest.java

ANTLR_LIB       = lib/antlrworks-1.4.3.jar
TESTNG_LIB      = lib/junit-4.10.jar

.PHONY: tests

all: grammar parser tests

grammar: $(GRAMMAR)
	java -cp .:$(ANTLR_LIB) org.antlr.Tool -fo build $(GRAMMAR)

parser: $(SOURCES)
	javac -g -cp .:$(ANTLR_LIB) -d build $(SOURCES)

tests: $(TESTS)
	javac -g -cp .:build:$(ANTLR_LIB):$(TESTNG_LIB) $(TESTS)

clean: $(OBJECTS)
	rm -f build/*

