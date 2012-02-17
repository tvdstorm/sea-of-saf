package saf.fighter;

import java.security.InvalidParameterException;
import java.util.List;

import saf.fighter.fdl.FDLReader;
import saf.fighter.fdl.InvalidAttributeMessage;


public class SuperAwesomeFighter extends AbstractDescribableFighter implements Fighter {
	
	private double weight;
	private double height;
	private double speed;
	
	public SuperAwesomeFighter (){
		super();
		
		int defProp = Aspect.Value.getDefault();
		this.weight = calcWeight(defProp, defProp);
		this.height = calcHeight(defProp, defProp);
		this.speed = calcSpeed(weight, height);
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
		
		this.weight = calcWeight(getTrait("punchPower"), getTrait("kickPower"));
		this.height = calcHeight(getTrait("punchReach"), getTrait("kickReach"));
		this.speed = calcSpeed(weight, height);
	}
	
	//--- Implementing Fighter ---
	public int getTrait(String aspect) {
		if(properties.get(aspect) != null) {
			return properties.get(aspect).getIntValue();
		} else {
			return Aspect.Value.getDefault();
		}
	}
	
	private double calcWeight(int punchPower, int kickPower){
		return (punchPower + kickPower) / 2;
	}
	
	private double calcHeight(int punchReach, int kickReach){
		return (punchReach + kickReach) / 2;
	}
	
	private double calcSpeed(double height, double weight) {
		return Math.abs(0.5*(height-weight));
	}
	
}
