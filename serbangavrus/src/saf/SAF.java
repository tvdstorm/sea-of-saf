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
import antlrgenerated.SAFParser.fighter_return;
import nodes.*;


public class SAF
{
	// Name of the folder where the files that hold the fighter definitions are
	private static final String PATH_PRE = "data/";
	
	public static void main(String[] args)
	{
		//String file_path = getFighterFile();
		String file_path = "data/lloyd.txt";
		try
		{
			// Get the CharStream for the file where the data is
			CharStream cs = new ANTLRFileStream(file_path);
			
			// Get the ANTLR generated lexer and parser
			SAFLexer lexer = new SAFLexer(cs);
			CommonTokenStream tokens = new CommonTokenStream();
			tokens.setTokenSource(lexer);
			SAFParser parser = new SAFParser(tokens);
			
			// Get the CommonTree
			SAFParser.fighter_return fr = parser.fighter();
			Fighter f = fr.f;
			f.test();
			
			//CommonTree tree = (CommonTree)fighter.getTree();
			//this.tree = tree;
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
		}
		catch (IOException e)
		{
			System.out.println("Error reading fighter file.");
		}
		catch (RecognitionException e)
	    {
	        System.out.println("Antlr exception thrown: " + e.getMessage());
	    }
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