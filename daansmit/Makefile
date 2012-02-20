ANTLR=lib/antlr-3.4-complete.jar
JUNIT=lib/junit-4.10.jar

CLASS_DIR=classes
SRC_DIR=src

JC=javac
CP=-cp .:$(ANTLR):$(JUNIT):$(CLASS_DIR)
ARGS=$(CP) -d $(CLASS_DIR) -sourcepath $(SRC_DIR)

PARSER_SOURCES=src/saf/parser/SAFLexer.java \
	src/saf/parser/SAFParser.java

SYNTAX_SOURCES=src/saf/syntax/Action.java \
	src/saf/syntax/And.java \
	src/saf/syntax/ASTNode.java \
	src/saf/syntax/BinaryOperation.java \
	src/saf/syntax/Characteristic.java \
	src/saf/syntax/Choose.java \
	src/saf/syntax/Evaluable.java \
	src/saf/syntax/Fighter.java \
	src/saf/syntax/Or.java \
	src/saf/syntax/Response.java \
	src/saf/syntax/Simple.java \
	src/saf/syntax/State.java

CHECK_SOURCES=src/saf/check/Message.java \
	src/saf/check/Error.java \
	src/saf/check/Warning.java \
	src/saf/check/CheckLog.java

SIMULATION_SOURCES=src/saf/simulation/Coordinate.java \
	src/saf/simulation/Fight.java \
	src/saf/simulation/Move.java \
	src/saf/simulation/Process.java \
	src/saf/simulation/Instance.java \
	src/saf/simulation/Simulation.java

SIMULATION_EVENT_SOURCES=src/saf/simulation/event/ChangeHealth.java \
	src/saf/simulation/event/StopAttack.java \
	src/saf/simulation/event/Stand.java \
	src/saf/simulation/event/KickLow.java \
	src/saf/simulation/event/MoveTo.java \
	src/saf/simulation/event/PunchLow.java \
	src/saf/simulation/event/KickHigh.java \
	src/saf/simulation/event/BlockHigh.java \
	src/saf/simulation/event/Miss.java \
	src/saf/simulation/event/Jump.java \
	src/saf/simulation/event/BlockLow.java \
	src/saf/simulation/event/Crouch.java \
	src/saf/simulation/event/Event.java \
	src/saf/simulation/event/PunchHigh.java \
	src/saf/simulation/event/Block.java \
	src/saf/simulation/event/Win.java \
	src/saf/simulation/event/Hit.java

VISUALIZATION_SOURCES=src/saf/visualization/Visualizer.java \
	src/saf/visualization/TextVisualizer.java

PARSER_CLASSES=$(PARSER_SOURCES:$(SRC_DIR)/%.java=$(CLASS_DIR)/%.class)
SYNTAX_CLASSES=$(SYNTAX_SOURCES:$(SRC_DIR)/%.java=$(CLASS_DIR)/%.class)
CHECK_CLASSES=$(CHECK_SOURCES:$(SRC_DIR)/%.java=$(CLASS_DIR)/%.class)
SIMULATION_CLASSES=$(SIMULATION_SOURCES:$(SRC_DIR)/%.java=$(CLASS_DIR)/%.class)
SIMULATION_EVENT_CLASSES=$(SIMULATION_EVENT_SOURCES:$(SRC_DIR)/%.java=$(CLASS_DIR)/%.class)
VISUALIZATION_CLASSES=$(VISUALIZATION_SOURCES:$(SRC_DIR)/%.java=$(CLASS_DIR)/%.class)



.PHONY: all parser clean


all: $(CLASS_DIR)/saf/Main.class


$(CLASS_DIR)/saf/Main.class: $(SRC_DIR)/saf/Main.java parser $(SYNTAX_CLASSES) $(CHECK_CLASSES) $(SIMULATION_CLASSES) $(VISUALIZATION_CLASSES)
	$(JC) $(ARGS) $(SRC_DIR)/saf/Main.java


parser: $(PARSER_CLASSES)

$(CLASS_DIR)/saf/parser/SAFParser.class: $(SRC_DIR)/saf/parser/SAFParser.java $(CLASS_DIR)/saf/parser/SAFLexer.class $(SYNTAX_CLASSES)
	$(JC) $(ARGS) $(SRC_DIR)/saf/parser/SAFParser.java

$(CLASS_DIR)/saf/parser/SAFLexer.class: $(SRC_DIR)/saf/parser/SAFLexer.java
	$(JC) $(ARGS) $(SRC_DIR)/saf/parser/SAFLexer.java

$(SRC_DIR)/saf/parser/%Lexer.java $(SRC_DIR)/saf/parser/%Parser.java: $(SRC_DIR)/saf/parser/SAF.g
	java -cp .:$(ANTLR) org.antlr.Tool -fo $(SRC_DIR)/saf/parser $<


$(CLASS_DIR)/saf/syntax/%.class: $(SRC_DIR)/saf/syntax/%.java
	$(JC) $(ARGS) $<

$(CLASS_DIR)/saf/check/%.class: $(SRC_DIR)/saf/check/%.java
	$(JC) $(ARGS) $<

$(CLASS_DIR)/saf/simulation/Simulation.class: $(SIMULATION_EVENT_CLASSES)
	$(JC) $(ARGS) $(SRC_DIR)/saf/simulation/Simulation.java

$(CLASS_DIR)/saf/simulation/%.class: $(SRC_DIR)/saf/simulation/%.java
	$(JC) $(ARGS) $<

$(CLASS_DIR)/saf/visualization/%.class: $(SRC_DIR)/saf/visualization/%.java
	$(JC) $(ARGS) $<

clean:
	rm -R classes/saf src/saf/parser/SAFParser.java src/saf/parser/SAFLexer.java src/saf/parser/SAF.tokens