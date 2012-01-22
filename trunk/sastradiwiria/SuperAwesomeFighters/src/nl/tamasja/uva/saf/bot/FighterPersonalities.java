package nl.tamasja.uva.saf.bot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FighterPersonalities {
	private List<FighterPersonality> personalities;
	
	public FighterPersonalities() {
		this.personalities = new ArrayList<FighterPersonality>();
	}
	
	public void Add(FighterPersonality fighterProperty) {
		this.personalities.add(fighterProperty);
	}
	
	public String toString() {
		String str = "";
		Iterator iterator = personalities.iterator();
		while(iterator.hasNext())
		    str += iterator.next().toString()+"\n";
		
		return str;
	}
}
