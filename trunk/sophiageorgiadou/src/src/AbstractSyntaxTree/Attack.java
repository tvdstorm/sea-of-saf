package AbstractSyntaxTree;

import java.util.ArrayList;

public class Attack {
	
	private ArrayList<String> attacks;
	
	public Attack(){
		this.setAttacks(new ArrayList<String>());
	}

	public ArrayList<String> getAttacks() {
		return attacks;
	}

	public void setAttacks(ArrayList<String> attacks) {
		this.attacks = attacks;
	}

}
