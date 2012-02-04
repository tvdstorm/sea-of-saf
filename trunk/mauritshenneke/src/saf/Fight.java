package saf;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import saf.evaluators.*;

public class TestBot {
	private static ArrayList<Bot> bots = new ArrayList<Bot>();

	public static void main(String[] args) throws IOException, RecognitionException{
		for (String fileName : args) {
			Bot bot = createBot(fileName);
			addBotToList(bot);
		}
	}
	
	private static Bot createBot(String fileName) throws RecognitionException, IOException{
		String filePath = String.format("src/saf/fighters/%s.saf", fileName);
		boolean exists = (new File(filePath)).exists();
		if(!exists){
			return null;
		}
		
		ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
		BotLexer lexer = new BotLexer(fileStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		BotParser botParser = new BotParser(tokenStream);
		return botParser.create();
	}
	
	private static void addBotToList(Bot bot){
		if(bot != null){
			bots.add(bot);
		}
	}
}