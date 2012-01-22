import org.antlr.runtime.*;
import org.junit.Test;


public class SAFTest
{
    @Test
    public void testAlwaysRule() throws RecognitionException
    {
        String input = "Always { always [walk_towards punch_high] }";
        Fighter fighter = new Fighter(new ANTLRStringStream(input));
    }

    @Test(expected = SAFException.class)
    public void testMissingAlwaysRule() throws java.io.IOException, RecognitionException
    {
        String input = "NoAlwaysRule { far [walk_towards punch_high] }";
        Fighter fighter = new Fighter(new ANTLRStringStream(input));
    }
}
