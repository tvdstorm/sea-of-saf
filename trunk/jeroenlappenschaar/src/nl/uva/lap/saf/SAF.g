grammar SAF;

options {
  language = Java;
}

@header {
  package nl.uva.lap.saf;
}

@lexer::header {
  package nl.uva.lap.saf;
}

statement : INTEGER;

INTEGER : '0'..'9'+;
IDENT : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMENT : '//' .* ('\n'|'\r') {$channel = HIDDEN;};
MULTICOMMENT : '/*' .* '*/' {$channel = HIDDEN;};