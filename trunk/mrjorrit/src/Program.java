
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.antlr.runtime.*;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.stringtemplate.StringTemplate;

import saf.generation.output.*;

public class Program {

	public static void main(String[] args) throws Exception {
		FDLLexer lexer = new FDLLexer(new ANTLRFileStream("input/JackieChan.fdl"));
		FDLParser parser = new FDLParser(new CommonTokenStream(lexer));
		parser.setTreeAdaptor(adaptor);
		FDLParser.fighter_return fighter = parser.fighter();
		CommonTree tree = (CommonTree)fighter.getTree();
		
		printTree((CommonTree)fighter.getTree(), 0);
		
	}
	
	static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
		public Object create(Token payload) {
			return new CommonTree(payload);
		}
	};
	
	public static void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				printTree((CommonTree)t.getChild(i), indent+1);
			}
		}
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
