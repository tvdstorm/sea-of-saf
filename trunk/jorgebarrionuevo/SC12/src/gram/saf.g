grammar saf;

options {
  language = Java;
   output=AST;
}

tokens{

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

   
fighter returns [Fighter fighter] @init{ $fighter = new Fighter();}
  : 
    ID 
    {
      $fighter.setName($ID.text);
    }
    L_CURLY 
    (characteristic 
    {
      $fighter.addCharacteristic($characteristic.c);
    }
    )* 
    (behaviour
    {
      $fighter.addBehaviour($behaviour.beha);
    }
    )*
    R_CURLY 
     
  ;
 
characteristic returns[Characteristic c]
  :
  CHARACTERISTIC EQ NUMBER
  {
  $c = new Characteristic($CHARACTERISTIC.getText(),Integer.parseInt($NUMBER.getText()));
  }
  ;
  
behaviour returns[Behaviour beha]
  :
  condi=condition
  { 
   $beha = new Behaviour($condi.ct,$condi.act1, $condi.act2);
  }
  ; 

condition returns [Condition ct, Action act1, Action act2]
  :
  c=conditionType L_BRACKET  a1=action a2=action R_BRACKET
  {
    $ct=$c.condType;
    $act1=$a1.act;
    $act2=$a2.act;
  }
  |
  o=operand L_BRACKET  a1=action a2=action R_BRACKET
  {
    $ct=$o.log;
    $act1=$a1.act;
    $act2=$a2.act;
  }
  ;
operand returns [ConditionLogic log]
  :
  cl=conditionType OR cr=conditionType 
  {
    $log= new Or($cl.condType,$cr.condType);
  }|
  cl=conditionType AND cr=conditionType 
  {
    $log= new And($cl.condType,$cr.condType);
  }
  ; 
  
conditionType returns [ConditionType condType]
  :
  CONDITION_TYPE
  {
  $condType = new ConditionType($CONDITION_TYPE.getText());
  }
  ;

action returns [Action act]
  :
  
  choa=chooseAction {$act=choa.cha;}|
  simac=simpleAction {$act=simac.siac;}  
  ;
  
chooseAction returns[ChooseAction cha]
  :
  CHOOSE L_PAR sa1=simpleAction sa2=simpleAction R_PAR  
  {
   $cha = new ChooseAction($sa1.siac, $sa2.siac);
  }
  ;
    
simpleAction returns[SimpleAction siac] 
  :
  moveAction 
  {
    $siac = $moveAction.moac;
  }
  | fightAction
  {
    $siac = $fightAction.fiac;
  }
  ;

moveAction returns[MoveAction moac] 
  :
  MOVE_ACTION
  {
    $moac = new MoveAction($MOVE_ACTION.getText());
  }
  ;
  
fightAction returns[FightAction fiac] 
  :
  FIGHT_ACTION
  {
    $fiac = new FightAction($FIGHT_ACTION.getText());
  }
  ;
 

ID : ('A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9'| '_')*;
CHARACTERISTIC: ('punchReach' | 'punchPower' | 'kickReach' | 'kickPower');
CONDITION_TYPE : ('always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker');
MOVE_ACTION: ('jump' | 'crouch' | 'stand'|'walk_towards' | 'walk_away' | 'run_towards' | 'run_away');
FIGHT_ACTION: ('block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high');
CHOOSE: 'choose';
L_BRACKET : '[';
R_BRACKET : ']';
L_CURLY : '{';
R_CURLY : '}';
L_PAR : '(';
R_PAR : ')';
NUMBER : '0'..'9'*;
AND : 'and'|'AND' | '&&' | ',';
OR : 'or'| 'OR' | '||' | '|';
EQ: '=';
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ { $channel = HIDDEN; };