package safcr.ast;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Saf implements Node{
	private final Map<String,Bot> bots;
	
	public Saf(){
		super();
		bots = new HashMap<String,Bot>();
	}
	
	public void addBot(Bot b){
		bots.put(b.getName(), b);
	}
	
	public Collection<Bot> getBots(){
		return bots.values();
	}
	
	public Bot getBot(String name){
		return bots.get(name);
	}

	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);	
	}
}
