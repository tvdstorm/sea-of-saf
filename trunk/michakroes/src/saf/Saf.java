package saf;

public class Saf {

	private String name;
	
	private Behaviour b;
	private Personality p; 
	
	public Saf() {}
	
	public Saf(String name, Personality p, Behaviour b) {
        this.name = name;
        this.p = p; 
        this.b = b;
	} 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
