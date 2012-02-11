grammar saf;

options {
    language = Java;
}

@header { package saf; }

@lexer::header {
  package saf;
}

/*--------------------------------------------------------------------------
 * LEXER RULES
 *--------------------------------------------------------------------------*/
CHOOSE  : ('choose')*;
INT : '0'..'9'+;
ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ; 
 
/*--------------------------------------------------------------------------
 * PARSER RULES
 *--------------------------------------------------------------------------*/
saf returns[Saf saf]
  : name '{' personality behaviour '}' EOF 
  { $saf = new Saf($name.text, $personality.p); }
  ;
name   
  : ID; 
personality returns[Personality p]
  : strength+ 
  { $p = new Personality(); }
  ; 
strength
  : characteristic '=' power;
power: INT;
characteristic
  : 'punchPower' 
  | 'punchReach' 
  | 'kickPower' 
  | 'kickReach';
behaviour
  : behaviourrules+;
behaviourrules
  : condition '[' moveAction fightAction ']' ;
condition
  : ID;
moveAction
  : move 
  | CHOOSE '(' moves ')';
moves
  : (move)+;
move  
  : 'walk_towards' 
  | 'walk_away' 
  | 'run_towards' 
  | 'run_away' 
  | 'jump' 
  | 'crouch' 
  | 'stand';
fightAction
  : fight 
  | CHOOSE '(' fights ')';
fights
  : (fight)+;
fight 
  : ID;
 
