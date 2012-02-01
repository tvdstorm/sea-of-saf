package data;
import java.util.List;

import core.BaseTreePrinter;

public class Personality extends BaseData {

	private List<Characteristic> characteristics;
	
	public Personality(List<Characteristic> characteristics) {
		this.characteristics = characteristics;
	}
	
	public List<Characteristic> getCharacteristics() {
		return characteristics;
	}

	@Override
	public void acceptTreePrinter(BaseTreePrinter treePrinter) {
		treePrinter.visit(this);
		for ( Characteristic characteristic : characteristics ) {
			characteristic.acceptTreePrinter(treePrinter);
		}
	}
	
}
