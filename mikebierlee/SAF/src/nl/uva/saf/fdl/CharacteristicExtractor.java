package nl.uva.saf.fdl;

import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.ITreeNode;
import java.util.HashMap;

public class CharacteristicExtractor extends TreeVisitor {

	private ITreeNode fighter;
	private HashMap<String, Integer> extractedCharacteristics;

	public CharacteristicExtractor(ITreeNode fighter) {
		if (fighter == null) {
			throw new IllegalArgumentException("tree");
		}
		
		this.fighter = fighter;
	}
	
	public HashMap<String, Integer> extract() {
		extractedCharacteristics = new HashMap<String, Integer>();		
		fighter.accept(this);		
		return extractedCharacteristics;
	}
	
	@Override
	public void visit(Characteristic node) {
		extractedCharacteristics.put(node.getType(), node.getValue()); // TODO(mike): unit tests
		super.visit(node);
	}
}
