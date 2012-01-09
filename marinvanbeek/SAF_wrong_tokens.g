grammar SuperAwesomeFighters;

tokens {
    /* Strengths. */
    KICK_REACH      = 'kick_reach' ;
    PUNCH_REACH     = 'punch_reach' ;
    KICK_POWER      = 'kick_power' ;
    PUNCH_POWER     = 'punch_power' ;

    /* Conditions. */
    STRONGER        = 'stronger' ;
    WEAKER          = 'weaker' ;
    MUCH_STRONGER   = 'much_stronger' ;
    MUCH_WEAKER     = 'much_weaker' ;
    EVEN            = 'even' ;
    NEAR            = 'near' ;
    FAR             = 'far' ;
    /* Required condition. */
    ALWAYS          = 'always' ;

    /* Moves. */
    JUMP            = 'jump' ;
    CROUCH          = 'crouch' ;
    STAND           = 'stand' ;
    RUN_TOWARDS     = 'run_towards' ;
    RUN_AWAY        = 'run_away' ;
    WALK_TOWARDS    = 'walk_towards' ;
    WALK_AWAY       = 'walk_away' ;

    /* Attacks. */
    PUNCH_LOW       = 'punch_low' ;
    PUNCH_HIGH      = 'punch_high' ;
    KICK_LOW        = 'kick_low' ;
    KICK_HIGH       = 'kick_high' ;
}

/*--------------------------------------------------------------------------
 * PARSER RULES
 *--------------------------------------------------------------------------*/


super_awesome_fighter 
    : STRING '\n' { '\n' personality behaviour } 
    ;

personality
    : '    ' KICK_REACH  ' = ' LEVEL '\n'
      '    ' PUNCH_REACH ' = ' LEVEL '\n'
      '    ' KICK_POWER  ' = ' LEVEL '\n'
      '    ' PUNCH_POWER ' = ' LEVEL '\n'
    ;

behaviour
    : (condition ' ' action '\n')* ALWAYS ' ' action '\n'
    ;

condition
    :   STRONGER
    |   WEAKER
    |   MUCH_STRONGER
    |   MUCH_WEAKER
    |   EVEN
    |   NEAR
    |   FAR
    ;

action
    : '[' move ' ' attack ']'
    ;

move
    :   JUMP
    |   CROUCH
    |   STAND
    |   RUN_TOWARDS
    |   RUN_AWAY
    |   WALK_TOWARDS
    |   WALK_AWAY
    ;

attack
    :   PUNCH_LOW
    |   PUNCH_HIGH
    |   KICK_LOW
    |   KICK_HIGH
    ;
 

/*--------------------------------------------------------------------------
 * LEXER RULES
 *--------------------------------------------------------------------------*/

LEVEL   
    : '0'..'9' 
    ;
STRING  
    : ('a'..'z' | 'A'..'Z' | '0'..'9')+ 
    ;
WHITESPACE 
    : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } 
    ;


