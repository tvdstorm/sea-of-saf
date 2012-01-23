grammar SAF;

options {
  language = Java;
}

@header {
  package saf;
  import saf.classes.*;
  import java.util.ArrayList;
}

@lexer::header  {
  package saf;
  import saf.classes.*;
  import java.util.ArrayList;
}

bot returns [Bot bot]
	: IDENT '{' (c = characteristic | b = behaviour)* '}' { $bot = new Bot($IDENT.text, c, b); }
	;
  
characteristic returns [List<Characteristic> c]
	@init { $c = new ArrayList<Characteristic>(); }
	: IDENT '=' INT { $c.add(new Characteristic($IDENT.text, Integer.parseInt($INT.text))); }
	;

behaviour returns [List<Behaviour> b]
  @init { $b = new ArrayList<Behaviour>(); }
	: condition '[' mA=moveAction fA=fightAction ']' { $b.add(new Behaviour($condition.text, mA, fA)); }
	;
  
condition
	: IDENT
	;
  
moveAction returns [List<BehaviourAction> mA]
	@init { $mA = new ArrayList<BehaviourAction>(); }
	: IDENT { $mA.add(new BehaviourAction($IDENT.text)); }
	| 'choose' '(' mAT1=IDENT { $mA.add(new BehaviourAction($mAT1.text)); } mAT2=IDENT { $mA.add(new BehaviourAction($mAT2.text)); } ')'
	;

fightAction returns [List<BehaviourAction> fA]
	@init { $fA = new ArrayList<BehaviourAction>(); }
	: IDENT { $fA.add(new BehaviourAction($IDENT.text)); }
	| 'choose' '(' fAT1=IDENT { $fA.add(new BehaviourAction($fAT1.text)); } fAT2=IDENT { $fA.add(new BehaviourAction($fAT2.text)); } ')'  
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