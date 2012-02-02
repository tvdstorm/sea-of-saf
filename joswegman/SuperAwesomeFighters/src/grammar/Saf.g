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
      : i=ID {$b.setName($i.text);} '{' (c=characteristic {$b.addC(c);})* (r=rule {$b.addR($r.value);})* '}' 
      ;

condition returns [Condition value]
      : i=ID {$value = new Condition($i.text, null, "const");} 
      | b=binarycondition {$value = (b);}
      ;

binarycondition returns [Condition value]
      : i=ID 'and' j=condition  {$value =  new Condition($i.text, j, "and");} 
      | k=ID 'or'  l=condition  {$value =  new Condition($k.text, l, "or");} 
      ;
      
rule returns [Rule value, ConditionList c]
       @init {
        $c= new ConditionList();
       }
      : i=condition+ '['m=inputRule f=inputRule']' 
        {$value = new Rule (i, m, f); $c.addCondition(i);}
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

INT   : '0'..'9'*
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
      