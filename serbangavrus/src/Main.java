
import saf.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import safreader.nodes.*;

import animator.Animator;

import safreader.antlrgenerated.*;


public class Main {
	// Name of the folder where the files that hold the fighter definitions are
	private static final String PATH_PRE = "data/";
	private static Logger logger = new Logger("Main");
	
	public static void main(String[] args)
	{
		// Get the files where the SAF specifications are
		String filepath1 = "fighters/lloyd.txt";//getFighterFile();
		String filepath2 = "fighters/chicken.txt";//getFighterFile();
		
		// Create fighters from these specifications
		Fighter f1 = getFighter(filepath1);
		Fighter f2 = getFighter(filepath2);
		
		// If any of the fighters are null, it means there were errors while creating them
		if(f1 != null && f2 != null)
		{
			// Check if the fighters' specifications are valid
			boolean f1Valid = f1.isValid(); 
			boolean f2Valid = f2.isValid();
			
			if(f1Valid && f2Valid)
			{
				// Both fighters are valid, create the bots and start the fight
				Bot bot1 = new Bot(f1, Arena.getBot1StartPosition());
				Bot bot2 = new Bot(f2, Arena.getBot2StartPosition());
				
				Animator animator = new Animator(bot1, bot2);
				
				Cronos cronos = new Cronos(bot1, bot2, animator);
				cronos.startFight();
			}
		}
	}
	
	
	// Returns a Fighter object created from a set of SAF specifications
	private static Fighter getFighter(String filepath)
	{
		Fighter f;
		try
		{
			// Get the CharStream for the file where the data is
			CharStream cs = new ANTLRFileStream(filepath);
			
			// Get the ANTLR generated lexer and parser
			SAFLexer lexer = new SAFLexer(cs);
			CommonTokenStream tokens = new CommonTokenStream();
			tokens.setTokenSource(lexer);
			SAFParser parser = new SAFParser(tokens);
			
			// Get the CommonTree
			SAFParser.fighter_return fr = parser.fighter();
			f = fr.f;
			return f;
		}
		catch(FileNotFoundException e)
		{
			logger.log("File not found.");
		}
		catch (IOException e)
		{
			logger.log("Error reading fighter file.");
		}
		catch (RecognitionException e)
	    {
			logger.log("Antlr exception thrown: " + e.getMessage());
	    }
		
		return null;
	}
	
	
	// Asks the user for the filename where the fighter data is stored
	// and returns the file path
	private static String getFighterFile()
	{
		String file_path = "";
		logger.log("Enter fighter data filename:");
		
		try
		{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    String file_name = bufferRead.readLine();
		    file_path = PATH_PRE + file_name;
		}
		catch(IOException e)
		{
			logger.log("Error while reading input.");
		}
		
		return file_path;		
	}
}