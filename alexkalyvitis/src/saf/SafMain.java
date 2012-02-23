package saf;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import saf.ast.Fighter;
import saf.checker.CheckException;
import saf.checker.SafChecker;
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
	 * 3) Simulates a fight between two fighters.
	 */
	public static void main(String[] args){
		
		try {
	        String path  = new java.io.File(".").getCanonicalPath();
			String safFile = "fighters.saf";

	        InputStream stream = new FileInputStream(path + "/src/saf/source/" + safFile);

	        Saf parser = new Saf(stream);

	        System.out.print("Parsing...      ");
			List<Fighter> fighters = parser.Parse();
			System.out.println("PASSED");

			System.out.print("Checking...     ");
			SafChecker checker = new SafChecker(fighters);
			checker.check();
			System.out.println("PASSED");

			System.out.print("Simulating...   ");
			FightSimulator fight = new FightSimulator(fighters);
			String winner = fight.Simulate();
			System.out.println("DONE");
			System.out.print("\nWinner:         " + winner);
	    }
		catch(ParseException pe) {
			System.out.println("FAILED: " + pe.getMessage());
		}
		catch(CheckException ce) {
			System.out.println("FAILED: " + ce.getMessage());
		}
	    catch(Exception e) {
	        System.out.println("ERROR: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
}