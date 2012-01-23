import java.io.*;
//import org.antlr.runtime.*;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

public class Fight {

	static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
		public Object create(Token payload) {
			return new CommonTree(payload);
		}
	};

    public static void main(String[] args) throws Exception {
    	ANTLRFileStream fs = new ANTLRFileStream("expendables/Statham.saf");
    	safLexer lex = new safLexer(fs);
    	TokenRewriteStream tokens = new TokenRewriteStream(lex);
    	safParser grammar = new safParser(tokens);
    	
    	grammar.setTreeAdaptor(adaptor);
    	safParser.saf_return ret = grammar.saf();
    	CommonTree tree = (CommonTree)ret.getTree();
    	
    	//for (Object t : tokens.getTokens()) {
		//	System.out.println(t);
		//}
        
    	// show S-Expression respresentation of the AST 
    	String s = tree.toStringTree(); 
    	//System.out.println(s);
    	
    	// print the AST as DOT specification 
    	DOTTreeGenerator gen = new DOTTreeGenerator(); 
    	StringTemplate st = gen.toDOT(tree); 
    	
    	try{
    		FileWriter fstream = new FileWriter("fighter_ast.dot");
    		BufferedWriter out = new BufferedWriter(fstream);
    		out.write(st.toString());
    		out.close();
    	} catch (Exception e){
    		System.err.println("Error: " + e.getMessage());
        }
    	
    	System.out.println(st.toString());
    	
    	//printTree(tree, 2);
    	
	    // CharStream input = new ANTLRFileStream(args[0]);
	    //CharStream input = new ANTLRFileStream("fighters/Statham.saf");
		//safLexer lexer = new safLexer(input);
		//CommonTokenStream tokens = new CommonTokenStream(lexer);
	
		
	
		//safParser parser = new safParser(tokens);
		//parser.saf();
    }
    
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
}
