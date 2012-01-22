package nl.tamasja.uva.saf.bot;

public class FighterProperty {
	private String propertyName;
	private int propertyStat;
	
	public FighterProperty(String propertyName, int propertyStat) {
		this.propertyName = propertyName;
		this.propertyStat = propertyStat;
	}
	
	public String toString() {
		return this.propertyName +" = "+ this.propertyStat;
	}
}
