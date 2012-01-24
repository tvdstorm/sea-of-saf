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
  : ^(att=ATTRIBUTE pow=ONEDIGIT) {characteristic = new Characteristic(Attribute.valueOf(att.getText()), Integer.parseInt(pow.getText()));}
  ;
  
rule returns [Rule rule]
  : {rule = new Rule();}
  
    (
    
			^(con=CONDITIONTYPE {rule.setConditionType(ConditionType.valueOf(con.getText()));}
			  
			(move=MOVEACTIONTYPE {rule.getMoveActionTypes().add(MoveActionType.valueOf(move.getText()));} 
			| moves=chooseMoveActionType {rule.setMoveActionTypes(moves);}) 
			
			(fightaction=FIGHTACTIONTYPE  {rule.getFightActionTypes().add(FightActionType.valueOf(fightaction.getText()));} 
			| fights=chooseFightActionType {rule.setFightActionTypes(fights);})) 
		|
		
		  ^(LOGICAL CONDITIONTYPE CONDITIONTYPE 
		  (move=MOVEACTIONTYPE {rule.getMoveActionTypes().add(MoveActionType.valueOf(move.getText()));} 
      | moves=chooseMoveActionType {rule.setMoveActionTypes(moves);}) 
      
      (fightaction=FIGHTACTIONTYPE  {rule.getFightActionTypes().add(FightActionType.valueOf(fightaction.getText()));} 
      | fights=chooseFightActionType {rule.setFightActionTypes(fights);}))
      
		)
  ;
  
chooseMoveActionType returns [Vector<MoveActionType> moveActionTypes]
  : {moveActionTypes = new Vector<MoveActionType>();}
    ^(CHOOSE (move=MOVEACTIONTYPE {moveActionTypes.add(MoveActionType.valueOf(move.getText()));})+)
  ;

chooseFightActionType returns [Vector<FightActionType> fightActionTypes]
  : {fightActionTypes = new Vector<FightActionType>();}
    ^(CHOOSE (fight=FIGHTACTIONTYPE {fightActionTypes.add(FightActionType.valueOf(fight.getText()));})+)
  ;
  