grammar SAF;

options {
	output = AST;
}

tokens {
	PERSONALITY;
	BEHAVIOUR;
	FIGHTER;
	CHOOSE = 'choose';
	OR = 'or';
	AND = 'and';
	CONDITION = 'CONDITION';
}

@header {
	package safreader.antlrgenerated;
	import safreader.nodes.*;
}

@lexer::header {
	package safreader.antlrgenerated;
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

fighter returns [Fighter f]
	: STRING			{	$f = new Fighter($STRING.text);
					}
	'{' (s=spec			{	$f.addSpec($s.s);
					}
	)+ '}'
	-> ^(STRING spec+)
	'{'
	;

spec returns [Specification s]
	:(p=personality 		{	$s = $p.p;
					}
	| b=behaviour			{	$s = $b.b;
					}
	)
	;

personality returns [Personality p]
	: s=strength '=' n=NUMBER 	{	$p = new Personality($s.str, Integer.parseInt($n.text));
					}
	-> ^(PERSONALITY strength NUMBER)
	;
	
behaviour returns [Behaviour b]
	: c=condition '[' m=move a=attack ']'	{	$b = new Behaviour();
							$b.setCondition($c.cond);
							$b.setMove($m.move);
							$b.setAttack($a.attack);
						}
	-> ^(BEHAVIOUR condition move attack)
	;

strength returns [String str]
	: STRING			{	$str = $STRING.text;
					}
	;
	
condition returns [Condition cond]
	: (c_o=condition_or 		{	$cond = c_o.cond;
					}
	| c_a=condition_and		{	$cond = c_a.cond;
					}
	| STRING			{	$cond = new Condition();
						$cond.addCondition($STRING.text);
					}
	)
	;

condition_or returns [Condition cond]
	:				{	$cond = new ConditionOr();
					}
	s1=STRING			{	$cond.addCondition($s1.text);
					}
	(OR s2=STRING			{	$cond.addCondition($s2.text);
					}
	)+
	-> ^(OR STRING+)
	;
	
condition_and returns [Condition cond]
	:				{	$cond = new ConditionAnd();
					}
	s1=STRING			{	$cond.addCondition($s1.text);
					}
	(AND s2=STRING			{	$cond.addCondition($s2.text);
					}
	)+
	-> ^(AND STRING+)
	;

move returns [Move move]
	: (c_m=choose_move		{	$move = $c_m.move;
					}
	| STRING			{	$move = new Move();
						$move.addMove($STRING.text);
					}
	)
	;

choose_move returns [Move move]
	:				{	$move = new Move();
					}
	CHOOSE '(' (STRING		{	$move.addMove($STRING.text);
					}
	)+ ')'
	-> ^(CHOOSE STRING+)
	;

attack returns [Attack attack]
	: ( c_a=choose_attack		{	$attack = $c_a.attack;
					}
	| STRING			{	$attack = new Attack();
						$attack.addAttack($STRING.text);
					}
	)
	;

choose_attack returns [Attack attack]
	:				{	$attack = new Attack();
					}
	CHOOSE '(' (STRING		{	$attack.addAttack($STRING.text);
					}
	)+ ')' -> ^(CHOOSE STRING+)
	;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

NUMBER
	: '0'..'9'+
	;

WHITESPACE
	: ('\t'|' '|'\r'|'\n'|'\u000C')+ { $channel = HIDDEN; }
	;
 
STRING
	: ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')+
	;