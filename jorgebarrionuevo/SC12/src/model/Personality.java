package model;

import java.util.ArrayList;
import java.util.List;

import util.Visitor;

public class Personality extends ASTNode{
	
	 private final List<Characteristic> characteristics = new ArrayList<Characteristic>();
	 
	 public void addCharacteristic(Characteristic characteristic) {
			this.characteristics.add(characteristic);
	}
	 
	 @Override
	 public void accept(Visitor visitor) {
		visitor.visit(this);
	 } 
}
