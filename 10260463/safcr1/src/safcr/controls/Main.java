package safcr.controls;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import safcr.ast.*;
import safcr.data.*;
import safcr.parser.SAFGrammarLexer;
import safcr.parser.SAFGrammarParser;

public class Main {
	public static void main(String[] args)  throws RecognitionException, IOException {
		String testFile = System.getProperty("user.dir") + "\\src\\safcr\\test\\test.saf";
		ANTLRFileStream fileStream = new ANTLRFileStream(testFile);
		CharStream charStream = new ANTLRStringStream(fileStream.toString());
		SAFGrammarLexer lexer = new SAFGrammarLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFGrammarParser parser = new SAFGrammarParser(tokenStream);
		
		AttackData ad = new AttackData();
		CharacteristicData cd = new CharacteristicData();
		ConditionData cod = new ConditionData();
		MoveData md = new MoveData();
		
		Saf tree = parser.saf();
		//TreePrinter printer = new TreePrinter();
		//tree.accept(printer);
		
		CheckData check = new CheckData();
		check.setDatas(cd, cod, ad, md);
		tree.accept(check);
		check.printErrors();

		if(check.getErrors().size() <= 0){
			Game g = new Game(tree);

			g.setDatas(cd, cod);
			g.initGame();
		}

	}

}
