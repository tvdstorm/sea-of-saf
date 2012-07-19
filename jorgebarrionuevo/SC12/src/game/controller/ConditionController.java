package game.controller;

import graphic.ArenaConfiguration;
import java.util.ArrayList;
import model.Behaviour;

public class ConditionController {
//responsibility: monitor fighter condition regularly
//informs the other fighter controller about its actual condition
	
	public ArrayList<Behaviour> getActualBehaviours(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		//For a given attackingFighterStatus, return a list of behaviors based on actual conditions 
		ArrayList<Behaviour> filteredBehaviours = new ArrayList<Behaviour>();
		for (int i=0; i<attackingFighterStatus.getBehaviours().size() ;i++){
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("far") && isFar(attackingFighterStatus, waitingFighterStatus)) {
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("near") && isNear(attackingFighterStatus, waitingFighterStatus)) {
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("much_stronger")&& isMuchStronger(attackingFighterStatus, waitingFighterStatus)) {
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("stronger")&& isStronger(attackingFighterStatus, waitingFighterStatus)) {
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("weaker")&& isWeaker(attackingFighterStatus, waitingFighterStatus)) {
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("much_weaker")&& isMuchWeaker(attackingFighterStatus, waitingFighterStatus)) {
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("even") && isEven(attackingFighterStatus, waitingFighterStatus)) {
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));	 
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("always")) {
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
		}
		attackingFighterStatus.setActualBehaviours(filteredBehaviours); 
		return filteredBehaviours;
	}
	private boolean isFar(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		int positionDelta = Math.abs(attackingFighterStatus.getXPosition() - waitingFighterStatus.getXPosition());
		boolean isFar = positionDelta >= ArenaConfiguration.FAR; 
		return isFar;  		
	}
	private boolean isNear(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		int positionDelta = Math.abs(attackingFighterStatus.getXPosition() - waitingFighterStatus.getXPosition());
		boolean isNear = positionDelta <= ArenaConfiguration.NEAR;
		return isNear;  
	}
	private boolean isMuchStronger(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		boolean isMuchStronger = attackingFighterStatus.getEnergy() > (waitingFighterStatus.getEnergy() + 50.0);
		return isMuchStronger;
	}
	private boolean isStronger(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		boolean isStronger = attackingFighterStatus.getEnergy() > waitingFighterStatus.getEnergy();
		return isStronger;
	}
	private boolean isWeaker(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		boolean isWeaker = attackingFighterStatus.getEnergy() < waitingFighterStatus.getEnergy();
		return isWeaker;
	}
	private boolean isMuchWeaker(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		boolean isMuchWeaker = attackingFighterStatus.getEnergy() < (waitingFighterStatus.getEnergy() - 50);
		return isMuchWeaker;
	}
	private boolean isEven(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		boolean isEven = attackingFighterStatus.getEnergy() == waitingFighterStatus.getEnergy();
		return isEven;
	}
}