package main;

import game.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;

import objects.*;

import parser.*;
import visualization.*;

public class Main {
	public static void main(String args []) throws ParseException
	  {
		try
		{
			String path  = new java.io.File(".").getCanonicalPath();
	        String FightersFile = "fighters.txt";
			InputStream stream = new FileInputStream(path + "/src/parser/" + FightersFile);
		  	SafParser parser = new SafParser(stream);
		  	System.out.println("Parsing is completed!!!!");
	    	List<Fighter> f = parser.Start();
			Checker i = new Checker(f);
	    	i.CheckInputs();
	    	Fight saf=new Fight(f);
	        saf.evaluateCondition();
	        Animations a=new Animations(saf);
	        a.startFight();
	      	}
	 	catch(Exception e)
	 	{
	 	    System.out.println("ERROR: " + e.getMessage());
	        e.printStackTrace();
	 	}
	  }
}
