package saf;

public class Saf {

	private String name;
	
	private Behaviour b;
	private Personality p;
	
	public Saf() {}
	
	public Saf(String name, Personality p) {
        this.name = name;
        //this.b = b;
        this.p = p; 
	} 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
