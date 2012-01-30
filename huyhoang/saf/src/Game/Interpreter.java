package Game;

import java.lang.reflect.*;

import saf.ast.*;
import saf.ast.LogicalExpression.ConditionalOperators;

public class Interpreter 
{
	private saf.ast.ASTManager astManager;
	private FighterBot bot;
	
	public Interpreter(ASTManager astManager)
	{
		this.astManager = astManager;
		bot = new FighterBot();
	}

	/***
	 * Start interpreting the AST
	 */
	protected void Start()
	{
		for (Statement statement : astManager.getStatements())
		{
			statement.accept(this);
		}
	}
	
	/***
	 * 
	 * @param statement
	 * @throws ClassNotFoundException
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	public void visit(AssignmentStatement statement) throws ClassNotFoundException, 
															NoSuchFieldException, 
															IllegalAccessException
	{
		Class aClass = Class.forName("Game.FighterBot");
		Field field = aClass.getField(statement.getVariableName());
		field.setInt(this.bot, new Integer(statement.getValue()));
	}
	
	public void visit(Function statement)
	{
		
	}
	
	public void visit(IfStatement statement)
	{
	}

	public void visit(LogicalExpression logicalExpression)
	{
	}
	
	public void visit(BoolExpression booleanExpression)
	{
	}
}
