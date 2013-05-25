
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import game.Jury;

import ast.Printer;
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void start(String args []) throws ParseException
	  {
	    FileReader input = initFile();
	    SAFParser parser = null;
	    boolean useSystemIn = !initSAFParser(parser, input);
	    List<Fighter> fighters = launchSAFParser(useSystemIn, parser);
		if(fighters != null){
			startFight(fighters);
		  }
		else{
			System.err.println("No fighters available.");
			}
	  }

	  private static List<Fighter> launchSAFParser(boolean useSystemIn, SAFParser parser){
		  List<Fighter> fighters = null;
		  if(useSystemIn){
	        while (true)
	        {
	          System.out.print("Enter an expression like \u005c"1+(2+3)*4;\u005c" :");
	          try{
	           fighters = startParser(parser, true);
	          } catch(Error e){
	           System.err.println(e);
	           break;
	          }
	        }
	    } else{
	        try{
	            fighters = startParser(parser, false);
	        } catch(Error e){
	            System.err.println(e);
	        }
	    }
		  return fighters;
	  }

	  private static boolean initSAFParser(SAFParser parser, FileReader input){
	    boolean result = false;
	    if(input != null){
	        parser = new SAFParser(input);
	        result = true;
	    } else {
	        System.out.println("Defaulting to console-input");
	        parser = new SAFParser(System.in);
	        result = false;
	    }
	    return result;
	  }

	  private static FileReader initFile(){
	    FileReader input;
	    boolean useSystemIn = false;
	    try{
	        input = new FileReader("input.txt");
	        System.out.println("input-file found, using it.");
	    } catch(FileNotFoundException e) {
	        System.out.println("input-file not found: " + e);
	        input = null;
	    }
	    return input;
	  }

	  private static List<Fighter> startParser(SAFParser parser, boolean useSystemIn) throws Error{
		  List<Fighter> fighters = null;
		  try
	      {
			fighters = SAFParser.getFighters();
			for(Fighter fighter : fighters){
			    System.out.println(Printer.print(fighter));
			}
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
	        System.out.println("NOK.");
	        System.out.println(e.getMessage());
	        e.printStackTrace();
	        if(useSystemIn) SAFParser.ReInit(System.in);
	      }
	      catch (Error e)
	      {
	        System.out.println("Oops.");
	        throw e;
	      }
		  return fighters;
	  }
	  
	  private static void startFight(List<Fighter> fighters){
		  Fighter fighterOne = fighters.get(0);
		  Fighter fighterTwo = fighters.get(1);
		  Jury jury = new Jury(fighterOne, fighterTwo);
		  jury.startFight();
	  }

}
