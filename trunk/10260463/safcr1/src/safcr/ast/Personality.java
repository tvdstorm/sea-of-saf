package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Personality implements Node{
	private final List<Characteristic> characteristic;
	
	public Personality(){
		super();
		characteristic = new ArrayList<Characteristic>();
	}
	
	public void addCharacteristic(Characteristic c){
		characteristic.add(c);
	}
	
	public List<Characteristic> getCharacteristic(){
		return characteristic;
	}
	
	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);	
	}
}
