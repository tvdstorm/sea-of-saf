package saf.interpreter;

import java.lang.reflect.*;
import saf.ast.*;
import saf.ast.condition.*;
import saf.ast.definition.*;
import saf.util.Tool;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Interpreter implements FighterVisitor
{
	private List<Behaviour> satisfiedBehaviours;
	private Bot bot;
	
	protected void Evaluate(Fighter fighter, Bot bot) {
		this.bot = bot;
		satisfiedBehaviours = new ArrayList<Behaviour>();
		for (ASTNode statement : fighter.getStatements()) {
			statement.accept(this);
		}
		randomlyExecuteSatisfiedBehaviour();
	}
	
	public void visit(Strength statement) {
		try {
			Field field = Bot.class.getField(statement.getName());
			field.setInt(this.bot, new Integer(statement.getValue()));
		} catch (Exception ex) {
			System.out.println("Unable to set strength: " + ex.getMessage());
		}
	}

	@Override
	public void visit(AndOperator andOperator) {
		Condition leftExpression = andOperator.getLeftExpression();
		Condition rightExpression = andOperator.getRightExpression();
		
		andOperator.setValue(leftExpression.getValue() && rightExpression.getValue());
	}

	@Override
	public void visit(OrOperator orOperator) {
		Condition leftExpression = orOperator.getLeftExpression();
		Condition rightExpression = orOperator.getRightExpression();
		
		orOperator.setValue(leftExpression.getValue() || rightExpression.getValue());
	}

	@Override
	public void visit(Condition state) {
		boolean value = (Boolean)this.bot.invokeMethod(state.getName());
		state.setValue(value);
	}

	@Override
	public void visit(Behaviour behaviour) {
		behaviour.getCondition().accept(this);
		
		if (behaviour.getCondition().getValue()) {
			this.satisfiedBehaviours.add(behaviour);
		}
	}

	@Override
	public void visit(Action function) {
		if (function.getName().equals("choose")) {
			Random random = new Random();
			int index = random.nextInt(function.getParameters().size());
			Action randomFunction = function.getParameters().get(index);
			visit(randomFunction);
		} else {
			bot.invokeMethod(function.getName());
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
