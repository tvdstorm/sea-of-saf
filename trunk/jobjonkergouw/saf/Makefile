# Makefile for SAF project for Software Construction
# 
# Author: Job Jonkergouw
# Compiler: Java Compiler v_677_R32x, 3.2.1

CC = javac
FLAGS = -1.6 -classpath /user/jjonkerg/sc/jobjonkergouw/svn/jobjonkergouw/:/user/jjonkerg/sc/antlrworks-1.4.3.jar:.


main : astclasses Main.class 

Main.class : Main.java syntax/SAFParser.class syntax/SAFLexer.java	
	$(CC) $(FLAGS) Main.java 

# ANLTR Part

syntax/SAFParser.class : syntax/SAFParser.java
	$(CC) $(FLAGS) syntax/SAFParser.java 
	$(CC) $(FLAGS) syntax/SAFLexer.java
	
syntax/SAFParser.java : syntax/SAF.g 
	java org.antlr.Tool syntax/SAF.g	

syntax/SSAF.g : 

# ast sources
astclasses : astnodesclasses ast/Visitor.class ast/Validator.class

ast/Visitor.class : ast/Visitor.java
	$(CC) $(FLAGS) ast/Visitor.java 
	
ast/Validator.class : ast/Validator.java
	$(CC) $(FLAGS) ast/Validator.java 

# ast node sources

astnodesclasses : ast/nodes/ASTNode.class ast/nodes/Fighter.class ast/nodes/Strength.class ast/nodes/Rule.class \
			 	ast/nodes/Or.class ast/nodes/And.class ast/nodes/Condition.class \
			  	ast/nodes/Action.class ast/nodes/Move.class ast/nodes/Attack.class
	
ast/nodes/ASTNode.class : ast/nodes/ASTNode.java
	$(CC) $(FLAGS) ast/nodes/ASTNode.java 
	
ast/nodes/Strength.class : ast/nodes/Strength.java
	$(CC) $(FLAGS) ast/nodes/Strength.java 

ast/nodes/Fighter.class : ast/nodes/Fighter.java
	$(CC) $(FLAGS) ast/nodes/Fighter.java 

ast/nodes/Rule.class : ast/nodes/Rule.java
	$(CC) $(FLAGS) ast/nodes/Rule.java  
	
ast/nodes/And.class : ast/nodes/And.java
	$(CC) $(FLAGS) ast/nodes/And.java 
	
ast/nodes/Or.class : ast/nodes/Or.java
	$(CC) $(FLAGS) ast/nodes/Or.java 
	
ast/nodes/Condition.class : ast/nodes/Condition.java
	$(CC) $(FLAGS) ast/nodes/Condition.java 
	
ast/nodes/Move.class : ast/nodes/Move.java
	$(CC) $(FLAGS) ast/nodes/Move.java 
	
ast/nodes/Attack.class : ast/nodes/Attack.java
	$(CC) $(FLAGS) ast/nodes/Attack.java 
	
ast/nodes/Action.class : ast/nodes/Action.java
	$(CC) $(FLAGS) ast/nodes/Action.java 


	