//import org.testng.annotations.*;
//import org.testng.Reporter;
import org.junit.*;

import org.antlr.runtime.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;

public class ParseTest
{
    private static final String LOG_FILE = "test_results.txt";

    @BeforeClass
    public static void redirect()
    {
        try
        {
            PrintStream logFile = new PrintStream(LOG_FILE);
            System.setOut(logFile);
            System.setErr(logFile);
        } catch (FileNotFoundException e)
        {
            System.err.println("Couldn't open log file" + e.getMessage());
        }
    }

    @Before
    public void setup()
    {
        System.out.println();
    }

    @Test
    public void legalFilesTest()
        throws IOException, RecognitionException
    {
        String[] legalFiles = new String[] {"legal_minimum.saf",
                                            "logic_test.saf",
                                            "legal_maximum.saf"};

        for (String fileName : legalFiles)
        {
            safFilesTest(fileName, true);
        }
    }
//
//    @Test(expected = NumberFormatException.class)
//    public void illegalNumberTest()
//    {
//        String[] illegalFiles = new String[] {"illegal_attribute_value.saf"};
//
//        for (String fileName : illegalFiles)
//        {
//            safFilesTest(fileName, false);
//        }
//    }

    @Test
    public void illegalFilesTest()
        throws IOException, RecognitionException
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
        throws IOException, RecognitionException
    {
        System.out.println("Testing " + fileName + ">");

        ANTLRFileStream input = new ANTLRFileStream("tests/safs/" + fileName);
        SAFLexer lexer = new SAFLexer(input);
        SAFParser parser = new SAFParser(new CommonTokenStream(lexer));
        parser.parse();
        Fighter fighter = parser.fighter;

        List<String> syntaxErrors = new ArrayList<String>();

        boolean wellFormed = fighter.isWellFormed(syntaxErrors);
        System.out.println("Reported errors:");
        for (String error : syntaxErrors)
        {
            System.out.println(" -- " + error);
        }
        Assert.assertEquals(passes, wellFormed);

        if (passes)
            System.out.println(fighter);

        System.out.println("<passed (fighter.isWellFormed() = " + passes + 
                           ").");
        System.out.println();
    }
}

