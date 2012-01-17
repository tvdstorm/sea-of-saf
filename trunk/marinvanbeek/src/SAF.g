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
    BEHAVIOUR;
    TACTIC;
    CONDITION;
    MOVE;
    ATTACK;
}

@header {
}

@members {
//    class V extends CommonTree {
//        public V(Token t) { token=t;}                 // for 'int'<V>
//        public V(V node) { super(node); }             // for dupNode
//        public V(int tType, String name) { token=new CommonToken(tType, name); }
//        public Tree dupNode() { return new V(this); } // for dup'ing type
//        public String toString() { return token.getText()+"<V>";}
//    }
}

/*--------------------------------------------------------------------------
 * PARSER RULES
 *--------------------------------------------------------------------------*/

parse
    : name=STRING super_awesome_fighter -> 
            ^(SAF<SafTreeFighter>[$name.text] super_awesome_fighter)
    ;

super_awesome_fighter 
    : CURLY_OPEN attributes behaviour CURLY_CLOSE EOF -> 
            ^(ATTRIBUTES<SafTreeAttributes>[$attributes.text] attributes)
            ^(BEHAVIOUR behaviour)
    ;

attributes
    : (attribute=STRING EQUAL LEVEL)+ -> 
            (ATTRIBUTE<SafTreeAttribute>[$attribute.text, LEVEL] LEVEL)+
    ;

behaviour
    : tactic+ -> ^(TACTIC<SafTreeTactic>["Tactic"] tactic+)
    ;

tactic
    : complex_condition SQUARE_OPEN move=STRING attack=STRING SQUARE_CLOSE ->
            ^(CONDITION<SafTreeCondition>["Condition"] )
            ^(MOVE<SafTreeMove>[$move.text] )
            ^(ATTACK<SafTreeAttack>[$attack.text] )
    ;

complex_condition
    : (condition=STRING ((AND|OR)^ condition=STRING)*) 
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


