package nl.uva.saf.fdl;

import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.ITreeNode;
import nl.uva.saf.fdl.types.CharacteristicType;
import nl.uva.saf.fdl.types.TypeTranslator;

import java.util.HashMap;

public class CharacteristicExtractor extends TreeVisitor {

	private ITreeNode fighter;
	private HashMap<CharacteristicType, Integer> extractedCharacteristics;

	public CharacteristicExtractor(ITreeNode fighter) {
		if (fighter == null) {
			throw new IllegalArgumentException("tree");
		}
		
		this.fighter = fighter;
	}
	
	public HashMap<CharacteristicType, Integer> extract() {
		extractedCharacteristics = new HashMap<CharacteristicType, Integer>();		
		fighter.accept(this);		
		return extractedCharacteristics;
	}
	
	@Override
	public void visit(Characteristic node) {
		extractedCharacteristics.put(TypeTranslator.getCharacteristicType(node.getType()), node.getValue()); // TODO(mike): unit tests
		super.visit(node);
	}
	
	public static HashMap<CharacteristicType, Integer> getCharacteristics(ITreeNode fighter) {
		CharacteristicExtractor extractor = new CharacteristicExtractor(fighter);
		return extractor.extract();
	}
}
