package grammar;

import static org.junit.Assert.*;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import fighter.Fighter;
import fighter.Personality;
import fighter.Rule;
import fighter.condition.ICondition;
import fighter.condition.OrCondition;

import reader.antlr.SAFParser;
import utils.TestUtils;

public class GrammarParserTest {

	private final String inputFile = "operatorsPriority.txt";
	private SAFParser parser;
	private Fighter fighter;

	public GrammarParserTest() throws RecognitionException {
		parser = TestUtils.getParserForFile(inputFile);
		fighter = parser.fighter();
	}

	@Test
	public void persoanlityTest() throws RecognitionException {

		assertEquals("JackieChan", fighter.getName());
		Personality personality = fighter.getPersonality();

		assertEquals(7, personality.getKickPower());
		assertEquals(3, personality.getKickReach());
		assertEquals(5, personality.getPunchPower());
		assertEquals(9, personality.getPunchReach());
	}

	@Test
	public void andLeftStrongerThanOr() throws RecognitionException {
		Rule rule = fighter.getBehaviour().get(0);
		ICondition condition = rule.getCondition();
		assertEquals(OrCondition.class, condition.getClass());
		assertEquals("(far OR (near AND weaker))", condition.toString());

	}

	@Test
	public void andRightStrongerThanOr() throws RecognitionException {
		Rule rule = fighter.getBehaviour().get(1);
		ICondition condition = rule.getCondition();
		assertEquals(OrCondition.class, condition.getClass());
		assertEquals("((far AND near) OR weaker)", condition.toString());

	}

	@Test
	public void multipleAndOrOperators() {
		Rule rule = fighter.getBehaviour().get(2);
		ICondition condition = rule.getCondition();
		assertEquals("((far OR (near AND weaker)) OR much_stronger)",
				condition.toString());
	}

	@Test
	public void testBrackets() {
		Rule rule = fighter.getBehaviour().get(3);
		ICondition condition = rule.getCondition();
		assertEquals("((far OR near) AND (weaker OR much_stronger))",
				condition.toString());
	}

}
