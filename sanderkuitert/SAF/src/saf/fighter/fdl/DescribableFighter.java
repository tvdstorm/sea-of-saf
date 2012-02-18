package saf.fighter.fdl;

import java.util.List;


/** Fighters that can obtain valid attributes from FDL */
public interface DescribableFighter {
	
	//Attribute validity
	public boolean isValidName(String name);
	public boolean isValidAspect(String aspect);
	public boolean isValidPropertyValue(String aspect, int value);
	public boolean isValidCondition(String condition);
	public boolean isValidMove(String move);
	public boolean isValidAttack(String attack);

	//Attribute possibilities
	public String validNames();
	public String validProperties();
	public String validBehaviour();
	public String getAlwaysCondition();

	//Attribute addition
	public void setName(String name);
	public void addProperty(String aspect, int value);
	public void addBehaviour(List<String> conditions, List<String> moves, List<String> attacks);
	
}
