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

            Fighter fighter = new Fighter(path);
            DOTTreeGenerator generator = new DOTTreeGenerator();
            StringTemplate dot = generator.toDOT(fighter.ast);

            System.out.println(dot);
        }
    }
}


class Fighter
{
    public SAFTree ast;


    public Fighter(String path)
        throws java.io.IOException, RecognitionException
    {
        buildAST(new ANTLRFileStream(path));
        checkAST();
    }

    public Fighter(ANTLRStringStream stream) throws RecognitionException
    {
        buildAST(stream);
        checkAST();
    }

    public void buildAST(CharStream stream) throws RecognitionException
    {
        SAFLexer lexer = new SAFLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SAFParser parser = new SAFParser(tokens);
        SAFParser.bot_return bot = parser.bot();
        this.ast = (SAFTree)bot.getTree();
    }

    public void checkAST() throws RecognitionException
    {
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(this.ast);
        SAFChecker checker = new SAFChecker(nodes);
        checker.bot();
    }
}
