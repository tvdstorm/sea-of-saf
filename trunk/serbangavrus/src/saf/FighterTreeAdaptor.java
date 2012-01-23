package saf;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import antlrgenerated.SAFLexer;
import antlrgenerated.SAFParser;


public class FighterTreeAdaptor{
	
	// Path to "dot.exe" - the app we use to generate a PNG from dot source
	private final static String dot_path = "C:\\Program Files\\Graphviz 2.28\\bin\\dot.exe";
	private CommonTree tree;
	
	// Returns a FighterTree based on the data found in the file given as argument
	public FighterTreeAdaptor(String file_path) throws FileNotFoundException, IOException, RecognitionException
	{
		// Get the CharStream for the file where the data is
		CharStream cs = new ANTLRFileStream(file_path);
		
		// Get the ANTLR generated lexer and parser
		SAFLexer lexer = new SAFLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		SAFParser parser = new SAFParser(tokens);
		
		// Get the CommonTree
		SAFParser.fighter_return fighter = parser.fighter();			
		CommonTree tree = (CommonTree)fighter.getTree();
		this.tree = tree;
	}
	
	
	// Creates dot and png files from our CommonTree
	public void exportTree(String tofile)
	{
		// Generate a dot tree from our CommonTree
        DOTTreeGenerator gen = new DOTTreeGenerator();
        StringTemplate st = gen.toDOT(tree);
        
        try
        {
        	// The app that generates the PNG needs the dot data to be in a file so we create that file
			FileWriter dotfile = new FileWriter(tofile + ".dot");
			dotfile.write(st.toString());
			dotfile.close();
			
			// Generate the PNG using dot.exe
			String[] cmd = {dot_path, "-Tpng", "-o", tofile + ".png", tofile + ".dot"};
			Runtime.getRuntime().exec(cmd);
		}
        catch (IOException e)
		{
			System.out.println("Error when trying to create the AST graph.");
		}
	}
	
	
	public Fighter getFighter()
	{
		Fighter fighter = new Fighter();
		CommonTree tree_child;
		
		for(Object child : tree.getChildren())
		{
			tree_child = (CommonTree)child;
			if(tree_child.getText().toLowerCase().equals("personality"))
			{
				fighter.setPersonality(tree_child.getChild(0).toString(), Integer.parseInt(tree_child.getChild(1).toString()));
			}
			else if(tree_child.getText().toLowerCase().equals("behaviour"))
			{
				fighter.setBehaviour(tree_child.getChild(0).toString(), tree_child.getChild(1).toString(), tree_child.getChild(3).toString());
			}
		}
		
		return fighter;
	} 
	
}
