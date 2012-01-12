grammar FDL;

options {
  language = Java;
  output = AST;
}

@header {
  package fdl;
}

@lexer::header {
  package fdl;
}

//CHARACTERISTIC  : 'kickPower'
//                | 'kickReach'
//                | 'punchPower'
//                | 'punchReach'
//                ;

IDENT  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

WHITESPACE  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
 
LEFT_PARENTHESIS  : '{';
RIGHT_PARENTHESIS  : '}';

ASSIGN : '=';
INTEGER : '0'..'9'+;

// Fighter definition
//characteristicAssignment : CHARACTERISTIC ASSIGN INTEGER; 
characteristicAssignment : IDENT ASSIGN INTEGER;
fighter : IDENT WHITESPACE* LEFT_PARENTHESIS characteristicAssignment* RIGHT_PARENTHESIS;