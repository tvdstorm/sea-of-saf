import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        for (String s: args)
        {
            String path = "../data/" + s + ".saf";

            Fighter fighter = Fighter.fromFile(path);
            System.out.println(fighter.dot);

            // ANTLRFileStream input = new ANTLRFileStream(path);
            // CommonTree ast = treeFromCharStream(input);
        }
    }

    // private static treeFromCharStream(CharStream stream)
    //     throws RecognitionException
    // {
    //     SAFLexer lexer = new SAFLexer(stream);
    //     CommonTokenStream token = new CommonTokenStream(lexer);
    //     SAFParser parser = new SAFParser(tokens);
    //     SAFParser.bot_return bot = parser.bot();
    //     CommonTree tree = (CommonTree)bot.getTree();
    // }
}


class Fighter
{
    public StringTemplate dot;

    public Fighter() { }

    public static Fighter fromFile(String path)
        throws java.io.IOException, RecognitionException, Exception
    {
        ANTLRFileStream input = new ANTLRFileStream(path);
        return Fighter.fromCharStream(input);
    }

    private static Fighter fromCharStream(CharStream stream)
        throws RecognitionException, Exception
    {
        SAFLexer lexer = new SAFLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SAFParser parser = new SAFParser(tokens);
        SAFParser.bot_return bot = parser.bot();
        CommonTree tree = (CommonTree)bot.getTree();

        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        SAFChecker checker = new SAFChecker(nodes);
        checker.bot();

        DOTTreeGenerator generator = new DOTTreeGenerator();
        StringTemplate dot = generator.toDOT(tree);

        Fighter fighter = new Fighter();
        fighter.dot = dot;
        return fighter;
    }
}
