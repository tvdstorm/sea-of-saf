VERSION_NUMBER  = 0.2
SOURCES         = *.java
GRAMMAR         = SAF.g
OBJECTS         = $(SOURCES:.java=.class)
LIBS            = antlrworks-1.4.3.jar

JCC             = javac
JFLAGS          = -g -cp .:$(LIBS)
ANTLR           = java -cp .:$(LIBS) org.antlr.Tool

RM              = rm -f

all: grammar parser

grammar: $(GRAMMAR)
	$(ANTLR) $(GRAMMAR)

parser: $(SOURCES)
	$(JCC) $(JFLAGS) $(SOURCES)

clean: $(OBJECTS)
	$(RM) $(OBJECTS)

