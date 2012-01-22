package nl.tamasja.uva.saf.bot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FighterProperties {
	private List<FighterProperty> properties;
	
	public FighterProperties() {		
		this.properties = new ArrayList<FighterProperty>();
	}
	
	public void Add(FighterProperty fighterProperty) {
		this.properties.add(fighterProperty);
	}
	
	public String toString() {
		String str = "";
		Iterator iterator = properties.iterator();
		while(iterator.hasNext())
		    str += iterator.next().toString()+"\n";
		
		return str;
	}

}
