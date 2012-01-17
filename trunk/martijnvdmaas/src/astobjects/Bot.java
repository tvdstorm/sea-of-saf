package astobjects;

import java.util.ArrayList;

public class Bot {
	public ArrayList<Characteristic> characteristics 	= new ArrayList<Characteristic>();
	public ArrayList<Behaviour> behaviours 				= new ArrayList<Behaviour>();
	
	public String botName = new String();

	public void addCharacteristic(Characteristic characteristic) {
		this.characteristics.add(characteristic);
	}
	
	public void addBehaviour(Behaviour behaviour) {
		this.behaviours.add(behaviour);
	}
	
}