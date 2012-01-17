package saf;

import java.io.IOException;

import net.sf.oval.constraint.NotNull;

import org.antlr.runtime.RecognitionException;

import saf.entities.Bot;
import saf.parser.BotDefinitionMalformedException;
import saf.parser.BotParser;


public class Arena {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws RecognitionException 
	 * @throws BotDefinitionMalformedException 
	 */
	public static void main(String[] args) throws IOException, BotDefinitionMalformedException {
		BotParser parser = new BotParser();
		Bot result = parser.parseBot("test.saf");
		System.out.println(result);
	}
	
	
	public static void test(@NotNull String t1) {
		System.out.println(t1);
	}

}
