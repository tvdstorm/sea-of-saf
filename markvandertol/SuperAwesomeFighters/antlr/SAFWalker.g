tree grammar SAFWalker;

options {
	ASTLabelType=CommonTree;
	tokenVocab=SAF;
}

@header {
	package saf.parser;
	
	import saf.ast.*;
	import java.util.Map;
	import java.util.HashMap;
	import java.util.AbstractMap;
}

@members {
	private List<String> errorList;
	
	public void setErrorList(List<String> errorList) {
		this.errorList = errorList;
	}
	
	@Override
	public void emitErrorMessage(String msg) {
		errorList.add("Walker error: " + msg);
	}	
}


fighter returns [FighterDefinition f]
@init {
	Map<String, Integer> assignments = new HashMap<String, Integer>();
	List<BehaviourRule> behaviourRules = new ArrayList<BehaviourRule>();
}
	:	^(FIGHTER name=IDENTIFIER (a=assignment {assignments.put(a.getKey(), a.getValue());})+ (b=rule {behaviourRules.add(b);})+)
		{ $f = new FighterDefinition($name.text, assignments, behaviourRules);};

assignment returns [AbstractMap.SimpleEntry<String, Integer> a]
	:	^(ASSIGNMENT key=IDENTIFIER value=DIGIT)
		{ $a = new AbstractMap.SimpleEntry<String, Integer>($key.text, Integer.parseInt($value.text)); };

rule returns [BehaviourRule r] 	
	:	^(RULE con=condition move=moves attack=attacks)
		{ $r = new BehaviourRule(con, move, attack);};
		
moves returns [List<String> l]
@init {
	l = new ArrayList<String>();
}
	:	^(MOVES (move=IDENTIFIER { l.add($move.text); })+);
	
attacks returns [List<String> l]
@init {
	l = new ArrayList<String>();
}
	:	^(ATTACKS (attack=IDENTIFIER { l.add($attack.text); })+);

condition returns [Condition cresult]
	:	^(RCONDITION c=condition) { $cresult = c; }
	|	^(ANDCONDITION andc1=condition andc2=condition) { $cresult = new CombinedCondition(andc1, andc2, true); }
	|	^(ORCONDITION orc1=condition orc2=condition) { $cresult = new CombinedCondition(orc1, orc2, false); }
	|	^(CONDITION c2=IDENTIFIER) { $cresult = new ConcreteCondition($c2.text); };
