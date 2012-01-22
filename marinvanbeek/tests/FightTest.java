//import org.testng.annotations.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Long;

public class FightTest
{
    @Beforeclass
    public void setUp()
    {
        // code that will be invoked when this test is instantiated
    }

    @Afterclass
    public void tearDown()
    {
        // code that will be invoked when this test is instantiated
    }

    public SafFighter getRandomFighter(long seed)
    {
        Random randomGenerator = new Random(seed);

        ArrayList<String> legalAttributes = SafAttribute.LEGAL;
        ArrayList<String> attributes = new ArrayList<String>();
        for (String legalAttribute : legalAttributes)
        {
            int value = randomGenerator.nextInt(SafAttribute.MAX_VALUE) + 1;
            attributes.add(new SafAttribute(legalAttribute, value));
        }

        /* FIXME safbehaviour constructor not defined at time of writing. */
        SafBehaviour behaviour = new SafBehaviour();

        return new SafFighter(Long.toString(seed),
                              SafFighter.MAX_HEALTH,
                              attributes.toArray(),
                              behaviour);
    }

//    @Test(expected = Exception.class)

    @Test
    public void legalSafsTest()
    {
        System.out.println("Testing 'legal' fighters...");
    }

    @Test
    public void illegalSafsTest()
    {
        System.out.println("Testing 'illegal' fighters...");
    }
}

