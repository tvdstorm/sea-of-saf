tree grammar FighterWalker;

options {
  language = Java;
  tokenVocab = FDL;
  ASTLabelType = CommonTree;
}

@header
{
  package saf.generation.output;
  import saf.structure.*;
  import java.util.ArrayList;
}

fighter returns [Fighter fighter]
  : ^( name=IDENT pers=personality beh=behaviour) {fighter = new Fighter(name.getText(), pers, beh);}
  ;

personality returns [Personality personality]
  : {ArrayList<Characteristic> personalityArrayList = new ArrayList<Characteristic>();}
    ^(PERSONALITY (chara=characteristic {personalityArrayList.add(chara);})*)
    {personality = new Personality(personalityArrayList);}
  ;
  
behaviour returns [Behaviour behaviour]
  : {ArrayList<Rule> behaviourArrayList = new ArrayList<Rule>();}
    ^(BEHAVIOUR (rul=rule {behaviourArrayList.add(rul);})*)
    {behaviour = new Behaviour(behaviourArrayList);}
  ;
  
characteristic returns [Characteristic characteristic]
  : ^(CHARACTERISTIC att=IDENT pow=DIGIT) {characteristic = new Characteristic(att.getText(), Integer.parseInt(pow.getText()));}
  ;
  
rule returns [Rule rule]
  : 
    ^(RULE con=condition mov=moveActionTypes fight=fightActionTypes)
    {
      rule = new Rule(con, mov, fight);
    }
  ;
  
condition returns [Logical logical]
  :
    (s=IDENT) {logical = new LogicalSimple(s.getText());}
  | ^(and=AND left=condition right=condition) {logical= new LogicalAnd(left,right);}
  | ^(or=OR left=condition right=condition) {logical= new LogicalOr(left,right);}
  ;

moveActionTypes returns [ArrayList<MoveAction> moveActions]
  :{moveActions = new ArrayList<MoveAction>();}
  (
    mov=IDENT {moveActions.add(new MoveAction(mov.getText()));}
    | movs=chooseMoveActionType {moveActions = movs;}
  )
  ;

fightActionTypes returns [ArrayList<FightAction> fightActions]
  :{fightActions = new ArrayList<FightAction>();}
  (
    fight=IDENT {fightActions.add(new FightAction(fight.getText()));}
    | fights=chooseFightActionType {fightActions = fights;}
  )
  ;
  
chooseMoveActionType returns [ArrayList<MoveAction> moveActions]
  : {moveActions = new ArrayList<MoveAction>();}
    ^(CHOOSE (mov=IDENT {moveActions.add(new MoveAction(mov.getText()));})+)
  ;

chooseFightActionType returns [ArrayList<FightAction> fightActions]
  : {fightActions = new ArrayList<FightAction>();}
    ^(CHOOSE (fight=IDENT {fightActions.add(new FightAction(fight.getText()));})+)
  ;
  