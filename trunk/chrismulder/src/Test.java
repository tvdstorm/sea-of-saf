import java.io.*;
import org.antlr.runtime.*;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;

import AST.*;
import parser.*;


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
    	printTree((CommonTree)r.getTree(), 0);
	}
	
	static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
		public Object create(Token payload) {
			System.out.println(payload);
			if (payload != null) { 
				switch (payload.getType()) {
					case FDLParser.SAF_NODE:
						return new SafNode(payload);
					case FDLParser.BEHAVIOUR_NODE:
						return new BehaviourNode(payload);
					case FDLParser.STRENGTH_NODE:
						return new StrengthNode(payload);
					case FDLParser.CONDITION_NODE:
						return new ConditionNode(payload);
					default:
						return new Node(payload);
				}
			}
			return new Node(payload);
		}
	};
	
	public static void printTree(CommonTree t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ ) {
				System.out.print("    ");
			}
			System.out.print(t.getChildCount() + ":");
			System.out.print(t.getClass() + ":");
			System.out.println(t.toString() );
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				printTree((Node)t.getChild(i), indent+1);
			}
		}
	}

}
