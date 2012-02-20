package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Attack;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Move;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Strength;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;

import nl.tamasja.uva.saf.fighter.action.ActionOptions.*;
public class ExecuteAction {

	
	public void doAction(FighterBot self, IAction action) {
		//System.out.print(" [d] ");
		//String key = action.getKey();
		//String property = action.getRangeStatisticName();
		//FighterBot target = self.getEnemyFighter();
		

		IBehaviourCondition condition = action.getCondition();
		
		
		ActionOptions actionOptions = new ActionOptions();
		
		
		//ActionMapper actionMapper = new ActionMapper();
		
		Type strikeType = action.getStrikeType();
		Height strikeHeight = action.getStrikeHeight();
		
		
		
		int movement = action.getMovement();
		Height movementHeight = action.getMovementHeight();
		
		Attack attack = actionOptions.MapAttack(strikeType, strikeHeight);
		
		Move move = actionOptions.MapMove(movementHeight);
		
		Strength powerStat = actionOptions.getPowerStat(strikeType);
		Strength rangeStat = actionOptions.getRangeStat(strikeType);
		
		
		
		
		
		boolean canExecute = rangeStat == null ? condition.evaluate(self) : condition.evaluate(self, self.getStat(rangeStat));
		
		if(canExecute) {
			//System.out.print(" [e] ");

			
			//if(movement == null || movementHeight != null) {
				self.move(movement,movementHeight,move);
			//}
			
			if(attack != null) {
				
				//System.out.println(self.getName() + " MyAttackToExecute: "+attack + " range: "+rangeStat +" = "+self.getStat(rangeStat) );
				self.attack(strikeType,strikeHeight);
			}
			/*
			if(action.strikeHeight() != null) {
				
				
				
				System.out.print(" [strike "+ key + " " + target.getName()+ " for " + self.getStat(action.getPowerStatisticName()) + "dmg] ");
				
				//self.getEnemyFighter().takeHit(self.getStat(action.getPowerStatisticName()), action.strikeHeight());
				
				//self.strikeTarget()
				//System.out.print("Action: "+self.getName() + " " + key + " " +self.getEnemyFighter().getName());
				
			}
			
			if(action.blockHeight() != null) {
				self.setBlock(action.blockHeight());
				System.out.print(" [block "+ key+"] ");
			}
			
			if(action.movementHeight() != null) {
				self.setVerticalPosition(action.movementHeight());
				System.out.print(" [vertical "+ key+"] ");
			}
			*/		
			//System.out.println("..");
		}
		
	}
}
