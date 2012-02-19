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

import behaviours.Action;
import behaviours.Action.Actions;
import behaviours.Condition;
import behaviours.Condition.Conditions;
import behaviours.Movement;
import behaviours.Movement.Movements;

import fighter.Combatmove;
import fighter.Fighter;
import fighter.Property;
import fighter.Rules;
import fighter.Property.Properties;

public class Main {

	@Test
	public void test()
	{
		try {
			SAFLexer lexer = new SAFLexer(createFighter());
			TokenStream tokenStream = new CommonTokenStream(lexer);
			SAFParser parser = new SAFParser(tokenStream); 
			Fighter fighter = parser.fighter();

			runTests(fighter);
		} catch (RecognitionException e) {
			fail(e.getMessage());
		}

	}
	
	private void runTests(Fighter fighter)
	{
		assertEquals(true, fighter.getErrors().isEmpty());
		assertEquals("Testfighter", fighter.name());
		
		for (Properties p : Property.Properties.values())
		{
			assertEquals(fighter.getPropertyValue(p), 7);
		}
		
		Rules rules = new Rules(10,1,100);
		fighter.setRules(rules);
		assertEquals(100, fighter.getHealth());
		fighter.getDamage(10);
		assertEquals(90, fighter.getHealth());
		
		fighter.movePosition(20);
		assertEquals(20,fighter.getPosition());
		fighter.movePosition(30);
		assertEquals(50,fighter.getPosition());
		
		assertNotNull(fighter.performAction(1, 10));
		assertNotNull(fighter.performAction(1, 50));
		assertNotNull(fighter.performAction(1, 90));
	}
	
	private CharStream createFighter()
	{
		String fighter="Testfighter\n{";
		for (Properties p : Property.Properties.values())
		{
			fighter+="\n"+p+"=7";
		}
		
		for (Conditions c : Condition.Conditions.values())
		{
			for (Movements m : Movement.Movements.values())
			{
				for (Actions a : Action.Actions.values())
				{
					fighter+="\n"+c+"["+m+" "+a+"]";
					fighter+="\n"+c+" and ("+c+" or "+c+")["+m+" "+a+"]";
					fighter+="\n"+c+" and "+c+"["+m+" "+a+"]";
					fighter+="\n"+c+"["+m+" choose("+a+" "+a+")]";
					fighter+="\n"+c+"[choose("+m+" "+m+")"+a+"]";
					fighter+="\n"+c+"[choose("+m+" "+m+")choose("+a+" "+a+")]";
				}
			}
		}
		
		fighter+="\n}";

		return new ANTLRStringStream(fighter);
	}
	

}
