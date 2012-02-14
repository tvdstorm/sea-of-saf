grammar SAF;

options {
  language = Java;
  output = AST;
}

tokens
{
	CHOOSE  		= 'choose'; 
}

@header {
  package com.yennick.fighter;
  import com.yennick.fighter.bot.*;
}

@lexer::header {
  package com.yennick.fighter;
}



fighter returns [Bot fighter]
	: IDENT '{' {			$fighter = new Bot($IDENT.text); }
			(personality {$fighter.addPersonality($personality.personality);}
			|behaviour {$fighter.addBehaviour($behaviour.behaviour);})* 
		'}'
		{
			System.out.println("FighterName:  " + $fighter.toString()); 
		}
	;

behaviour returns [Behaviour behaviour]
	:
	 {
			$behaviour = new Behaviour(); 
		}
		(condition {$behaviour.addCondition($condition.condition);} )
		 '[' a1=action a2=action ']'
		
	;


condition returns [Condition condition]
	: IDENT { $condition = new Condition($IDENT.text); }
		| IDENT 'or' condition 
		| IDENT 'and' condition 
	;


action returns [Action action]
	:	(
		'choose' '(' a1=IDENT a2=IDENT ')' 
		| act=IDENT
		)
 	;
	
	
personality returns [Personality personality]
	: IDENT '=' VALUE
		{
			$personality = new Personality($IDENT.text,Integer.parseInt($VALUE.text)); 
		}
	;
	

IDENT	: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'_')*;
VALUE	: '0'..'9'+;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n' )*   { $channel = HIDDEN; } ;

COMMENT : '//' .* ('\n'|'\r')   { $channel = HIDDEN; } ;
MULTI_COMMENT : '/*' .* '*/'   { $channel = HIDDEN; } ;