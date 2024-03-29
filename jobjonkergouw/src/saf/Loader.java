package saf;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import saf.ast.Printer;
import saf.ast.Validator;
import saf.ast.nodes.Fighter;
import saf.bot.GameBot;
import saf.syntax.SAFLexer;
import saf.syntax.SAFParser;

/**
 * Methods for loading bots from files
 * @author job
 *
 */
public class Loader {

	/**
	 * Print the AST from a .saf file
	 * @param filePath
	 */
	public static void printASTFromFile(String filePath) {
		String source = null;
		try {
			source = readStringFromFile(filePath);
		} catch (IOException e) {
			ErrorHandler.exitWithException(e);
		}

		Fighter fighter = null;
		try {
			fighter = getFighterTree(source);
		} catch (RecognitionException e) {
			ErrorHandler.exitWithException(e);
		}
		
		Printer printer = new Printer();
		System.out.println( printer.print(fighter) );
	}
	
	/**
	 * Get a bot from a .saf file
	 * @param filePath
	 * @return bot
	 */
	public static GameBot getBotFromFile(String filePath) {
		String source = null;
		try {
			source = readStringFromFile(filePath);
		} catch (IOException e) {
			ErrorHandler.exitWithException( e );
		}

		GameBot fighter = null;
		try {
			fighter = (GameBot)getFighterTree(source);
		} catch (RecognitionException e) {
			ErrorHandler.exitWithException(e);
		}

		Validator val = new Validator();
		if ( val.isValid(fighter) ) {
			fighter.initializeFighter();
			return fighter;
		} else {
			ErrorHandler.exitWithString( val.messagesAsString());
			// unreachable:
			return null;
		}
		
		
	}

	private static GameBot getFighterTree(String source) throws RecognitionException {
		SAFLexer lexer = new SAFLexer(new ANTLRStringStream(source));
		SAFParser parser = new SAFParser(new CommonTokenStream(lexer));
		GameBot fighterTree = parser.fighter();   
		return fighterTree;
	}

	private static String readStringFromFile(String filePath) throws IOException{
		byte[] buffer = new byte[(int) new File(filePath).length()];
		BufferedInputStream f = new BufferedInputStream(new FileInputStream(filePath));
		f.read(buffer);
		f.close();
		return new String(buffer);
	}
}
