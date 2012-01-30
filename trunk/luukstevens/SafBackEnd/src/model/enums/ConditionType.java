package model.enums;

public enum ConditionType {
	ALWAYS("always"),
	NEAR("near"), 
	FAR("far"), 
	MUCH_STRONGER("much_stronger"), 
	STRONGER("stronger"),
	EVEN("even"), 
	WEAKER("weaker"), 
	MUCH_WEAKER("much_weaker");

	private String text;
	
	ConditionType(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
