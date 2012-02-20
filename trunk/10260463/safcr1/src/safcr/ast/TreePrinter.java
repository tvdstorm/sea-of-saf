package safcr.ast;

public class TreePrinter implements VisitorInterface {
	private String indent = "   ";
	private int depth = 0;
	
	public void printTree(String message){
		System.out.println(indentsGenerator(depth) + message);
	}
	
	public String indentsGenerator(int lv){
		String indents = "";
		for(int i = 0; i < lv; i++){
			indents += indent;
		}
		
		return indents;
	}
	
	@Override
	public void visit(Saf saf) {
		printTree("SAF");
	}
	
	@Override
	public void visit(Bot bot) {
		depth = 1;
		printTree("bot: " + bot.getName());
	}

	@Override
	public void visit(Personality pers) {
		depth = 2;
		printTree("personality");
	}

	@Override
	public void visit(Characteristic chars) {
		depth = 3;
		printTree(chars.getName() + " " + chars.getValue());
	}

	@Override
	public void visit(Behaviour behave) {
		depth = 2;
		printTree("behaviour");
	}

	@Override
	public void visit(Rule rule) {
		depth = 3;
		printTree("rule");
		depth += 1;
	}

	@Override
	public void visit(Condition con) {
		printTree("condition: " + con.getType());
	}

	@Override
	public void visit(Action act) {
		depth = 4;
		printTree("actions");
	}

	@Override
	public void visit(ActionType actType) {
		depth = 5;
		printTree("action: " + actType.getActionType());
	}

	@Override
	public void visit(MultiActionType multiActType) {
		depth = 5;
		printTree("action choices: " + '\n' + indentsGenerator(depth+1) +
				   multiActType.getTypeChoice1() + "\n" + indentsGenerator(depth+1) +
				   multiActType.getTypeChoice2());
	}

	@Override
	public void visit(And andStatement) {
		printTree("and");
		depth += 1;
	}

	@Override
	public void visit(Or orStatement) {
		printTree("or");
		depth += 1;
	}
}
