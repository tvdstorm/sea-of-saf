package saf.junit.game;

import static org.junit.Assert.assertEquals;

import java.awt.Point;

import org.junit.Before;
import org.junit.Test;

import saf.game.GameConstant;
import saf.game.engine.FightActionProcessor;
import saf.game.engine.MoveActionProcessor;
import saf.game.state.BotState;
import saf.game.state.GameState;
import saf.parser.FileParser;
import saf.structure.Bot;
import saf.structure.Bots;

public class FightActionProcessorTest implements GameConstant {
	
	private BotState botState;
	private BotState otherBotState;
	private int distance;
	private GameState gameState;

	@Before
	public void init() {
		Bots bots = FileParser
				.consume("src\\saf\\junit\\input\\Bot_Char_Normal.txt");
		Bot bot = bots.getBots().get(0);

		this.botState = new BotState(bot, CONST_LEFT);
		this.otherBotState = new BotState(bot, CONST_RIGHT);

	}
	@Test
	public void processFightActionTest() {

	}
	
	private void prepareStateForTest(String lastMoveAction, String lastFightAction)
	{
		otherBotState.setLastMoveAction(lastMoveAction);
		otherBotState.setLastFightAction(lastFightAction);
		createGameState();
	}

	private void createGameState() {
		this.gameState = new GameState(CONST_STARTING_DISTANCE);
		this.gameState.addBot(botState);
		this.gameState.addBot(otherBotState);
	}
	
	private double getFightActionPower(int Distance, String fightAction, boolean isJumping)
	{
		FightActionProcessor actionProcessor = new FightActionProcessor(botState, otherBotState, gameState.getDistance(), fightAction, isJumping);
		return actionProcessor.getOutcome();
	}
}
