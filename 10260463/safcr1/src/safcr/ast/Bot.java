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
	public void addNode(Node actionType) {}
	
	public String getName(){
		return name;
	}

	@Override
	public String toTreeString(String indent) {
		return '\n' + indent + "bot: " + name + 
				personality.toTreeString(indent + "  ") +
				behaviour.toTreeString(indent + "  ");
	}
}
