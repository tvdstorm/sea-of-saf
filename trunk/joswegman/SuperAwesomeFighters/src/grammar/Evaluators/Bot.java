package grammar.Evaluators;


public class Bot {
	//Characteristic [] characteristics ;
	//List <Characteristic> karakterestieken = new LinkedList<Characteristic>();
	//List <Rule>regels = new LinkedList<Rule>();
	Characteristic karakteristiek;
	Rule regel;
	
	public Bot(Characteristic karakterestiek, Rule regel) {
		super();
		this.karakteristiek = karakterestiek;
		this.regel = regel;
		
	}
	public Bot () {
		super();
		this.karakteristiek = null;
		this.regel = null;
	}

	public String toString () {
		// System.out.println("Bot: " + this.karakteristiek.toString() + " "+ this.regel.toString());
		return "Bot: " + this.karakteristiek.toString() + " "+ this.regel.toString();
	}
	
	
	
	


	
}