package Core;
import java.io.*;
import org.antlr.runtime.*;

import Antler.*;

public class Main {

	public static void main(String[] args) throws Exception {
		
		String calculationExpression = null;
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
		
		}
		
	}
	
}
