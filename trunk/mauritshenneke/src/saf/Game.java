package saf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import javax.swing.Timer;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import saf.evaluators.Attack;
import saf.evaluators.BehaviourActionType;
import saf.evaluators.Bot;

public class Game implements ActionListener {
	private final static Integer TIMERSPEED = 500;
	private final static String FILEPATH = "src/saf/fighters";
	private final static String IMAGESROOTPATH = "src/saf/images";
	private static final String[] COLORS = new String[]{"red", "blue"};
	private static final Integer[] MOVEDIRECTIONCORRECTIONS = new Integer[]{1, -1};
	
	private Arena arena;
	private Timer timer;
	private List<Bot> bots;
	
	public static void main(String[] args){
		new Game();
	}
	
	public void beginFight() throws RecognitionException, IOException {
		if(timer.isRunning()){
			timer.stop();
		}else{
			arena.clearBots();
			createBots();
			timer.start();
		}
	}

	/**
	 * Callback function for the ActionLister of timer.
	 */
	public void actionPerformed(ActionEvent e) {
		Bot aggressorBot, opponentBot;
		
		HashMap<String, Bot> botsMap = generateAggressorOpponentBotsMap(bots);
		
		aggressorBot = botsMap.get("aggressor");
		opponentBot = botsMap.get("opponent");
		
		executeAttack(aggressorBot, opponentBot);
		updateScreen(aggressorBot);
		executeAttack(opponentBot, aggressorBot);
		updateScreen(opponentBot);
		
		if(!aggressorBot.hasHealth() || !opponentBot.hasHealth()){
			timer.stop();
			finish();
		}
	}
	
	private void updateScreen(Bot bot) {
		BehaviourActionType currentFightActionType = bot.getCurrentFightActionType();
		String fightActionName = bot.hasHealth() ? currentFightActionType.getName() : "dead";
		String fighterColor = bot.getColor();
		Integer position = bot.getPosition();
		
		arena.updateScreen(fightActionName, fighterColor, position);
		arena.addStatusText(bot.getColor(), String.format("%s", bot.getHealth()));
	}

	private Game(){
		String[] botList = getListOfBotFiles();
		timer = new Timer(TIMERSPEED, this);
		arena = new Arena(this, botList, COLORS);
		arena.setImagesRootPath(IMAGESROOTPATH);
	}

	private static String[] getListOfBotFiles() {
		File dir = new File(FILEPATH);

		FilenameFilter filenameFilter = new FilenameFilter() {
			public boolean accept(File filePath, String name) {
				return name.contains(".saf");
			}
		};
		
		return dir.list(filenameFilter);
	}
	
	private void finish() {
		for (Bot bot : bots) {
			if(bot.lost()){
				updateScreen(bot);
				arena.addStatusText(bot.getColor(), "LOST");
			}else{
				arena.addStatusText(bot.getColor(), "WIN");
			}
		}
	}
	
	private void createBots() throws RecognitionException, IOException{
		bots = new ArrayList<Bot>();
		for (int i = 0; i < COLORS.length; i++) {
			String color = COLORS[i];
			String fileName = arena.getFighterSelectFieldValue(color);
			Bot bot = createBot(fileName, color);
			bot.setPosition(225 + i * 25);
			bot.setMoveDirectionCorrection(MOVEDIRECTIONCORRECTIONS[i]);
			arena.initFighter(color);
			arena.updateScreen(bot.getCurrentFightActionType().getName(), color, bot.getPosition());
			
			bots.add(bot);
		}
	}
	
	private Bot createBot(String fileName, String color) throws RecognitionException, IOException{
		String filePath = String.format("%s/%s", FILEPATH, fileName);
		File safFile = new File(filePath);
		
		if(!safFile.exists()){
			return null;
		}
		
		ANTLRFileStream fileStream = new ANTLRFileStream(filePath);
		BotLexer lexer = new BotLexer(fileStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		BotParser botParser = new BotParser(tokenStream);
		Bot bot = botParser.create();
		bot.init();
		bot.setColor(color);
		bot.setHealth(100);
		bot.setLeftWallPosition(arena.getLeftWallPosition());
		bot.setRightWallPosition(arena.getRightWallPosition());
		
		return bot;
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
