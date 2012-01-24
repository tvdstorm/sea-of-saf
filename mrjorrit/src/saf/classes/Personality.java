package saf.classes;

import java.util.Vector;

public class Personality implements Strict  {
	
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
	public void check() throws Exception {
		for(Characteristic character : personality) character.check();
	}
}
