package saf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRFileStream;


public class SAF
{

	private static final String PATH_PRE = "data/";
	
	public static void main(String[] args)
	{
		System.out.println("Enter fighter data file:");
		
		try
		{
		    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
		    String file_name = bufferRead.readLine();
		    String file_path = PATH_PRE + file_name;
		    Fighter fighter = new Fighter(new ANTLRFileStream(file_path));
		}
		catch(IOException e)
		{
			System.out.println("Error reading user input.");
			e.printStackTrace();
		}
	}

}
