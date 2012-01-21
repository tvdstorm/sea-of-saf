grammar Saf1;

options {
  language = Java;
}

@header {
  package grammar;
  import grammar.Evaluators.*;
}

@lexer::header {
  package grammar;
  
}

prog  : bot+;

bot   : ID '{' (characteristic)+  (rule)+  '}'
      ;

attrib  
      : characteristic
      | rule
      ;
  
rule  : ID'['inputRule inputRule']'
      ;
  
inputRule 
      : ID 
      |'choose' '(' ID ID ')'
      ; 

characteristic 
      : ID '=' INT    
      ;


ID    : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
      ;

INT   : '0'..'9'+
      ;
      
COMMENT
      :     '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
      |     '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
      ;

WS    :   ( ' '
          | '\t'
          | '\r'
          | '\n'
          )+ {$channel=HIDDEN;}
      ;
