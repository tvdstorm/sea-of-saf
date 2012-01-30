package saf.checker;

import Game.MethodAnnotation;

import java.util.*;
import java.lang.annotation.*;
import java.lang.reflect.*;

import saf.ast.*;

import safparser.safgrammar;

// this is the SAF consistency checker
public class Checker
{
	private List<EvaluationError> evaluationErrors;
	private List<Function> listOfAllowedBotActions;
	private List<String> listOfAllowedBotStrengths;
	private ASTManager astManager;
	
    public static void main(String args [])
    {
        System.out.println("Reading from standard input...");
        System.out.print("Enter a SAF specification: ");
        safgrammar parser = new safgrammar(System.in);
        parser.Initialize();
        try
        {
        	parser.Root();
        	Checker evaluation = new Checker(parser.getAstManager());
        	
        	System.out.println(evaluation.evaluationErrors.size() + " error(s) found");
        	for ( EvaluationError e : evaluation.evaluationErrors )
        	{
        		System.out.println(e.toString());
        	}
        }
        catch (Exception e)
        {
        	System.out.println("Oops.");
        	System.out.println(e);
        }
    }
	
	public Checker(ASTManager fighterAST)
	{
		this.evaluationErrors = new ArrayList<EvaluationError>();
		this.listOfAllowedBotActions = loadFunctions();
		this.listOfAllowedBotStrengths = fetchBotStrengths();
		this.astManager = fighterAST;
		
		this.visitAllAstStatements();
	}
	
	protected void visitAllAstStatements()
	{
		for ( Statement statement : this.astManager.getStatements() )
		{
			statement.accept(this);
		}
	}
	
	public void checkHasAlwaysNode()
	{
		
	}

	/**
	 * Returns a list of "SAF fighter bot strength"-variable names.
	 * The list is created by using reflection to read the fields of the FighterBot class. 
	 * 
	 * @return a list of "SAF bot strength"
	 */
	protected ArrayList<String> fetchBotStrengths()
	{
		ArrayList<String> result = new ArrayList<String>();
		
		try
		{
			Class c = Class.forName("Game.FighterBot");
			Field fields[] = c.getFields();
			for ( Field field : fields )
			{
				result.add(field.getName());
			}
			
			return result;
		}
		catch (Exception ex)
		{
			return new ArrayList<String>();
		}
	}
	
	/**
	 * Returns a list of allowed functions.
	 * The list is created by using reflection to load the methods of the FighterBot class.
	 * 
	 * @return a list of of "SAF actions"
	 */
	protected ArrayList<Function> loadFunctions()
	{
		ArrayList<Function> result = new ArrayList<Function>();
		
		try
		{
			Class c = Class.forName("Game.FighterBot");
			for (Method method : c.getMethods())
			{
				MethodAnnotation annotation = method.getAnnotation(MethodAnnotation.class);
				if (annotation != null)
				{
					Function function = new Function(annotation.safName());
					function.setReturnType(method.getReturnType());
					result.add(function);
				}
			}
			return result;
		}
		catch (Exception ex)
		{
			return new ArrayList<Function>();
		}
	}
	
	/**
	 * Evaluates an AssignmentStatement object. It checks the following:
	 * - rvalue range (1..10)
	 * - whether the variable exists in the listOfBotStrengths field.  
	 * 
	 * @param statement the assignment statement that we want to evaluate
	 */
	public void visit(AssignmentStatement statement)
	{
		checkAssignmentStatementRange(statement);
	}
	
	protected void checkAssignmentStatementRange(AssignmentStatement statement)
	{
		if (statement.getValue() < 1 || statement.getValue() > 10)
		{
			evaluationErrors.add(new OutOfRangeError());
		}
	}
	
	protected void checkBotStrength(AssignmentStatement statement)
	{
		if (!listOfAllowedBotStrengths.contains(statement.getVariableName()))
		{
			evaluationErrors.add(new VariableNotDefinedError(statement.getVariableName()));
		}
	}
	
	/**
	 * Evaluates a Function object. It checks whether the function exists in the FighterBot class.
	 * @param statement
	 */
	public void visit(Function statement)
	{
		if (!listOfAllowedBotActions.contains(statement))
		{
			evaluationErrors.add(new MethodNotDefinedError(statement));
		}
		
		if (!isParameterCountEqualToSafLibrary(statement))
		{
			//evaluationErrors.add()
		}
	}
	
	/**
	 * 
	 * 
	 * @param function
	 * @return
	 */
	protected boolean isParameterCountEqualToSafLibrary(Function function)
	{
		int indexOfSafFunction = listOfAllowedBotActions.indexOf(function);
		if (indexOfSafFunction != -1)
		{
			return function.getParameters().size() == listOfAllowedBotActions.get(indexOfSafFunction).getParameters().size();
		}
		return false;
	}
	
	public void visit(IfStatement statement)
	{
		statement.getEvaluationExpression().accept(this);
	}
	
	public void visit(LogicalExpression expression)
	{
		expression.getLeftExpression().accept(this);
		expression.getRightExpression().accept(this);
	}
	
	public void visit(BoolExpression expression)
	{
		expression.getLeftOperand().accept(this);
		
		int index = this.listOfAllowedBotActions.indexOf(expression.getLeftOperand());
		if (index > -1)
		{
			Function function = this.listOfAllowedBotActions.get(index);
			if ( function.getReturnType() == void.class )
			{
				evaluationErrors.add(new TypeMismatchError(function, boolean.class));
			}
		}
	}
}
