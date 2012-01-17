import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;

import parser.FDLLexer;
import parser.FDLParser;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FDLLexer lex = new FDLLexer(new ANTLRFileStream("C:\\Users\\Chris\\school\\SAFplayer\\src\\parser\\__Test___input.txt", "UTF8"));
	        CommonTokenStream tokens = new CommonTokenStream(lex);
	
	        FDLParser g = new FDLParser(tokens, null);
	        try {
	        	g.setTreeAdaptor(adaptor);
	        	FDLParser.saf_return  ret = g.saf();
	        	FDLAST tree = (FDLAST) ret.getTree();
	        	System.out.println("bla");
	        	printTree(tree, 0);//.toString());
	        	System.out.println("bla");
	        } catch (RecognitionException e) {
	            e.printStackTrace();
	        }
		} catch (IOException e) {
			//System.out.println()
			e.printStackTrace();
		}
	}
	
	static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
		public Object create(Token payload) {
			System.out.println("create:");
			if (payload != null)
				System.out.print(payload.getType());
//			System.out.println(payload.);
			System.out.println(payload);
			return new FDLAST(payload);
		}
	};
	
	public static void printTree(FDLAST t, int indent) {
		if ( t != null ) {
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			for ( int i = 0; i < t.getChildCount(); i++ ) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				printTree((FDLAST)t.getChild(i), indent+1);
			}
		}
	}

}
