JC                  = javac
JC_FLAGS            = -Xlint -d build
CLASSPATH           = -cp build

DATA_SOURCES        = src/saf/data/*.java
DATA_CLASSES        = $(subst src,build,$(DATA_SOURCES:.java=.class))

GRAMMAR             = src/saf/parser/SAF.g
GRAMMAR_BUILD_DIR   = build/grammar
GRAMMAR_OUTPUT      = $(GRAMMAR_BUILD_DIR)/*.java

PARSER_SOURCES      = $(GRAMMAR_OUTPUT)
PARSER_CLASSES      = build/saf/parser/*.class

SYNTAX_SOURCES      = src/saf/syntax/*.java
SYNTAX_CLASSES      = $(subst src,build,$(SYNTAX_SOURCES:.java=.class))

SIMULATION_SOURCES  = src/saf/simulation/*.java
SIMULATION_CLASSES  = $(subst src,build,$(SIMULATION_SOURCES:.java=.class))

ANIMATION_SOURCES   = src/saf/animation/*.java
ANIMATION_CLASSES   = $(subst src,build,$(ANIMATION_SOURCES:.java=.class))

TEST_SOURCES        = src/tests/*.java
TEST_CLASSES        = $(subst src/tests,build,$(TEST_SOURCES:.java=.class))
TEST_NAMES          = ParseTest SimulationTest AnimationTest \
                      IntegrationAllTest IntegrationSimulationAnimationTest
TEST                = IntegrationSimulationAnimationTest

ANTLR_LIB           = lib/antlrworks-1.4.3.jar
JUNIT_LIB           = lib/junit-4.10.jar

all: $(DATA_CLASSES) $(GRAMMAR_OUTPUT) $(SYNTAX_CLASSES) $(PARSER_CLASSES) \
     $(SIMULATION_CLASSES) $(ANIMATION_CLASSES) $(TEST_CLASSES)
    
check: all
	java -cp build:$(ANTLR_LIB):$(JUNIT_LIB) org.junit.runner.JUnitCore \
    $(TEST_NAMES)

single_check: all
	java -cp build:$(ANTLR_LIB):$(JUNIT_LIB) org.junit.runner.JUnitCore $(TEST)

clean:
	rm -rf build/*


$(DATA_CLASSES): $(DATA_SOURCES)
	$(JC) $(JC_FLAGS) $(CLASSPATH) $(DATA_SOURCES)

$(GRAMMAR_OUTPUT): $(GRAMMAR)
	java $(CLASSPATH):$(ANTLR_LIB) org.antlr.Tool -fo $(GRAMMAR_BUILD_DIR) $(GRAMMAR)

$(PARSER_CLASSES): $(PARSER_SOURCES)
	$(JC) -d build $(CLASSPATH):$(ANTLR_LIB) $(PARSER_SOURCES)

$(SYNTAX_CLASSES): $(SYNTAX_SOURCES)
	$(JC) $(JC_FLAGS) $(CLASSPATH) $(SYNTAX_SOURCES)

$(SIMULATION_CLASSES): $(SIMULATION_SOURCES)
	$(JC) $(JC_FLAGS) $(CLASSPATH) $(SIMULATION_SOURCES)

$(ANIMATION_CLASSES): $(ANIMATION_SOURCES)
	$(JC) $(JC_FLAGS) $(CLASSPATH) $(ANIMATION_SOURCES)

$(TEST_CLASSES): $(TEST_SOURCES)
	$(JC) $(JC_FLAGS) $(CLASSPATH):$(ANTLR_LIB):$(JUNIT_LIB) $(TEST_SOURCES)

