package saf;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import saf.ast.Fighter;
import saf.interpreter.SafInterpreter;
import saf.parser.Saf;
import saf.parser.ParseException;
import saf.simulator.FightSimulator;

/**
 * @author      Alex Kalyvitis <me@alexkappa.com>
 * @version     1.0                   
 * @since       09/01/2012
 */

public class SafMain {

	/**
	 * Main method
	 * 
	 * Reads a (.saf) file from inside the saf.fighters package and:
	 * 1) Parses it and generates an abstract syntax tree (see package saf.ast)
	 * 2) Interprets the abstract syntax tree.
	 */
	public static void main(String[] args){
		try{
	        String path  = new java.io.File(".").getCanonicalPath();
			String safFile = "fighters.saf";

	        InputStream stream = new FileInputStream(path + "/src/saf/fighters/" + safFile);

	        Saf parser = new Saf(stream);

	        System.out.println("Parsing...");
	        
			List<Fighter> fighters = parser.Parse(); // Parse
			System.out.println("Parsing Succeeded");

			System.out.println("Interpreting...");

			SafInterpreter interpreter = new SafInterpreter(fighters);
			if (interpreter.interpret()) {
				System.out.println("Interpreting Succeeded");
				// Print AST
				/*for(Fighter fighter : fighters){
					fighter.print();
				}*/
				FightSimulator fightSimulator = new FightSimulator(fighters);
				fightSimulator.Simulate();
			} else {
			    System.out.println("Interpreting Failed");
			}
	    }
		catch(ParseException e){
			System.out.println("ERROR: " + e.getMessage());
		}
	    catch(Exception e) {
	        System.out.println("ERROR: " + e.getMessage());
	        e.printStackTrace();
	    }
	}

}