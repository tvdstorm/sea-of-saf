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
import safparser.safgrammar;

// this is the SAF consistency checker
public class CheckerVisitor implements FighterVisitor
{
	private List<Error> evaluationErrors;
	private List<String> listOfAllowedBotActions;
	private List<String> listOfAllowedBotConditions;
	private List<String> listOfAllowedBotStrengths;
	private Fighter fighter;
	
    public static void main(String args []) {
        System.out.println("Reading from standard input...");
        System.out.print("Enter a SAF specification: ");
        safgrammar parser = new safgrammar(System.in);
        parser.Initialize();
        try {
        	parser.Root();
        	CheckerVisitor checker = new CheckerVisitor(parser.getFighter());
        	checker.visitAllAstStatements();
        	
        	System.out.println(checker.evaluationErrors.size() + " error(s) found");
        	for ( Error e : checker.evaluationErrors ) {
        		System.out.println(e.toString());
        	}
        }
        catch (Exception e)
        {
        	System.out.println("Oops.");
        	System.out.println(e);
        }
    }
	
	public CheckerVisitor(Fighter fighter) {
		this.evaluationErrors = new ArrayList<Error>();
		this.listOfAllowedBotActions = Tool.getSafFunctionsFromClass("Game.FighterBot", "action");
		this.listOfAllowedBotConditions = Tool.getSafFunctionsFromClass("Game.FighterBot", "condition");
		this.listOfAllowedBotStrengths = fetchBotStrengths();
		this.fighter = fighter;
	}
	
	public void visitAllAstStatements() {
		for ( Statement statement : this.fighter.getStatements() )
		{
			statement.accept(this);
		}
	}
	
	public void checkHasAlwaysNode() {
		
	}

	/**
	 * Returns a list of "SAF fighter bot strength"-variable names.
	 * The list is created by using reflection to read the fields of the FighterBot class. 
	 * 
	 * @return a list of "SAF bot strength"
	 */
	protected ArrayList<String> fetchBotStrengths() {
		ArrayList<String> result = new ArrayList<String>();
		
		try {
			Class c = Class.forName("Game.FighterBot");
			Field fields[] = c.getFields();
			for ( Field field : fields )
			{
				result.add(field.getName());
			}
			
			return result;
		}
		catch (Exception ex) {
			return new ArrayList<String>();
		}
	}

	protected void checkAssignmentStatementRange(StrengthAssignment statement) {
		if (statement.getValue() < 1 || statement.getValue() > 10) {
			evaluationErrors.add(new OutOfRange());
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
		checkAssignmentStatementRange(statement);
		checkBotStrength(statement);
	}
	
	protected void checkBotStrength(StrengthAssignment statement) {
		if (!listOfAllowedBotStrengths.contains(statement.getName())) {
			evaluationErrors.add(new VariableNotDefined(statement.getName()));
		}
	}
	
	protected void checkIsValidAction(Function statement) {
		if (!listOfAllowedBotActions.contains(statement)) {
			evaluationErrors.add(new ActionNotDefined(statement));
		}
	}
	
	protected void checkCorrectParameterCount(Function statement) {
		if (statement.getFunctionName().equals("choose") && statement.getParameters().size() == 0) {
			evaluationErrors.add(new ParameterCountMismatch("choose"));
		}
		else if (!statement.getFunctionName().equals("choose") && statement.getParameters().size() > 0) {
			evaluationErrors.add(new ParameterCountMismatch(statement.getFunctionName()));
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
	
	/**
	 * 
	 * 
	 * @param function
	 * @return
	 */
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
		for ( Statement behaviourAction : statement.getStatements())
		{
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
			this.evaluationErrors.add(new ConditionNameInvalid(state.getStateName()));
		}
	}
}
