grammar saf;

options {
  language = Java;
   output=AST;
}

tokens{
  BEHAVIOUR;
  CHARACTERISTIC;
  BETWEEN;
  PROGRAM;
}

@header {
  package Parser;
  import model.*;
}

@lexer::header {
  package Parser;
}

@parser::members {
    //Fighter fighter;
    //List<Characteristic> personality = new ArrayList<Characteristic>();
    //List<Rule> behaviour = new ArrayList<Rule>();
}

program returns [Arena arena] @init{$arena = new Arena();}
  :    
    (fighter)+ EOF; 

fighter returns [Fighter fighter]
  : ID L_CURLY R_CURLY
    { 
          String figtherName = $ID.text;
          $fighter = new Fighter();
    }
  ;
  
ID : ('A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9'| '_')*;

L_BRACKET : '[';
R_BRACKET : ']';
L_CURLY : '{';
R_CURLY : '}';
L_PAR : '(';
R_PAR : ')';
DIGIT : '0'..'9' | '10';
AND : 'and'|'AND' | '&&' | ',';
OR : 'or'| 'OR' | '||' | '|';
EOF: '<EOF>';
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ { $channel = HIDDEN; };