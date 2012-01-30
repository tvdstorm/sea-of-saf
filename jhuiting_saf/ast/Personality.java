package ast;

import visitor.FighterVisitor;

public class Personality implements FighterNode {

	public Identifier id;
	public Identifier value;
	
	public Personality(Identifier identifier, Identifier value)
	{	
		this.id = identifier;
		this.value = value;
	}
	
	public Identifier getId() {
		return id;
	}

	public Identifier getValue() {
		return value;
	}
	
	public void accept(FighterVisitor v) {
	     v.visit(this);
	}
	
    public String toString()
    {
    	return "Personality prop:" + id.toString() + "Personality val" + value.toString();
    }
}