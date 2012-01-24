tree grammar FighterWalker;

options {
  language = Java;
  tokenVocab = FDL;
  ASTLabelType = CommonTree;
}

@header
{
  package saf.generation.output;
  import saf.classes.*;
  import java.util.Vector;
}

fighter returns [Fighter fighter]
  : ^( name=IDENT pers=personality beh=behaviour) {fighter = new Fighter(name.getText(), pers, beh);}
  ;

personality returns [Vector<Characteristic> personality]
  : {personality = new Vector<Characteristic>();}
    ^(PERSONALITY (chara=characteristic {personality.add(chara);})*) 
  ;
  
behaviour returns [Vector<Rule> behaviour]
  : {behaviour = new Vector<Rule>();}
    ^(BEHAVIOUR (rul=rule {behaviour.add(rul);})*)
  ;
  
characteristic returns [Characteristic characteristic]
  : ^(CHARACTERISTIC att=ATTRIBUTE pow=ONEDIGIT) {characteristic = new Characteristic(Attribute.valueOf(att.getText()), Integer.parseInt(pow.getText()));}
  ;
  
rule returns [Rule rule]
  : {rule = new Rule();}
    ^(RULE con=conditionTypes mov=moveActionTypes fight=fightActionTypes)
    {
      rule.setConditionTypeOperator(con);
      rule.setMoveActionTypes(mov);
      rule.setFightActionTypes(fight);
    }
  ;

conditionTypes returns [ConditionTypeOperator conditionType]
  : 
    {conditionType = new ConditionTypeOperator();}
    (
    con=CONDITIONTYPE {conditionType.setConditionType(ConditionType.valueOf(con.getText()));}
    |
    ^(log=LOGICAL rec=conditionTypes con=CONDITIONTYPE )
      {
        conditionType.setConditionType(ConditionType.valueOf(con.getText()));
        conditionType.setLogicalOperator(LogicalOperators.valueOf(log.getText()));
        conditionType.setConditionTypeOperator(rec);
      }
    )
  ;

moveActionTypes returns [Vector<MoveActionType> moveActionTypes]
  :{moveActionTypes = new Vector<MoveActionType>();}
  (
    mov=MOVEACTIONTYPE {moveActionTypes.add(MoveActionType.valueOf(mov.getText()));}
    | movs=chooseMoveActionType {moveActionTypes = movs;}
  )
  ;

fightActionTypes returns [Vector<FightActionType> fightActionTypes]
  :{fightActionTypes = new Vector<FightActionType>();}
  (
    fight=FIGHTACTIONTYPE {fightActionTypes.add(FightActionType.valueOf(fight.getText()));}
    | fights=chooseFightActionType {fightActionTypes = fights;}
  )
  ;
  
chooseMoveActionType returns [Vector<MoveActionType> moveActionTypes]
  : {moveActionTypes = new Vector<MoveActionType>();}
    ^(CHOOSE (mov=MOVEACTIONTYPE {moveActionTypes.add(MoveActionType.valueOf(mov.getText()));})+)
  ;

chooseFightActionType returns [Vector<FightActionType> fightActionTypes]
  : {fightActionTypes = new Vector<FightActionType>();}
    ^(CHOOSE (fight=FIGHTACTIONTYPE {fightActionTypes.add(FightActionType.valueOf(fight.getText()));})+)
  ;
  