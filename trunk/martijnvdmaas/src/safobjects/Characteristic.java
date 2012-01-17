package safobjects;

public class Characteristic {
	private String name;
	private int value;
	
	public Characteristic() {
		value = 5; //set default value;
	}
	
	public String toString() {
		String output = "      Name: " + this.name + "\n";
		output += "      Value: " + this.value;
		return "    Class: " + this.getClass().getName() + "\n" +  output + "\n";
	}
}
