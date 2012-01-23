package saf;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.runtime.RecognitionException;


public class SAF
{
	// Name of the folder where the files that hold the fighter definitions are
	private static final String PATH_PRE = "data/";
	
	public static void main(String[] args)
	{
		String file_path = getFighterFile();
		try
		{
			System.out.println("Loading fighter AST..");
			FighterTreeAdaptor fightertree = new FighterTreeAdaptor(file_path);
			
			System.out.println("Exporting AST..");
			fightertree.exportTree("treegraph");

			fightertree.getFighter();
			
			System.out.println("Done.");
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