package saf.checker;

import java.util.*;
import java.lang.reflect.*;
import saf.ast.*;
import safparser.Parser;

public class CheckerVisitor implements FighterVisitor
{
	private List<String> errors;
	private List<String> listOfAllowedBotConditions;
	private List<String> listOfAllowedBotStrengths;
	private Fighter fighter;
	private boolean alwaysNodeFound = false;
	private ArrayList<Function> visitedFunctions;

	public List<String> getErrors() {
		return this.errors;
	}
	
	public static void main(String args []) {
        System.out.println("Reading from standard input...");
        System.out.print("Enter a SAF specification: ");
        Parser parser = new Parser(System.in);
        try {
        	parser.Root();
        	CheckerVisitor checker = new CheckerVisitor(parser.getFighter());
        	checker.visitAllAstStatements();
        	
        	System.out.println(checker.errors.size() + " error(s) found");
        	for ( String e : checker.errors ) {
        		System.out.println(e.toString());
        	}
        }
        catch (Exception e) {
        	System.out.println("Oops.");
        	System.out.println(e);
        }
    }
    
	public CheckerVisitor(Fighter fighter) {
		this.errors = new ArrayList<String>();
//		this.listOfAllowedBotAttacks = Tool.getAnnotatedSafnamesFromClass("Game.FighterBot", "attack");
//		this.listOfAllowedBotMoves = Tool.getAnnotatedSafnamesFromClass("Game.FighterBot", "move");
		this.listOfAllowedBotConditions = Tool.getAnnotatedSafnamesFromClass("Game.Bot", "condition");
		this.listOfAllowedBotStrengths = Tool.fetchBotStrengths();
		this.visitedFunctions = new ArrayList<Function>();
		this.fighter = fighter;
	}
	
	public void visitAllAstStatements() {
		for (Statement statement : this.fighter.getStatements()) {
			statement.accept(this);
		}
		
		if (!alwaysNodeFound) {
			errors.add("The condition 'always' is obliged and must be defined!");
		}
	}

	protected void checkAssignmentStatementRange(StrengthAssignment statement) {
		if (statement.getValue() < 1 || statement.getValue() > 10) {
			errors.add(String.format("%d is out of range. You cannot assign this to %s", statement.getValue(), statement.getName()));
		}
	}
	
	/**
	 * Evaluates an AssignmentStatement object. It checks the following:
	 * - rvalue range (1..10)
	 * - whether the variable exists in the listOfBotStrengths field.  
	 * 
	 * @param logicalOperator the assignment statement that we want to evaluate
	 */
	public void visit(StrengthAssignment statement) {
		checkBotStrength(statement);
		checkAssignmentStatementRange(statement);
	}
	
	protected void checkBotStrength(StrengthAssignment statement) {
		if (!listOfAllowedBotStrengths.contains(statement.getName())) {
			errors.add(String.format("Undefined strength '%s'", statement.getName()));
		}
	}
	
	protected void checkCorrectParameterCount(Function statement) {
		if (statement.getFunctionName().equals("choose") && statement.getParameters().size() == 0) {
			errors.add("The choose keyword requires at least 1 action");
		}
		else if (!statement.getFunctionName().equals("choose") && statement.getParameters().size() > 0) {
			errors.add(String.format("The action '%s' does not accept any parameters", statement.getFunctionName()));
		}
	}
	
	protected void visitFunctionChildren(Function statement) {
		for (Function function : statement.getParameters()) {
			visit(function);
		}
	}
	
	/**
	 * Evaluates a Function object. It checks whether the function exists in the FighterBot class.
	 * @param statement
	 */
	public void visit(Function statement) {
		// populate the type of keyword
		Tool.determineFunctionKeywordType(statement);
		visitedFunctions.add(statement);
		checkCorrectParameterCount(statement);
		visitFunctionChildren(statement);
	}
	
	/**
	 * Visit the Behaviour node.
	 * 
	 * @param statement
	 */
	public void visit(Behaviour statement) {
		statement.getCondition().accept(this);
		
		visitedFunctions.clear();
		visit(statement.getMove());
		checkVisitedFunctionsForKeywordValidity("move");
		
		visitedFunctions.clear();
		visit(statement.getAttack());
		checkVisitedFunctionsForKeywordValidity("attack");
	}
	
	protected void checkVisitedFunctionsForKeywordValidity(String expected) {
		for ( Function function : visitedFunctions ) {
			if (function.getKeywordType() != null && !function.getKeywordType().equals("choose") && !function.getKeywordType().equals(expected)) {
				errors.add(String.format("'%s' is a '%s' keyword. A 'choose' keyword or '%s' keyword was expected",
										 function.getFunctionName(),
										 function.getKeywordType(),
										 expected));
			}
		}
	}
	
	protected void visitLogicalExpression(LogicalExpression expression) {
		expression.getLeftExpression().accept(this);
		expression.getRightExpression().accept(this);
	}
	
	@Override
	public void visit(AndOperator andOperator) {
		visitLogicalExpression(andOperator);
	}

	@Override
	public void visit(OrOperator orOperator) {
		visitLogicalExpression(orOperator);
	}

	@Override
	public void visit(Condition state) {
		if (!listOfAllowedBotConditions.contains(state.getConditionName())) {
			errors.add(String.format("Condition '%s' is invalid", state.getConditionName()));
		}
		
		if (state.getConditionName().equals("always")) {
			alwaysNodeFound = true;
		}
	}
}
