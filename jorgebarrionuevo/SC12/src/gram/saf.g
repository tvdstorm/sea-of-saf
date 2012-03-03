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
Fighter fighter;
}

program returns [Arena arena] @init{$arena = new Arena();}
  :      
    f=fighter{$arena.addFighter($f.fighter);}
    ;
fighter returns [Fighter fighter] @init{ $fighter = new Fighter();}
  : 
    ID L_CURLY characteristic * behaviour *
    {
      $fighter.addCharacteristic($characteristic.c);
    } 
    R_CURLY 
    {
      $fighter.setName($ID.text);
    } 
  ;

characteristic returns[Characteristic c]
  :
  CHARACTERISTIC EQ DIGIT {$c = new Characteristic($CHARACTERISTIC.getText(),Integer.parseInt($DIGIT.getText()));}
  ;

behaviour returns[Behaviour b]
  :
  CONDITION_TYPE 
    L_BRACKET MOVE_ACTION FIGHT_ACTION R_BRACKET
        { 
          $b = new Behaviour(new ConditionType($CONDITION_TYPE.getText()), new MoveAction($MOVE_ACTION.getText()), new FightAction($FIGHT_ACTION.getText()));
        }
  ;

ID : ('A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9'| '_')*;
CHARACTERISTIC: ('punchReach' | 'punchPower' | 'kickReach' | 'kickPower');
MOVE_ACTION: ('walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand');
FIGHT_ACTION: ('block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high');
CONDITION_TYPE : ('always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker');
L_BRACKET : '[';
R_BRACKET : ']';
L_CURLY : '{';
R_CURLY : '}';
L_PAR : '(';
R_PAR : ')';
DIGIT : '0'..'9' | '10';
AND : 'and'|'AND' | '&&' | ',';
OR : 'or'| 'OR' | '||' | '|';
EQ: '=';
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ { $channel = HIDDEN; };