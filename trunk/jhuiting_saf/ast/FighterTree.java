package ast;

import visitor.FighterVisitor;

public class FighterTree implements FighterNode {
    Elements el;
    
    /** Constructor. */
    public FighterTree(Elements e) {
        el = e;
    }
    
    public Elements getElements()
    {
    	return el;
    }

	@Override
	public void accept(FighterVisitor v) {
	     v.visit(this);
	}
}