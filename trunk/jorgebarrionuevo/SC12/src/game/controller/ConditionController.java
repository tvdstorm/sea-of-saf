package game.controller;

import game.FighterStatus;
import graphic.ArenaConfiguration;
import java.util.ArrayList;
import model.Behaviour;

public class ConditionController {
//responsibility: monitor fighter condition regularly
//informs the other fighter controller about its actual condition
	FighterController fc;
	FighterStatus fighterStatus;
	FighterStatus oponentStatus;
	
	public ConditionController (FighterStatus fighterStatus,  FighterStatus oponentStatus){
		//System.out.println("Creating conditionController");
		this.fighterStatus= fighterStatus;
		this.oponentStatus= oponentStatus;
	}
	
	public ArrayList<Behaviour> getActualBehaviours(){
		//For a given fighterStatus, return a list of behaviours based on actual conditions 
		//System.out.println("getActualBehaviours");
		ArrayList<Behaviour> filteredBehaviours = new ArrayList<Behaviour>();
		
		for (int i=0; i<fighterStatus.getBehaviours().size() ;i++){
			//System.out.println("find a behaviour " + figtherStatus.getBehaviours().get(i).getCondition().getName());
			
			 if (fighterStatus.getBehaviours().get(i).getCondition().getName().equals("far") && isFar()) {
				 //System.out.println("Is far");
				 filteredBehaviours.add(fighterStatus.getBehaviours().get(i));
			 }
			 if (fighterStatus.getBehaviours().get(i).getCondition().getName().equals("near") && isNear()) {
				 //System.out.println("Is near");
				 filteredBehaviours.add(fighterStatus.getBehaviours().get(i));
			 }
			 if (fighterStatus.getBehaviours().get(i).getCondition().getName().equals("much_stronger")&& isMuchStronger()) {
				 //System.out.println("is much stronger");
				 filteredBehaviours.add(fighterStatus.getBehaviours().get(i));
			 }
			 if (fighterStatus.getBehaviours().get(i).getCondition().getName().equals("stronger")&& isStronger()) {
				 //System.out.println("is stronger");
				 filteredBehaviours.add(fighterStatus.getBehaviours().get(i));
			 }
			 if (fighterStatus.getBehaviours().get(i).getCondition().getName().equals("weaker")&& isWeaker()) {
				 //System.out.println("is weaker");
				 filteredBehaviours.add(fighterStatus.getBehaviours().get(i));
			 }
			 if (fighterStatus.getBehaviours().get(i).getCondition().getName().equals("much_weaker")&& isMuchWeaker()) {
				 //System.out.println("is much weaker");
				 filteredBehaviours.add(fighterStatus.getBehaviours().get(i));
			 }
			 if (fighterStatus.getBehaviours().get(i).getCondition().getName().equals("even") && isEven()) {
				// System.out.println("are even");
				 filteredBehaviours.add(fighterStatus.getBehaviours().get(i));	 
			 }
			 if (fighterStatus.getBehaviours().get(i).getCondition().getName().equals("always")) {
				 //System.out.println("is always");
				 filteredBehaviours.add(fighterStatus.getBehaviours().get(i));
			 }
		}
		
		//for (int i=0; i<filteredBehaviours.size(); i++){
			//System.out.println("Filtered: " + filteredBehaviours.get(i).getCondition().getName());
		//}
		
		return filteredBehaviours;
	}
	
	private boolean isFar(){
		int positionDelta = Math.abs(fighterStatus.getXPosition() - oponentStatus.getXPosition());
		//System.out.println("Position delta " + positionDelta);
		fighterStatus.setDistance(positionDelta);
		return positionDelta >= ArenaConfiguration.FAR;  		
	}
	
	private boolean isNear(){
		int positionDelta = Math.abs(fighterStatus.getXPosition() - oponentStatus.getXPosition());
		//System.out.println("Position delta " + positionDelta);
		fighterStatus.setDistance(positionDelta);
		return positionDelta <= ArenaConfiguration.NEAR;  
	}
	
	private boolean isMuchStronger(){
		return fighterStatus.getEnergy() > (oponentStatus.getEnergy() + 50.0);
	}
	
	private boolean isStronger(){
		return fighterStatus.getEnergy() > oponentStatus.getEnergy();
	}
	
	private boolean isWeaker(){
		return fighterStatus.getEnergy() < oponentStatus.getEnergy();
	}
	
	private boolean isMuchWeaker(){
		return fighterStatus.getEnergy() < (oponentStatus.getEnergy() - 50);
	}
	
	private boolean isEven(){
		return fighterStatus.getEnergy() == oponentStatus.getEnergy();
	}
	
}
