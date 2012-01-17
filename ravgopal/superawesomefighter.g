grammar superawesomefighter;

options {
  language = Java;
  output = AST;
}

tokens {
  FIGHTER_START = '{';
  FIGHTER_END = '}';
  EQLS = '=';
  RULE_START = '[';
  RULE_END = ']';
  CHOICE_START = '(';
  CHOICE_END = ')';
  AND = 'and';
  OR = 'or';
  CHOOSE = 'choose';
  
  NAME;
  PERSONALITY;
  CHARACTERISTIC;
  BEHAVIOUR;
  ACTION;
  CONDITION;
}

/* PARSER RULES */
fighter
  : name FIGHTER_START personality behaviour FIGHTER_END EOF
  ;

name
  : ID
  ;

personality
  : (characteristic EQLS INT)*
  ;

characteristic
  : 'punchReach'
  | 'punchPower'
  | 'kickReach'
  | 'kickPower'
  ;
  
behaviour
  : (rule)*
  ;

rule
  : condition RULE_START (move fight) RULE_END
  ;

condition
  : conditionType AND condition
  | conditionType OR condition
  | conditionType
  ;

move
  : moveAction | CHOOSE CHOICE_START (moveAction)+ CHOICE_END
  ;
 
fight
  : fightAction | CHOOSE CHOICE_START (fightAction)+ CHOICE_END;
  
moveAction
  : 'walk_towards'
  | 'walk_away'
  | 'run_towards'
  | 'run_away'
  | 'jump'
  | 'crouch'
  | 'stand'
  ;

fightAction
  : 'block_low'
  | 'block_high'
  | 'punch_low'
  | 'punch_high'
  | 'kick_low'
  | 'kick_high'
  ;

conditionType
  : 'always'
  | 'near'
  | 'far'
  | 'much_stronger'
  | 'stronger'
  | 'even'
  | 'weaker'
  | 'much_weaker'
  ;


/* LEXER RULES */
ID
  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
  ;

INT
  : '0'..'9'+
  ;

WS
  : ( ' '
    | '\t'
    | '\r'
    | '\n'
    ) {$channel=HIDDEN;}
  ;

