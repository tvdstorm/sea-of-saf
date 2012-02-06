package nl.uva.saf.fdl;

import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.ITreeNode;
import java.util.HashMap;

public class AttributeExtractor extends TreeVisitor {

	private ITreeNode fighter;
	private HashMap<String, Integer> extractedAttributes;

	public AttributeExtractor(ITreeNode fighter) {
		this.fighter = fighter;
	}
	
	public HashMap<String, Integer> extract() {
		extractedAttributes = new HashMap<String, Integer>();		
		fighter.accept(this);		
		return extractedAttributes;
	}
	
	@Override
	public void visit(Characteristic node) {
		extractedAttributes.put(node.getType(), node.getValue()); // TODO(mike): unit tests
		super.visit(node);
	}
}
