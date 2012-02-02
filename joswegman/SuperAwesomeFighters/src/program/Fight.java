package program;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import grammar.SafLexer;
import grammar.SafParser;
import grammar.Evaluators.*;


public class Fight {
	Bot botLeft, botRight;
	int lifeLeft, lifeRight;
	int positionLeft, positionRight;
	
	
   
	public Fight(Bot botLeft, Bot botRight) {
		this.botLeft = botLeft;
		this.lifeLeft = 100;
		this.botRight = botRight;
		this.lifeRight =100;
		this.positionLeft = 10;
		this.positionRight = 90;
	}

	public int getLifeRight(){
		return this.lifeRight;
	}
	
	public void setLifeRight(int value) {
		this.lifeRight = value;
	}
	
	public int getLifeLeft(){
		return this.lifeLeft;
	}
	
	public void setLifeLeft(int value) {
		this.lifeLeft = value;
	}
	
	
	public static void main(String[] args) throws RecognitionException, IOException{
		ANTLRFileStream fileStreamLeft = new ANTLRFileStream ("/home/jos/workspace/SuperAwesomeFighters/src/program/Sample.saf");
		SafLexer lexerLeft = new SafLexer(fileStreamLeft);
		TokenStream tokenStreamLeft = new CommonTokenStream(lexerLeft);
		SafParser parserLeft = new SafParser(tokenStreamLeft);
		Bot bLeft = parserLeft.bot();
		bLeft.accept(new BotChecker());
		
		ANTLRFileStream fileStreamRight = new ANTLRFileStream("/home/jos/workspace/SuperAwesomeFighters/src/program/Test.saf");
		SafLexer lexerRight = new SafLexer(fileStreamRight);
		TokenStream tokenStreamRight = new CommonTokenStream(lexerRight);
		SafParser parserRight = new SafParser(tokenStreamRight);
		Bot bRight = parserRight.bot();
		bRight.accept(new BotChecker());
		
		Fight fight = new Fight (bLeft,bRight);
		Engine engine = new Engine (fight); 

	}

}
