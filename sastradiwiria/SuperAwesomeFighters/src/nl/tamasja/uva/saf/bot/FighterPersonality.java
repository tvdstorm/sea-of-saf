package nl.tamasja.uva.saf.bot;

public class FighterPersonality {
	private String condition;
	private String move;
	private String attack;
	
	public FighterPersonality(String condition, String move, String attack) {
		this.condition = condition;
		this.move = move;
		this.attack = attack;
	}
	
	public String toString() {
		return this.condition +" [ "+ this.move + " "+this.attack+" ]";
	}	
}
