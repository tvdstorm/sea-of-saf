package tests;

import saf.data.*;
import saf.syntax.*;

import saf.parser.SAFLexer;
import saf.parser.SAFParser;

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
    private static final String LOG_FILE = "parse_test_results.txt";
    private static final String TEST_FILES_LOCATION = "src/tests/safs/";

    private static PrintStream stdout;
    private static PrintStream stderr;

    @BeforeClass
    public static void redirect()
    {
        try
        {
            stdout = System.out;
            stderr = System.err;

            PrintStream logFile = new PrintStream(LOG_FILE);
            System.setOut(logFile);
            System.setErr(logFile);
        } catch (FileNotFoundException e)
        {
            System.err.println("Couldn't open log file\n" + e.getMessage());
        }
    }

    @AfterClass
    public static void unRedirect()
    {
        System.setOut(stdout);
        System.setErr(stderr);
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

        ANTLRFileStream input = new ANTLRFileStream(TEST_FILES_LOCATION + 
                                                    fileName);
        SAFLexer lexer = new SAFLexer(input);
        SAFParser parser = 
                new SAFParser(new CommonTokenStream(lexer));
        parser.parse();
        saf.syntax.SyntaxCheck syntaxCheck = parser.getSyntaxCheck();

        List<String> syntaxErrors = new ArrayList<String>();

        boolean wellFormed = syntaxCheck.isWellFormed(syntaxErrors);
        if (syntaxErrors.size() > 0)
        {
            System.out.println("Reported errors:");
            for (String error : syntaxErrors)
            {
                System.out.println(" -- " + error);
            }
            System.out.println();
        }
        else if (wellFormed)
        {
            System.out.println("Passed; parsed result:");
            syntaxCheck.printResult();
        } 
        else
        {
            System.out.println("No syntax errors, but didn't pass either.");
        }
        Assert.assertEquals(passes, wellFormed);
    }
}

