package saf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import antlrgenerated.*;
import nodes.*;


public class SAF
{
	// Name of the folder where the files that hold the fighter definitions are
	private static final String PATH_PRE = "data/";
	
	public static void main(String[] args)
	{
		String filepath1 = "data/chicken.txt";//getFighterFile();
		String filepath2 = "data/lloyd.txt";//getFighterFile();
		Fighter f1 = getFighter(filepath1);
		Fighter f2 = getFighter(filepath2);
		
		if(f1.consistencyCheck())
		{
			Logger.log("Fighter 1 is consistent!");
			
			if(f2.consistencyCheck())
			{
				Logger.log("Fighter 2 is consistent!");
				
				Bot bot1 = new Bot(f1, 0);
				Bot bot2 = new Bot(f2, 9);
				Cronos cronos = new Cronos(bot1, bot2);
				cronos.startFight();
				
			}
			else
			{
				Logger.log("Fighter 2 is not consistent!");
			}
		}
		else
		{
			Logger.log("Fighter 1 is not consistent!");
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
			Logger.log("File not found.");
		}
		catch (IOException e)
		{
			Logger.log("Error reading fighter file.");
		}
		catch (RecognitionException e)
	    {
			Logger.log("Antlr exception thrown: " + e.getMessage());
	    }
		
		return null;
	}
	
	
	// Asks the user for the filename where the fighter data is stored
	// and returns the file path
	private static String getFighterFile()
	{
		String file_path = "";
		System.out.println("Enter fighter data filename:");
		
		try
		{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    String file_name = bufferRead.readLine();
		    file_path = PATH_PRE + file_name;
		}
		catch(IOException e)
		{
			System.out.println("Error while reading input.");
		}
		
		return file_path;		
	}
}