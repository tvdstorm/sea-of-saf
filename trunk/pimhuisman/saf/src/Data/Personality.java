package Data;
import java.util.LinkedList;

public class Personality {

	private LinkedList<Characteristic> characteristics;
	
	public Personality() {
		characteristics = new LinkedList<Characteristic>();
	}
	
	public void clearCharacteristics() {
		characteristics.clear();
	}
	
	public void addCharacteristic(Characteristic characteristic) {
		characteristics.add(characteristic);
	}
	
	public LinkedList<Characteristic> getCharacteristics() {
		return characteristics;
	}
	
}
