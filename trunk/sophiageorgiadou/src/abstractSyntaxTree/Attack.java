package abstractSyntaxTree;

import java.util.ArrayList;

/**
 * This class represents the fighter's attack attribute.
 * It contains an arraylist of attacks 
 * @author Sofia
 *
 */
public class Attack {
	
	private ArrayList<String> attacks;
	
	/**
	 * Constructor
	 */
	public Attack(){
		this.setAttacks(new ArrayList<String>());
	}

	/**
	 * Get attacks
	 * @return
	 */
	public ArrayList<String> getAttacks() {
		return attacks;
	}

	/**
	 * Set attacks
	 * @param attacks
	 */
	public void setAttacks(ArrayList<String> attacks) {
		this.attacks = attacks;
	}

	public String toString(){
		String temp="Attacks: ";
		
		for(int i=0;i<this.attacks.size();i++){
			temp+=this.attacks.get(i)+",";
		}
		return temp;
	}
}
