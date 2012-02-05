package Game;

import java.lang.reflect.*;
import saf.ast.*;
import saf.checker.Tool;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Interpreter implements FighterVisitor
{
	private List<Behaviour> satisfiedBehaviours;
	private Bot bot;
	
	/***
	 * Start interpreting the AST
	 */
	protected void Evaluate(Fighter fighter, Bot bot)
	{
		this.bot = bot;
		satisfiedBehaviours = new ArrayList<Behaviour>();
		for (Statement statement : fighter.getStatements())
		{
			statement.accept(this);
		}
		randomlyExecuteSatisfiedBehaviour();
	}
	
	public void visit(StrengthAssignment statement) {
		try {
			Class aClass = Class.forName("Game.Bot");
			Field field = aClass.getField(statement.getName());
			field.setInt(this.bot, new Integer(statement.getValue()));
		} catch (Exception ex) {
			System.out.println("Unable to set strength: " + ex.getMessage());
		}
	}

	@Override
	public void visit(AndOperator andOperator) {
		Expression leftExpression = (Expression)andOperator.getLeftExpression();
		Expression rightExpression = (Expression)andOperator.getRightExpression();
		
		andOperator.setExpressionValue(leftExpression.getExpressionValue() && rightExpression.getExpressionValue());
	}

	@Override
	public void visit(OrOperator orOperator) {
		Expression leftExpression = (Expression)orOperator.getLeftExpression();
		Expression rightExpression = (Expression)orOperator.getRightExpression();
		
		orOperator.setExpressionValue(leftExpression.getExpressionValue() || rightExpression.getExpressionValue());
	}

	@Override
	public void visit(Condition state) {
		boolean value = (Boolean)this.bot.invokeMethod(state.getConditionName());
		state.setCurrentState(value);
		state.setExpressionValue(value);
	}

	@Override
	public void visit(Behaviour behaviour) {
		behaviour.getCondition().accept(this);
		
		Expression condition = (Expression)behaviour.getCondition();
		if (condition.getExpressionValue()) {
			this.satisfiedBehaviours.add(behaviour);
		}
	}

	@Override
	public void visit(Function function) {
		if (function.getFunctionName().equals("choose")) {
			Random random = new Random();
			int index = random.nextInt(function.getParameters().size());
			Function randomFunction = function.getParameters().get(index);
			visit(randomFunction);
		} else {
			bot.invokeMethod(function.getFunctionName());
		}
	}
	
	public void randomlyExecuteSatisfiedBehaviour() {
		Random random = new Random();
		int index = random.nextInt(this.satisfiedBehaviours.size());
		Behaviour behaviour = this.satisfiedBehaviours.get(index);
		behaviour.getMove().accept(this);
		behaviour.getAttack().accept(this);
	}
}
