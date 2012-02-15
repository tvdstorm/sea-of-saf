package saf.junit.structure;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import saf.checker.ElementChecker;
import saf.game.GameConstant;
import saf.junit.TestHelpers;
import saf.parser.FileParser;
import saf.structure.Bot;
import saf.structure.Bots;
import saf.structure.intelligence.BotIntelligence;


public class CharacteristicTest implements GameConstant {
	
	private Bot botNormal;
	private Bot botDouble;
	private Bot botInvalid;
	
	private List<String> botNormalErrors;
	private List<String> botDuplicateErrors;
	private List<String> botInvalidErrors;
	
	
	
	@Before
	public void init()
	{
		Bots bots = FileParser.consume("src\\saf\\junit\\input\\Bot_Char_Normal.txt");
		this.botNormal = bots.getBots().get(0);
		botNormalErrors = ElementChecker.check(bots);
		
		bots = FileParser.consume("src\\saf\\junit\\input\\Bot_Char_Double.txt");
		this.botDouble = bots.getBots().get(0);
		botDuplicateErrors = ElementChecker.check(bots);
		
		bots = FileParser.consume("src\\saf\\junit\\input\\Bot_Char_Invalid.txt");
		this.botInvalid = bots.getBots().get(0);
		botInvalidErrors = ElementChecker.check(bots);
	}
	
	@Test
	public void valueTest()
	{
		String Error_Base = "Error in valueTest :";	
		
		assertEquals(Error_Base + TestHelpers.convertToReadableString(botNormalErrors), 0, botNormalErrors.size());
		
		assertEquals(Error_Base + "loading " + CHAR_TYPE_KICKREACH + " Characteristic value", 9, BotIntelligence.getCharacteristic(botNormal, CHAR_TYPE_KICKREACH).getValue());
		assertEquals(Error_Base + "loading " + CHAR_TYPE_KICKPOWER + " Characteristics value", 5, BotIntelligence.getCharacteristic(botNormal, CHAR_TYPE_KICKPOWER).getValue());
		assertEquals(Error_Base + "loading " + CHAR_TYPE_PUNCHPOWER + " Characteristics value", 6, BotIntelligence.getCharacteristic(botNormal, CHAR_TYPE_PUNCHPOWER).getValue());
		assertEquals(Error_Base + "loading " + CHAR_TYPE_PUNCHREACH + " Characteristics value", 1, BotIntelligence.getCharacteristic(botNormal, CHAR_TYPE_PUNCHREACH).getValue());
	}
	
	@Test
	public void invalidTest()
	{
		if(botInvalidErrors.size() == 0)
			fail("Error in invalidTest, error not found in 'invalidTest'" );
		
		assertEquals("Error in invalidTest","The characteristic 'punchPowerrrrr' is invalid.", botInvalidErrors.get(0));
	}
	
	@Test
	public void duplicateTest()
	{
		if(botDuplicateErrors.size() == 0)
			fail("Error in duplicationTest, error not found in 'doubleTest'" );
		
		assertEquals("Error in duplicationTest", "Duplicate characteristic found: 'punchPower'.", botDuplicateErrors.get(0));	
	}

}
