package safobjects;

import java.util.ArrayList;

public class Behaviour {
	public ConditionChoices conditionChoices;
	public ArrayList<String>  moveChoices;
	public ArrayList<String> attackChoices;
	
	public Behaviour() {
		moveChoices = new ArrayList<String>();
		attackChoices = new ArrayList<String>();
	}
}
