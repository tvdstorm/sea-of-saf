package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Attack;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Move;
import nl.tamasja.uva.saf.fighter.SpecificationMapper.Strength;
import nl.tamasja.uva.saf.fighter.condition.IBehaviourCondition;

import nl.tamasja.uva.saf.fighter.action.ActionOptions.*;
public class ExecuteAction {

	
	public void doAction(FighterBot self, IAction action) {

		IBehaviourCondition condition = action.getCondition();
		
		ActionOptions actionOptions = new ActionOptions();

		Type strikeType = action.getStrikeType();
		Height strikeHeight = action.getStrikeHeight();
		
		Strength rangeStat = actionOptions.getRangeStat(strikeType);
		
		boolean canExecute = rangeStat == null ? condition.evaluate(self) : condition.evaluate(self, self.getStat(rangeStat));
		
		if(canExecute) {
			
			int movement = action.getMovement();
			Height movementHeight = action.getMovementHeight();
			Attack attack = actionOptions.MapAttack(strikeType, strikeHeight);
			Move move = actionOptions.MapMove(movementHeight);

			self.move(movement,movementHeight,move);

			if(attack != null) {
				self.attack(strikeType,strikeHeight);
			}
		}
		
	}
}
