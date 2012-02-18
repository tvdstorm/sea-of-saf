package safcr.ast;

import java.util.ArrayList;
import java.util.List;

public class Personality implements Node{
	private List<Node> characteristic;
	
	public Personality(){
		characteristic = new ArrayList<Node>();
	}
	
	@Override
	public void addNode(Node chars) {
		characteristic.add(chars);
	}

	@Override
	public String toTreeString(String indent) {
		String s = '\n' + indent + "characteristic";
		for(Node chars : characteristic){
			s += chars.toTreeString(indent + "  ");
		}
		
		return s;
	}
}
