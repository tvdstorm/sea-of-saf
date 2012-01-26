package visitor;

import ast.*;
import java.util.Iterator;

public abstract class FighterVisitor {
	
	public abstract  void startVisit();
	public abstract void finishVisit();

    public void visit(FighterTree f) {
    	startVisit(); 
        visit(f.getOptions());
        finishVisit();
    }
	
	public void visit(Identifier identifier) {
		
	}
	
    public void visit(Options s) {
        for (Iterator<INode> iterator = s.iterator(); iterator.hasNext();) {
        	INode fEl = iterator.next();
            fEl.accept(this);
        } 
    }

	public void visit(Personality personality) {
		
	}

	public void visit(Characteristic characteristic) {
		
	}
	public void visit(Action action) {
		
	}
}
