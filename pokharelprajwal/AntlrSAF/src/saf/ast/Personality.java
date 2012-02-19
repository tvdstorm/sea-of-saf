package saf.ast;

import java.util.ArrayList;

public class Personality implements INodeVisitable  {
	
	private final ArrayList<Characterstics> characterstics = new ArrayList<Characterstics>();

	@Override
	public void accept(INodeVisitor v) {
		v.visit(this);
		for(Characterstics c : characterstics){
			c.accept(v);
		}
	}

	public ArrayList<Characterstics> getCharacterstics() {
		return characterstics;
	}

	public void addCharacterstics(Characterstics characterstics) {
		this.characterstics.add(characterstics);
	}
	
	@Override
	public String GetTreeString() {
		StringBuilder retStr = new StringBuilder();
		String newLine = System.getProperty("line.separator");
		for(Characterstics c : characterstics){
			retStr.append(newLine);
			retStr.append(c.GetTreeString());
		}
		return retStr.toString();
	}
	
}
