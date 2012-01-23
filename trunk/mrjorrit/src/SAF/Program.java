package SAF;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;


public class Program {

	public static void main(String[] args) throws RecognitionException {
		
		String src = "chicken\n" + 
				"{\n" + 
				"  kickReach  = 9\n" + 
				"  punchReach = 1\n" + 
				"  kickPower  = 2\n" + 
				"  punchPower = 2\n" + 
				"  far [choose(run_towards run_away) kick_low]\n" + 
				"  \n" + 
				"  near [run_away kick_low]\n" + 
				"  near [crouch punch_low]\n" + 
				"}";
		FDLLexer lexer = new FDLLexer(new ANTLRStringStream(src));
		FDLParser parser = new FDLParser(new CommonTokenStream(lexer));
	    
	    CommonTree tree = (CommonTree)parser.fighter().getTree();
	    DOTTreeGenerator gen = new DOTTreeGenerator();
	    StringTemplate st = gen.toDOT(tree);
	    System.out.println(st);
	}

}
