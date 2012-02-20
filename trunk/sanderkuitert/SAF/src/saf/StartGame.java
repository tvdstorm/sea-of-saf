package saf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.LinkedList;
import java.util.List;

import saf.fighter.PassiveFighter;
import saf.fighter.SuperAwesomeFighter;


public class StartGame {
	
	private ThreadGroup simulations;
	
	
	public static void main(String[] args) {
		System.out.println("============[Super Awesome Fighters]==================");
		new StartGame().startGame(args);
	}

	/** Load fighters from args, and simulate matches between all of them */
	public void startGame(String[] args){
        
		List<PassiveFighter> fighters = obtainFighters(args);
		System.err.flush();	System.out.println("> " + fighters.size() + " fighters joined the game");//DEBUG
		
		if(fighters.size() > 1){
			startTournament(fighters);
		}else{
			System.out.println("> Simulation aborted (not enough fighters available)"); 			//DEBUG
		}
		
	}

	private List<PassiveFighter> obtainFighters(String[] args) {
		List<PassiveFighter> fighters = new LinkedList<PassiveFighter>();

		for(String source : args){
			try {
				String fdl = readFileContent(source);
				PassiveFighter fighter = new SuperAwesomeFighter(fdl);
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
		while((line = reader.readLine()) != null) {
			content+=line+"\n";
		}
		
		return content;
	}
	
	private void startTournament(List<PassiveFighter> fighters) {
		assert fighters.size() > 1 : "Matches need at least two valid fighters!";
		
		//Start matches between every fighter
		simulations = new ThreadGroup("Tournament with "+fighters.size()+" fighters");
		for(int i=0; i < fighters.size()-1; i++) {
			for(int j=i+1; j < fighters.size(); j++) {
				Runnable match = new Match(fighters.get(i),fighters.get(j));
				new Thread(simulations, match).start();
			}
		}
	}
	
}
