package SAF.Structure;

import java.util.ArrayList;

import SAF.Checker.SAFElement;
import SAF.Checker.SAFElementVisitor;
import SAF.Checker.SAFValidationException;

public class Bot implements SAFElement {
	public Bot(String name) {
		Characteristics = new ArrayList<Characteristic>();
		Behaviors = new ArrayList<Behavior>();
		setName(name);
	}
	
    public void accept(SAFElementVisitor visitor) throws SAFValidationException {
        visitor.visit(this);
    }
	
	private String name;
	private ArrayList<Characteristic> Characteristics;
	private ArrayList<Behavior> Behaviors;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Characteristic> getCharacteristics() {
		return Characteristics;
	}
	public void setCharacteristics(ArrayList<Characteristic> characteristics) {
		Characteristics = characteristics;
	}
	public ArrayList<Behavior> getBehaviors() {
		return Behaviors;
	}
	public void setBehaviors(ArrayList<Behavior> behaviors) {
		Behaviors = behaviors;
	}
}
