package nl.uva.lap.saf;

import nl.uva.lap.saf.SAFParser.fighter_return;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

public class Test
{

	public static void main(String[] args) throws RecognitionException
	{
		CharStream charStream = new ANTLRStringStream("" + 
			"JackieChan{\r\n" + 
			"	kickPower = 7\r\n" + 
			"	punchPower = 5\r\n" + 
			"	kickReach = 3\r\n" + 
			"	punchReach = 9\r\n" + 
			"	far[run_towards punch_high]\r\n" + 
			"	near[choose(stand crouch) kick_high]\r\n" + 
			"	much_stronger[walk_towards punch_low]\r\n" + 
			"	weaker[run_away choose(block_high block_low)]\r\n" + 
			"	always[walk_towards block_high]\r\n" +
			"}");
		
		/*CharStream charStream = new ANTLRStringStream("" + 
			"pietje{\r\n" + 
			"	kickPower = 7\r\n" + 
			"}");*/
		SAFLexer lexer = new SAFLexer(charStream);
		
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream);
		
		fighter_return evaluator = parser.fighter();
		//System.out.println(evaluator.tree.toStringTree());
		
		CommonTree tree = (CommonTree)evaluator.getTree();
        DOTTreeGenerator gen = new DOTTreeGenerator();
        StringTemplate st = gen.toDOT(tree);
        System.out.println(st);
        
		/*
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(evaluator.tree);
		EvaluatorWalker evaluatorWalker = new EvaluatorWalker(nodeStream);
		int result = evaluatorWalker.evaluator();
		System.out.println(result);		
		System.out.println("ok");*/
		
	}

}