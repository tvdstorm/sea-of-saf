package safcr.ast;;

public class Characteristic implements Node{
	private final String name;
	private int value;
	
	public Characteristic(String charName, int charValue){
		name = charName;
		value = charValue;		
	}
	
	public String getName(){
		return name;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int v){
		value = v;
	}
	
	@Override
	public void addNode(Node actionType) {}

	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);
	}
}
