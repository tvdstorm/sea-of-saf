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

package nl.uva.saf.test;

import java.util.ArrayList;
import java.util.HashMap;

import junit.framework.Assert;

import nl.uva.saf.fdl.CharacteristicExtractor;
import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.FighterAttribute;
import nl.uva.saf.fdl.types.CharacteristicType;

import org.junit.Test;

public class CharacteristicExtractorTest {

	@Test
	public void extractPunchCharacteristicsTest() {
		ArrayList<FighterAttribute> attributes = new ArrayList<FighterAttribute>();
		attributes.add(new Characteristic("punchReach", 10));
		attributes.add(new Characteristic("punchPower", 1));

		Fighter fighter = new Fighter("extractPunchCharacteristicsTest", attributes);
		CharacteristicExtractor extractor = new CharacteristicExtractor(fighter);
		HashMap<CharacteristicType, Integer> extractedCharacteristics = extractor.extract();

		Assert.assertTrue(extractedCharacteristics.size() > 0);
		Assert.assertTrue(extractedCharacteristics.get(CharacteristicType.punchReach) == 10);
		Assert.assertTrue(extractedCharacteristics.get(CharacteristicType.punchPower) == 1);
		Assert.assertTrue(extractedCharacteristics.get(CharacteristicType.kickPower) == null);
	}

	@Test
	public void extractFromEmptyAttributeListTest() {
		Fighter fighter = new Fighter("extractFromEmptyAttributeListTest", new ArrayList<FighterAttribute>());
		CharacteristicExtractor extractor = new CharacteristicExtractor(fighter);
		HashMap<CharacteristicType, Integer> extractedCharacteristics = extractor.extract();

		Assert.assertTrue(extractedCharacteristics.size() == 0);
		Assert.assertTrue(extractedCharacteristics.get(CharacteristicType.punchPower) == null);
		Assert.assertTrue(extractedCharacteristics.get("kickReach") == null);
	}

	@Test
	public void extractWithStaticMethod() {
		ArrayList<FighterAttribute> attributes = new ArrayList<FighterAttribute>();
		attributes.add(new Characteristic("punchReach", 10));
		attributes.add(new Characteristic("punchPower", 1));
		Fighter fighter = new Fighter("extractPunchCharacteristicsTest", attributes);

		HashMap<CharacteristicType, Integer> extractedCharacteristics = CharacteristicExtractor
				.getCharacteristics(fighter);

		Assert.assertTrue(extractedCharacteristics.size() > 0);
		Assert.assertTrue(extractedCharacteristics.get(CharacteristicType.punchReach) == 10);
		Assert.assertTrue(extractedCharacteristics.get(CharacteristicType.punchPower) == 1);
		Assert.assertTrue(extractedCharacteristics.get(CharacteristicType.kickPower) == null);
	}
}
