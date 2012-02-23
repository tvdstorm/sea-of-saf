package model;

import java.util.ArrayList;
import java.util.List;

public class Personality extends ASTNode{
	
	 private final List<Characteristic> characteristics = new ArrayList<Characteristic>();
	 
	 public void add(Characteristic characteristic) {
			this.characteristics.add(characteristic);
	}
}
