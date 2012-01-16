grammar SAF;
options { 
output=AST; ASTLabelType=CommonTree;

}

@header {
  package Generated;
}
@lexer::header
{
  package Generated;
}

bots  :
  bot* ;
bot :
  name NEWLINE* '{' NEWLINE*  (behavior | personality)+ '}' NEWLINE* ;
name :
  ID subname*;
subname :
  (ID | INT);
  
personality:
  WS* CHARACTERISTIC WS* '=' WS* INT NEWLINE;

behavior:
  WS* condition '[' (MoveActionType | choose) WS (FightActionType | choose) ']' NEWLINE;

condition:
   ConditionType conditionRule*;
conditionRule:
   (WS+ 'and' WS+ ConditionType |
    WS+ 'or' WS+ ConditionType);
  
choose:
  CHOOSE  '(' (MoveActionType WS MoveActionType | FightActionType WS FightActionType) ')';


CHARACTERISTIC  
      : ('punchReach'
        |'punchPower' 
        |'kickReach'  
        |'kickPower');

MoveActionType
      : ( 'walk_towards' 
        | 'walk_away' 
        | 'run_towards'  
        | 'run_away'
        | 'jump'
        | 'crouch'
        | 'stand') {};

FightActionType
      : ( 'block_low' 
        | 'block_high' 
        | 'punch_low'  
        | 'punch_high'
        | 'kick_low'
        | 'kick_high');

ConditionType
      : ( 'always' 
        | 'near' 
        | 'far'  
        | 'much_stronger'
        | 'stronger'
        | 'even'
        | 'weaker'
        | 'much_weaker');

CHOOSE: 'choose';
NEWLINE
      :'\r'? '\n' ;
ID    :   ('a'..'z'|'A'..'Z')+ ;
INT   :   '0'..'9'+ ;
WS    :   (' '|'\t')+ {skip();} ;