package main;

import java.io.*;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

//import antlr.CommonAST;
//import antlr.DumpASTVisitor;
//import org.antlr.stringtemplate.*;

import lexer.*;
import saf.*;
import test.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Fight {

	static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
		public Object create(Token payload) {
			return new CommonTree(payload);
		}
	};
	
    public static void main(String[] args) throws Exception {
    	// create new fighter Statham
    	Saf s = loadFighter("expendables/Statham.saf");
        
    	// visit AST
    	s.accept(new SafVisitorCheck());
    	
    	// print the name, so you know parsing went ok
    	System.out.println(s.getName());
    	
    	// do consistency check
    	//checkSaf();
    	
    	//grammar.setTreeAdaptor(adaptor);
    	//safParser.saf_return ret = grammar.saf();
    	//CommonTree tree = (CommonTree)ret.getTree();
    	
    	//String treeString = generateStringDotTree(tree);
    	//saveDotFile("output/fighter_ast.dot", treeString);
        
        //CommonAST ast = (CommonAST)parser.getAST(); 
        //DumpASTVisitor visitor = new DumpASTVisitor();
        //visitor.visit(ast);
    }
    
    public static Saf loadFighter(String file) throws IOException, RecognitionException {
    	ANTLRFileStream fs = new ANTLRFileStream(file);
    	safLexer lex = new safLexer(fs);
    	
    	TokenRewriteStream tokens = new TokenRewriteStream(lex);
    	safParser grammar = new safParser(tokens);
    	
    	return grammar.saf();
    }
    
    public static void checkSaf() {
    	Result result = JUnitCore.runClasses(SafChecker.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
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
    
    // print tree in console
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
