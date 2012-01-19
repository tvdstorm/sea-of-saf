//import org.antlr.runtime.ANTLRFileStream;
//import org.antlr.runtime.TokenRewriteStream;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import java.io.IOException;

public class Main
{
    //public static final String TEST_FILE = "safs/dijkstra.saf";
    public static final String TEST_FILE = "safs/hamming.saf";

    public static void main(String[] args)
    {
        try
        {
            ANTLRFileStream input = new ANTLRFileStream(TEST_FILE);

            SAFLexer lexer = new SAFLexer(input);
            SAFParser parser = new SAFParser(new CommonTokenStream(lexer));

            SafTreeNode tree = (SafTreeNode)parser.parse().getTree();
            DOTTreeGenerator gen = new DOTTreeGenerator();
            StringTemplate st = gen.toDOT(tree);
            System.out.println(st);
            System.out.println("--------------------------");
            System.out.println(tree.toStringTree());
            System.out.println("--------------------------");
            System.out.println(tree.isWellFormed());
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        } catch (RecognitionException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
