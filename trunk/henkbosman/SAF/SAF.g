grammar SAF;

options {   language = Java; }
@header {import java.util.LinkedList;}

INT	  	:	('0'..'9')+;
WS	  	:	(' ' | '\t' ) {$channel=HIDDEN;};
NEWLINE		:	('\n' | '\r')+ ;
OPERATOR	:	('and' | 'or');
CHOOSE		:	('choose');
NAME		:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
IS		:	('=');
SQUAREOPEN	:	('[');
SQUARECLOSE	:	(']');
CURLYOPEN	:	('{');
CURLYCLOSE	:	('}');
PARENTHESESOPEN	:	('(');
PARENTHESESCLOSE:	(')');

fighter returns [Fighter f]
 @init{$f = new Fighter();}
 
:	n=NAME {$f.Name($n.text);} NEWLINE CURLYOPEN 
		(
			  NEWLINE 
			| p=property {$f.AddProperty(p);}
			| c=activity {$f.AddActivity(c);}
		)* 
	CURLYCLOSE {};

property returns [Property p]:	n=NAME IS v=INT NEWLINE {$p=new Property($n.text, $v.text);};

activity returns [Activity a]
@init{$a = new Activity();}
:	 
	 (c=condition {$a.AddCondition(c);})+ 
	 SQUAREOPEN m=movement {$a.AddMovement(m);} ac=action {$a.AddAction(ac);} SQUARECLOSE
	;


condition returns[Condition c]
:
	 (n=NAME {$c=new Condition($n.text);})
	|(o=OPERATOR m=NAME {$c=new Condition($m.text, $o.text);})
	;

movement returns[Movement m]
@init{$m = new Movement();}
:
	(n=NAME {$m.AddMovement($n.text);})
	|(c=choose {$m.AddMovement(c);})
	;
	
action returns[Action a]
@init{$a = new Action();}
:
	(n=NAME {$a.AddAction($n.text);})
	|(c=choose {$a.AddAction(c);})
	;

choose returns[List<String> s]
@init{$s = new LinkedList<String>();}
:	
	CHOOSE PARENTHESESOPEN
	(n=NAME {$s.add($n.text);})+ 
	PARENTHESESCLOSE
	;















