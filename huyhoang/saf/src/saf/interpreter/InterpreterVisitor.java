package saf.interpreter;

import java.lang.reflect.*;
import saf.ast.*;
import saf.ast.condition.*;
import saf.ast.definition.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class InterpreterVisitor implements FighterVisitor
{
	private List<Behaviour> satisfiedBehaviours;
	private Bot bot;
	
	public Bot getBot() {
		return bot;
	}
	
	public void setBot(Bot bot) {
		this.bot = bot;
	}
	
	protected void Evaluate(Fighter fighter) {
		satisfiedBehaviours = new ArrayList<Behaviour>();
		for (ASTNode nodes : fighter.getDefinitions()) {
			nodes.accept(this);
		}
		randomlyExecuteSatisfiedBehaviour();
	}
	
	public void visit(Strength strength) {
		try {
			Field field = Bot.class.getField(strength.getName());
			field.setInt(this.bot, new Integer(strength.getValue()));
		} catch (Exception ex) {
			System.out.println("Unable to set strength: " + ex.getMessage());
		}
	}

	@Override
	public void visit(AndOperator andOperator) {
		Condition leftExpression = andOperator.getLeftExpression();
		Condition rightExpression = andOperator.getRightExpression();
		
		leftExpression.accept(this);
		rightExpression.accept(this);
		
		andOperator.setValue(leftExpression.getValue() && rightExpression.getValue());
	}

	@Override
	public void visit(OrOperator orOperator) {
		Condition leftExpression = orOperator.getLeftExpression();
		Condition rightExpression = orOperator.getRightExpression();
		
		leftExpression.accept(this);
		rightExpression.accept(this);
		
		orOperator.setValue(leftExpression.getValue() || rightExpression.getValue());
	}

	@Override
	public void visit(Condition condition) {
		boolean value = this.bot.getCondition(condition.getName());
		condition.setValue(value);
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
		bot.performAction(function.getName());
	}
	
	public void randomlyExecuteSatisfiedBehaviour() {
		if (this.satisfiedBehaviours.size() > 0) {
			Random random = new Random();
			int index = random.nextInt(this.satisfiedBehaviours.size());
			Behaviour behaviour = this.satisfiedBehaviours.get(index);
			behaviour.getMove().accept(this);
			behaviour.getAttack().accept(this);
		}
	}

	@Override
	public void visit(Choose choose) {
		Random random = new Random();
		int index = random.nextInt(choose.getProcedures().size());
		Procedure randomFunction = choose.getProcedures().get(index);
		randomFunction.accept(this);
	}

	@Override
	public void visit(Procedure procedure) {
	}
}
