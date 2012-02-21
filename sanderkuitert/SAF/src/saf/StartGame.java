package saf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import saf.fighter.AIFighter;
import saf.fighter.PassiveFighter;


public class StartGame {
	
	public final static String WELCOME_MSG = "============[Super Awesome Fighters]==================";
	public final static File AUTO_START_DIRECTORY = new File("./data/fighters/Drop fighters into me for autostart");
	
	
	public static void main(String[] args) {
		System.out.println(WELCOME_MSG);
		
		List<File> files = new LinkedList<File>();
		for(String arg: args) {
			files.add(new File(arg));
		}
		new StartGame().startGame(files);
	}

	/** Load fighters from args, and simulate matches between all of them */
	public void startGame(List<File> files){
        
		List<PassiveFighter> fighters = obtainFighters(files);
		System.err.flush();	System.out.println("> " + fighters.size() + " fighters joined the game");//LOG
		
		if(fighters.size() > 1){
			startTournament(fighters);
		}else{
			System.out.println("> Simulation aborted (not enough fighters available)"); 			//LOG
		}
		
	}

	private List<PassiveFighter> obtainFighters(List<File> files) {
		List<PassiveFighter> fighters = new LinkedList<PassiveFighter>();

		files.addAll(Arrays.asList(AUTO_START_DIRECTORY.listFiles()));
			
		for(File file : files){
			try {
				if(file.isFile()) {
					String fdl = readFileContent(file);
					PassiveFighter fighter = new AIFighter(fdl);
					fighters.add(fighter);
				}
			} catch (InvalidParameterException e){
				System.out.flush();
				System.err.println(file.getName()+": "+e.getMessage());
			}
		}
		
		return fighters;
	}

	private String readFileContent(File source) {
		String content = "";
		
		try {
			String line;
			BufferedReader reader = new BufferedReader(new FileReader(source));
			while((line = reader.readLine()) != null) {
				content+=line+"\n";
			}
		} catch (FileNotFoundException e){
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println("Failed to read from "+source);
		}

		return content;
	}
	
	private void startTournament(List<PassiveFighter> fighters) {
		assert fighters.size() > 1 : "Matches need at least two valid fighters!";
		
		//Start matches between every fighter
		ThreadGroup simulations = new ThreadGroup("Tournament with "+fighters.size()+" fighters");
		for(int i=0; i < fighters.size()-1; i++) {
			for(int j=i+1; j < fighters.size(); j++) {
				Runnable match = new MatchSimulator(fighters.get(i),fighters.get(j));
				new Thread(simulations, match).start();
			}
		}
	}
	
}
