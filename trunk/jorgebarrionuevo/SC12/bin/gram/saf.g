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

behaviour returns[Behaviour beha]
  :
  condi=condition
  { 

   $beha = new Behaviour($condi.ct,$condi.action.get(0), $condi.action.get(1));
  }
  ;

condition returns [ConditionType ct, ArrayList<Action> action]@init{$action = new ArrayList<Action>();}
  :
  c=conditionType L_BRACKET  a=action R_BRACKET
  {
    $ct=$c.condType;
    $action=$a.action;
  }
  ;

conditionType returns [ConditionType condType]
  :
  CONDITION_TYPE
  {
  $condType = new ConditionType($CONDITION_TYPE.getText());
  System.out.println("The condition is> " + $condType.getName());
  }
  ;

action returns [ArrayList<Action> action]@init{$action = new ArrayList<Action>();}
  :
  mac=moveAction fac=fightAction 
  {$action.add($mac.mova);$action.add($fac.figa);} | 
  cho1=chooseAction cho2=chooseAction {$action.add($cho1.cha);$action.add($cho2.cha);} | 
  mac=moveAction cho2=chooseAction {$action.add($mac.mova);$action.add($cho2.cha);} | 
  cho=chooseAction fac=fightAction {$action.add($cho1.cha);$action.add($fac.figa);}  
  ;
  
chooseAction returns[ChooseAction cha]
  :
  CHOOSE L_PAR ap=actionPair R_PAR  
  {
   $cha = new ChooseAction(ap.actionPair);
  }
  ;
  
actionPair returns [ArrayList<Action> actionPair] @init{$actionPair = new ArrayList<Action>();}
  :
  (movepair=moveActionPair  |  fightpair=fightActionPair)
  {
   if (! movepair.actionList.isEmpty()){
    $actionPair.addAll(movepair.actionList);
   }
   else{
    $actionPair.addAll(fightpair.actionList);
   }
  }
  ; 
  
moveActionPair returns [ArrayList<Action> actionList] @init{$actionList = new ArrayList<Action>();}
  :
  ma1=moveAction ma2=moveAction 
  {
   $actionList.add(ma1.mova);
   $actionList.add(ma2.mova);
  }
  ;

fightActionPair returns [ArrayList<Action> actionList] @init{$actionList = new ArrayList<Action>();}
  :
  fa1=fightAction fa2=fightAction 
  {
   $actionList.add(fa1.figa);
   $actionList.add(fa2.figa);
  }
  ;
  
moveAction returns[MoveAction mova] 
  :
  MOVE_ACTION
  {
    $mova = new MoveAction($MOVE_ACTION.getText());
  }
  ;

fightAction returns[FightAction figa] 
  :
  FIGHT_ACTION
  {
    $figa = new FightAction($FIGHT_ACTION.getText());
  }
  ;

ID : ('A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9'| '_')*;
CHARACTERISTIC: ('punchReach' | 'punchPower' | 'kickReach' | 'kickPower');
MOVE_ACTION: ('walk_towards' | 'walk_away' | 'run_towards' | 'run_away' | 'jump' | 'crouch' | 'stand');
FIGHT_ACTION: ('block_low' | 'block_high' | 'punch_low' | 'punch_high' | 'kick_low' | 'kick_high');
CONDITION_TYPE : ('always' | 'near' | 'far' | 'much_stronger' | 'stronger' | 'even' | 'weaker' | 'much_weaker');
CHOOSE: 'choose';
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