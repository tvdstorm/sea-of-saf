package grammar.Evaluators;

import java.util.*;


public class Bot implements Visitable {
	final private List <Characteristic> karakterestieken = new LinkedList<Characteristic>();
	final private List <Rule>regels = new LinkedList<Rule>();
	private String naam;
	
	public Bot() {

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

	public List<Characteristic> getCharacteristics (){
		return this.karakterestieken;
	}
	
	public List<Rule> getRules () {
		return this.regels;
	}

	@Override
	public void accept(BotVisit visitor) {
		visitor.visit(this);
	}
}
