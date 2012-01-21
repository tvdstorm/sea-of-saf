package safobjects;

import java.util.ArrayList;

public class Bot {
	private ArrayList<Characteristic> characteristics 	= new ArrayList<Characteristic>();
	private ArrayList<Behaviour> behaviours 			= new ArrayList<Behaviour>();
	
	private String botName = new String();

	public void addCharacteristic(Characteristic characteristic) {
		this.characteristics.add(characteristic);
	}
	
	public void addBehaviour(Behaviour behaviour) {
		this.behaviours.add(behaviour);
	}
	
	public String toString() {
		String output = "";
		for(int i = 0; i < this.characteristics.size(); i++) {
			output +=  this.characteristics.get(i).toString();
		}
		
		for(int i = 0; i < this.behaviours.size(); i++) {
			output +=  this.behaviours.get(i).toString();
		}
		return "  Class:" + this.getClass().getName() + "\n" +  output;
	}
	
	public ArrayList<Characteristic> getCharacteristics() {
		return characteristics;
	}
	
	public void setCharacteristics(ArrayList<Characteristic> characteristics) {
		this.characteristics = characteristics;
	}
	
	public ArrayList<Behaviour> getBehaviours() {
		return behaviours;
	}
	
	public void setBehaviours(ArrayList<Behaviour> behaviours) {
		this.behaviours = behaviours;
	}

	public String getBotName() {
		return botName;
	}

	public void setBotName(String botName) {
		this.botName = botName;
	}
}