import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;


public class SAF {

    public static void main(String[] args) throws Exception {
        for (String s: args) {
            // System.out.println(s);
            String fighter = "../data/fighters/" + s + ".saf";

            ANTLRFileStream input = new ANTLRFileStream(fighter);
            SAFLexer lexer = new SAFLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SAFParser parser = new SAFParser(tokens);
            SAFParser.bot_return bot = parser.bot();

            CommonTree tree = (CommonTree)bot.getTree();
            DOTTreeGenerator generator = new DOTTreeGenerator();
            StringTemplate dot = generator.toDOT(tree);
            System.out.println(dot);

            // System.out.println("tree = " + ((Tree)r.tree).toStringTree());
        }
    }

}