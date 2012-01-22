package safcr.test;

import java.io.IOException;
import java.io.File;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import safcr.antlr.SAFGrammarLexer;
import safcr.antlr.SAFGrammarParser;
import safcr.antlr.SAFGrammarParser.saf_return;

public class Test {
	
	 private static void traverse(CommonTree tree, int indent) {
		    if(tree == null) return;
		    for(int i = 0; i < indent; i++) System.out.print("|   ");
		    System.out.println("|--> " + tree.getText());
		    for(int i = 0; i < tree.getChildCount(); i++) {
		      traverse((CommonTree)tree.getChild(i), indent + 1);
		    }
		  }

	public static void main(String[] args) throws RecognitionException, IOException {		
		ANTLRFileStream fileStream = new ANTLRFileStream("C:\\tmp\\test.saf");
		CharStream charStream = new ANTLRStringStream(fileStream.toString());
		
		SAFGrammarLexer lexer = new SAFGrammarLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFGrammarParser parser = new SAFGrammarParser(tokenStream);
			
		CommonTree saf = (CommonTree) parser.saf().getTree();
		System.out.println(saf.toStringTree());
		//traverse(saf, 0);
	}

}
