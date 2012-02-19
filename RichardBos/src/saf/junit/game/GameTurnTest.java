package saf.junit.game;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import saf.game.GameConstant;
import saf.game.engine.GameTurn;
import saf.game.state.BotState;
import saf.game.state.GameState;
import saf.junit.TestHelpers;
import saf.parser.FileParser;
import saf.structure.Behavior;
import saf.structure.Bot;
import saf.structure.Bots;

public class GameTurnTest extends GameTurn implements GameConstant {
		
	private BotState otherBotState;
	
	@Before
	public void init() {
		Bots bots = FileParser.consume("src\\saf\\junit\\input\\Bot_GameTurn.txt");
		Bot bot = bots.getBots().get(0);

		botState = new BotState(bot, CONST_LEFT);
		otherBotState = new BotState(bot, CONST_RIGHT);
	}

	@Test
	public void collectValidBehaviorsTest() {
		List<Behavior> behaviors = null;
		
		String behaviorError = "Error in collectValidBehaviors";
		String behaviorCollectingError = "Error in collectValidBehaviors; ";
		
		prepareBotState(100, 0);
		behaviors = collectValidBehaviors();
		assertEquals(behaviorCollectingError + TestHelpers.convertListToReadableString(behaviors), 8, behaviors.size());
		assertEquals(behaviorError, "always [stand kick_low]", behaviors.get(0).toString());
		assertEquals(behaviorError, "near [stand kick_low]", behaviors.get(1).toString());
		assertEquals(behaviorError, "much_stronger [stand kick_low]", behaviors.get(2).toString());
		assertEquals(behaviorError, "stronger [stand kick_low]", behaviors.get(3).toString());
		assertEquals(behaviorError, "stronger or weaker [stand kick_low]", behaviors.get(4).toString());
		assertEquals(behaviorError, "much_stronger or (far and even) [stand kick_low]", behaviors.get(5).toString());
		assertEquals(behaviorError, "(far and even) or much_stronger [stand kick_low]", behaviors.get(6).toString());
		assertEquals(behaviorError, "near or far or weaker [stand kick_low]", behaviors.get(7).toString());
		
		
		prepareBotState(65, 0);
		behaviors = collectValidBehaviors();
		//3 less then the previous assert batch, the much_stronger behaviors are gone.
		assertEquals(behaviorCollectingError + TestHelpers.convertListToReadableString(behaviors), 5, behaviors.size());
		
		
		prepareBotState(50, 50);
		behaviors = collectValidBehaviors();
		assertEquals(behaviorCollectingError + TestHelpers.convertListToReadableString(behaviors), 7, behaviors.size());
		assertEquals(behaviorError, "far [stand kick_low]", behaviors.get(1).toString());
		assertEquals(behaviorError, "even [stand kick_low]", behaviors.get(2).toString());
		assertEquals(behaviorError, "(far and even) [stand kick_low]", behaviors.get(3).toString());
		assertEquals(behaviorError, "much_stronger or (far and even) [stand kick_low]", behaviors.get(4).toString());
		assertEquals(behaviorError, "(far and even) or much_stronger [stand kick_low]", behaviors.get(5).toString());
		assertEquals(behaviorError, "near or far or weaker [stand kick_low]", behaviors.get(6).toString());
		
		
		prepareBotState(0, 0);
		behaviors = collectValidBehaviors();
		assertEquals(behaviorCollectingError + TestHelpers.convertListToReadableString(behaviors), 7, behaviors.size());
		assertEquals(behaviorError, "weaker [stand kick_low]", behaviors.get(2).toString());
		assertEquals(behaviorError, "much_weaker [stand kick_low]", behaviors.get(3).toString());
		assertEquals(behaviorError, "stronger or weaker [stand kick_low]", behaviors.get(4).toString());
		assertEquals(behaviorError, "near or far or weaker [stand kick_low]", behaviors.get(5).toString());
		assertEquals(behaviorError, "(near and (weaker and much_weaker)) [stand kick_low]", behaviors.get(6).toString());
		
		prepareBotState(35, 0);
		behaviors = collectValidBehaviors();
		//2 less then the previous assert batch, the much_weaker behaviors are gone.
		assertEquals(behaviorCollectingError + TestHelpers.convertListToReadableString(behaviors), 5, behaviors.size());
		
	}	

	private void prepareBotState(int hp, int distance) {
		botState.setHitpoints(hp);
		otherBotState.setHitpoints(50);
		prepareGameState(distance);
	}

	private void prepareGameState(int distance) {
		gameState = new GameState();
		gameState.setDistance(distance);
		gameState.addBot(botState);
		gameState.addBot(otherBotState);
	}
}