package abstractSyntaxTree;

/**
 * This class represents a personality node
 * @author Sofia
 *
 */
public class PersonalityNode {

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
}
