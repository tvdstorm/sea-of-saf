package saf.fighter;

import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import saf.fighter.fdl.FDLReader;
import saf.fighter.fdl.InvalidAttributeMessage;


public class SuperAwesomeFighter extends AbstractDescribableFighter implements Fighter {
	

	public SuperAwesomeFighter (){
		super();
	}
	
	public SuperAwesomeFighter (String fdl) throws InvalidParameterException {
		this();
		
		FDLReader attributeSource = new FDLReader(fdl);
		List<InvalidAttributeMessage> failMsgs = attributeSource.applyAttributes(this);
		if(failMsgs!=null) {
			String failMsg = "No attributes have been applied, as some were invalid.\n";
			for(InvalidAttributeMessage msg: failMsgs){
				failMsg += msg+"\n";
			}
			throw new InvalidParameterException(failMsg);
		}
	}
	
	public double getRelativeActSpeed() {
		double weight = getProperty("punchPower") + getProperty("kickPower") / 2;
		double height = getProperty("punchReach") + getProperty("kickReach") / 2;
		return Math.abs(0.5*(height-weight));
	}
	
	public double getRelativeStrength(){
		return getProperty("punchPower") + getProperty("kickPower") / 2;
	}
	
	
	public int getProperty(String aspect) {
		for(Property prop: properties) {
			if(prop.getName().equals(aspect)) {
				return prop.getValue();
			}
		}
		return DEFAULT_PROPERTY_VALUE;
	}
	
	protected Condition getState(double distance, double strengthDifference) {
		List<Condition> possibleStates = new LinkedList<Condition>();
		
		if(distance < NEAR_ZONE_DISTANCE) {
			possibleStates.add(new Condition("near", null));
		} else {
			possibleStates.add(new Condition("far", null));
		}
		
		if(Math.abs(strengthDifference) < LITTLE_STRENGTH_DIFFERENCE) {
			possibleStates.add(new Condition("even", null));
		}
		if(strengthDifference > LITTLE_STRENGTH_DIFFERENCE) {
			possibleStates.add(new Condition("stronger", null));
		}
		if(strengthDifference > MUCH_STRENGTH_DIFFERENCE) {
			possibleStates.add(new Condition("much_stronger", null));	//entails "stronger"
		}
		if(strengthDifference < LITTLE_STRENGTH_DIFFERENCE) {
			possibleStates.add(new Condition("weaker", null));
		}
		if(strengthDifference < -MUCH_STRENGTH_DIFFERENCE) {
			possibleStates.add(new Condition("much_weaker", null)); 	//entails "weaker"
		}
		
		return new Condition.OrCondition(possibleStates);
	}
	
	protected List<Action> getPossibleActions(Condition context) {
		List<Action> actions = new LinkedList<Action>();
		for(Condition condition: behaviours) {
			actions.addAll(condition.getActions(context));
		}
		
		assert actions.size() > 0: "Always-rule should ensure some valid action";
		return actions;
	}
	
	// @require actions.size() > 0
	protected Action selectRandom(List<Action> actions) {
		assert actions.size() > 0: "Requirement broken!";
		return actions.get(new Random().nextInt(actions.size()));
	}
	

	//--- Implementing Fighter ---
	public Fighter.ActionEffect act(double distance, double strengthDifference) {
		Action chosenAction = selectRandom(getPossibleActions(getState(distance, strengthDifference)));
		return chosenAction.getEffectFromRandomChoice(this.properties); 
	}

}
