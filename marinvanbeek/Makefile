JC                  = javac
JC_FLAGS            = -g -Xlint -d build

SYNTAX_SOURCES      = src/saf/syntax/*.java
SYNTAX_CLASSES      = $(subst src,build,$(SYNTAX_SOURCES:.java=.class))

DATA_SOURCES        = src/saf/data/*.java
DATA_CLASSES        = $(subst src,build,$(DATA_SOURCES:.java=.class))

SIMULATION_SOURCES  = src/saf/simulation/*.java
SIMULATION_CLASSES  = $(subst src,build,$(SIMULATION_SOURCES:.java=.class))

ANIMATION_SOURCES   = src/saf/animation/*.java
ANIMATION_CLASSES   = $(subst src,build,$(ANIMATION_SOURCES:.java=.class))

TEST_SOURCES        = $(wildcard src/tests/*.java)
TEST_CLASSES        = $(subst src/tests,build,$(TEST_SOURCES:.java=.class))

GRAMMAR             = src/SAF.g
GRAMMAR_OUTPUT      = build/SAFParser.java build/SAFLexer.java
PARSER_SOURCES      = src/Syntax.java $(GRAMMAR_OUTPUT)
SIM_SRC             = src/data/*.java src/simulation/*.java src/animation/*.java
TESTS               = src/tests/*.java

ANTLR_LIB           = lib/antlrworks-1.4.3.jar
JUNIT_LIB           = lib/junit-4.10.jar

A                   = AnimationTest

all: grammar parser data simulation animation tests

grammar: $(GRAMMAR_OUTPUT)

parser: grammar $(PARSER_SOURCES)
	javac -g -cp $(ANTLR_LIB) -d build $(PARSER_SOURCES)

data: $(DATA_CLASSES)
syntax: data $(SYNTAX_CLASSES)
simulation: data $(SIMULATION_CLASSES) 
animation: simulation data $(ANIMATION_CLASSES) 
tests: parser data simulation animation $(TEST_CLASSES) 

    
check: tests
	java -cp tests:build:$(ANTLR_LIB):$(JUNIT_LIB) org.junit.runner.JUnitCore ParseTest FightTest AnimationTest

a_check: all
	java -cp tests:build:$(ANTLR_LIB):$(JUNIT_LIB) org.junit.runner.JUnitCore $(A)


$(GRAMMAR_OUTPUT): $(GRAMMAR)
	java -cp $(ANTLR_LIB) org.antlr.Tool -fo build $(GRAMMAR)

$(DATA_CLASSES): $(DATA_SOURCES)
	$(JC) $(JC_FLAGS) -cp .:build $(DATA_SOURCES)

$(SYNTAX_CLASSES): $(SYNTAX_SOURCES)
	$(JC) $(JC_FLAGS) -cp .:build $(SYNTAX_SOURCES)

$(TEST_CLASSES): $(TEST_SOURCES)
	$(JC) $(JC_FLAGS) -cp build:$(ANTLR_LIB):$(JUNIT_LIB) $(TEST_SOURCES)

$(ANIMATION_CLASSES): $(ANIMATION_SOURCES)
	$(JC) $(JC_FLAGS) -cp .:build $(ANIMATION_SOURCES)

$(SIMULATION_CLASSES): $(SIMULATION_SOURCES)
	$(JC) $(JC_FLAGS) -cp .:build $(SIMULATION_SOURCES)


clean:
	rm -rf build/*

