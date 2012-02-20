package saf.checker;

import java.util.*;

import saf.ast.*;
import saf.ast.condition.AndOperator;
import saf.ast.condition.Condition;
import saf.ast.condition.LogicalCondition;
import saf.ast.condition.OrOperator;
import saf.ast.definition.Behaviour;
import saf.ast.definition.Action;
import saf.ast.definition.Choose;
import saf.ast.definition.Procedure;
import saf.ast.definition.Strength;
import saf.interpreter.Bot;
import saf.util.MethodAnnotation;
import saf.util.Tool;

public class CheckerVisitor implements FighterVisitor
{
	private List<String> errors;
	private List<String> listOfAllowedBotConditions;
	private List<String> listOfAllowedBotStrengths;
	private Fighter fighter;
	private boolean alwaysNodeFound = false;
	private ArrayList<Action> visitedActions;

	public List<String> getErrors() {
		if (this.errors == null)
			this.errors = new ArrayList<String>();
		return this.errors;
	}
    
	public CheckerVisitor(Fighter fighter) {
		this.listOfAllowedBotConditions = Tool.getAnnotatedSafnamesFromClass(Bot.class, "condition");
		this.listOfAllowedBotStrengths = Tool.getAnnotatedSafnamesFromClass(Bot.class, "getStrength");
		this.visitedActions = new ArrayList<Action>();
		this.fighter = fighter;
	}
	
	public void visitAllASTNodes() {
		for (ASTNode statement : this.fighter.getDefinitions())
			statement.accept(this);
		
		if (!alwaysNodeFound)
			getErrors().add("The condition 'always' is obliged and must be defined!");
	}

	protected void checkAssignmentRange(Strength statement) {
		if (statement.getValue() < 1 || statement.getValue() > 10) {
			getErrors().add(String.format("%d is out of range. You cannot assign this to %s",
										  statement.getValue(),
										  statement.getName()));
		}
	}
	
	public void visit(Strength statement) {
		checkBotStrength(statement);
		checkAssignmentRange(statement);
	}
	
	private void checkBotStrength(Strength statement) {
		if (!listOfAllowedBotStrengths.contains(statement.getName())) {
			getErrors().add(String.format("Undefined strength '%s'", statement.getName()));
		}
	}
	
	private void checkActionHasNoChildren(Action action) {
		if (action.getProcedures().size() > 0) {
			getErrors().add(String.format("The action '%s' does not accept any parameters", action.getName()));
		}
	}
	
	public void visit(Action action) {
		modifyActionNodeKeywordType(action);
		visitedActions.add(action);
		checkActionHasNoChildren(action);
	}
	
	public void visit(Behaviour behaviour) {
		behaviour.getCondition().accept(this);
		
		visitedActions.clear();
		behaviour.getMove().accept(this);
		checkVisitedFunctionsForKeywordValidity("move");
		
		visitedActions.clear();
		behaviour.getAttack().accept(this);
		checkVisitedFunctionsForKeywordValidity("attack");
	}
	
	private void checkVisitedFunctionsForKeywordValidity(String expected) {
		for ( Action action : visitedActions ) {
			if (action.getKeywordType() == null) {
				getErrors().add(String.format("'%s' is an invalid action", action.getName()));
			}
			else if (action.getKeywordType() != null && !action.getKeywordType().equals(expected)) {
				getErrors().add(String.format("'%s' is a '%s' keyword. A 'choose' keyword or '%s' keyword was expected",
										 	  action.getName(),
										 	  action.getKeywordType(),
										 	  expected));
			}
		}
	}
	
	private void visitLogicalExpression(LogicalCondition expression) {
		expression.getLeftExpression().accept(this);
		expression.getRightExpression().accept(this);
	}
	
	@Override
	public void visit(AndOperator andOperator) {
		visitLogicalExpression(andOperator);
	}

	@Override
	public void visit(OrOperator orOperator) {
		visitLogicalExpression(orOperator);
	}

	@Override
	public void visit(Condition state) {
		if (!listOfAllowedBotConditions.contains(state.getName())) {
			getErrors().add(String.format("Condition '%s' is invalid", state.getName()));
		}
		
		if (state.getName().equals("always")) {
			alwaysNodeFound = true;
		}
	}
	
	private void modifyActionNodeKeywordType(Action action) {
		for (MethodAnnotation key : Tool.getAnnotations(Bot.class)) {
			if (key.safName().equals(action.getName())) {
				action.setKeywordType(key.keywordType());
			}
		}
	}

	@Override
	public void visit(Choose choose) {
		if (choose.getProcedures().size() == 0)
			getErrors().add("The 'choose' keyword requires at least 1 action as its parameter");
		
		for (Procedure procedure : choose.getProcedures()) {
			procedure.accept(this);
		}
	}

	@Override
	public void visit(Procedure procedure) {
	}
}
