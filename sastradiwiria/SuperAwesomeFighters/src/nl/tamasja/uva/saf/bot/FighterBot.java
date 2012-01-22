package nl.tamasja.uva.saf.bot;

public class FighterBot {
	private String name;
	private FighterProperties fighterProperties;
	private FighterPersonalities fighterPersonalities;
	
	public FighterBot(String name, FighterProperties fighterProperties, FighterPersonalities fighterPersonalities) {
		this.name = name;
		this.fighterProperties = fighterProperties;
		this.fighterPersonalities = fighterPersonalities;
	}
	
	public String toString() {
		return this.name + " {\n" + 
				fighterProperties.toString() + "\n" +
				fighterPersonalities.toString() + "\n" +
				"}";
		
	}
	
}
