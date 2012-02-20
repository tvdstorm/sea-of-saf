package nl.tamasja.uva.saf.fighter.action;

import nl.tamasja.uva.saf.fighter.FighterBot;


public class WalkTowardsAction extends MoveAction_o {
	
	//TODO: Remove
	/*
	@Override
	public void execute(FighterBot self) {
		FighterBot target = self.getEnemyFighter();
		System.out.println( self.getName() + " walks towards "+target.getName());
		
		if(self.position-1 > target.position) {
			self.move(-1);
			
		} else if(self.position+1 < target.position) {
			self.move(1);
		}
	}
	 */
	
	@Override
	protected int getMovement() {
		return 1;
	}
}
