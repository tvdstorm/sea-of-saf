package saf.ast;

import java.util.ArrayList;

public class Personality implements INodeVisitable  {
	
	private final ArrayList<Characterstics> characterstics = new ArrayList<Characterstics>();

	public ArrayList<Characterstics> getCharacterstics() {
		return characterstics;
	}

	public void addCharacterstics(Characterstics characterstics) {
		this.characterstics.add(characterstics);
	}

	@Override
	public void accept(INodeVisitor v) {
		for(Characterstics c : characterstics){
			c.accept(v);
		}
		v.visit(this);
	}
	
		
}
