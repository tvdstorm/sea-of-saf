grammar SAF;

options {
  output = AST;
  ASTLabelType = CommonTree;
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
  CHOICE;
}

/* PARSER */
fighter
  : name FIGHTER_START personality behaviour FIGHTER_END EOF -> ^(name ^(PERSONALITY personality) ^(BEHAVIOUR behaviour))
  ;

name
  : STRING
  ;

personality
  : (characteristic EQLS INT)* -> ^(characteristic INT)*
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
  : condition RULE_START (move fight) RULE_END -> ^(condition ^(ACTION ^(move fight)))
  ;

condition
  : conditionType AND condition
  | conditionType OR condition
  | conditionType
  ;

move
  : moveAction | CHOOSE CHOICE_START (moveAction)+ CHOICE_END -> ^(CHOICE (moveAction)+)
  ;
 
fight
  : fightAction | CHOOSE CHOICE_START (fightAction)+ CHOICE_END -> ^(CHOICE (fightAction)+)
  ;
  
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


/* LEXER */
STRING
  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
  ;

INT
  : '0'..'9'+
  ;

WHITESPACE
  : ( ' '
    | '\t'
    | '\r'
    | '\n'
    ) {$channel=HIDDEN;}
  ;

