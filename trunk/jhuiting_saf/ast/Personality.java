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
	
	public String getId() {
		return id.getValue();
	}

	public Integer getValue() {
		return Integer.parseInt(value.getValue());
	}
	
	public void accept(FighterVisitor v) {
	     v.visit(this); 
	}
	
    public String toString()
    {
    	return "Personality prop:" + id.toString() + "Personality val" + value.toString();
    }
}