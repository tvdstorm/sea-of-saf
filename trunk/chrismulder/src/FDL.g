grammar FDL;

tokens {
	SAF_NODE;
	BEHAVIOUR_NODE;
	STRENGTH_NODE;
	CONDITION_NODE;
	ACTION_NODE;
	OR_NODE;
	AND_NODE;
	CHOOSE_NODE;
}

@header {
 package parser;
 import ast.*;
}

@lexer::header {
  package parser;
}
/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/


saf returns [Saf n]
  : NAME { $n = new Saf($NAME.text); } '{'  
      (s=strength  { $n.addStrength($s.n); })* 
      (b=behaviour { $n.addBehaviour($b.n); })* '}'
  ; 
  
strength returns [Strength n]
  :	NAME '=' NUMBER {$n = new Strength($NAME.text, Integer.parseInt($NUMBER.text));};


condition returns [BooleanCondition n]
  : a1=ands  { $n = new OrCondition(); $n.addCondition($a1.n); }
  ('or' a2=ands { $n.addCondition($a2.n); })* 
  ;
  		
ands  returns [BooleanCondition n]
  :	n1=NAME  { $n = new AndCondition(); $n.addCondition(new ConditionAtom($n1.text)); }
  ( 'and' n2=NAME { $n.addCondition(new ConditionAtom($n2.text)); })* 
  ;

behaviour returns [Behaviour n]
  :	condition '[' move attack ']' { $n = new Behaviour($condition.n, $move.n, $attack.n); }
  ;

move returns [Move n]
  : NAME { $n = new MoveAtom ($NAME.text);}
  | 'choose' '(' n1=NAME n2=NAME ')' 
    {
      $n = new MoveChoice(
        new MoveAtom ($n1.text),
        new MoveAtom ($n2.text)
      );
    }
  ;

attack returns [Attack n]
  : NAME { $n = new AttackAtom ($NAME.text);}
  | 'choose' '(' n1=NAME n2=NAME ')' 
    {
      $n = new AttackChoice(
        new AttackAtom ($n1.text),
        new AttackAtom ($n2.text)
      );
    }
  ;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

NUMBER	: (DIGIT)+ ;
WHITESPACE : ( '\t' | ' ' | '\u000C' | '\r' | '\n')+ 	{ $channel = HIDDEN; } ;
NAME :	('a'..'z'|'A'..'Z'|'_')+ ;
fragment DIGIT	: '0'..'9' ;
