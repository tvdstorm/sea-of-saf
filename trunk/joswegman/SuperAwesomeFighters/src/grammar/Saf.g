grammar Saf;

options {
  language = Java;
}

@header {
package grammar;
import  grammar.Evaluators.*;
}

@lexer::header {
package grammar;
}



bot returns [Bot b]
      @init {
        $b = new Bot();
      }
      : i=ID {$b.setName($i.text);} '{' (c=characteristic {$b.addC(c);})* (r=rule {$b.addR(r);})* '}' 
      ;

conditions returns [Conditions value]
      @init {
        $value = new Conditions();
      }
      : c=condition+ {$value.addCondition(c);}
      ; 

condition returns [Condition value]
      : i=ID {$value = new Const($i.text);} //subclass Condition
      | b=binairycondition {$value = (b);}
      ;

binairycondition returns [Condition value]
      : i=ID 'and' j=ID  {$value =  new ConAnd($i.text, $j.text);} 
      | k=ID 'or' l=ID   {$value =  new ConOr($k.text, $l.text);} 
      ;
      
rule returns [Rule value] 
      : i=conditions '['e=inputRule f=inputRule']' 
        {$value = new Rule (i, e, f);}
      ;

inputRule returns [InputRule value]
      : i=ID {$value = new InputRule ($i.text , null);} 
      | 'choose' '(' i=ID j=ID ')' 
        {$value = new InputRule($i.text, $j.text);}
      ; 

characteristic returns [Characteristic value] 
      : i=ID '=' j=INT 
        {$value = new Characteristic ($i.text, Integer.parseInt($j.text)); }
      ;
      
ID    : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
      ;

INT   : '1'..'9'|'10'
      ;
      
COMMENT
      :     '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
      |     '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
      ;

NEWLINE
      : ('\r'
      |  '\n'
      ){$channel=HIDDEN;}
      ; 
      
WS    :   
      ( ' '
      | NEWLINE
      | '\t'
      )+ {$channel=HIDDEN;}
      ;
      