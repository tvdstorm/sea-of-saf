package fighter;

import java.util.ArrayList;
import java.util.List;

public class Personality {

	private List<Caracteristic> caracteristics;

	public Personality() {
		caracteristics = new ArrayList<Caracteristic>();
	}

	public void addCaracteristic(Caracteristic newCaracteristic) {
		caracteristics.add(newCaracteristic);
	}

	public List<Caracteristic> getCaracteristics() {
		return caracteristics;
	}
}
