tree grammar SAFWalker;

options {
	ASTLabelType=CommonTree;
	tokenVocab=SAF;
}

@header {
	package saf.parser;
	
	import saf.ast.*;
	import java.util.Stack;
	import java.util.List;
}

@members {
	private FighterDefinition fighter = new FighterDefinition();
	
	private List<String> errorList;
	private Stack<Condition> conditions = new Stack<Condition>();
	
	public void setErrorList(List<String> errorList) {
		this.errorList = errorList;
	}
	
	@Override
	public void emitErrorMessage(String msg) {
		errorList.add("Walker error: " + msg);
	}
	
	public FighterDefinition getFighterDefinition() {
		return fighter;
	}
	
	private void createAction(String move, String attack) {	
		BehaviourRule behaviourRule = new BehaviourRule();
		try {
			MoveAction moveAction = MoveAction.valueOf(move);
			behaviourRule.setMoveAction(moveAction);
		} catch(IllegalArgumentException ex) {
			emitErrorMessage("Unknown move action: " + move);
		}
		
		try {
			FightAction fightAction = FightAction.valueOf(attack);
			behaviourRule.setFightAction(fightAction);
		} catch(IllegalArgumentException ex) {
			emitErrorMessage("Unknown fight action: " + attack);
		}
		behaviourRule.setCondition(conditions.pop());
		fighter.getBehaviourRules().add(behaviourRule);
	}
	
	private void createCondition(String state) {
		try {
			State s = State.valueOf(state);
			conditions.push(new ConcreteCondition(s));
		} catch(IllegalArgumentException ex) {
			emitErrorMessage("Unknown state: " + state);
		}
	}
	
	private void createCombinedCondition(String state, String operator) {
		Condition c = null;
		try {
			State s = State.valueOf(state);
			c = new ConcreteCondition(s);
		} catch(IllegalArgumentException ex) {
			emitErrorMessage("Unknown state: " + state);
		}
		boolean requireBoth = false;
		if ("and".equals(operator))
			requireBoth = true;
		else if ("or".equals(operator))
			requireBoth = false;
		else
			emitErrorMessage("Unknown operator: " + operator);
		
		conditions.push(new CombinedCondition(c, conditions.pop(), requireBoth));
	}
	
}


fighter 	:	^(FIGHTER name=IDENTIFIER assignment* action*) { fighter.setName($name.text);};

assignment
	:	^(ASSIGNMENT key=IDENTIFIER value=DIGIT) { fighter.setProperty($key.text, Integer.parseInt($value.text)); };

action 	:	^(ACTION condition move=IDENTIFIER attack=IDENTIFIER) { createAction($move.text, $attack.text);};

condition 
	:	^(CONDITION c=condition) { /* No action */ }
	|	^(CONDITION c2=IDENTIFIER) { createCondition($c2.text); }
	|	^(CONDITION c3=IDENTIFIER op=operator condition) { createCombinedCondition($c3.text, $op.text); };

operator 
	:	('and' | 'or');