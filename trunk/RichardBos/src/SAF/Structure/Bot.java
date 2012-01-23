package SAF.Structure;

import java.util.ArrayList;

public class Bot {
	public Bot(String _name) {
		System.out.println(_name);
		Characteristics = new ArrayList<Characteristic>();
		Behavior = new ArrayList<BehaviorRule>();
		name = _name;
	}
	public String name;
	
	//Characteristics
	public ArrayList<Characteristic> Characteristics;
	public ArrayList<BehaviorRule> Behavior;
}
