// Copyright © Pim Huisman 2012.
package Core;
import java.io.*;
import org.antlr.runtime.*;
import Antlr.*;

public class Main {

	public static void LoadFighter(String fileName) {
		try {
			CharStream inputStream = new ANTLRFileStream(fileName);
			
			SAFLexer lexer = new SAFLexer(inputStream);

			TokenStream tokenStream = new CommonTokenStream(lexer);
			SAFParser parser = new SAFParser(tokenStream);

			try {
				parser.fighter();
				
			} catch (RecognitionException exc) {
				exc.printStackTrace();
			}
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Loading file...");
		LoadFighter("data/fighter.saf");
		System.out.println("File loaded.");
		
		/*String calculationExpression = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while ( true ) {
			
			System.out.print("Enter a calculation: ");
			try {
				calculationExpression = br.readLine();
			} catch (IOException exc) {
				System.out.println("IO error trying to read expression!");
				System.exit(1);
			}

			CharStream inputString = new ANTLRStringStream(calculationExpression);
			Lexer lexer = new SAFLexer(inputString);
			
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			SAFParser parser = new SAFParser(tokenStream);
			int result = parser.expr();
			System.out.println("Result: " + result);
			
			System.out.println(tokenStream.size());
			for (int i=0; i<tokenStream.size();  i++) {
				System.out.println(tokenStream.get(i).toString());
			}
		
		}*/
		
	}
	
}
