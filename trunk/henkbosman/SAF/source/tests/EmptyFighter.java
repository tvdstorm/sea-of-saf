package tests;

import static org.junit.Assert.*;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.junit.Test;

import parser.SAFLexer;
import parser.SAFParser;

import fighter.Fighter;
import fighter.Property.EnumProperties;
import fighter.Rules;

public class EmptyFighter {

	@Test
	public void testFighter()
	{
		Fighter fighter = parseFighter();
		assertEquals(true, fighter.getErrors().isEmpty());
		assertEquals("Testfighter", fighter.getName());
	}
	
	@Test
	public void testProperties()
	{
		Fighter fighter = parseFighter();
		for (EnumProperties p : EnumProperties.values())
		{
			assertEquals(fighter.getPropertyValue(p), 5);
		}
	}
	
	@Test
	public void testRules()
	{
		Fighter fighter = parseFighter();
		Rules rules = new Rules(10,1,100);
		fighter.setRules(rules);
		assertEquals(100, fighter.getHealth());
	}
	
	@Test
	public void testDamage()
	{
		Fighter fighter = parseFighter();
		Rules rules = new Rules(10,1,100);
		fighter.setRules(rules);
		fighter.getDamage(10);
		assertEquals(90, fighter.getHealth());
	}
	
	@Test
	public void testMovement()
	{
		Fighter fighter = parseFighter();
		Rules rules = new Rules(10,1,100);
		fighter.setRules(rules);
		fighter.movePosition(20);
		assertEquals(20,fighter.getPosition());
		fighter.movePosition(30);
		assertEquals(50,fighter.getPosition());
	}
	
	@Test
	public void testActions()
	{
		Fighter fighter = parseFighter();
		Rules rules = new Rules(10,1,100);
		fighter.setRules(rules);
		assertNotNull(fighter.performAction(1, 10));
		assertNotNull(fighter.performAction(1, 50));
		assertNotNull(fighter.performAction(1, 90));
	}
	
	private Fighter parseFighter()
	{
		try {
			SAFLexer lexer = new SAFLexer(createFighter());
			TokenStream tokenStream = new CommonTokenStream(lexer);
			SAFParser parser = new SAFParser(tokenStream); 
			Fighter fighter = parser.fighter();

			return fighter;
			
		} catch (RecognitionException e) {
			fail(e.getMessage());
		}
		
		return null;
	}
	
	private CharStream createFighter()
	{
		String fighter="Testfighter\n{";
		fighter+="\n}";

		return new ANTLRStringStream(fighter);
	}
	

}
