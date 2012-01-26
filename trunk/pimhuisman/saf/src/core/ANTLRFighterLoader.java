package core;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import parser.SAFLexer;
import parser.SAFParser;
import parser.SAFParser.fighter_return;
import parser.SAFTreeWalker;

import data.Fighter;


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
				
				fighter_return evaluator = parser.fighter();
				System.out.println(evaluator.getTree().toString());
				
				CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(evaluator.getTree());
				SAFTreeWalker walker = new SAFTreeWalker(nodeStream);
				Fighter fighter = walker.fighter();
				System.out.println("done! result = " + fighter.getName());
				
				
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
