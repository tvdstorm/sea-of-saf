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
public class TestLoader {

	/**
	 * Print the AST from a .saf file
	 * @param filePath
	 */
	public static void printASTFromFile(String filePath) {
		String source = null;
		try {
			source = readStringFromFile(filePath);
		} catch (IOException e) {
			ErrorHandler.printException(e);
		}

		GameBot fighter = null;
		try {
			fighter = getFighterTree(source);
		} catch (RecognitionException e) {
			ErrorHandler.printException(e);
		}
		
		Printer printer = new Printer();
		System.out.println( printer.print(fighter) );
	}
	
	/**
	 * Get a bot from a .saf file
	 * @param filePath
	 * @return bot
	 */
	public static Fighter getBotFromFile(String filePath) {
		String source = null;
		try {
			source = readStringFromFile(filePath);
		} catch (IOException e) {
			ErrorHandler.printException( e );
			return null;
		}

		GameBot fighter = null;
		try {
			fighter = getFighterTree(source);
		} catch (RecognitionException e) {
			ErrorHandler.printException(e);
			return null;
		}

		Validator val = new Validator();
		if ( val.isValid(fighter) ) {
			return fighter;
		} else {
			ErrorHandler.printString( val.messagesAsString());
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
