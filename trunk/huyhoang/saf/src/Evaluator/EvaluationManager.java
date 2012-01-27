package Evaluator;

import AST.*;

import java.util.*;
import java.lang.reflect.*;

import safparser.safgrammar;

// this is the SAF consistency checker
public class EvaluationManager
{
	private List<EvaluationError> evaluationErrors;
	private List<Function> listOfFunctions;
	
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
        	for (Statement s : parser.getAstManager().getStatements())
        	{
        		s.accept(evaluation);
        	}
        	
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
		
		for ( AST.Statement statement : astManager.getStatements() )
		{
			statement.accept(this);
		}
	}
	
	protected ArrayList<Function> loadFunctions()
	{
		ArrayList<Function> result = new ArrayList<Function>();
		
		try
		{
			Class c = Class.forName("FunctionManager");
			Method methods[] = c.getDeclaredMethods();
			for ( Method method : methods )
			{
				Function function = new Function(method.getName());
				result.add(function);
			}
		}
		catch (Exception ex)
		{
			// hmmm...
		}
		
		return result;
	}
	
	public void visit(AssignmentStatement statement)
	{
		if (statement.getValue() < 1 || statement.getValue() > 10)
		{
			evaluationErrors.add(new OutOfRangeError(statement));
		}
	}
	
	public void visit(Function statement)
	{
		if (!listOfFunctions.contains(statement))
		{
			evaluationErrors.add(new FunctionNotDefinedError(statement));
		}
	}
	
	public void visit(IfStatement statement)
	{
	}
	
	public void visit(LogicalExpression statement)
	{
	}
}
