package saf.fighter;

import java.security.InvalidParameterException;
import java.util.LinkedList;

import saf.fighter.fdl.FDLReader;


public class SuperAwesomeFighter extends AbstractDescribableFighter implements Fighter {
	
	public SuperAwesomeFighter (){
		super();
	}
	
	public SuperAwesomeFighter (String fdl) throws InvalidParameterException {
		this();
		
		FDLReader attributeSource = new FDLReader(fdl); //parse		
		attributeSource.applyAttributes(this);			//check & apply
	}
	
	public String getName(){
		return name;
	}

}
