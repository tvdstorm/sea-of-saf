package saf.evaluator;

import java.util.ArrayList;

public class Personality implements INodeVisitable  {
	
	private ArrayList<Characterstics> characterstics = new ArrayList<Characterstics>();

	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
	}

	public ArrayList<Characterstics> getCharacterstics() {
		return characterstics;
	}

	public void setCharacterstics(Characterstics characterstics) {
		this.characterstics.add(characterstics);
	}
	
}
