package saf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;

import saf.fighter.Fighter;
import saf.fighter.fdl.FDLReader;


public class MatchSetup {
	
	public static void main(String[] args) {
		System.out.println("============[Super Awesome Fighters]==================");
        
		List<Fighter> fighters = obtainFighters(args);
		System.out.println("LOG: Read " + fighters.size() + " fighters"); //DEBUG
		
		if(fighters.size() > 1 && fighters.size() % 2 == 0){
			simulate(fighters);
			System.out.println("LOG: Simulation ran"); //DEBUG
		}else{
			System.out.println("LOG: Simulation aborted"); //DEBUG
		}
		
        System.out.println("======================================================");
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
	
	private static void simulate(List<Fighter> fighters) {
		assert fighters.size() > 1 : "Matches need at least two valid fighters!";
		assert fighters.size() % 2 == 0 : "Matches need an even number of fighers";
		
		List<MatchSimulator> matches = new LinkedList<MatchSimulator>();
		for(int i=0;i<fighters.size();i++)
			for(int j=i+1;j<fighters.size();j++)
				matches.add(new MatchSimulator(fighters.get(i),fighters.get(j)));

		for(MatchSimulator sim: matches)
			sim.run(); //TODO in seperate threads?
	}
	
}
