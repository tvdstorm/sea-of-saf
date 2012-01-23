package data;
import java.util.List;
import java.util.LinkedList;

public class Personality {

	private List<Characteristic> characteristics;
	
	public Personality() {
		characteristics = new LinkedList<Characteristic>();
	}
	
	public void clearCharacteristics() {
		characteristics.clear();
	}
	
	public void addCharacteristic(Characteristic characteristic) {
		characteristics.add(characteristic);
	}
	
	public List<Characteristic> getCharacteristics() {
		return characteristics;
	}
	
}
