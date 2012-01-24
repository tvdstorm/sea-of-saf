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
  : ^(CHARACTERISTIC att=IDENT pow=DIGIT) {characteristic = new Characteristic(Attribute.valueOf(att.getText()), Integer.parseInt(pow.getText()));}
  ;
  
rule returns [Rule rule]
  : 
    ^(RULE con=conditionTypes mov=moveActionTypes fight=fightActionTypes)
    {
      rule = new Rule(con, mov, fight);
    }
  ;

conditionTypes returns [ConditionTypeOperator conditionType]
  : 
    (
    con=IDENT {conditionType = new ConditionTypeOperator(ConditionType.valueOf(con.getText()));}
    |
    ^(log=LOGICAL rec=conditionTypes con=IDENT )
      {
        conditionType = new ConditionTypeOperator(
        ConditionType.valueOf(con.getText()),
        LogicalOperators.valueOf(log.getText()),
        rec
        );
        
      }
    )
  ;

moveActionTypes returns [Vector<MoveActionType> moveActionTypes]
  :{moveActionTypes = new Vector<MoveActionType>();}
  (
    mov=IDENT {moveActionTypes.add(MoveActionType.valueOf(mov.getText()));}
    | movs=chooseMoveActionType {moveActionTypes = movs;}
  )
  ;

fightActionTypes returns [Vector<FightActionType> fightActionTypes]
  :{fightActionTypes = new Vector<FightActionType>();}
  (
    fight=IDENT {fightActionTypes.add(FightActionType.valueOf(fight.getText()));}
    | fights=chooseFightActionType {fightActionTypes = fights;}
  )
  ;
  
chooseMoveActionType returns [Vector<MoveActionType> moveActionTypes]
  : {moveActionTypes = new Vector<MoveActionType>();}
    ^(CHOOSE (mov=IDENT {moveActionTypes.add(MoveActionType.valueOf(mov.getText()));})+)
  ;

chooseFightActionType returns [Vector<FightActionType> fightActionTypes]
  : {fightActionTypes = new Vector<FightActionType>();}
    ^(CHOOSE (fight=IDENT {fightActionTypes.add(FightActionType.valueOf(fight.getText()));})+)
  ;
  