package nl.uva.saf.test;

import java.util.ArrayList;
import java.util.HashMap;

import junit.framework.Assert;

import nl.uva.saf.fdl.CharacteristicExtractor;
import nl.uva.saf.fdl.ast.Characteristic;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.FighterAttribute;
import org.junit.Test;

public class CharacteristicExtractorTest {

	@Test
	public void extractPunchCharacteristicsTest() {
		ArrayList<FighterAttribute> attributes = new ArrayList<FighterAttribute>();
		attributes.add(new Characteristic("punchReach", 10));
		attributes.add(new Characteristic("punchPower", 1));
		
		Fighter fighter = new Fighter("extractPunchCharacteristicsTest", attributes);	
		CharacteristicExtractor extractor = new CharacteristicExtractor(fighter);
		HashMap<String, Integer> extractedCharacteristics =  extractor.extract();
		
		Assert.assertTrue(extractedCharacteristics.size() > 0);
		Assert.assertTrue(extractedCharacteristics.get("punchReach") == 10);
		Assert.assertTrue(extractedCharacteristics.get("punchPower") == 1);
		Assert.assertTrue(extractedCharacteristics.get("kickPower") == null);
	}
	
	@Test
	public void extractFromEmptyAttributeListTest() {
		Fighter fighter = new Fighter("extractFromEmptyAttributeListTest", new ArrayList<FighterAttribute>());
		CharacteristicExtractor extractor = new CharacteristicExtractor(fighter);
		HashMap<String, Integer> extractedCharacteristics = extractor.extract();
		
		Assert.assertTrue(extractedCharacteristics.size() == 0);
		Assert.assertTrue(extractedCharacteristics.get("punchPower") == null);
		Assert.assertTrue(extractedCharacteristics.get("kickReach") == null);
	}
}
 