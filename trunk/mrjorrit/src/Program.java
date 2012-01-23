
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.*;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.stringtemplate.StringTemplate;

import saf.generation.output.*;

public class Program {

	public static void main(String[] args) throws Exception {
		FDLLexer lexer = new FDLLexer(new ANTLRFileStream("input/JackieChan.fdl"));
		FDLParser parser = new FDLParser(new CommonTokenStream(lexer));
	}
		
//
//		CommonTree tree = (CommonTree) parser.fighter().getTree();
//		DOTTreeGenerator gen = new DOTTreeGenerator();
//		StringTemplate st = gen.toDOT(tree);
//
//		try {
//			// Create file
//			FileWriter fstream = new FileWriter("output/AST.dot");
//			BufferedWriter out = new BufferedWriter(fstream);
//			out.write(st.toString());
//			// Close the output stream
//			out.close();
//
//		} catch (Exception e) {// Catch exception if any
//			System.err.println("Error: " + e.getMessage());
//		}
//	}
}
