/**
 * 
 */
package cb.saf.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import cb.saf.parser.FighterFactory;
import cb.saf.parser.SafgrammarLexer;
import cb.saf.parser.SafgrammarParser;

/**
 * @author Mpounta
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
			//using terminal for the input file, will change it to gui in the backend
		    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		    //initializing lexer,parser Grammar!
		    SafgrammarLexer safgrammarLexer = new SafgrammarLexer(new ANTLRFileStream(bufferedReader.readLine()));
			CommonTokenStream tokenStream = new CommonTokenStream();
			tokenStream.setTokenSource(safgrammarLexer);
			CommonTree fighterTree=null;
			SafgrammarParser parser = new SafgrammarParser(tokenStream);
			SafgrammarParser.fighter_return fighterParser = parser.fighter();
			//AST representation of the fighter file
			fighterTree= (CommonTree)fighterParser.getTree();
			//Test printout for demonstration reasons
			System.out.println("k:"+fighterTree.getChildren());
			//creating the first Fighter
			FighterFactory fighterFactory=new FighterFactory(fighterTree);
			Fighter fighter=fighterFactory.getFighter();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("There was an error with the parsing of the fighter file "+ e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("There was an error with the parsing of the fighter file "+ e.getMessage());
		}
		finally{
			
		}


	}

}
