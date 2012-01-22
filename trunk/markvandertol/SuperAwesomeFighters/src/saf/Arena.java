package saf;

import java.io.IOException;

import net.sf.oval.guard.Guarded;

import org.antlr.runtime.RecognitionException;

import saf.entities.Bot;
import saf.parser.BotDefinitionMalformedException;
import saf.parser.BotParser;

@Guarded
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

}
