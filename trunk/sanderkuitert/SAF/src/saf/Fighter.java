package saf;

import java.util.List;

public interface Fighter {
	
	void setDefaults();
	void setName(String name);
	void setCharacteristic(String property, int value);
	void setBehaviour(String condition, String move, String attack);
	void setBehaviour(String condition, List<String> moves, String attack);
	void setBehaviour(String condition, String move, List<String> attacks);
	void setBehaviour(String condition, List<String> moves, List<String> attacks);

}
