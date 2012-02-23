package control;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.io.*;
import Parser.*;
import model.*;

public class Test2 {
    public static void main(String[] args) throws Exception {
    	
    			InputStream inputStream = new FileInputStream("D:/SAF/workspace/SC12/data/safs.txt");
    			ANTLRInputStream input = new ANTLRInputStream(inputStream);
    	        safLexer lexer = new safLexer(input);
    	        CommonTokenStream tokens = new CommonTokenStream(lexer);
    	        safParser parser = new safParser(tokens);
    	        parser.fighter();
    	        safParser.fighter_return result = parser.fighter();
    	        Tree t = (Tree)result.getTree();
    	        System.out.println(t.toStringTree()); // print out the tree

    }
}

