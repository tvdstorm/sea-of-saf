package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Personality implements Node{
	private final List<Node> characteristic;
	private List<String> errors;
	
	private String[] defaultCharacteristic = {"punchPower", "kickPower", "punchReach", "kickReach"};
	private final int defaultValue = 5;
	
	public Personality(){
		characteristic = new ArrayList<Node>();
		errors = new ArrayList<String>();

		for(String s : defaultCharacteristic){
			characteristic.add(new Characteristic(s, defaultValue));
		}
	}
	
	private void addLastCharacteristic(){
		int punchPower = 0;
		int kickPower = 0;
		int punchReach = 0;
		int kickReach = 0;
		
		for(Node c : characteristic){
			Characteristic ch = (Characteristic) c;
			if(ch.getName().equals("punchPower")) punchPower = ch.getValue();
			if(ch.getName().equals("kickPower")) kickPower = ch.getValue();
			if(ch.getName().equals("punchReach")) punchReach = ch.getValue();
			if(ch.getName().equals("kickReach")) kickReach = ch.getValue();
		}
		
		int weight = (punchPower + kickPower) / 2;
		Characteristic w = new Characteristic("weight", weight);
		characteristic.add(w);
		
		int height = (punchReach + kickReach) / 2;
		Characteristic h = new Characteristic("height", height);
		characteristic.add(h);
		
		int speed = (height-weight) / 2;
		if(speed < 1) speed = 1;
		Characteristic s = new Characteristic("speed", speed);
		characteristic.add(s);
	}
	
	@Override
	public void addNode(Node n) {		
		if(n == null) addLastCharacteristic();
		else{
			Characteristic c = (Characteristic) n;
			for(Node c2 : characteristic){
				Characteristic ch = (Characteristic) c2;
				if(ch.getName().equals(c.getName())){ 
						ch.setValue(c.getValue());
						c = null;
						break;
				}
			}
			
			if(c != null) characteristic.add(n);
		}
	}

	@Override
	public String toTreeString(String indent) {
		String s = '\n' + indent + "characteristic";
		for(Node chars : characteristic){
			s += chars.toTreeString(indent + "  ");
		}
		
		return s;
	}

	@Override
	public List<String> getErrors() {
		List<String> allErrors = new ArrayList<String>();
		allErrors.addAll(errors);
		for(Node c : characteristic){
			allErrors.addAll(c.getErrors());
		}
		
		return allErrors;
	}
}
