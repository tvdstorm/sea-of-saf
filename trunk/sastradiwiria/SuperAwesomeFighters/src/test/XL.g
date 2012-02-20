grammar XL;

options { 
  language = Java;
}

@header {
  package test;
}

@lexer::header {
  package test;
}


WS : (' ' | '\\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};

//rule: IDENT+;

program
  : 'program' IDENT '='
     (constant | variable)*
    'begin'
    'end' IDENT '.'
  ;
  

constant
  : 'constant' IDENT ':' type ':=' expression ';'
;

variable :
'var' IDENT (',' IDENT)* ':' type ';'
;

type
: 'Integer'
;

expression
: INTEGER
;



INTEGER : '0'..'9'+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;

//WS : ' '+ {$channel = HIDDEN;};
