package saf.junit.game;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import saf.game.GameConstant;
import saf.game.engine.FightActionProcessor;
import saf.game.state.BotState;
import saf.game.state.GameState;
import saf.parser.FileParser;
import saf.structure.Bot;
import saf.structure.Bots;

public class FightActionProcessorTest implements GameConstant {
	
	private BotState botState;
	private BotState otherBotState;
	private GameState gameState;

	@Before
	public void init() {
		Bots bots = FileParser.consume("src\\saf\\junit\\input\\Bot_Char_Normal.txt");
		Bot bot = bots.getBots().get(0);

		this.botState = new BotState(bot, CONST_LEFT);
		this.otherBotState = new BotState(bot, CONST_RIGHT);
	}
	
	@Test
	public void processFightActionTest() {
		prepareStateForTest(MOVE_ACTION_STAND, FIGHT_ACTION_KICKHIGH, 200);
		assertEquals("Error in FightActionProcessor", 0,  getFightActionPower(FIGHT_ACTION_KICKHIGH, false), 5);
		
		prepareStateForTest(MOVE_ACTION_STAND, FIGHT_ACTION_KICKHIGH, 0);
		assertEquals("Error in FightActionProcessor", 30, getFightActionPower(FIGHT_ACTION_PUNCHHIGH, false), 5);
		
		prepareStateForTest(MOVE_ACTION_JUMP, FIGHT_ACTION_KICKHIGH, 15);
		assertEquals("Error in FightActionProcessor", 0, getFightActionPower(FIGHT_ACTION_KICKLOW, false), 5);
		
		prepareStateForTest(MOVE_ACTION_RUNAWAY, FIGHT_ACTION_KICKHIGH, 0);
		assertEquals("Error in FightActionProcessor", 0, getFightActionPower(FIGHT_ACTION_KICKHIGH, true), 5);
		
		prepareStateForTest(MOVE_ACTION_JUMP, FIGHT_ACTION_BLOCKHIGH, 5);
		assertEquals("Error in FightActionProcessor", 25, getFightActionPower(FIGHT_ACTION_KICKLOW, true), 5);
		
		prepareStateForTest(MOVE_ACTION_STAND, FIGHT_ACTION_BLOCKHIGH, 10);
		assertEquals("Error in FightActionProcessor", 0,  getFightActionPower(FIGHT_ACTION_KICKHIGH, false), 5);
		
		prepareStateForTest(MOVE_ACTION_STAND, FIGHT_ACTION_BLOCKLOW, 10);
		assertEquals("Error in FightActionProcessor", 0,  getFightActionPower(FIGHT_ACTION_PUNCHLOW, false), 5);
		
		prepareStateForTest(MOVE_ACTION_CROUCH, FIGHT_ACTION_KICKLOW, 10);
		assertEquals("Error in FightActionProcessor", 0,  getFightActionPower(FIGHT_ACTION_KICKHIGH, false), 5);
	}
	
	private void prepareStateForTest(String lastMoveAction, String lastFightAction, int distance)
	{
		otherBotState.setLastMoveAction(lastMoveAction);
		otherBotState.setLastFightAction(lastFightAction);
		createGameState(distance);
	}

	private void createGameState(int distance) {
		this.gameState = new GameState();
		this.gameState.setDistance(distance);
		this.gameState.addBot(botState);
		this.gameState.addBot(otherBotState);
	}
	
	private double getFightActionPower(String fightAction, boolean isJumping)
	{
		FightActionProcessor actionProcessor = new FightActionProcessor(botState, otherBotState, gameState.getDistance(), fightAction, isJumping);
		return actionProcessor.getOutcome();
	}
}
