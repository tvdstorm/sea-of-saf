package gui;

import java.util.List;

public abstract class DelegateGuiVisitor implements GuiVisitor {

	private void delegate(List<VisitableGui> hosts){
		for(VisitableGui host : hosts)
			host.accept(this);
	}
	
	@Override
	public void visit(Arena arena) {
		delegate(arena.getVisitableChildren());
	}

	@Override
	public void visit(HealthPanel healthPanel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Battlefield battlefield) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(FighterPanel fighterPanel) {
		// TODO Auto-generated method stub
		
	}

	
	
}
