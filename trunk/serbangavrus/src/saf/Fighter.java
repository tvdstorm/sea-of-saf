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

	private CommonTree tree;
	
	// Path to "dot.exe" - the app we use to generate a PNG from dot source
	private final static String dot_path = "C:\\Program Files\\Graphviz 2.28\\bin\\dot.exe";
	
	
	public Fighter(CharStream cs)
	{
		// Get the ANTLR generated lexer and parser
		SAFLexer lexer = new SAFLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		SAFParser parser = new SAFParser(tokens);
		try
		{
			SAFParser.fighter_return fighter = parser.fighter();			
			tree = (CommonTree)fighter.getTree();
		}
		catch (RecognitionException e)
        {
            System.out.println(e.getMessage());
        }
	}
	
	
	// Creates dot and png files from our CommonTree
	public void exportTree(String tofile)
	{
		// Generate a dot tree from our CommonTree
        DOTTreeGenerator gen = new DOTTreeGenerator();
        StringTemplate st = gen.toDOT(tree);
        
        try {
        	// The app that generates the PNG needs the dot data to be in a file so we create that file
			FileWriter dotfile = new FileWriter(tofile + ".dot");
			dotfile.write(st.toString());
			dotfile.close();
			
			// Generate the PNG using dot.exe
			String[] cmd = {dot_path, "-Tpng", "-o", tofile + ".png", tofile + ".dot"};
			Process proc = Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			System.out.println("Error when trying to create the AST graph.");
		}
	}
	
}
