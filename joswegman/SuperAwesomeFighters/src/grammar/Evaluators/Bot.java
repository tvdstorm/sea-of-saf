package grammar.Evaluators;

import java.util.*;


public class Bot implements Visitable {
	final private List <Characteristic> characteristics = new LinkedList<Characteristic>();
	final private List <Rule>rules = new LinkedList<Rule>();
	private String name;
	
	public Bot() {

	}
	
    public void setName(String name) {
    	this.name = name;
    }

    public String getName(){
    	return this.name;
    }
    
    public Bot (String name) {
		super();
		this.name = name;
	}
	
	public  void addC (Characteristic karakterestiek) {
		this.characteristics.add(karakterestiek);
	}

	public  void addR (Rule regel) {
		this.rules.add(regel);
	}

	public String toString () {
		return "Bot: "+this.name + this.characteristics.toString() + " "+ this.rules.toString();
	}

	public List<Characteristic> getCharacteristics (){
		return this.characteristics;
	}
	
	public List<Rule> getRules () {
		return this.rules;
	}

	@Override
	public void accept(BotVisit visitor) {
		visitor.visit(this);
	}
}
