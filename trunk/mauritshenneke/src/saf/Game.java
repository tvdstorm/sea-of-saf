package saf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.swing.Timer;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import saf.evaluators.Attack;
import saf.evaluators.Bot;

public class Game implements ActionListener {
	private final static String FILEPATH = "src/saf/fighters";

	private Arena arena;
	private Timer timer;
	private List<Bot> bots;
	
	public static void main(String[] args){
		new Game();
	}
	
	public void beginFight() {
		if(timer.isRunning()){
			arena.stop();
			timer.stop();
		}else{
			createBots();
			timer.start();
		}
	}

	public void actionPerformed(ActionEvent e) {
		Bot aggressorBot, opponentBot;
		
		HashMap<String, Bot> botsMap = generateAggressorOpponentBotsMap(bots);
		
		aggressorBot = botsMap.get("aggressor");
		opponentBot = botsMap.get("opponent");
		
		executeAttack(aggressorBot, opponentBot);
		executeAttack(opponentBot, aggressorBot);
		
		if(!aggressorBot.hasHealth() || opponentBot.hasHealth()){
			timer.stop();
			finish();
		}
	}
	
	private Game(){
		String[] botList = getListOfBotFiles();
		timer = new Timer(50, this);
		arena = new Arena(this, botList);
	}

	private static String[] getListOfBotFiles() {
		File dir = new File(FILEPATH);

		FilenameFilter filenameFilter = new FilenameFilter() {
			public boolean accept(File filePath, String name) {
				return !name.startsWith(".") || !name.contains(".saf");
			}
		};
		
		return dir.list(filenameFilter);
	}
	
	private void finish() {
		arena.addText(getVictorText());
	}

	private String getVictorText(){
		for (Bot bot : bots) {
			if(!bot.lost()){
				return String.format("The winner is", bot.getName());
			}
		}
		return "There is no winner";
	}
	
	private void createBots(){
		String[] fileNames = {arena.getFighterASelectFieldValue(), arena.getFighterBSelectFieldValue()};
		bots = null;
		for (String fileName : fileNames) {
			try {
				bots.add(createBot(fileName));
			} catch (RecognitionException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private Bot createBot(String fileName) throws RecognitionException, IOException{
		String filePath = String.format("%s%s", FILEPATH, fileName);
		File safFile = new File(filePath);
		
		if(!safFile.exists()){
			return null;
		}
		
		ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
		BotLexer lexer = new BotLexer(fileStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		BotParser botParser = new BotParser(tokenStream);
		
		return botParser.create();
	}
	
	@SuppressWarnings("serial")
	private HashMap<String, Bot> generateAggressorOpponentBotsMap(final List<Bot> bots) {
		Random randomIndexGenerator = new Random();
		
		final int aggressorIndex = randomIndexGenerator.nextInt(2);
		final int opponentIndex = -1 * aggressorIndex + 1;
		
		return new HashMap<String, Bot>() {{ 
			put("aggressor", bots.get(aggressorIndex));
			put("opponent", bots.get(opponentIndex));
		}};
	}
	
	private void executeAttack(Bot aggressor, Bot opponent){
		Attack attack = aggressor.attack(opponent);
		opponent.defend(attack);
	}
}
