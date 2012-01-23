grammar SAFGrammar;

options {
  language = Java;
  output = AST;
  ASTLabelType=CommonTree;
}

tokens{
	  ROOT;
	  BOT;
	  NAME;
	  PERSONALITY;
	  CHARACTERISTIC;
	  BEHAVIOUR;
	  RULE;
	  MOVE_ACTION;
	  FIGHT_ACTION;
	  CONDITION;
	  CHOOSE = 'choose';
}

@header {
package safcr.antlr;
}

@lexer::header {
package safcr.antlr;
}

saf
    : bot* EOF -> ^(ROOT bot*)
    ;

bot
    :   ID
        '{'
        personality
        behaviour 
        '}'
        -> ^(BOT ^(NAME ID) ^(PERSONALITY personality) ^(BEHAVIOUR behaviour))
    ;
    
personality
    :   characteristic* ->  ^(CHARACTERISTIC characteristic*)
    ;
    
behaviour
    :   expression*
    ;
    
expression
    :   and_expr
    ;
    
and_expr 
    :   or_expr (AND^ and_expr)*
    ;
    
or_expr 
    :   rule | OR^ expression
    ;

rule
    :   condition? 
        '['
        move_actions? 
        fight_actions? 
        ']'
        -> ^(RULE condition? move_actions? fight_actions?)
    ;

move_actions
    :   move_action
        | CHOOSE^ '('! move_action move_action ')'!
    ;

move_action
    :   move_action_type -> ^(MOVE_ACTION move_action_type)
		;
		
fight_actions
    :   fight_action
        | CHOOSE^ '('! fight_action fight_action ')'!
    ;
    		
fight_action
    :   fight_action_type -> ^(FIGHT_ACTION fight_action_type)
    ;

condition
    :   condition_type -> ^(CONDITION condition_type)
    ;

characteristic
    :   characteristic_properties^ '='! PROPERTIES_VALUE
    ;
    
condition_type
    :   'stronger'
    |   'weaker'
    |   'much_stronger'
    |   'much_weaker'
    |   'even'
    |   'near'
    |   'far'
    |   'always' 
    ;

move_action_type
    :   'jump'
    |   'crouch'
    |   'stand'
    |   'run_towards'
    |   'run_away'
    |   'walk_towards'
    |   'walk_away'
    ;

fight_action_type
    :   'punch_low'
    |   'punch_high'
    |   'kick_low'
    |   'kick_high'
    |   'block_low'
    |   'block_high' 
    ;
    
characteristic_properties
    :   'punchReach'
    |   'kickReach'
    |   'kickPower'
    |   'punchPower'
    ;

// General tokens
AND: ('and' | 'AND' | '&&');
OR: ('or' | 'OR' '|');
PROPERTIES_VALUE  : ('10' | '1'..'9');

fragment LETTER : ('a'..'z' |'A'..'Z' ) ;
fragment DIGIT  : '0'..'9' ;

ID  : LETTER (LETTER | DIGIT)* ;
INT : DIGIT+ ;

WS  : (' ' |'\t' |'\n' |'\r' |'\f' )+ {$channel = HIDDEN;} ;
COMMENT : '//' .* ('\n' | '\r') {$channel = HIDDEN;} ;
MULTILINE_COMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;