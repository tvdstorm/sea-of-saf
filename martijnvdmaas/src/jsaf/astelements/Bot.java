package jsaf.astelements;

import java.util.ArrayList;
import java.util.List;

import jsaf.visitor.SAFElement;
import jsaf.visitor.SAFElementVisitor;


public class Bot implements SAFElement
{
	private List<Characteristic> characteristics;
	private List<Behaviour> behaviours;
	private String botName = new String();
	
	public Bot()
	{
		characteristics = new ArrayList<Characteristic>();
		behaviours = new ArrayList<Behaviour>();
	}

	public void addCharacteristic(Characteristic characteristic)
	{
		this.characteristics.add(characteristic);
	}

	public void addBehaviour(Behaviour behaviour)
	{
		this.behaviours.add(behaviour);
	}
	
	public List<Characteristic> getCharacteristics()
	{
		return characteristics;
	}

	public void setCharacteristics(List<Characteristic> characteristics)
	{
		this.characteristics = characteristics;
	}

	public List<Behaviour> getBehaviours()
	{
		return behaviours;
	}

	public void setBehaviours(List<Behaviour> behaviours)
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
	public void accept(SAFElementVisitor visitor)
	{
		for (Characteristic characteristic : characteristics)
		{
			characteristic.accept(visitor);
		}
		for (Behaviour behaviour : behaviours)
		{
			behaviour.accept(visitor);
		}
		visitor.visit(this);
	}
}