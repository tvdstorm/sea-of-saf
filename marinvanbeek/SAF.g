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
    NAME;
    TRAITS;
    BEHAVIOURS;
    ACTION;
    CONDITION;
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
    : super_awesome_fighter -> ^(SAF<SafFighter>["SAF"] super_awesome_fighter)
    ;

super_awesome_fighter 
    : name CURLY_OPEN traits behaviour CURLY_CLOSE EOF -> ^(NAME<SafName>[$name.text]) ^(TRAITS<SafTraits>[$traits.text] traits) ^(BEHAVIOURS behaviour)
    ;

name
    : STRING
    ;

traits
    : (property EQUAL LEVEL)+ -> ^(property LEVEL)+
    ;

property
    : STRING
    ;

behaviour
    : (complex_condition action)+ -> ^(CONDITION complex_condition ^(ACTION action))+
    ;

complex_condition
    : (condition ((AND|OR)^ condition)*) 
    ;

condition
    : STRING
    ;

action
    : SQUARE_OPEN move attack SQUARE_CLOSE -> move attack
    ;

move
    : STRING
    ;

attack
    : STRING
    ;
 

/*--------------------------------------------------------------------------
 * LEXER RULES
 *--------------------------------------------------------------------------*/

LEVEL   
    : '0'..'9' 
    ;

STRING  
    : ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')+ 
    ;

WHITESPACE 
    : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ { $channel = HIDDEN; } 
    ;


