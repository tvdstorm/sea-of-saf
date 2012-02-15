package saf.fighter.fdl;

import java.util.List;

/** Fighters that can obtain valid attributes from FDL */
public interface DescribableFighter {
	
	//--- Validity tests:
	public boolean isValidName(String name);
	public boolean isValidProperty(String property);
	public boolean isValidPropertyValue(int value);
	public boolean isValidCondition(String condition);
	public boolean isValidMove(String move);
	public boolean isValidAttack(String attack);

	//--- Attribute possibilities:
	public String validNames();
	public String validCharacteristics();
	public String validBehaviour();
	public String getAlwaysCondition();

	//--- Set values:
	public void setName(String name);
	public void addCharacteristic(String property, int value);
	public void addBehaviour(String condition, List<String> moves, List<String> attacks);
	
}
