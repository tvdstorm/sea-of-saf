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
		
		this.weight = calcWeight(DEFAULT_PROPERTY_VALUE, DEFAULT_PROPERTY_VALUE);
		this.height = calcHeight(DEFAULT_PROPERTY_VALUE, DEFAULT_PROPERTY_VALUE);
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
		
		this.weight = calcWeight(getProperty("punchPower"), getProperty("kickPower"));
		this.height = calcHeight(getProperty("punchReach"), getProperty("kickReach"));
		this.speed = calcSpeed(weight, height);
	}
	
	
	public double getSpeed() {
		return speed;
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
	
	//--- Implementing Fighter ---
	public int getProperty(String aspect) {
		for(Property prop: properties) {
			if(prop.getName().equals(aspect)) {
				return prop.getValue();
			}
		}
		return DEFAULT_PROPERTY_VALUE;
	}
	
}
