grammar Saf;

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

bot  returns [Bot value]
      : ID '{' (c=characteristic)+  (r=rule)+  '}'
        {$value = new Bot(c,r);}
      ;

rule returns [Rule value]
      : i=ID'['e=inputRule f=inputRule']'
        {$value = new Rule ($i.text, e, f); }
      ;

inputRule returns [InputRule value]
      : i=ID {$value = new InputRule ($i.text , null);} 
      |'choose' '(' i=ID j=ID ')'
        {$value = new InputRule($i.text, $j.text);}
      ; 

characteristic returns [Characteristic value] 
      : i=ID '=' j=INT
        {$value = new Characteristic ($i.text, Integer.parseInt($j.text)); }
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

