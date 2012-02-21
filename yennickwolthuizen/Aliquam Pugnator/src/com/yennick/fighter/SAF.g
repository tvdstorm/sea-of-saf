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
			System.out.println( $fighter.toString()); 
		}
	;

behaviour returns [Behaviour behaviour]
	:
	 {
			$behaviour = new Behaviour(); 
		}
		(condition {$behaviour.addCondition($condition.condition);} )
		 '[' a1=action a2=action ']' {$behaviour.addAction($a1.action,$a2.action);}
		
	;

condition returns [Condition condition]
	: IDENT { $condition = new Condition($IDENT.text); }
		| first=IDENT 'or' second=IDENT { $condition = new Condition($first.text,$second.text,"or"); }
		| first=IDENT 'and' second=IDENT { $condition = new Condition($first.text,$second.text,"and"); }
	;


action returns [Action action]
	:	(
		'choose' '(' a1=IDENT a2=IDENT ')' { $action = new Action($a1.text, $a2.text,true); }
		| act=IDENT { $action = new Action($act.text); }
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
