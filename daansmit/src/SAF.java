import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


public class SAF {

    public static void main(String[] args) throws Exception {
        for (String s: args) {
            String fighter = "../data/fighters/" + s + ".saf";

            ANTLRFileStream input = new ANTLRFileStream(fighter);
            SAFLexer lexer = new SAFLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SAFParser parser = new SAFParser(tokens);
            SAFParser.bot_return r = parser.bot();

            System.out.println(s);
            System.out.println("tree = " + ((Tree)r.tree).toStringTree());
        }
    }

}