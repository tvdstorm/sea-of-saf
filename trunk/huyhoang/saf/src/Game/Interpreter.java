package Game;

import java.lang.reflect.*;
import saf.ast.*;

public class Interpreter
{
	private saf.ast.Fighter astManager;
	private FighterBot bot;
	
	public Interpreter(Fighter astManager)
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
			//statement.(this);
		}
	}
	
	public void visit(StrengthAssignment statement) throws ClassNotFoundException, 
															NoSuchFieldException, 
															IllegalAccessException
	{
		Class aClass = Class.forName("Game.FighterBot");
		Field field = aClass.getField(statement.getName());
		field.setInt(this.bot, new Integer(statement.getValue()));
	}

	public boolean evaluate(AndOperator andOperator) {
		// TODO Auto-generated method stub
		return false;
	}
}
