package ast;

import visitor.FighterVisitor;

public class Identifier implements FighterNode {
    public String value;

    /** Constructor. */
    public Identifier(String identifier) {
        value = identifier;
    }
    
    public String getValue()
    {
    	return value;
    }

	@Override
	public void accept(FighterVisitor v) {
        v.visit(this);
	}
}    