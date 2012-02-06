package saf.structure;

import java.util.ArrayList;

import saf.checker.Element;
import saf.checker.ElementVisitor;


public class Bots implements Element {
	public Bots()
	{ 
		this.bots = new ArrayList<Bot>();
	}
	
    public void accept(ElementVisitor visitor) {
        visitor.visit(this);
        
        for (Bot bot : this.getBots()) {
			bot.accept(visitor);
		}
    }
	
	private final ArrayList<Bot> bots;
	public ArrayList<Bot> getBots() {
		return bots;
	}
	public void addBot(Bot bot) {
		this.bots.add(bot);
	}
}
