VERSION_NUMBER  = 0.2

GRAMMAR         = src/SAF.g
SOURCES         = src/Syntax.java src/Arena.java build/SAFParser.java build/SAFLexer.java
SIM_SRC         = src/data/*.java src/simulation/*.java
TESTS           = tests/ParseTest.java tests/FightTest.java

ANTLR_LIB       = lib/antlrworks-1.4.3.jar
TESTNG_LIB      = lib/junit-4.10.jar

.PHONY: junit_tests

all: grammar parser junit_tests check

grammar: $(GRAMMAR)
	java -cp $(ANTLR_LIB) org.antlr.Tool -fo build $(GRAMMAR)

parser: $(SOURCES)
	javac -g -cp $(ANTLR_LIB) -d build $(SOURCES)

simulation: $(SIM_SRC)
	javac -g -cp .:build -d build $(SIM_SRC)

junit_tests: $(TESTS)
	javac -g -cp build:$(ANTLR_LIB):$(TESTNG_LIB) $(TESTS)

check: junit_tests
	java -cp tests:build:$(ANTLR_LIB):$(TESTNG_LIB) org.junit.runner.JUnitCore ParseTest

fight_test: $(TESTS)
	java -cp tests:build:$(ANTLR_LIB):$(TESTNG_LIB) org.junit.runner.JUnitCore FightTest

clean: $(OBJECTS)
	rm -f build/*

