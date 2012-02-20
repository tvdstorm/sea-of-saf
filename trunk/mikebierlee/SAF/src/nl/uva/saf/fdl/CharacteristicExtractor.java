/* Copyright (c) 2012 Mike Bierlee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package nl.uva.saf.fdl;

import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.ITreeNode;
import nl.uva.saf.fdl.types.CharacteristicType;
import nl.uva.saf.fdl.types.TypeTranslator;

import java.util.HashMap;

public class CharacteristicExtractor extends TreeVisitor {

	public static HashMap<CharacteristicType, Integer> getCharacteristics(ITreeNode fighter) {
		CharacteristicExtractor extractor = new CharacteristicExtractor(fighter);
		return extractor.extract();
	}
	private HashMap<CharacteristicType, Integer> extractedCharacteristics;

	private ITreeNode fighter;

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
		extractedCharacteristics.put(TypeTranslator.getCharacteristicType(node.getType()), node.getValue());
		super.visit(node);
	}
}
