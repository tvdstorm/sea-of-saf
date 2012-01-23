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
    	
    	String treeString = generateStringDotTree(tree);
    	saveDotFile("output/fighter_ast.dot", treeString);
    }
    
    // print the AST as DOT specification 
    public static String generateStringDotTree(CommonTree tree) {
    	DOTTreeGenerator gen = new DOTTreeGenerator(); 
    	StringTemplate st = gen.toDOT(tree); 
    	return st.toString();
    }
    
    // save the file to disk
    public static void saveDotFile(String file, String content) {
    	try {
    		FileWriter fstream = new FileWriter(file);
    		BufferedWriter out = new BufferedWriter(fstream);
    		out.write(content);
    		out.close();
    	} catch (Exception e){
    		System.err.println("Error: " + e.getMessage());
        }
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
