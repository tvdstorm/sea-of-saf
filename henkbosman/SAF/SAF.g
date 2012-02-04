grammar SAF;

options {   language = Java; }
@header {import java.util.LinkedList;}

INT	  	:	('0'..'9')+;
WS	  	:	(' ' | '\t' ) {$channel=HIDDEN;};
NEWLINE		:	('\n' | '\r')+ ;
OPERATOR	:	('and' | 'or');
CHOOSE		:	('choose');
NAME		:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

fighter returns [Fighter f]
 @init{$f = new Fighter();}
 
:	n=NAME {$f.name($n.text);} NEWLINE '{' 
		(
			  NEWLINE 
			| p=property {$f.addProperty(p);}
			| c=activity {$f.addActivity(c);}
		)* 
	'}' {};

property returns [Property p]:	n=NAME '=' v=INT NEWLINE {$p=new Property($n.text, $v.text);};

activity returns [Activity a]
:	 
	 c=condition '[' m=movement ac=action ']' NEWLINE {$a = new Activity(c,m,ac);}
	;

condition returns [Condition c]
	:	
	  (n=NAME {$c = new Condition($n.text);} | '(' cc=condition {$c = new Condition(cc);} ')') (o=OPERATOR sc=condition {$c.addSubCondition($o.text,sc);})?
;



movement returns[Movement m]
:
	(n=NAME {$m = new Movement($n.text);})
	|(c=choose {$m = new Movement(c);})
	;
	
action returns[Action a]
:
	(n=NAME {$a = new Action($n.text);})
	|(c=choose {$a = new Action(c);})
	;

choose returns[List<String> s]
@init{$s = new LinkedList<String>();}
:	
	CHOOSE '('
	(n=NAME {$s.add($n.text);})+ 
	')'
	;















