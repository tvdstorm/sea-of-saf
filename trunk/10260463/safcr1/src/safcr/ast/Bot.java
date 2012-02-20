package safcr.ast;

public class Bot implements Node{
	private final String name;
	private final Node personality;
	private final Node behaviour;
	
	public Bot(String botName, Node botPersonality, Node botBehaviour){
		name = botName;
		personality = botPersonality;
		behaviour = botBehaviour;
	}
	
	@Override
	public void addNode(Node n){}
	
	public String getName(){
		return name;
	}
	
	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
		personality.accept(v);
		behaviour.accept(v);
	}
}
