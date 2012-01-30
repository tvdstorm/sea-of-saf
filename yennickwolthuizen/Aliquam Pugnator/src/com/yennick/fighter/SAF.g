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
	:	IDENT '[' a1=action a2=action ']'
		{
			$behaviour = new Behaviour($IDENT.text); 
		}
	;

action returns [Action action]
	:	(
		CHOOSE '(' a1=IDENT a2=IDENT ')' 
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