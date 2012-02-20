grammar SAF;

options {
  language = Java;
}

@header {
  package saf;
  import saf.ast.*;
  import java.util.ArrayList;
}

@lexer::header  {
  package saf;
  import saf.ast.*;
  import java.util.ArrayList;
}

readin returns [Bot bot]
	: IDENT '{' 
	  { $bot = new Bot($IDENT.text); } 
	  ( c = characteristic {$bot.addCharacteristics(c); } 
	  | b = behaviour { $bot.addBehaviour(b); } 
	  )* '}' 
	;
  
characteristic returns [Characteristic c]
	: IDENT '=' INT { $c = new Characteristic($IDENT.text, Integer.parseInt($INT.text)); }
	;

behaviour returns [Behaviour b]
	: condition '[' mA=action fA=action ']' { $b = new Behaviour($condition.text, mA, fA); }
	;
  
condition
	: IDENT
	| IDENT 'or' IDENT
	| IDENT 'and' IDENT
	;
  
action returns [List<Action> mA]
	@init { $mA = new ArrayList<Action>(); }
	: IDENT { $mA.add(new Action($IDENT.text)); }
	| 'choose' '(' (IDENT {$mA.add(new Action($IDENT.text));} )+ ')'
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