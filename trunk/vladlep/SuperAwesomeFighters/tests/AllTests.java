import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ grammar.GrammarParserTest.class,
		algorithm.FightActionReaderTest.class, checker.semantic.CheckerTests.class })
public class AllTests {

}
