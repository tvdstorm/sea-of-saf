package nl.uva.saf.fdl.ast;

import java.util.List;


public abstract class TreeWalker implements ITreeWalker {

	public void walk(Fighter fighterNode) {
		//List<ITreeNode> attributes = fighterNode.getAttributes();
				
		//for (ITreeNode attribute : attributes) {			
		//	walk(attribute);
		//}
	}
	
	public void walk(Characteristic characteristicNode){};
	
	public void walk(Behaviour behaviourNode) {};
	
	//public void walk(ITreeNode treeNode) {
	//	System.err.println("Tree traversal error. Type not implemented: " + treeNode.toString());
	//}
}
