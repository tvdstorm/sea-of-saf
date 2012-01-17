package safobjects;

public class Bots {
	private Bot firstBot;
	private Bot secondBot;
	
	
	public String toString() {
		String output = firstBot.toString() + secondBot.toString();
		return "Class: " + this.getClass().getName() +  "\n" + output;
	}
}