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
		HashMap<CharacteristicType, Integer> extractedCharacteristics =  extractor.extract();
		
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
		
		HashMap<CharacteristicType, Integer> extractedCharacteristics =  CharacteristicExtractor.getCharacteristics(fighter);
		
		Assert.assertTrue(extractedCharacteristics.size() > 0);
		Assert.assertTrue(extractedCharacteristics.get(CharacteristicType.punchReach) == 10);
		Assert.assertTrue(extractedCharacteristics.get(CharacteristicType.punchPower) == 1);
		Assert.assertTrue(extractedCharacteristics.get(CharacteristicType.kickPower) == null);
	}
}
 