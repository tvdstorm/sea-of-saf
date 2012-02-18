package abstractSyntaxTree;

import java.util.ArrayList;

public class Personality {

	ArrayList<PersonalityNode> personality= new ArrayList<PersonalityNode>();
	
	public void addNode(PersonalityNode node){
		this.personality.add(node);
	}
	
	public String toString(){
		String temp="";
		for(int i=0; i<this.personality.size();i++){
			temp+=this.personality.get(i)+",";
		}
		return temp;
	}
}