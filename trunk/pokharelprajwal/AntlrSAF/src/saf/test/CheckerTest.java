package saf.test;

import static org.junit.Assert.*;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.TokenStream;
import org.junit.Test;

import saf.ast.*;
import saf.SAFLexer;
import saf.SAFParser;

public class CheckerTest {

	private Checker initializeChecker(String fighterString){
		
		try {
			
			CharStream charStream = new ANTLRStringStream(fighterString) ;
			SAFLexer lexer = new SAFLexer(charStream);
			TokenStream tokenStream = new CommonTokenStream(lexer);
			SAFParser parser = new SAFParser(tokenStream);
			Bot fighter = parser.bot();
			Checker checkFighter = new Checker();
			fighter.accept(checkFighter);
			return checkFighter;
			
		} catch (Exception e) {
			fail("Could not parse the fighter string");
			return null;
		}
		
		
	}

	@Test
	public void testForMissingDefaultRule(){
		String fighterString = "prajwal{}";
		Checker checker = initializeChecker(fighterString);
		assertEquals(1, checker.getErrorMessages().size());
		assertEquals(checker.getErrorMessages().get(0),"Missing default rule 'always'");
	}
	
	@Test
	public void testForInvalidStrengthConditon(){
		String fighterString = "prajwal{ b = 2 always }";
		Checker checker = initializeChecker(fighterString);
		assertEquals(1, checker.getErrorMessages().size());
		assertEquals(checker.getErrorMessages().get(0),"'b' is not a valid characterstics property.");
	}
	
	@Test
	public void testForInvalidStrengthRange(){
		String fighterString = "prajwal{ punchReach = 55 always[run_towards kick_low] }";
		Checker checker = initializeChecker(fighterString);
		assertEquals(1, checker.getErrorMessages().size());
		assertEquals(checker.getErrorMessages().get(0),"Characterstics 'punchReach' should be between 0 and 10");
	}

	@Test
	public void testForDublicateStrengthRange(){
		String fighterString = "prajwal{ kickPower = 5 kickPower = 5 always[run_towards kick_low] }";
		Checker checker = initializeChecker(fighterString);
		assertEquals(1, checker.getErrorMessages().size());
		assertEquals(checker.getErrorMessages().get(0),"Dublicate 'kickPower' characterstic's present.");
	}
	
	@Test
	public void testForValidConditionName(){
		String fighterString = "prajwal{ kickPower = 5 always[run_towards kick_low] asss[run_towards kick_low] }";
		Checker checker = initializeChecker(fighterString);
		assertEquals(1, checker.getErrorMessages().size());
		assertEquals(checker.getErrorMessages().get(0),"Invalid Condition type 'asss'");
	}
	
	@Test
	public void testForValidChooseActionType(){
		String fighterString = "prajwal{ kickPower = 5 always[choose(aaa run_towards) kick_low] }";
		Checker checker = initializeChecker(fighterString);
		assertEquals(1, checker.getErrorMessages().size());
		assertEquals(checker.getErrorMessages().get(0),"'aaa' is not a valid action type for choose");
	}
	
	@Test
	public void testForSameChooseActionType(){
		String fighterString = "prajwal{ kickPower = 5 always[choose(kick_low run_towards) kick_low] }";
		Checker checker = initializeChecker(fighterString);
		assertEquals(1, checker.getErrorMessages().size());
		assertEquals(checker.getErrorMessages().get(0),"Actions 'kick_low' and 'run_towards' should be of same type for choose");
	}
	
	@Test
	public void testForValidFightActionType(){
		String fighterString = "prajwal{ kickPower = 5 always[kick_losw kick_low] }";
		Checker checker = initializeChecker(fighterString);
		assertEquals(1, checker.getErrorMessages().size());
		assertEquals(checker.getErrorMessages().get(0),"'kick_losw' is not a valid Moveaction type.");
	}
	
	@Test
	public void testForValidMoveActionType(){
		String fighterString = "prajwal{ kickPower = 5 always[jump kick_lows] }";
		Checker checker = initializeChecker(fighterString);
		assertEquals(1, checker.getErrorMessages().size());
		assertEquals(checker.getErrorMessages().get(0),"'kick_lows' is not a valid Fightaction type.");
	}
	
}
