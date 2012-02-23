package control;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.io.*;
import Parser.*;
import SC12.src.model;

public class Test {
    public static void main(String[] args) throws Exception {
    	
    			InputStream inputStream = new FileInputStream("D:/SAF/workspace/SC12/data/saf2.txt");
    			ANTLRInputStream input = new ANTLRInputStream(inputStream);
    			//ANTLRInputStream input = new ANTLRInputStream(System.in);
    	        safLexer lexer = new safLexer(input);
    	        CommonTokenStream tokens = new CommonTokenStream(lexer);
    	        safParser parser = new safParser(tokens);
    	        parser.prog();
    	        
    	        // launch the parser starting at rule r, get return object
    	        safParser.rule_return result = parser.rule();
    	        // pull out the tree and cast it
    	        Tree t = (Tree)result.getTree();
    	        System.out.println(t.toStringTree()); // print out the tree
    	        
    	        
//    	        final int IDENTIFIER_TYPE = 24;
//    	        int size = tokens.size();
//    	        for(int i = 0; i < size; i++)
//    	        {
//    	            Token token = (Token) tokens.get(i);
//    	            if(token.getType() == IDENTIFIER_TYPE)
//    	            {
//    	            	System.out.println("A Name: " + tokens.get(i).getType());
//    	            	//token.setText("V");
//    	            }
//    	            else{
//    	            	System.out.println("Not a Name: " + tokens.get(0).getType());
//    	            }
//    	            System.out.println("Token type: " + tokens.get(i).getType() + " Token text: " + tokens.get(i).getText());
//    	           
//    	            
//    	        }
//    	        
    	
    	// Create an input character stream from standard in
    	//InputStream inputStream = new FileInputStream("D:/uva/Development/workspace/SC2012/fighters/safs1.txt");
    	//ANTLRInputStream input = new ANTLRInputStream(System.in);
    	//ANTLRInputStream input = new ANTLRInputStream(inputStream);
    	
    	// Create a SAFLexer that feeds from that stream
    	//jorge3Lexer lexer = new jorge3Lexer(input);
        // Create a stream of tokens fed by the lexer
        //CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Create a parser that feeds off the token stream
        //ExprParser parser = new ExprParser(tokens);
        //jorge3Parser parser = new jorge3Parser(tokens);
        // Begin parsing at rule prog, get return value structure
        //ExprParser.prog_return r = parser.prog();
        //jorge3Parser.prog_return r = parser.prog();
           
        // WALK RESULTING TREE
        //CommonTree t = (CommonTree)r.getTree(); // get tree from parser
        // Create a tree node stream from resulting tree
        //CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        //Eval walker = new Eval(nodes); // create a tree parser
        //walker.prog();                 // launch at start rule prog
    }
}

