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
  : condition RULE_START (action action) RULE_END -> ^(condition ^(ACTION ^(action action)))
  ;

condition
  : conditionType AND condition
  | conditionType OR condition
  | conditionType
  ;

action
  : actionType | CHOOSE CHOICE_START (action)+ CHOICE_END -> ^(CHOICE (action)+)
  ;
 
actionType
  : STRING
  ;

conditionType
  : STRING
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

