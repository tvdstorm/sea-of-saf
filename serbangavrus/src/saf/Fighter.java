package saf;

import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import antlrgenerated.*;

public class Fighter
{

	public Fighter(CharStream cs)
	{
		SAFLexer lexer = new SAFLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		SAFParser parser = new SAFParser(tokens);
		try
		{
			SAFParser.fighter_return fighter = parser.fighter();
			CommonTree tree = (CommonTree)fighter.getTree();
			System.out.println("tree="+tree.toStringTree());
			
			DOTTreeGenerator dottreegen = new DOTTreeGenerator();
	        StringTemplate dot = dottreegen.toDOT(tree);
	        DOTTreeGenerator gen = new DOTTreeGenerator();
	        StringTemplate st = gen.toDOT(tree);
	        
	        try {
				FileWriter dotfile = new FileWriter("dot_graph.dot");
				dotfile.write(st.toString());
				dotfile.close();
				String[] cmd = {"C:\\Program Files\\Graphviz 2.28\\bin\\dot.exe", "-Tpng", "-o", "dot_graph.png", "dot_graph.dot"};
				Process proc = Runtime.getRuntime().exec(cmd);
			} catch (IOException e) {
				System.out.println("Error when trying to write the .dot file.");
				e.printStackTrace();
			}
	        
			
		}
		catch (RecognitionException e)
        {
            System.out.println(e.getMessage());
        }
	}

	
}
