package SAF;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import Generated.SAFLexer;
import Generated.SAFParser;
import Generated.SAFParser.bots_return;
import SAF.Checker.SAFElementDoVisitor;
import SAF.Structure.Bots;

public class Main {
	public static void main(String args[]) throws Exception {
		
		SAFLexer lexer = new SAFLexer(new ANTLRFileStream("src/SAF/Tests/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SAFParser parser = new SAFParser(tokens);

        DebugFunctions DF = new DebugFunctions();

        try {
        	bots_return _bots = parser.bots();
        	Bots bots = _bots.bots;
        	
        	bots.accept(new SAFElementDoVisitor());
        	DF.PrintAST(bots);
        	
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
        
    	
        
    }
	
	
}