package saf.structure;

import java.util.Vector;

public class Personality extends Check  {
	
	public Personality(Vector<Characteristic> personality)
	{
		this.personality = personality;
	}
	
	//Behaviour
	private Vector<Characteristic> personality;
	
	public Vector<Characteristic> getBehaviour() {
		return personality;
	}

	@Override
	public void check(){
		for(Characteristic character : personality) character.check();
	}
}
