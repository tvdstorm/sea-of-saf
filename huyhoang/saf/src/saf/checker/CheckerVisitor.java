package saf.checker;

import java.util.*;
import java.lang.reflect.*;
import saf.ast.*;
import saf.checker.errors.ActionNotDefined;
import saf.checker.errors.ConditionNameInvalid;
import saf.checker.errors.Error;
import saf.checker.errors.OutOfRange;
import saf.checker.errors.ParameterCountMismatch;
import saf.checker.errors.VariableNotDefined;
import safparser.Parser;

public class CheckerVisitor implements FighterVisitor
{
	private List<Error> errors;
	private List<String> listOfAllowedBotActions;
	private List<String> listOfAllowedBotConditions;
	private List<String> listOfAllowedBotStrengths;
	private Fighter fighter;
	
    public static void main(String args []) {
        System.out.println("Reading from standard input...");
        System.out.print("Enter a SAF specification: ");
        Parser parser = new Parser(System.in);
        try {
        	parser.Root();
        	CheckerVisitor checker = new CheckerVisitor(parser.getFighter());
        	checker.visitAllAstStatements();
        	
        	System.out.println(checker.errors.size() + " error(s) found");
        	for ( Error e : checker.errors ) {
        		System.out.println(e.toString());
        	}
        }
        catch (Exception e) {
        	System.out.println("Oops.");
        	System.out.println(e);
        }
    }
    
    public List<Error> getErrors() {
    	return this.errors;
    }
	
	public CheckerVisitor(Fighter fighter) {
		this.errors = new ArrayList<Error>();
		this.listOfAllowedBotActions = Tool.getSafFunctionsFromClass("Game.FighterBot", "action");
		this.listOfAllowedBotConditions = Tool.getSafFunctionsFromClass("Game.FighterBot", "condition");
		this.listOfAllowedBotStrengths = Tool.fetchBotStrengths();
		this.fighter = fighter;
	}
	
	public void visitAllAstStatements() {
		for (Statement statement : this.fighter.getStatements()) {
			statement.accept(this);
		}
	}
	
	public void checkHasAlwaysNode() {
		
	}

	protected void checkAssignmentStatementRange(StrengthAssignment statement) {
		if (statement.getValue() < 1 || statement.getValue() > 10) {
			errors.add(new OutOfRange());
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
			errors.add(new VariableNotDefined(statement.getName()));
		}
	}
	
	protected void checkIsValidAction(Function statement) {
		if (!listOfAllowedBotActions.contains(statement)) {
			errors.add(new ActionNotDefined(statement));
		}
	}
	
	protected void checkCorrectParameterCount(Function statement) {
		if (statement.getFunctionName().equals("choose") && statement.getParameters().size() == 0) {
			errors.add(new ParameterCountMismatch("choose"));
		}
		else if (!statement.getFunctionName().equals("choose") && statement.getParameters().size() > 0) {
			errors.add(new ParameterCountMismatch(statement.getFunctionName()));
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
		checkIsValidAction(statement);
		checkCorrectParameterCount(statement);
		visitFunctionChildren(statement);
	}
	
	protected boolean isParameterCountEqualToSafLibrary(Function function) {
		int indexOfSafFunction = listOfAllowedBotActions.indexOf(function);
		if (indexOfSafFunction != -1) {
			//return function.getParameters().size() == listOfAllowedBotActions.get(indexOfSafFunction).getParameters().size();
		}
		return false;
	}
	
	/**
	 * Visit the Behaviour node.
	 * 
	 * @param statement
	 */
	public void visit(Behaviour statement) {
		statement.getCondition().accept(this);
		for (Statement behaviourAction : statement.getStatements()) {
			behaviourAction.accept(this);
		}
	}
	
	protected void visitLogicalExpression(LogicalExpression expression) {
		expression.getLeftExpression().accept(this);
		expression.getRightExpression().accept(this);
	}
	
	@Override
	public void visitExpr(AndOperator andOperator) {
		visitLogicalExpression(andOperator);
	}

	@Override
	public void visitExpr(OrOperator orOperator) {
		visitLogicalExpression(orOperator);
	}

	@Override
	public void visitExpr(State state) {
		if (!listOfAllowedBotConditions.contains(state.getStateName())) {
			this.errors.add(new ConditionNameInvalid(state.getStateName()));
		}
	}
}
