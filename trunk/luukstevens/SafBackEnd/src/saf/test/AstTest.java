package saf.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import javax.xml.bind.JAXBException;

import org.junit.Test;

import saf.ast.Action;
import saf.ast.BehaviourRule;
import saf.ast.Bot;
import saf.ast.Characteristic;
import saf.ast.condition.*;

public class AstTest {
	public static final String XML_FILE_LOCATION = "data/examples/bot.xml";
	
	@Test
	public void deserialization() throws FileNotFoundException, JAXBException {
		Bot bot = Bot.deserialize(XML_FILE_LOCATION);
		
		assertTrue(bot.getName().equals("Bot"));
		
		Characteristic characteristic = bot.getCharacteristics().get(0);
		assertTrue(characteristic.getName().equals("kickPower"));
		assertTrue(characteristic.getValue() == 5);
		
		BehaviourRule behaviourRule = bot.getBehaviourRules().get(0);
		
		Simple condition = (Simple) behaviourRule.getCondition();
		assertTrue(condition.getValue().equals("always"));
		
		Action move = behaviourRule.getMoveActions().get(0);
		assertTrue(move.getValue().equals("run_towards"));
		
		Action fightAction = behaviourRule.getFightActions().get(0);
		assertTrue(fightAction.getValue().equals("kick_high"));
	}
}
