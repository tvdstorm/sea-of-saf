package saf.fighter.fdl;

import java.util.List;

public interface DescribableFighter {

	public String validAttributes();
	public boolean isValidName(String name);
	public boolean isValidCharacteristic(String property, int value);
	public boolean isValidBehaviour(String condition, List<String> moves, List<String> attacks);
	
	public void resetAttributes();
	public void setName(String name);
	public void addCharacteristic(String property, int value);
	public void addBehaviour(String condition, List<String> moves, List<String> attacks);

}
