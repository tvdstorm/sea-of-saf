package safcr.ast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Saf implements Node{
	private final List<Bot> bots;
	
	public Saf(){
		super();
		bots = new ArrayList<Bot>();
	}
	
	public void addBot(Bot b){
		bots.add(b);
	}
	
	public List<Bot> getBots(){
		return bots;
	}
	

	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);	
	}
}
