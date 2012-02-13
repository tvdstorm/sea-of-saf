package saf.checker;

import java.util.*;
import java.lang.reflect.*;

import saf.ast.*;
import saf.ast.condition.AndOperator;
import saf.ast.condition.Condition;
import saf.ast.condition.LogicalCondition;
import saf.ast.condition.OrOperator;
import saf.ast.definition.Behaviour;
import saf.ast.definition.Action;
import saf.ast.definition.Strength;
import saf.interpreter.Bot;
import saf.util.MethodAnnotation;
import saf.util.Tool;
import safparser.Parser;

public class CheckerVisitor implements FighterVisitor
{
	private List<String> errors;
	private List<String> listOfAllowedBotConditions;
	private List<String> listOfAllowedBotStrengths;
	private Fighter fighter;
	private boolean alwaysNodeFound = false;
	private ArrayList<Action> visitedActions;

	public List<String> getErrors() {
		return this.errors;
	}
    
	public CheckerVisitor(Fighter fighter) {
		this.errors = new ArrayList<String>();
		this.listOfAllowedBotConditions = Tool.getAnnotatedSafnamesFromClass(Bot.class, "condition");
		this.listOfAllowedBotStrengths = Bot.fetchBotStrengths();
		this.visitedActions = new ArrayList<Action>();
		this.fighter = fighter;
	}
	
	public void visitAllAstStatements() {
		for (ASTNode statement : this.fighter.getStatements()) {
			statement.accept(this);
		}
		
		if (!alwaysNodeFound) {
			errors.add("The condition 'always' is obliged and must be defined!");
		}
	}

	protected void checkAssignmentStatementRange(Strength statement) {
		if (statement.getValue() < 1 || statement.getValue() > 10) {
			errors.add(String.format("%d is out of range. You cannot assign this to %s", statement.getValue(), statement.getName()));
		}
	}
	
	public void visit(Strength statement) {
		checkBotStrength(statement);
		checkAssignmentStatementRange(statement);
	}
	
	private void checkBotStrength(Strength statement) {
		if (!listOfAllowedBotStrengths.contains(statement.getName())) {
			errors.add(String.format("Undefined strength '%s'", statement.getName()));
		}
	}
	
	private void checkCorrectParameterCount(Action statement) {
		if (statement.getName().equals("choose") && statement.getParameters().size() == 0) {
			errors.add("The choose keyword requires at least 1 action");
		}
		else if (!statement.getName().equals("choose") && statement.getParameters().size() > 0) {
			errors.add(String.format("The action '%s' does not accept any parameters", statement.getName()));
		}
	}
	
	private void visitFunctionChildren(Action action) {
		for (Action function : action.getParameters()) {
			visit(function);
		}
	}
	
	public void visit(Action action) {
		modifyActionNodeKeywordType(action);
		visitedActions.add(action);
		checkCorrectParameterCount(action);
		visitFunctionChildren(action);
	}
	
	public void visit(Behaviour behaviour) {
		behaviour.getCondition().accept(this);
		
		visitedActions.clear();
		visit(behaviour.getMove());
		checkVisitedFunctionsForKeywordValidity("move");
		
		visitedActions.clear();
		visit(behaviour.getAttack());
		checkVisitedFunctionsForKeywordValidity("attack");
	}
	
	private void checkVisitedFunctionsForKeywordValidity(String expected) {
		for ( Action function : visitedActions ) {
			if (function.getKeywordType() != null && !function.getKeywordType().equals("choose") && !function.getKeywordType().equals(expected)) {
				errors.add(String.format("'%s' is a '%s' keyword. A 'choose' keyword or '%s' keyword was expected",
										 function.getName(),
										 function.getKeywordType(),
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
			errors.add(String.format("Condition '%s' is invalid", state.getName()));
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
}
