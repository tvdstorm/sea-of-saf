package main;

	import org.antlr.runtime.*;
	import org.antlr.runtime.tree.*;
	import java.io.*;
	import Parser.*;
	import model.*;

	public class Main  {
	    public static void main(String[] args) throws Exception {
	    	
	    			InputStream inputStream = new FileInputStream("D:/SAF/workspace/SC12/data/unbeatable.saf");
	    			ANTLRInputStream input = new ANTLRInputStream(inputStream);
	    	        safLexer lexer = new safLexer(input);
	    	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	    	        safParser parser = new safParser(tokens);
	    	        //parser.program();
	    	        safParser.program_return result = parser.program();
	    	        Tree t = (Tree)result.getTree();
	    	        System.out.println("Number of tree childs: " + t.getChildCount()); // print out the tree
	    	        System.out.println("Tree index : " + t.getChildIndex()); // print out the tree index
	    	        for(int i=0; i < t.getChildCount(); i++){
	    	        	System.out.println("Tree child " + i + " : " + t.getChild(i).toString());
	    	        }
	    	        
	    	        Arena a = result.arena;
	    	        
	    	        System.out.println(a.getFighters().toString());
	    	        
	    	        

	    }
}
