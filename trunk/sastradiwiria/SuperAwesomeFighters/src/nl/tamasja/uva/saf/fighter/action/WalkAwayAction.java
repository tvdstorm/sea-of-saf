package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.FighterBot;

public class WalkAwayAction extends MoveAction_o {
	
	//TODO: Remove
	/*
	@Override
	public void execute(FighterBot self) {
		FighterBot target = self.getEnemyFighter();
		System.out.println( self.getName() + " walks away from "+target.getName());
		
		if(self.position > target.position) {
			self.move(1);
			
		} else if(self.position < target.position) {
			self.move(-1);
		} else {
			System.out.println("Thats weird");
		}
	}
	*/
	@Override
	protected int getMovement() {
		return -1;
	}
}
