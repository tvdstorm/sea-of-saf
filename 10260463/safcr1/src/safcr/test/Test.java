package safcr.test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.ANTLRStringStream;

import safcr.ast.*;
import safcr.check.*;
import safcr.controls.CrazyBot;
import safcr.parser.SAFGrammarLexer;
import safcr.parser.SAFGrammarParser;

public class Test {

	public static void main(String[] args) throws RecognitionException, IOException {
		String testFile = System.getProperty("user.dir") + "\\src\\safcr\\test\\test.saf";
		ANTLRFileStream fileStream = new ANTLRFileStream(testFile);
		CharStream charStream = new ANTLRStringStream(fileStream.toString());
		SAFGrammarLexer lexer = new SAFGrammarLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFGrammarParser parser = new SAFGrammarParser(tokenStream);
			
		Node tree = parser.saf();
		//tree.accept(new TreePrinter());
		
		Check check = new Check();
		Visitor c = new Visitor();
		
		c.setCheck(check);
		tree.accept(c);
		
		check.printErrors();
		Map<String,CrazyBot> myBots = c.getBots();
		List<String> names = c.getBotsName();
		
		for(String name : names){
			System.out.println(myBots.get(name).toString());
		}
	}

}
