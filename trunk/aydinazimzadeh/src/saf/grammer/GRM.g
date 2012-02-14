grammar GRM;

options {
  language = Java;
  output = AST;
}

@header {
  package saf.grammer;
}

@lexer::header {
	package saf.grammer;  
}

saf	 
	: fighter+ EOF 
	;	
	
	
fighter 
    : IDENT '{' strength* tactic* '}' 
    ;

strength
  : IDENT '=' INTEGER; 

tactic
  : condition '[' action action ']'
  ;
  
condition
  : IDENT expr condition
  | IDENT 
  ; 
  
action
  : IDENT 
  |IDENT '('IDENT+')'
  ;

expr
	: 'and' 
	| 'or'
	;


fragment LETTER : ('a'..'z' | 'A'..'Z' ) ;
fragment DIGIT : '0'..'9';
INTEGER : DIGIT+ ;
IDENT : LETTER (LETTER | DIGIT | '_')*;
WS   : (' ' | '\t' | '\n' | '\r' | '\f') + {$channel = HIDDEN;}; 
