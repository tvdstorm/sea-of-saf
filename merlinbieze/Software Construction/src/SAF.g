grammar SAF;

options {
  language = Java;
}

@header {
  package saf;
  import saf.ast.*;
  import saf.ast.action.*;
  import saf.ast.condition.*;
  import java.util.ArrayList;
}

@lexer::header  {
  package saf;
  import saf.ast.*;
  import saf.ast.action.*;
  import saf.ast.condition.*;
  import java.util.ArrayList;
}

readin returns [FighterDef bot]
	: IDENT '{' 
	  { $bot = new FighterDef($IDENT.text); } 
	  ( c = characteristic {$bot.addCharacteristics(c); } 
	  | b = behaviour { $bot.addBehaviour(b); } 
	  )* '}' 
	;
  
characteristic returns [Characteristic c]
	: IDENT '=' INT { $c = new Characteristic($IDENT.text, Integer.parseInt($INT.text)); }
	;

behaviour returns [Behaviour b]
	: con=condition '[' mA=action fA=action ']' { $b = new Behaviour(con, mA, fA); }
	;
  
condition returns [Condition con]
	: IDENT { $con = new Atom($IDENT.text); }
	| lhs=IDENT 'or' rhs=IDENT { $con = new Or(new Atom($lhs.text), new Atom($rhs.text)); }
	| lhs=IDENT 'and' rhs=IDENT { $con = new And(new Atom($lhs.text), new Atom($rhs.text)); }
	;
  
action returns [Action a]
	: IDENT { $a = new Single($IDENT.text); }
	| 'choose' '(' a1=action a2=action ')' { $a = new Choose(a1, a2); }
	;

IDENT
	: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;
	

INT 
  : '1'..'9'|'10'+
  ;

WS  :   
  ( ' '
	| '\t'
	| '\r'
	| '\n'
	) {$channel=HIDDEN;}
	;