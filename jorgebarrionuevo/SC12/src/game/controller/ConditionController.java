package game.controller;

import game.FighterStatus;
import graphic.ArenaConfiguration;
import java.util.ArrayList;
import model.Behaviour;

public class ConditionController {
//responsibility: monitor fighter condition regularly
//informs the other fighter controller about its actual condition

	
	public ConditionController (){
		//System.out.println("Creating conditionController");
	}
	
	public ArrayList<Behaviour> getActualBehaviours(FighterStatus attackingFighterStatus, FighterStatus waitingFighterStatus){
		//For a given attackingFighterStatus, return a list of behaviours based on actual conditions 
		//System.out.println("getActualBehaviours");
		ArrayList<Behaviour> filteredBehaviours = new ArrayList<Behaviour>();
		
		for (int i=0; i<attackingFighterStatus.getBehaviours().size() ;i++){
			//System.out.println("find a behaviour " + figtherStatus.getBehaviours().get(i).getCondition().getName());
			
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("far") && isFar(attackingFighterStatus, waitingFighterStatus)) {
				 //System.out.println("Is far");
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("near") && isNear(attackingFighterStatus, waitingFighterStatus)) {
				 //System.out.println("Is near");
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("much_stronger")&& isMuchStronger(attackingFighterStatus, waitingFighterStatus)) {
				 //System.out.println("is much stronger");
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("stronger")&& isStronger(attackingFighterStatus, waitingFighterStatus)) {
				 //System.out.println("is stronger");
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("weaker")&& isWeaker(attackingFighterStatus, waitingFighterStatus)) {
				 //System.out.println("is weaker");
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("much_weaker")&& isMuchWeaker(attackingFighterStatus, waitingFighterStatus)) {
				 //System.out.println("is much weaker");
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("even") && isEven(attackingFighterStatus, waitingFighterStatus)) {
				// System.out.println("are even");
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));	 
			 }
			 if (attackingFighterStatus.getBehaviours().get(i).getCondition().getName().equals("always")) {
				 //System.out.println("is always");
				 filteredBehaviours.add(attackingFighterStatus.getBehaviours().get(i));
			 }
		}

		attackingFighterStatus.setActualBehaviours(filteredBehaviours);
		for(int i=0;i<filteredBehaviours.size();i++){
			System.out.println("Elemento actual " + i + " es Condition " + filteredBehaviours.get(i).getCondition().getName() + " MoveAction " + filteredBehaviours.get(i).getMoveAction().getName() + " and FightAction " + filteredBehaviours.get(i).getFightAction().getName());
		}
		System.out.println(attackingFighterStatus.getFighter().getName() + " distance  " + attackingFighterStatus.getDistance()); 
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
