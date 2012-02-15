package saf.fighter;

import java.security.InvalidParameterException;
import java.util.List;

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
	
	public String getName(){
		return name;
	}

}
