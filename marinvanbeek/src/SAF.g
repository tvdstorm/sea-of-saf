grammar SAF;

options {
    output = 'AST' ;
}

tokens {
    CURLY_OPEN      = '{' ;
    CURLY_CLOSE     = '}' ;

    EQUAL           = '=' ;

    SQUARE_OPEN     = '[' ;
    SQUARE_CLOSE    = ']' ;

    AND             = 'and' ;
    OR              = 'or' ;

    /* Imaginary nodes, used for tree topology. */
    SAF;
    ATTRIBUTES;
    ATTRIBUTE;
    MOVE;
    ATTACK;
    BEHAVIOUR;
    TACTIC;
    COMPOSED_CONDITION;
    CONDITION;
    LOGIC;
}

@header {
}

@members {
}

/*--------------------------------------------------------------------------
 * PARSER RULES
 *--------------------------------------------------------------------------*/

parse
    : name=STRING super_awesome_fighter -> 
            ^(SAF<SafTreeFighter>[$name.text] super_awesome_fighter)
    ;

super_awesome_fighter 
    : CURLY_OPEN attribute* behaviour CURLY_CLOSE EOF -> 
            ^(ATTRIBUTES<SafTreeAttributes>["_Attributes"] attribute*)
            ^(BEHAVIOUR<SafTreeBehaviour>["_Behaviour"] behaviour)
    ;

attribute
    : (name=STRING EQUAL value=LEVEL) -> 
            ATTRIBUTE<SafTreeAttribute>[$name.text, $value.text]
    ;

behaviour
    : tactic+ -> ^(TACTIC<SafTreeTactic>["_Tactic"] tactic)+
    ;

tactic
    : composed_condition SQUARE_OPEN move=STRING attack=STRING SQUARE_CLOSE ->
            ^(COMPOSED_CONDITION<SafTreeComposedCondition>["_Condition"] composed_condition)
            ^(MOVE<SafTreeMove>[$move.text])
            ^(ATTACK<SafTreeAttack>[$attack.text])
    ;

composed_condition
    : (condition (logic^ condition)*)
    ;

condition
    : name=STRING -> CONDITION<SafTreeCondition>[$name.text]
    ;

logic
    : (var=AND|var=OR) -> LOGIC<SafTreeLogic>[$var.text]
    ;
 

/*--------------------------------------------------------------------------
 * LEXER RULES
 *--------------------------------------------------------------------------*/

LEVEL   
    : '1'..'9' | '10'
    ;

STRING  
    : ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')+ 
    ;

WHITESPACE 
    : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } 
    ;


