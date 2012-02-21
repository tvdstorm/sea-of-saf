package data;
import java.util.List;

import core.BaseTreeVisitor;

public class Personality extends BaseData {

	private final static int DEFAULT_VALUE = 5;
	private List<Characteristic> characteristics;
	
	public Personality(List<Characteristic> characteristics) {
		this.characteristics = characteristics;
	}
	
	public List<Characteristic> getCharacteristics() {
		return characteristics;
	}
	
	public Characteristic getCharacteristic(String name) {
		for ( Characteristic characteristic : characteristics ) {
			if ( characteristic.getName() == name ) {
				return characteristic;
			}
		}
		return new Characteristic(name, DEFAULT_VALUE);
	}

	@Override
	public void acceptTreeVisitor(BaseTreeVisitor treeVisitor) {
		treeVisitor.visit(this);
		for ( Characteristic characteristic : characteristics ) {
			characteristic.acceptTreeVisitor(treeVisitor);
		}
	}
	
}
