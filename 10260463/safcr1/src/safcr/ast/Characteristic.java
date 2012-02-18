package safcr.ast;

public class Characteristic implements Node{
	private String name;
	private int value;
	
	public Characteristic(String charName, int charValue){
		name = charName;
		value = charValue;
	}
	
	@Override
	public void addNode(Node actionType) {}
	
	public String getName(){
		return name;
	}
	
	@Override
	public String toTreeString(String indent) {
		return '\n' + indent + name + " = " + value;
	}
}
