package Evaluator;

import AST.*;
import Game.MethodAnnotation;

import java.util.*;
import java.lang.annotation.*;
import java.lang.reflect.*;

import safparser.safgrammar;

// this is the SAF consistency checker
public class EvaluationManager
{
	private List<EvaluationError> evaluationErrors;
	private List<Function> listOfFunctions;
	private List<String> listOfBotStrengths;
	
    public static void main(String args [])
    {
        System.out.println("Reading from standard input...");
        System.out.print("Enter a SAF specification: ");
        safgrammar parser = new safgrammar(System.in);
        parser.Initialize();
        try
        {
        	parser.Root();
        	EvaluationManager evaluation = new EvaluationManager(parser.getAstManager());
        	
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
	
	public EvaluationManager(AST.ASTManager astManager)
	{
		evaluationErrors = new ArrayList<EvaluationError>();
		listOfFunctions = loadFunctions();
		listOfBotStrengths = fetchBotStrengths();
		
		for ( AST.Statement statement : astManager.getStatements() )
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
		if (statement.getValue() < 1 || statement.getValue() > 10)
		{
			evaluationErrors.add(new OutOfRangeError(statement));
		}
		
		if (!listOfBotStrengths.contains(statement.getVariableName()))
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
		if (!listOfFunctions.contains(statement))
		{
			evaluationErrors.add(new MethodNotDefinedError(statement));
		}
	}
	
	// still needs to implement
	public void visit(IfStatement statement)
	{
		statement.getEvaluationExpression().accept(this);
	}
	
	// still needs to implement
	public void visit(LogicalExpression expression)
	{
		expression.getLeftExpression().accept(this);
		expression.getRightExpression().accept(this);
	}
	
	public void visit(BoolExpression expression)
	{
		expression.getLeftOperand().accept(this);
		
		int index = this.listOfFunctions.indexOf(expression.getLeftOperand());
		if (index > -1)
		{
			Function function = this.listOfFunctions.get(index);
			if ( function.getReturnType() == void.class )
			{
				evaluationErrors.add(new TypeMismatchError(function, boolean.class));
			}
		}
	}
}
