grammar SAF;

options {
  language = Java;
}

tokens
{
	CHOOSE       = 'choose'; 
	LEFTCURLY    = '{';
	RIGHTCURLY   = '}';
}

@header {
  package com.yennick.parser;
  import com.yennick.fighter.bot.*;
}

@lexer::header {
  package com.yennick.parser;
  import com.yennick.fighter.bot.*;
}

fighter returns [Bot fighter]
	: IDENT LEFTCURLY? { $fighter = new Bot($IDENT.text); }
		(personality {$fighter.addPersonality($personality.personality);}
		|behaviour {$fighter.addBehaviour($behaviour.behaviour);})* 
		RIGHTCURLY?		
	;

behaviour returns [Behaviour behaviour]
	: cond=condition  '[' moveAction=action fightAction=action ']'
	 { 	$behaviour = new Behaviour($cond.condition, $moveAction.action, $fightAction.action);	}
	;

condition returns [Condition condition]
  : first=andcondition ('or' second=condition {$condition = new CombCondition($first.condition,$second.condition,false); })? {$condition = new ConcreteCondition($first.text); }
  ;
  
andcondition returns [Condition condition]
  : first=singlecondition ('and' second=andcondition {$condition = new CombCondition($first.condition,$second.condition,true); })?  {$condition = new ConcreteCondition($first.text); }
  ;
  
  
singlecondition returns [Condition condition]
  :
  first=IDENT  { $condition = new ConcreteCondition($first.text); } |
   '(' cond=condition ')' { $condition = $cond.condition; } 
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
