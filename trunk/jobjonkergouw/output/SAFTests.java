import java.io.*;
import org.testng.TestNG;
import org.testng.annotations.*;
import org.antlr.*;
import org.antlr.runtime.*;

import java.util.*;

public class SAFTests {
    @Test
    public void testNewline() throws IOException, RecognitionException {
        SAFParser parser = createParser("Botnaam{}");
        String result = parser.fighter();
        assert result.equals("Botnaam") : "Expected Botnaam, but got " + result;
    }
 
    private SAFParser createParser(String testString) throws IOException {
        CharStream stream = new ANTLRStringStream(testString);
        SAFLexer lexer = new SAFLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SAFParser parser = new SAFParser(tokens);
        return parser;
    }
    
    public static void main(String[] args) throws IOException, RecognitionException {
        SAFTests test = new SAFTests();
        test.testNewline();
    }
}