package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Bot implements Node{
	private final String name;
	private final Node personality;
	private final Node behaviour;
	private List<String> errors;
	
	public Bot(String botName, Node botPersonality, Node botBehaviour){
		name = botName;
		personality = botPersonality;
		behaviour = botBehaviour;
		errors = new ArrayList<String>();
	}
	
	@Override
	public void addNode(Node n){}
	
	public String getName(){
		return name;
	}

	@Override
	public String toTreeString(String indent) {
		return '\n' + indent + "bot: " + name + 
				personality.toTreeString(indent + "  ") +
				behaviour.toTreeString(indent + "  ");
	}

	@Override
	public List<String> getErrors() {
		List<String> allErrors = new ArrayList<String>();
		allErrors.addAll(errors);
		allErrors.addAll(personality.getErrors());
		allErrors.addAll(behaviour.getErrors());
		
		return allErrors;
	}
}
