package visitor;

import java.util.Iterator;

public abstract class FighterVisitor {
	

    public void visit(Fighter f) {
        visit(f.getOptions());
    }
	
	public void visit(Fighter.Identifier identifier) {
		
	}
	
    public void visit(Fighter.Options s) {
        for (Iterator iterator = s.iterator(); iterator.hasNext();) {
            Fighter.FighterElement fEl = (Fighter.FighterElement) iterator.next();
            fEl.accept(this);
        }
    }

	public void visit(Fighter.Personality personality) {
		
	}

	public void visit(Fighter.Characteristic characteristic) {
		// TODO Auto-generated method stub
		
	}
}
