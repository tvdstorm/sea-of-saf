package saf.evaluator;

public class Checker implements INodeVisitor {

	@Override
	public void visit(Bot bot) {
		// TODO Auto-generated method stub
		System.out.println("Bot");
	}

	@Override
	public void visit(Characterstics characterstics) {
		// TODO Auto-generated method stub
		System.out.println("Characterstics");
	}

	@Override
	public void visit(Rule rule) {
		// TODO Auto-generated method stub
		System.out.println("Rule");
	}

	@Override
	public void visit(Behaviour behaviour) {
		// TODO Auto-generated method stub
		System.out.println("Behaviour");
		
	}

	@Override
	public void visit(Personality personality) {
		// TODO Auto-generated method stub
		System.out.println("Personality");
	}


	
}
