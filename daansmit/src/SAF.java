import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;


public class SAF
{
    public static void main(String[] args) throws Exception
    {
        for (String s: args)
        {
            String path = "../data/fighters/" + s + ".saf";
            Fighter fighter = Fighter.fromFile(path);
            
            System.out.println(fighter.dot);
        }
    }
}


class Fighter
{
    public StringTemplate dot;

    public Fighter() { }

    public static Fighter fromFile(String path)
        throws java.io.IOException, RecognitionException
    {
        ANTLRFileStream input = new ANTLRFileStream(path);
        return Fighter.fromCharStream(input);
    }

    private static Fighter fromCharStream(CharStream stream)
        throws RecognitionException
    {
        SAFLexer lexer = new SAFLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SAFParser parser = new SAFParser(tokens);
        SAFParser.bot_return bot = parser.bot();
        CommonTree tree = (CommonTree)bot.getTree();

        DOTTreeGenerator generator = new DOTTreeGenerator();
        StringTemplate dot = generator.toDOT(tree);

        Fighter fighter = new Fighter();
        fighter.dot = dot;
        return fighter;
    }
}
