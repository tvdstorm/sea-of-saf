package checker.semantic;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import reader.antlr.SAFParser;
import utils.TestUtils;
import fighter.Bot;
import fighter.Personality;
import fighter.checker.SemanticChecker;
import fighter.messages.Message;

public class CheckerTests {

	private final String inputFile = "semanticTest.txt";
	private SAFParser parser;
	private Bot fighter;
	private List<Message> messages;

	public CheckerTests() throws RecognitionException {
		parser = TestUtils.getParserForFile(inputFile);
		System.out.println("ok read ");
		fighter = parser.fighter();
		System.out.println("ok parser ");
		messages = SemanticChecker.checkBot(fighter);
		System.out.println(" ok checker");
	}

	@Test
	public void persoanlityTest() throws RecognitionException {
		assertEquals("JackieChan", fighter.getName());
		Personality personality = fighter.getPersonality();

		assertEquals(7, personality.getKickPower());
		assertEquals(-1, personality.getKickReach());
		assertEquals(5, personality.getPunchPower());
		assertEquals(12, personality.getPunchReach());
	}

	@Test
	public void personalityErrors() {
		System.out.println(messages);
	}

	public static void main(String[] args) throws RecognitionException {
		new CheckerTests().personalityErrors();
	}
}
