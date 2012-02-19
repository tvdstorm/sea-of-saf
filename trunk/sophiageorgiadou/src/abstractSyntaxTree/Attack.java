package abstractSyntaxTree;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import checker.Checker;
import enumCheckerTypes.*;
/**
 * This class represents the fighter's attack attribute.
 * It contains an arraylist of attacks 
 * @author Sofia
 *
 */
public class Attack extends Checker{
	
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
	
	@Override
	public boolean IsAValidWord() {
		try {
			for(int i=0;i<this.attacks.size();i++){
		       ValidAttackWord.valueOf(this.attacks.get(i).toUpperCase());
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"CHECKER ERROR: See console for details");
			System.out.println("CHECKER ERROR: An Attack word is not valid\nDetails: "+e.getMessage());
			System.exit(-1);
		}
		System.out.println("Checker status: SUCCEED");
		return true;
	}

}
