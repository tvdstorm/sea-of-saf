package grammar.Evaluators;

public class Characteristic implements Visitable {
	final private String character;
	final private int value;
	
	public Characteristic(String character, int value) {
		this.character = character;
     	this.value = value;
	}
	
	public String getCharacterName () {
		return this.character;
	}
	
	public int getCharacterValue () {
		return this.value;
	}
	
	public String toString () {
		return "Charact: " + this.character + "  " + String.valueOf(this.value);
	}

	@Override
	public void accept(BotVisit visitor) {
		visitor.visit(this);
	}
}
