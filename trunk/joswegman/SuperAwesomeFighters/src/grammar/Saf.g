grammar Saf;

options {
  language = Java;
}

@header {
  package grammar;
}

@lexer::header {
  package grammar;
}



bot returns [Bot value]
      : ID '{' c=characteristic* & r=rule*  '}'
        {$value = new Bot(c, r);}
      ;

attrib  
      : characteristic
      | rule
      ;
  
rule returns [Rule value]
      : i=ID'['e=inputRule f=inputRule']'
        {$value = new Rule ( e , f);}
      ;
  
inputRule returns [InputRule value]
      : e=ID {$value = new InputRule($e.text, "");}
      |'choose' '(' i=ID j=ID ')' {$value = new InputRule($i.text, $j.text);}
      ; 

characteristic returns [Charasteristic value]
      : e=ID '=' i=INT    
        {$value= new Charasteristic( $e.text, Integer.parseInt($i.text));}
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




