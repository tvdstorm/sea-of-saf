
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.*;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.stringtemplate.StringTemplate;

import saf.generation.output.*;
import saf.classes.*;

public class Program {

	public static void main(String[] args) throws Exception {
		FDLLexer lexer = new FDLLexer(new ANTLRFileStream("input/JackieChan.fdl"));
		FDLParser parser = new FDLParser(new CommonTokenStream(lexer));
		FDLParser.fighter_return r = parser.fighter();
		CommonTree tree = (CommonTree)r.getTree();
		System.out.println(tree.toStringTree());
		writeDot(tree);
		
		FighterWalker walker = new FighterWalker(new CommonTreeNodeStream(tree));
		Fighter fighter = walker.fighter();
	}
	

	

		
		public static void writeDot(CommonTree tree)
		{
			DOTTreeGenerator gen = new DOTTreeGenerator();
			StringTemplate st = gen.toDOT(tree);
	
			try {
				// Create file
				FileWriter fstream = new FileWriter("output/AST.dot");
				BufferedWriter out = new BufferedWriter(fstream);
				out.write(st.toString());
				// Close the output stream
				out.close();
	
			} catch (Exception e) {// Catch exception if any
				System.err.println("Error: " + e.getMessage());
			}
		}
}
