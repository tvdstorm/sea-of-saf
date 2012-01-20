import org.testng.annotations.*;
import org.testng.Reporter;

import org.antlr.runtime.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import java.io.IOException;

public class ParseTest
{
    @BeforeClass
    public void setUp()
    {
        /* Should set stdout and stderr to Reporter. */
        // code that will be invoked when this test is instantiated
    }

    @AfterClass
    public void tareDown()
    {
    }

    @Test(groups = { "legal-fighters" })
    public void legalFilesTest()
    {
        String[] legalFiles = new String[] {"legal_minimum.saf",
                                            "legal_maximum.saf"};

        for (String fileName : legalFiles)
        {
            safFilesTest(fileName, true);
        }
    }

    @Test(groups = { "illegal-fighters" })
    public void illegalFilesTest()
    {
        String[] illegalFiles = new String[] {"illegal_attribute_name.saf",
                                              "illegal_attribute_value.saf",
                                              "illegal_condition.saf",
                                              "illegal_attack.saf",
                                              "illegal_missing_requirement.saf",
                                              "illegal_move.saf",
                                              "illegal_syntax_tree1.saf",
                                              "illegal_syntax_tree2.saf"};

        for (String fileName : illegalFiles)
        {
            safFilesTest(fileName, false);
        }
    }

    public void safFilesTest(String fileName, boolean passes)
    {
        try
        {
            System.out.println("Testing " + fileName + "...");

            ANTLRFileStream input = new ANTLRFileStream("safs/" + fileName);
            SAFLexer lexer = new SAFLexer(input);
            SAFParser parser = new SAFParser(new CommonTokenStream(lexer));
            SafTreeNode tree = (SafTreeNode)parser.parse().getTree();

            System.out.println(fileName + " is well formed: " +
                               tree.isWellFormed());
            System.out.println("Should pass: " + passes);
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        } catch (RecognitionException e)
        {
            System.out.println(e.getMessage());
        } 
    }
}

