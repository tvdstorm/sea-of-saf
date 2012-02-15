package saf;

import java.util.Iterator;
import java.util.List;

public class FightAction extends Type {
	
	public FightAction(String m) { 
		super(m);
		System.out.println("Fight: "  + m.toString());
	}
	
	public FightAction(List<String> fights) {
		super(fights);
		/*
		Iterator<String> i = fights.iterator();
		while (i.hasNext()) {
			System.out.println("Fight: " + i.next().toString());
		}
		*/
		//System.out.println("Fight: "  + m.toString());
	}
}
