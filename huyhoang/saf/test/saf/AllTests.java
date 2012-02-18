package saf;

import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import saf.ast.Fighter;
import saf.checker.CheckerVisitorTest;
import saf.interpreter.BotTest;
import saf.interpreter.InterpreterVisitorTest;
import saf.parser.ParseException;
import saf.parser.Parser;
import saf.parser.ParserTest;

@RunWith(Suite.class)
@SuiteClasses({ CheckerVisitorTest.class, BotTest.class, InterpreterVisitorTest.class, ParserTest.class })
public class AllTests {
	static public Fighter getFighterAst(String specification) {
		ByteArrayInputStream input = new ByteArrayInputStream(specification.getBytes());
		Parser parser = new Parser(input);
		try {
			parser.Root();
			return parser.getFighter();
		}
		catch (ParseException exception) {
			fail("ParseException not expected: " + exception.getMessage());
			return null;
		}
	}
}