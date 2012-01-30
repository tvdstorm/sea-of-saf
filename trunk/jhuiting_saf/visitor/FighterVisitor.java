package visitor;

import java.util.Iterator;

import ast.*;

public abstract class FighterVisitor {

	public void visit(FighterNode e) {
		
	}
	
	public void visit(FighterTree fighterTree) {
		startVisit();
		visit(fighterTree.getElements());
		endVisit();
	}
	
	public void visit(Elements el) {
		
		for (Iterator<FighterNode> iterator = el.iterator(); iterator.hasNext();) {
			FighterNode fn = (FighterNode) iterator.next();
			fn.accept(this);
		}
	}
	
	public void visit(BehaviourRule behaviourRule) {
		
	}

	public void visit(Personality personality) {
		
	}
	
	public abstract void startVisit();
	public abstract void endVisit();

}
