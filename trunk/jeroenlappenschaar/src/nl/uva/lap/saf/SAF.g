grammar SAF;

options {
  language = Java;
}

@header 
{
  package nl.uva.lap.saf;
  import nl.uva.lap.saf.ast.fighter.Fighter;
  import nl.uva.lap.saf.ast.fighter.Personality;
  import nl.uva.lap.saf.ast.fighter.Behaviour;
}

@lexer::header 
{
  package nl.uva.lap.saf;
}

@parser::members
{
	Fighter fighter;
	List<Personality> personalities = new ArrayList<Personality>();
	List<Behaviour> behaviours = new ArrayList<Behaviour>();
}

//fighters : fighter*;

fighter returns [Fighter fighter]: name=IDENT '{' statement* '}' 
	{fighter = new Fighter($name.text, personalities, behaviours);};

statement: personalityStatement;// | behaviourStatement;

personalityStatement: personality=IDENT '=' value=INTEGER 
	{personalities.add(new Personality($personality.text, $value.text));};
/*
behaviourStatement : cond=conditions '[' action1=actionStatement action2=actionStatement? ']'
	{
		Action action;
		if(action2)
			action = new Action(action1, action2);
		else
			action = new Action(action1);
		behaviours.add(new Behaviour(condition, action));
	};
/*
simpleCondition returns [Condition condition] : cond=IDENT {condition = new SimpleCondition($cond.text);};
bracketCondition returns [Condition condition] : cond=conditions {condition = new BracketCondition(cond);};
expression returns [Condition condition]: ident=IDENT | '(' bracketCondition ')';
conditions returns [Condition condition]: exp=expression ((operator='and' | operator='or') expression)*
	{
		if(!$operator)
			$condition = exp;
		if($operator.equals("and"))
			$condition = new AndCondition();
		else
			$condition = new OrCondition();
	};*/
/*
conditions returns [Condition cond]: condition=IDENT {cond = $condition.text};

actionStatement : (IDENT | ('choose' '(' IDENT+ ')')); //note: choose is not recursive
*/
INTEGER : (('1' '0'?) | '2'..'9'); //1 to 10 inclusive
IDENT : ('0'..'9')*('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9' | '-' | '_')*; //identifier has to have atleast one character

//ignore all whitespace and comments:
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMENT : '//' .* ('\n'|'\r') {$channel = HIDDEN;};
MULTICOMMENT : '/*' .* '*/' {$channel = HIDDEN;};