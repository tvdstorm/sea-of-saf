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
	
	private void createCombinedCondition(boolean requireBoth) {
		conditions.push(new CombinedCondition(conditions.pop(), conditions.pop(), requireBoth));
	}
	
}


fighter 	:	^(FIGHTER name=IDENTIFIER assignment* action*) { fighter.setName($name.text);};

assignment
	:	^(ASSIGNMENT key=IDENTIFIER value=DIGIT) { fighter.setProperty($key.text, Integer.parseInt($value.text)); };

action 	:	^(ACTION condition move=IDENTIFIER attack=IDENTIFIER) { createAction($move.text, $attack.text);};

condition 
	:	^(RCONDITION c=condition) { /* No action */ }
	|	^(ANDCONDITION condition condition) { createCombinedCondition(true); }
	|	^(ORCONDITION condition condition) { createCombinedCondition(false); }
	|	^(CONDITION c2=IDENTIFIER) { createCondition($c2.text); };
