package grammar.Evaluators;

import java.util.*;

public class Bot {
	//Characteristic [] characteristics ;
	List <Characteristic> karakterestieken = new LinkedList<Characteristic>();
	List <Rule>regels = new LinkedList<Rule>();
	String naam;
	
	public Bot() {
	}
	
	public Bot(String naam, List<Characteristic> karakterestieken, List<Rule> regels) {
		this.karakterestieken = karakterestieken;
		this.regels = regels;
		this.naam = naam;
	}

    public void setName(String name) {
    	this.naam = name;
    }

    public Bot (String naam) {
		super();
		this.naam = naam;
	}
	
	
	public  void addC (Characteristic karakterestiek) {
		this.karakterestieken.add(karakterestiek);
	}

	public  void addR (Rule regel) {
		this.regels.add(regel);
	}

	public String toString () {
		return "Bot: "+this.naam + this.karakterestieken.toString() + " "+ this.regels.toString();
	}
	
	
	
	


	
}
