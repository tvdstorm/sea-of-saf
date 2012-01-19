import org.testng.annotations.*;

public class ParseTest
{
    @BeforeClass
    public void setUp()
    {
        // code that will be invoked when this test is instantiated
    }

//legal_maximum.saf
//legal_minimal.saf
    @Test(groups = { "legal-fighters" })
    public void legalFilesTest()
    {
    }

//illegal_attribute_name.saf
//illegal_attribute_value.saf
//illegal_condition.saf
//illegal_attack.saf
//illegal_missing_requirement.saf
//illegal_move.saf
//illegal_syntax_tree1.saf
//illegal_syntax_tree2.saf
    @Test(groups = { "illegal-fighters" })
    public void illegalFilesTest()
    {
    }

    public void safFileTest(String file_name, boolean fails)
    {
        System.out.println("Testing " + file_name + "...");
    }
}

