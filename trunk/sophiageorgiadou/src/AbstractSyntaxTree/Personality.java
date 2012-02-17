package AbstractSyntaxTree;

import java.util.ArrayList;

public class Personality {

	private ArrayList<Integer> kickPower;
	private ArrayList<Integer> punchPower;
	private ArrayList<Integer> kickReach;
	private ArrayList<Integer> punchReach;
		
	public Personality(){
		
		this.setKickPower(new ArrayList<Integer>());
		this.setPunchPower(new ArrayList<Integer>());
		this.setKickReach(new ArrayList<Integer>());
		this.setPunchReach(new ArrayList<Integer>());
	}
	
	public ArrayList<Integer> getKickPower() {
		return kickPower;
	}

	public void setKickPower(ArrayList<Integer> kickPower) {
		this.kickPower = kickPower;
	}

	public ArrayList<Integer> getPunchPower() {
		return punchPower;
	}

	public void setPunchPower(ArrayList<Integer> punchPower) {
		this.punchPower = punchPower;
	}

	public ArrayList<Integer> getKickReach() {
		return kickReach;
	}

	public void setKickReach(ArrayList<Integer> kickReach) {
		this.kickReach = kickReach;
	}

	public ArrayList<Integer> getPunchReach() {
		return punchReach;
	}

	public void setPunchReach(ArrayList<Integer> punchReach) {
		this.punchReach = punchReach;
	}
}