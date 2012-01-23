package SAF;
import Generated.*;
import org.antlr.runtime.*;

public class Main {
	public static void main(String args[]) throws Exception {
		System.out.println("Boe");
		
		SAFLexer lexer = new SAFLexer(new ANTLRFileStream("C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\src\\SAF\\input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SAFParser parser = new SAFParser(tokens);
        
        
        try {
            parser.bots();
        } catch (RecognitionException e)  {
            e.printStackTrace();
        }
    }
}