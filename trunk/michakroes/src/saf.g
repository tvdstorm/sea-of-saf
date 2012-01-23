grammar saf;

options {
    output = 'AST';
    //tokenVocab = Calc; 
    //ASTLabelType = CommonTree;
}

tokens {
    BOT_OPEN    = '{' ;
    BOT_CLOSE   = '}' ;
    IS    = '=' ;
    
    BEHA_OPEN   = '[' ;
    BEHA_CLOSE  = ']' ;

    CHOOSE      = 'choose' ;
    
    C_OPEN  = '(';
    C_CLOSE = ')';
    
    SKILLS = 'skills';
    PERSONALITIES = 'personalities';
    PERSONALITY = 'personality';
    BEHAVIOURS = 'behaviours';
    BEHAVIOUR = 'behaviour';
}

/*--------------------------------------------------------------------------
 * PARSER RULES
 *--------------------------------------------------------------------------*/
saf 
  : name BOT_OPEN skills BOT_CLOSE EOF -> ^(name skills);
name  
  : ID;
skills 
  : personalities behaviour -> ^(SKILLS ^(PERSONALITIES personalities) ^(BEHAVIOURS behaviour));
personalities
  : personality+; 
personality
  : characteristic IS strength -> ^(characteristic strength);
strength : INT;
characteristic
  : 'punchPower' 
  | 'punchReach' 
  | 'kickPower' 
  | 'kickReach';
behaviour
  : behaviourrules+;
behaviourrules
  : condition BEHA_OPEN moveAction fightAction BEHA_CLOSE -> ^(condition moveAction fightAction);
//behaviourrule
//  : moveAction fightAction -> ^(moveAction fightAction);
condition
  : 'always' 
  | 'near' 
  | 'far' 
  | 'much_stronger' 
  | 'stronger' 
  | 'even' 
  | 'weaker' 
  | 'much_weaker';
moveAction
  : move 
  | CHOOSE C_OPEN moves C_CLOSE -> ^(CHOOSE moves);
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
  | CHOOSE C_OPEN fights C_CLOSE -> ^(CHOOSE fights);
fights
  : (fight)+;
fight 
  : 'block_low' 
  | 'block_high' 
  | 'punch_low' 
  | 'punch_high' 
  | 'kick_low' 
  | 'kick_high';
 
/*--------------------------------------------------------------------------
 * LEXER RULES
 *--------------------------------------------------------------------------*/
ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT : '0'..'9'+
    ;
 
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;