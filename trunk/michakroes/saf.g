grammar saf;

options {
    output = 'AST';
}

tokens {
    BOT_OPEN    = '{' ;
    BOT_CLOSE   = '}' ;
    IS 		= '=' ;
    
    BEHA_OPEN   = '[' ;
    BEHA_CLOSE  = ']' ;

    CHOOSE     	= 'choose' ;
    
    C_OPEN	= '(';
    C_CLOSE	= ')';
}

/*--------------------------------------------------------------------------
 * PARSER RULES
 *--------------------------------------------------------------------------*/
saf	:	name BOT_OPEN personality behaviour BOT_CLOSE EOF;
name	:	ID;
personality
	:	(characteristic IS strength)+;
strength:	INT;
characteristic
	:	ID;
behaviour
	:	behaviourrules+;
behaviourrules
	:	condition BEHA_OPEN moveAction fightAction BEHA_CLOSE;
condition
	:	ID;
moveAction
	:	move | CHOOSE C_OPEN (move)+ C_CLOSE;
move	:	ID;
fightAction
	:	fight | CHOOSE C_OPEN (fight)+ C_CLOSE;
fight	:	ID;
 
/*--------------------------------------------------------------------------
 * LEXER RULES
 *--------------------------------------------------------------------------*/
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;