grammar SAFGrammar;

options {
  language = Java;
  output = AST;
}

@header {
package safcr.antlr;
}

@lexer::header {
package safcr.antlr;
}
  
bot
    :   name '{'
        personality
        behaviour 
        '}'
    ;

name
    :   ID
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

move_action
    :  move_action_type
		;
		
fight_action
    :   fight_action_type
    ;

condition
    :   condition_type '[' ('choose' '(' move_action move_action ')')? move_action? fight_action? ('choose' '(' fight_action fight_action ')')? ']'
    ;

characteristic
    :   (PUNCHREACH
    |   KICKREACH
    |   KICKPOWER
    |   PUNCHPOWER)
        '=' INT
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
PUNCHREACH : 'punchReach' ;
KICKREACH : 'kickReach' ;
KICKPOWER : 'kickPower' ;
PUNCHPOWER : 'punchPower';
    
// class defintion
/*classDefinition[SAFAST mod]
    :   'class' cname=ID
        ('extends' sup=typename)?
        ('implements' i+=typename (',' i+=typename)*)?
        '{'
        ( variableDefinition
        | methodDefinition
        | ctorDefinition
        )*
        '}'
        -> ^('class' ID {$mod} ^('extends' $sup)? ^('implements' $i+)?
            variableDefinition* ctorDefinition* methodDefinition*
            )
    ;
*/

// General 
ID : ('a'..'z' |'A'..'Z' )('a'..'z' |'A'..'Z' | '0'..'9')* ;
INT : '0'..'9'+ ;
WS : (' ' |'\t' |'\n' |'\r' |'\f' )+ {$channel = HIDDEN;} ;
COMMENT : '//' .* ('\n' | '\r') {$channel = HIDDEN;} ;
MULTILINE_COMMENT : '/*' .* '*/' {$channel = HIDDEN;} ;
