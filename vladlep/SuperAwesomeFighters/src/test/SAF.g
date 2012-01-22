grammar SAF;

options {
  language = Java;
}
@header {
  package reader.antlr;
}

@lexer::header{
package reader.antlr;
} 
rule: IDENT+;

IDENT : 'a'..'z'+;
WS : ' '+ {$channel = HIDDEN;};