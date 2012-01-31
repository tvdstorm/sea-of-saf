import java.io.*;

import org.antlr.runtime.*;

import ast.*;
import parser.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Saf p1 = loadSaf("/data/test.fdl");
		Saf p2 = loadSaf("/data/test.fdl");
		
		if (!p1.validate() || !p2.validate()) {
			System.out.println("Goodbye.");
			return;
		}
		
		
		Game game = new Game(p1, p2);
		game.run();

	}
	
	private static Saf loadSaf(String file) {
		FDLLexer lex;
		try {
			lex = new FDLLexer(new ANTLRFileStream(System.getProperty("user.dir") + file, "UTF8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	    CommonTokenStream tokens = new CommonTokenStream(lex);
	
        FDLParser g = new FDLParser(tokens);
    	try {
			return g.saf();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

}
