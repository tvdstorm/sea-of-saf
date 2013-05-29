
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import game.Jury;
import gui.Arena;

import ast.checker.Checker;
import ast.checker.Message;
import ast.fighter.Fighter;
import parser.ParseException;
import parser.SAFParser;



public class Main {
	
	public static void main(String[] args){
		try {
			start(null);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void start(String args []) throws ParseException
	  {
	    FileReader input = initFile();
	    SAFParser parser = null;
	    initSAFParser(parser, input);
	    List<Fighter> fighters = launchSAFParser(parser);
		if(fighters != null){
			startSimulation(fighters);
		  }
		else{
			System.err.println("No fighters available.");
			}
	  }

	  private static List<Fighter> launchSAFParser(SAFParser parser){
		  List<Fighter> fighters = null;
		  try{
			  fighters = startParser(parser, false);
		  } catch(Error e){
			  System.err.println(e);
		  }
		  return fighters;
	  }

	  private static boolean initSAFParser(SAFParser parser, FileReader input){
	    boolean result = false;
	    if(input != null){
	        parser = new SAFParser(input);
	        result = true;
	    }
	    return result;
	  }

	  private static FileReader initFile(){
	    FileReader input;
	    try{
	        input = new FileReader("input.txt");
	    } catch(FileNotFoundException e) {
	        System.err.println("input-file not found: " + e);
	        input = null;
	    }
	    return input;
	  }

	  private static List<Fighter> startParser(SAFParser parser, boolean useSystemIn) throws Error{
		  List<Fighter> fighters = null;
		  try
	      {
			fighters = SAFParser.getFighters();
	        List<Message> messages = Checker.Check(fighters);
	        int numberOfErrors = 0;
	        for(Message msg: messages){
	        	if(msg instanceof ast.checker.Error){
	        		numberOfErrors++;
	        	}
	        	System.out.println(msg);
	        }
	        if(numberOfErrors > 0){
	        	String msg = numberOfErrors + " error(s) occured during parsing.";
	        	throw new Error(msg);
	        }
	      }
	      catch (Exception e)
	      {
	        System.out.println(e.getMessage());
	        e.printStackTrace();
	      }
		  return fighters;
	  }
	  
	  private static void startSimulation(List<Fighter> fighters){
		  Fighter fighterOne = fighters.get(0);
		  Fighter fighterTwo = fighters.get(1);
		  Jury jury = new Jury(fighterOne, fighterTwo);
	  }

}
