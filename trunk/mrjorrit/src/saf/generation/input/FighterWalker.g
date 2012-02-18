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
  import java.util.Vector;
}

fighter returns [Fighter fighter]
  : ^( name=IDENT pers=personality beh=behaviour) {fighter = new Fighter(name.getText(), pers, beh);}
  ;

personality returns [Personality personality]
  : {Vector<Characteristic> personalityVector = new Vector<Characteristic>();}
    ^(PERSONALITY (chara=characteristic {personalityVector.add(chara);})*)
    {personality = new Personality(personalityVector);}
  ;
  
behaviour returns [Behaviour behaviour]
  : {Vector<Rule> behaviourVector = new Vector<Rule>();}
    ^(BEHAVIOUR (rul=rule {behaviourVector.add(rul);})*)
    {behaviour = new Behaviour(behaviourVector);}
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
  | (and=AND left=condition right=condition) {logical= new LogicalAnd(left,right);}
  | (or=OR left=condition right=condition) {logical= new LogicalOr(left,right);}
  ;

moveActionTypes returns [Vector<MoveAction> moveActions]
  :{moveActions = new Vector<MoveAction>();}
  (
    mov=IDENT {moveActions.add(new MoveAction(mov.getText()));}
    | movs=chooseMoveActionType {moveActions = movs;}
  )
  ;

fightActionTypes returns [Vector<FightAction> fightActions]
  :{fightActions = new Vector<FightAction>();}
  (
    fight=IDENT {fightActions.add(new FightAction(fight.getText()));}
    | fights=chooseFightActionType {fightActions = fights;}
  )
  ;
  
chooseMoveActionType returns [Vector<MoveAction> moveActions]
  : {moveActions = new Vector<MoveAction>();}
    ^(CHOOSE (mov=IDENT {moveActions.add(new MoveAction(mov.getText()));})+)
  ;

chooseFightActionType returns [Vector<FightAction> fightActions]
  : {fightActions = new Vector<FightAction>();}
    ^(CHOOSE (fight=IDENT {fightActions.add(new FightAction(fight.getText()));})+)
  ;
  