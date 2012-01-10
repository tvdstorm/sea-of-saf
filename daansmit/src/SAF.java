import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


public class SAF {

    public static void main(String[] args) throws Exception {
        ANTLRFileStream input = new ANTLRFileStream("..\\data\\fighters\\Simple.saf");
        SAFLexer lexer = new SAFLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SAFParser parser = new SAFParser(tokens);
        SAFParser.bot_return r = parser.bot();
        System.out.println("tree = " + ((Tree)r.tree).toStringTree());
    }

}