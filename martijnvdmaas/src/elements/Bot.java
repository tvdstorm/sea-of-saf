package elements;

import java.util.ArrayList;

import visitor.SAFElement;
import visitor.SAFElementVisitor;

public class Bot implements SAFElement
{
	private ArrayList<Characteristic> characteristics 	= new ArrayList<Characteristic>();
	private ArrayList<Behaviour> behaviours 			= new ArrayList<Behaviour>();
	
	private String botName = new String();

	public void addCharacteristic(Characteristic characteristic) 
	{
		this.characteristics.add(characteristic);
	}
	
	public void addBehaviour(Behaviour behaviour) 
	{
		this.behaviours.add(behaviour);
	}
	
	public String toString() 
	{
		String output = "Class: " + this.getClass().getName();

		return output;
	}
	
	public ArrayList<Characteristic> getCharacteristics() 
	{
		return characteristics;
	}
	
	public void setCharacteristics(ArrayList<Characteristic> characteristics) 
	{
		this.characteristics = characteristics;
	}
	
	public ArrayList<Behaviour> getBehaviours() 
	{
		return behaviours;
	}
	
	public void setBehaviours(ArrayList<Behaviour> behaviours) 
	{
		this.behaviours = behaviours;
	}

	public String getBotName() 
	{
		return botName;
	}

	public void setBotName(String botName) 
	{
		this.botName = botName;
	}

	@Override
	public void accept(SAFElementVisitor visitor) throws Exception {
		for(Characteristic characteristic : characteristics) 
		{
			characteristic.accept(visitor);
		}
		for(Behaviour behaviour : behaviours) 
		{
			behaviour.accept(visitor);
		}
		visitor.visit(this);
	}
}