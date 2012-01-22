grammar SAF;

options {   language = Java; } 

CONDITION 	:	'stronger'|'weaker'| 'much_stronger'| 'much_weaker'| 'even'| 'near'|'far'| 'always';
MOVEMENT  	:	'jump' |'crouch' |'stand'| 'run_towards'| 'run_away'| 'walk_towards'| 'walk_away';
ACTION 	  	:	'punch_low' |'punch_high' |'kick_low' |'kick_high' |'block_low' |'block_high';
INT	  	:	'1'..'9' | '10';
WS	  	:	(' ' | '\t' )+;
NEWLINE		:	(WS*'\n' | WS*'\r')+ ;
PROPERTY	:	'punchReach'|'kickReach'|'kickPower'|'punchPower';
NAME		:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
IS		:	(WS*'='WS*);
SQUAREOPEN	:	(WS*'['WS*);
SQUARECLOSE	:	(WS*']'WS*);
CURLYOPEN	:	(WS*'{'WS*);
CURLYCLOSE	:	(WS*'}'WS*);
PARENTHESESOPEN	:	(WS*'('WS*);
PARENTHESESCLOSE:	(WS*')'WS*);

fighter 
: NAME NEWLINE CURLYOPEN NEWLINE codeline+ CURLYCLOSE {System.out.println("fighter");};

codeline
: 	  WS* PROPERTY IS INT NEWLINE {System.out.println("codeline property");}
	| WS* condition SQUAREOPEN choosemovement chooseaction SQUARECLOSE NEWLINE{System.out.println("codeline condition");}
	| WS* NEWLINE	{System.out.println("codeline newline");}
;

condition
: (
	  CONDITION {System.out.println("condition");} 
	| CONDITION WS+ 'and' WS+ CONDITION {System.out.println("condition and");}
	| CONDITION WS+ 'or' WS+ CONDITION {System.out.println("condition or");}
  );

choosemovement
: (MOVEMENT WS+ {System.out.println("movement");}
	| 'choose' PARENTHESESOPEN MOVEMENT WS+ MOVEMENT PARENTHESESCLOSE) {System.out.println("choose movement");};

chooseaction
: (ACTION {System.out.println("action");}
	| 'choose' PARENTHESESOPEN ACTION WS+ ACTION PARENTHESESCLOSE) {System.out.println("choose action");};














