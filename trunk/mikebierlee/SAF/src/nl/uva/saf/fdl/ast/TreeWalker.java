package nl.uva.saf.fdl.ast;

import java.util.List;


public abstract class TreeWalker implements ITreeWalker {

	public void walk(Fighter fighterNode) {
		List<Characteristic> characteristics = fighterNode.getCharacteristics();
		List<Behaviour> behaviours = fighterNode.getBehaviours();
		
		for (Characteristic attribute : characteristics) {			
			walk((Characteristic)attribute);
		}
		
		for (ITreeNode behaviour : behaviours) {
			walk((Behaviour)behaviour);
		}
	}
	
	public void walk(Characteristic characteristicNode){};
	
	public void walk(Behaviour behaviourNode) {};
	
	//public void walk(ITreeNode treeNode) {
	//	System.err.println("Tree traversal error. Type not implemented: " + treeNode.toString());
	//}
}
