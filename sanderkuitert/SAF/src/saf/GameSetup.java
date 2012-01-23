package saf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;

import saf.fdl.*;
import saf.simulator.*;


public class GameSetup {
	
	public static void main(String[] args) {
		System.out.println("============[Super Awesome Fighters]==================");
        
		List<Fighter> fighters = obtainFighters(args);
		
		simulate(fighters);
		
        System.out.println("======================================================");
	}

	private static void simulate(List<Fighter> fighters) {
		if(fighters.size() > 1){
			Simulator simulator = new Simulator();
        	simulator.simulate(fighters);
		}else{
			System.err.println("Simulation needs more fighters to start!");
		}
	}

	private static List<Fighter> obtainFighters(String[] args) {
		List<Fighter> fighters = new LinkedList<Fighter>();

		FDLReader fdlReader = new FDLReader();
		for(String source : args){
			Fighter fighter = null;
			try {
				String fdl = readFileContent(source);
				fighter = fdlReader.createFighter(fdl);
			} catch (FileNotFoundException e1){
				System.err.println(e1.getMessage());
			} catch (IOException e2) {
				System.err.println("Failed to extract fighter from "+source);
				System.err.println(e2.getMessage());
			} catch (InvalidParameterException e3){
				System.err.println("Misformed FDL:");
				System.err.println(e3.getMessage());
			}
			if(fighter != null)
				fighters.add(fighter);
		}
		
		return fighters;
	}

	private static String readFileContent(String source) throws FileNotFoundException, IOException {
		String content = "";
		
		String line;
		BufferedReader reader = new BufferedReader(new FileReader(new File(source)));
		while((line = reader.readLine()) != null)
			content+=line;
		
		return content;
	}
	
}
