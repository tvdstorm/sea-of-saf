package abstractSyntaxTree;

import java.util.ArrayList;

/**
 * This class represents the personalite attributes
 * @author Sofia
 *
 */
public class Personality {

	private ArrayList<PersonalityNode> personality= new ArrayList<PersonalityNode>();
	private int punchPower=0;
	private int kickPower=0;
	private int punchReach=0;
	private int kickReach=0;
		
	/**
	 * add node to personality
	 * @param node
	 */
	public void addNode(PersonalityNode node){
		this.getPersonality().add(node);
	}

	/**
	 * Calculate dynamic attributes
	 */
	public void calibrateAttributes(){
		calculatePower("punchPower");
		calculatePower("kickPower");
		calculatePower("punchReach");
		calculatePower("kickReach");
	}
	
	/**
	 * Calculate power
	 * @param type
	 */
	public void calculatePower(String type){
		int sum=0;
		int x=0;
		boolean exists=false;
		for(int i=0;i<getPersonality().size();i++){
			if(getPersonality().get(i).getStrength().equals(type)){
				sum+=getPersonality().get(i).getValue();
				x++;
				exists=true;
			}
		}
		
		if(type.equals("punchPower"))
			if(exists)
				this.punchPower=sum/x;
			else
				this.punchPower=5;
		else if(type.equals("kickPower"))
			if(exists)
				this.kickPower=sum/x;
			else
				this.kickPower=5;
		else if(type.equals("kickReach"))
			if(exists)
				this.kickReach=sum/x;
			else
				this.kickReach=5;
		else if(type.equals("punchReach"))
			if(exists)
				this.punchReach=sum/x;
			else
				this.punchReach=5;
	}
	
	public String toString(){
		String temp="";
		for(int i=0; i<this.getPersonality().size();i++){
			temp+=this.getPersonality().get(i)+",";
		}
		return temp;
	}

	/**
	 * @return the punchPower
	 */
	public int getPunchPower() {
		return punchPower;
	}

	/**
	 * @param punchPower the punchPower to set
	 */
	public void setPunchPower(int punchPower) {
		this.punchPower = punchPower;
	}

	/**
	 * @return the kickPower
	 */
	public int getKickPower() {
		return kickPower;
	}

	/**
	 * @param kickPower the kickPower to set
	 */
	public void setKickPower(int kickPower) {
		this.kickPower = kickPower;
	}

	/**
	 * @return the punchReach
	 */
	public int getPunchReach() {
		return punchReach;
	}

	/**
	 * @param punchReach the punchReach to set
	 */
	public void setPunchReach(int punchReach) {
		this.punchReach = punchReach;
	}

	/**
	 * @return the kickReach
	 */
	public int getKickReach() {
		return kickReach;
	}

	/**
	 * @param kickReach the kickReach to set
	 */
	public void setKickReach(int kickReach) {
		this.kickReach = kickReach;
	}

	/**
	 * @return the personality
	 */
	public ArrayList<PersonalityNode> getPersonality() {
		return personality;
	}

	/**
	 * @param personality the personality to set
	 */
	public void setPersonality(ArrayList<PersonalityNode> personality) {
		this.personality = personality;
	}
}