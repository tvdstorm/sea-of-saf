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


PARSER_CLASSES=$(PARSER_SOURCES:src/%.java=classes/%.class)
SYNTAX_CLASSES=$(SYNTAX_SOURCES:src/%.java=classes/%.class)


.PHONY: all parser clean


all: $(CLASS_DIR)/saf/Main.class


$(CLASS_DIR)/saf/Main.class: $(SRC_DIR)/saf/Main.java parser $(SYNTAX_CLASSES)
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


clean:
	rm -R classes/saf src/saf/parser/SAFParser.java src/saf/parser/SAFLexer.java src/saf/parser/SAF.tokens