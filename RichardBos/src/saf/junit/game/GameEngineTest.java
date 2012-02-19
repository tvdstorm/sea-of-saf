package saf.junit.game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import saf.game.GameConstant;
import saf.game.engine.GameEngine;
import saf.game.state.BotState;
import saf.parser.FileParser;
import saf.structure.Bot;
import saf.structure.Bots;

public class GameEngineTest extends GameEngine implements GameConstant {
	
	public GameEngineTest() {
		super();
	}

	@Test
	public void awardCreditsTest()
	{
		Bots bots = FileParser.consume("src\\saf\\junit\\input\\Bot_Char_Normal.txt");
		Bot bot = bots.getBots().get(0);

		BotState botState = new BotState(bot, CONST_LEFT);
		
		gameState.addBot(botState);
		
		awardCredits();
		
		assertEquals("Error in awardCredits", 5.0, gameState.getBotStates().get(0).getCredits(),1); 
	}
	
}
