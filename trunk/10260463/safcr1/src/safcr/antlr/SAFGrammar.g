grammar SAFGrammar;

options {
  language = Java;
  output = AST;
  ASTLabelType=CommonTree;
}

@header {
package safcr.antlr;
}

@lexer::header {
package safcr.antlr;
}
    
saf
    : bot* EOF
    ;

bot
    :   ID^
        '{'!
        personality
        behaviour 
        '}'!
    ;
    
personality
    :   characteristic*
    ;
    
behaviour
    :   rule*
    ;

rule
    :   condition
    ;

move_actions
    :   (move_action -> move_action
        | CHOOSE '(' move_action move_action ')' -> ^(CHOOSE move_action move_action)
        ) 
    ;

move_action
    :   move_action_type
		;
		
fight_actions
    :   (fight_action -> fight_action
        | CHOOSE '(' fight_action fight_action ')' -> ^(CHOOSE fight_action fight_action)
        ) 
    ;
    		
fight_action
    :   fight_action_type
    ;

condition
    :   (condition_type^)?
        '['! 
        move_actions? 
        fight_actions? 
        ']'! 
    ;

characteristic
    :   (
        PUNCHREACH  '='  pr=INT -> ^(PUNCHREACH $pr)
    |   KICKREACH   '='  kr=INT -> ^(KICKREACH $kr)
    |   KICKPOWER   '='  kp=INT -> ^(KICKPOWER $kp)
    |   PUNCHPOWER  '='  pp=INT -> ^(PUNCHPOWER $pp)
        )
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

// characteristic tokens
PUNCHREACH  : 'punchReach';
KICKREACH   : 'kickReach' ;
KICKPOWER   : 'kickPower' ;
PUNCHPOWER  : 'punchPower';

SAFROOT : 'SAF';
CHOOSE  : 'choose';

// General tokens
fragment LETTER : ('a'..'z' |'A'..'Z' ) ;
fragment DIGIT  : '0'..'9' ;

ID  : LETTER (LETTER | DIGIT)* ;
INT : DIGIT+ ;

WS  : (' ' |'\t' |'\n' |'\r' |'\f' )+ {$channel = HIDDEN;} ;
COMMENT : '//' .* ('\n' | '\r') {$channel = HIDDEN;} ;
MULTILINE_COMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;