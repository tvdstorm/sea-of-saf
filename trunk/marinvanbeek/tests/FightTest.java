import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Long;

public class FightTest
{
    @BeforeClass
    public void setUp()
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

    @Test(groups = { "legal-fighters" })
    public void aFastTest()
    {
        System.out.println("Testing 'maximal' fighter...");
    }
}

