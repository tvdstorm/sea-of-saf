import java.io.*;
import org.antlr.runtime.*;
//import org.antlr.runtime.debug.DebugEventSocketProxy;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;

import AST.Node;
import AST.SafNode;

import parser.FDLLexer;
import parser.FDLParser;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		FDLLexer lex = new FDLLexer(new ANTLRFileStream(System.getProperty("user.dir") + "/data/test.fdl", "UTF8"));
	    CommonTokenStream tokens = new CommonTokenStream(lex);
	
        FDLParser g = new FDLParser(tokens);
    	g.setTreeAdaptor(adaptor);
    	FDLParser.saf_return  r = g.saf();
    	if ( r.getTree()!=null ) {
            System.out.println(((Tree)r.getTree()).toString());
            ((CommonTree)r.getTree()).sanityCheckParentAndChildIndexes();
        }
    	//Node tree = (Node) ret.getTree();
    	printTree((CommonTree)r.getTree(), 0);//.toString());
	}
	
	static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
		public Object create(Token payload) {
			return new Node(payload);
		}
	};
	
	public static void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			System.out.print(indent + ":");
			System.out.print(t.getChildCount() + ":");
			System.out.print(t.getClass() + ":");
			System.out.println(t.toString() );
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				printTree((Node)t.getChild(i), indent+1);
			}
		}
	}

}
