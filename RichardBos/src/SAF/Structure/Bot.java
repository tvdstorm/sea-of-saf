package SAF.Structure;

import java.util.ArrayList;

public class Bot {
	public Bot() {
		Characteristics = new ArrayList<Characteristic>();
		Behavior = new ArrayList<BehaviorRule>();
	}
	public String name;
	
	//Characteristics
	public ArrayList<Characteristic> Characteristics;
	public ArrayList<BehaviorRule> Behavior;
}
