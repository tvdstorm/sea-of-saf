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
import saf.fighter.SuperAwesomeFighter;


public class GameSetup {
	
	public static void main(String[] args) {
		System.out.println("============[Super Awesome Fighters]==================");
		new GameSetup().startGame(args);
        System.out.println("======================================================");
	}

	/** Load fighters from args, and simulate as many matches as possible */
	public void startGame(String[] args){
        
		List<Fighter> fighters = obtainFighters(args);
		System.err.flush();//DEBUG
		System.out.println("LOG: Correctly read " + fighters.size() + " fighters"); //DEBUG
		
		if(fighters.size() > 1){
			simulate(fighters);
			System.out.println("LOG: Simulation ran"); //DEBUG
		}else{
			System.out.println("LOG: Simulation aborted (not enough fighters available)"); //DEBUG
		}
		
	}

	private List<Fighter> obtainFighters(String[] args) {
		List<Fighter> fighters = new LinkedList<Fighter>();

		for(String source : args){
			try {
				String fdl = readFileContent(source);
				Fighter fighter = new SuperAwesomeFighter(fdl);
				fighters.add(fighter);
			} catch (FileNotFoundException e){
				System.err.println(e.getMessage());
			} catch (IOException e) {
				System.err.println("Failed to extract fighter from "+source);
			} catch (InvalidParameterException e){
				System.out.flush();
				System.err.println(source+": "+e.getMessage());
			}
		}
		
		return fighters;
	}

	private String readFileContent(String source) throws FileNotFoundException, IOException {
		String content = "";
		
		String line;
		BufferedReader reader = new BufferedReader(new FileReader(new File(source)));
		while((line = reader.readLine()) != null)
			content+=line+"\n";
		
		return content;
	}
	
	private  void simulate(List<Fighter> fighters) {
		assert fighters.size() > 1 : "Matches need at least two valid fighters!";
//		assert fighters.size() % 2 == 0 : "Matches need an even number of fighters!";
		
		//Matches against every other fighter
		List<MatchSimulator> matches = new LinkedList<MatchSimulator>();
		for(int i=0;i<fighters.size()-1;i++)
			for(int j=i+1;j<fighters.size();j++)
				matches.add(new MatchSimulator(fighters.get(i),fighters.get(j)));
		
		for(MatchSimulator sim: matches)
			sim.run();
		
	}
	
}
