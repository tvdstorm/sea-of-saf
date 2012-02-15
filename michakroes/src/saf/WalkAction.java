package saf;

import java.util.List;
import java.util.Iterator;

public class WalkAction extends Type {
	
	public WalkAction(String m) {
		super(m);
		System.out.println("Walk: "  + m.toString());
	}
	
	public WalkAction(List<String> walks) {
		super(walks);
		/*
		Iterator<String> i = walks.iterator();
		while (i.hasNext()) {
			System.out.println("Walk: " + i.next().toString());
		}
		*/
		//System.out.println("Walk: "  + m.toString());
	}
}
