package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.FighterBot;
import nl.tamasja.uva.saf.fighter.action.FightAction_old.Height;

public abstract class MoveAction_o implements IBehaviourAction {

	protected abstract int getMovement();
	
	
    @Override
    public void execute(FighterBot self) {
    	FighterBot target = self.getEnemyFighter();
    	int movementSpeed = getMovement();
    	
    	//TODO: old
    	/*
		if(self.position > target.position) {
			
			//self.move(-movementSpeed);
		} else if(self.position < target.position) {
			//self.move(movementSpeed);
		} else {
			System.out.println("Thats weird "+self.getName());
		}
		*/
    }
}