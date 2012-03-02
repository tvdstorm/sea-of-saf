# Makefile for SAF project for Software Construction
# 
# Author: Job Jonkergouw
# Compiler: Java Compiler v_677_R32x, 3.2.1

CC = javac
FLAGS = -1.6 -nowarning -classpath /user/jjonkerg/sc/jobjonkergouw:/user/jjonkerg/sc/antlrworks-1.4.3.jar:.


main : Main.class astclasses

Main.class : Main.java syntax/SAFParser.class syntax/SAFLexer.java	
	$(CC) $(FLAGS) Main.java 

# ANLTR Part

syntax/SAFParser.class : syntax/SAFParser.java
	$(CC) $(FLAGS) syntax/SAFParser.java 
	$(CC) $(FLAGS) syntax/SAFLexer.java
	
syntax/SAFParser.java : syntax/SAF.g 
	java org.antlr.Tool syntax/SAF.g	

syntax/SSAF.g : 

# java sources

astclasses : ast/Fighter.class ast/Strength.class ast/ASTNode.class ast/Rule.class \
			 ast/Or.class ast/And.class ast/Condition.class \
			  ast/Action.class ast/Move.class ast/Attack.class
	
ast/Strength.class : ast/Strength.java
	$(CC) $(FLAGS) ast/Strength.java 

ast/Fighter.class : ast/Fighter.java
	$(CC) $(FLAGS) ast/Fighter.java 

ast/Rule.class : ast/Rule.java
	$(CC) $(FLAGS) ast/Rule.java  
	
ast/ASTNode.class : ast/ASTNode.java
	$(CC) $(FLAGS) ast/ASTNode.java 
	
ast/And.class : ast/And.java
	$(CC) $(FLAGS) ast/And.java 
	
ast/Or.class : ast/Or.java
	$(CC) $(FLAGS) ast/Or.java 
	
ast/Condition.class : ast/Condition.java
	$(CC) $(FLAGS) ast/Condition.java 
	
ast/Move.class : ast/Move.java
	$(CC) $(FLAGS) ast/Move.java 
	
ast/Attack.class : ast/Attack.java
	$(CC) $(FLAGS) ast/Attack.java 
	
ast/Action.class : ast/Action.java
	$(CC) $(FLAGS) ast/Action.java 
	
	
	