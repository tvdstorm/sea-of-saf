package safcr.ast;

interface VisitorInterface {
	public void visit(Saf saf);
	public void visit(Bot bot);
	public void visit(Personality pers);
	public void visit(Characteristic chars);
	public void visit(Behaviour behave);
	public void visit(Rule rule);
	public void visit(Condition con);
	public void visit(Action act);
	public void visit(ActionType actType);
	public void visit(MultiActionType multiActType);
	public void visit(And andStatement);
	public void visit(Or orStatement);
}
