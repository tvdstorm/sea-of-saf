package saf.structure;

import java.util.ArrayList;

import saf.checker.Element;
import saf.checker.ElementVisitor;


public class Bot implements Element {
	public Bot(String name) {
		Characteristics = new ArrayList<Characteristic>();
		Behaviors = new ArrayList<Behavior>();
		this.name = name;
	}
	
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
        
        for (Characteristic characteristic : this.getCharacteristics()) {
			characteristic.accept(visitor);
		}
        
        for (Behavior behavior : this.getBehaviors()) {
			behavior.accept(visitor);
		}
    }
	
	private final String name;
	private final ArrayList<Characteristic> Characteristics;
	private final ArrayList<Behavior> Behaviors;
	
	public String getName() {
		return name;
	}
	public ArrayList<Characteristic> getCharacteristics() {
		return Characteristics;
	}
	public ArrayList<Behavior> getBehaviors() {
		return Behaviors;
	}
	
	public void addCharacteristic(Characteristic characteristic) {
		Characteristics.add(characteristic);
	}
	public void addBehavior(Behavior behavior) {
		Behaviors.add(behavior);
	}
}
