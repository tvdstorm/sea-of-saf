import org.testng.annotations.*;

public class FightTest
{
    @BeforeClass
    public void setUp()
    {
        // code that will be invoked when this test is instantiated
    }

    @Test(groups = { "legal-fighters" })
    public void aFastTest()
    {
        System.out.println("Testing 'maximal' fighter...");
    }
}

