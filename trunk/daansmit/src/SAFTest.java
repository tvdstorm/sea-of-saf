import org.antlr.runtime.*;
import org.junit.*;

import java.io.PrintStream;
import java.io.FileNotFoundException;

public class SAFTest
{
    private static final String defaultAlwaysRule = 
        "always [crouch block_low]";

    @BeforeClass
    public static void setup()
    {
        try
        {
            PrintStream log = new PrintStream("test.out");
            System.setOut(log);
            System.setErr(log);
        }
        catch (FileNotFoundException e)
        {
            System.err.println(e.getMessage());
        }
    }

    @Test
    public void testAlwaysRule()
        throws RecognitionException
    {
        String input = "Always { " + alwaysRule + " }";
        Fighter fighter = new Fighter(new ANTLRStringStream(input));
    }

    @Test(expected = SAFException.class)
    public void testMissingAlwaysRule()
        throws java.io.IOException, RecognitionException
    {
        String input = "NoAlwaysRule { far [walk_towards punch_high] }";
        Fighter fighter = new Fighter(new ANTLRStringStream(input));
    }

    public void validNumber()
        throws RecognitionException
    {
        String input = "ValidNumber { punchReach = 1 " + defaultAlwaysRule;
        Fighter fighter = new Fighter(new ANTLRStringStream(input));
    }

    @Test(expected = NumberFormatException.class)
    public void testInvalidNumber()
        throws RecognitionException
    {
        String input = "InvalidNumber { punchReach = a " + defaultAlwaysRule;
        Fighter fighter = new Fighter(new ANTLRStringStream(input));
    }
}
