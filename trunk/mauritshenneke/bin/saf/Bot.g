grammar bot;

options {
  language = Java;
}

@header {
  package saf;
}

@lexer::header {
  package saf;
}

bot : IDENT '{'attribute*'}' ;

attribute    : characteristic | behaviour ;

characteristic : IDENT '=' INTEGER;

behaviour   : IDENT '[' behaviour_attribute behaviour_attribute']' ;

behaviour_attribute
    : IDENT
    | 'choose' '(' IDENT IDENT+ ')'
    ;

IDENT   : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INTEGER : '0'..'9'+ ;
WS  : ( ' ' | '\t' | '\f' | '\r' | '\n') { $channel = HIDDEN; };
