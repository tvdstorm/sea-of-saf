package saf;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import saf.checker.CheckerVisitorTest;
import saf.interpreter.BotTest;
import saf.parser.ParserTest;

@RunWith(Suite.class)
@SuiteClasses({ CheckerVisitorTest.class, BotTest.class, ParserTest.class })
public class AllTests {
}
