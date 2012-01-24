grammar SAF;

options {
  language = Java;
  output=AST;
  ASTLabelType=CommonTree;
}

tokens {
  BEHAVIOUR;
}

@header 
{
  package nl.uva.lap.saf;
}

@lexer::header 
{
  package nl.uva.lap.saf;
}

fighters : fighter*; //you can define multiple fighters in a single file

fighter : IDENT^ '{'! statement* '}'!; 

statement: personalityStatement | behaviourStatement;

personalityStatement: IDENT '='^ INTEGER;

behaviourStatement : conditions^ '['^ actionStatement actionStatement? ']'!; //second action is optional

expression : IDENT | '('! conditions ')'!;
conditions : expression^ (('and' | 'or')^ expression)*;

//possible todo: split in movement action and fight action.
actionStatement : (IDENT | ('choose'^ '('! IDENT+ ')'!)); //note that choose is not recursive

INTEGER : (('1' '0'?) | '2'..'9'); //1 to 10 inclusive
IDENT : ('0'..'9')*('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9' | '-' | '_')*; //identifier has to have atleast one character

//ignore all whitespace and comments:
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMENT : '//' .* ('\n'|'\r') {$channel = HIDDEN;};
MULTICOMMENT : '/*' .* '*/' {$channel = HIDDEN;};