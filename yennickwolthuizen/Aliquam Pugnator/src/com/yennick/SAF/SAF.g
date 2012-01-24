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
  package com.yennick.SAF;
  import com.yennick.SAF.Bot.*;
}

@lexer::header {
  package com.yennick.SAF;
}



fighter returns [Bot fighter]
	: IDENT '{' 
			(personality|behaviour)* 
		'}'
		{
			$fighter = new Bot($IDENT.text);
			$fighter.addPersonality($personality.personality);
			System.out.println("FighterName:  " + $fighter.toString()); 
		}
	;

behaviour
	:	IDENT '[' action action ']' 
	;
 
action
	:	CHOOSE '(' a1=IDENT a2=IDENT ')' | act=IDENT
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