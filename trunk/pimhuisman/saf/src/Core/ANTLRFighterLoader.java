package Core;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;

import Antlr.SAFLexer;
import Antlr.SAFParser;
import Data.Fighter;

public class ANTLRFighterLoader implements FighterLoader {

	@Override
	public Fighter loadFighterByFile(String filename) {
		
		try {
			CharStream inputStream = new ANTLRFileStream(filename);
			
			SAFLexer lexer = new SAFLexer(inputStream);

			TokenStream tokenStream = new CommonTokenStream(lexer);
			SAFParser parser = new SAFParser(tokenStream);

			try {
				CommonTree parserTree = (CommonTree) parser.fighter().getTree();
				System.out.println(parserTree.toStringTree());
				printTree(parserTree, 0);
				
			} catch (RecognitionException exc) {
				exc.printStackTrace();
			}
		} catch (IOException exc) {
			exc.printStackTrace();
		}
		return new Fighter("NotWorkingYet", null, null);
		
	}
	
	private static void printTree(CommonTree tree, int level) {
		
		if ( tree != null ) {
			for (int i = 0; i < level; i++) {
				System.out.print("  ");
			}
			System.out.println(" -> " + tree.getText());
			for (int i=0; i<tree.getChildCount(); i++) {
		    	printTree((CommonTree)tree.getChild(i), level + 1);
		    }
		}
		
	}

}
