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
		
		for(Bot b : saf.getBots()){
			b.accept(this);
		}
	}
	
	@Override
	public void visit(Bot bot) {
		depth = 1;
		printTree("bot: " + bot.getName());
		
		bot.getPersonality().accept(this);
		bot.getBehaviour().accept(this);
	}

	@Override
	public void visit(Personality pers) {
		depth = 2;
		printTree("personality");
		
		for(Characteristic c : pers.getCharacteristic()){
			c.accept(this);
		}
	}

	@Override
	public void visit(Characteristic chars) {
		depth = 3;
		printTree(chars.getName() + ": " + chars.getValue());
	}

	@Override
	public void visit(Behaviour behave) {
		depth = 2;
		printTree("behaviour");
		
		for(Rule r : behave.getRules()){
			r.accept(this);
		}
	}

	@Override
	public void visit(Rule rule) {
		depth = 3;
		printTree("rule");
		depth += 1;
		
		rule.getCondition().accept(this);
		rule.getAction().accept(this);
	}

	@Override
	public void visit(Condition con) {
		printTree("condition: " + con.getType());
	}

	@Override
	public void visit(Action act) {
		depth = 4;
		printTree("actions");
		
		depth += 1;
		act.getAction1().accept(this);
		act.getAction2().accept(this);
	}

	@Override
	public void visit(ActionType actType) {
		printTree("action: " + actType.getActionType());
	}

	@Override
	public void visit(MultiActionType multiActType) {
		printTree("action choices");
		depth += 1;
		multiActType.getTypeChoice1().accept(this);
		multiActType.getTypeChoice2().accept(this);
		depth -= 1;
	}

	@Override
	public void visit(And andStatement) {
		printTree("and");
		depth += 1;
		
		andStatement.getNode1().accept(this);
		andStatement.getNode2().accept(this);
		
		depth -= 1;
	}

	@Override
	public void visit(Or orStatement) {
		printTree("or");
		depth += 1;
		
		orStatement.getNode1().accept(this);
		orStatement.getNode2().accept(this);
		
		depth -= 1;
	}
}
