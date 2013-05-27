package gui;

public interface GuiVisitor {
	
	public void visit(Arena arena);
	public void visit(HealthPanel healthPanel);
	public void visit(Battlefield battlefield);
	public void visit(FighterPanel fighterPanel);

}
