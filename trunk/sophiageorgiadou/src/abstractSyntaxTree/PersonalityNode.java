package abstractSyntaxTree;

import javax.swing.JOptionPane;

import checker.Checker;
import enumCheckerTypes.*;
/**
 * This class represents a personality node
 * @author Sofia
 *
 */
public class PersonalityNode extends Checker{

	private String strength;
	private int value;
	
	public PersonalityNode(){
		this.strength=new String();
		this.value=0;
	}
	
	/**
	 * @return the strength
	 */
	public String getStrength() {
		return strength;
	}
	/**
	 * @param strength the strength to set
	 */
	public void setStrength(String strength) {
		this.strength = strength;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString(){
		String temp=this.strength+"="+this.value;
		return temp;
	}
	
	@Override
	public boolean IsAValidWord() {
		try {
			ValidStrengthWord.valueOf(this.strength.toUpperCase());
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"CHECKER ERROR: See console for details");
			System.out.println("CHECKER ERROR: A Strength word is not valid\nDetails: "+e.getMessage());
			System.exit(-1);
		}
		System.out.println("Checker status: SUCCEED");
		return true;
	}
}
