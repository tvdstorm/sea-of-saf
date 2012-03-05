package safcr.data;

import java.util.ArrayList;
import java.util.List;

public class AttackData {
	private List<String> attackData;
	private String[] defaultAttacks = {"punch_low", "punch_high", "kick_low", "kick_high", "block_low", "block_high"};
	
	public AttackData(){
		attackData = new ArrayList<String>();
		
		for(String s : defaultAttacks){
			attackData.add(s);
		}
	}
	
	public List<String> getAttacks(){
		return attackData;
	}
	
}
