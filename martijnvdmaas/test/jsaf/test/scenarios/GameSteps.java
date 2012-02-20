package jsaf.test.scenarios;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.jbehave.util.JUnit4Ensure.ensureThat;

import java.io.IOException;

import jsaf.astelements.Bots;
import jsaf.constants.SAFConstants;
import jsaf.game.FightEngine;
import jsaf.game.fighter.Fighter;
import jsaf.grammar.ParseException;
import jsaf.main.Main;
import jsaf.main.Parser;


import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;



public class GameSteps extends Steps
{
	private Bots bots;
	private String leftBot;
	private String unbeatablePlayer;
	private String rightBot;
	private FightEngine fightEngine;

	/* Scenario: each player makes a move after taking a step */

	@Given("two random players from the input file $value")
	public void twoRandomPlayersFromTheInputFile(String name) throws ParseException, IOException
	{
		bots = new Parser(Main.getRelativeProjectPath() + "input\\" + name).getBots();
		fightEngine = new FightEngine(bots);

	}
	
	@When("I start a game")
	public void iStartAGame()
	{
		fightEngine = new FightEngine(bots);
	}

	@When("I click on next step")
	public void iClickOnNextStep()
	{
		fightEngine.doStep();
	}

	@Then("the left player made a move")
	public void theLeftPlayerTookAStep()
	{
		Fighter fighter = fightEngine.getLeftFighter();
		String currentMove = fighter.getCurrentMove();
		ensureThat(SAFConstants.MoveTypes.contains(currentMove));
	}

	@Then("the right player made a move")
	public void theRightPlayerTookAStep()
	{
		Fighter fighter = fightEngine.getRightFighter();
		String currentMove = fighter.getCurrentMove();
		ensureThat(SAFConstants.MoveTypes.contains(currentMove));
	}

	@Then("the left player did an attack")
	public void theLeftPlayerDidAnAttack()
	{
		Fighter fighter = fightEngine.getLeftFighter();
		String currentAttack = fighter.getCurrentAttack();
		ensureThat(SAFConstants.AttackTypes.contains(currentAttack));

	}

	@Then("the right player did an attack")
	public void theRightPlayerDidAnAttack()
	{
		Fighter fighter = fightEngine.getRightFighter();
		String currentAttack = fighter.getCurrentAttack();
		ensureThat(SAFConstants.AttackTypes.contains(currentAttack));
	}

	/* Scenario: fight has one winner */

	@Given("a SAF file with value $value")
	public void aSAFFileWithValue(String name) throws ParseException, IOException
	{
		bots = new Parser(Main.getRelativeProjectPath() + "input\\" + name).getBots();
		leftBot = bots.getLeftBot().getBotName();
		rightBot = bots.getRightBot().getBotName();
	}

	@When("I play till the game is finished")
	public void playTillTheGameIsFinished()
	{
		while (fightEngine.isPlaying())
		{
			fightEngine.doStep();
		}
	}

	@SuppressWarnings("unchecked")
	@Then("there should be a winner")
	public void thereShouldBeAWinner()
	{
		ensureThat(fightEngine.getWinner(), anyOf(equalTo(leftBot), equalTo(rightBot)));
	}
	
	/* Scenario: unbeatable player wins */

	@Given("an unbeatable fighter file with value $value")
	public void anUnbeatableFighterFileWithValue(String name) throws ParseException, IOException
	{
		bots = new Parser(Main.getRelativeProjectPath() + "input\\" + name).getBots();
		fightEngine = new FightEngine(bots);
	}

	@Given("the name of the unbeatable player is $value")
	public void theNameOfTheUnbeatablePlayerIs(String name)
	{
		unbeatablePlayer = name;
	}
	
	@Then("the name of the winner should be $value")
	public void theNameOfTheWinnerShouldBe(String name)
	{
		ensureThat(fightEngine.getWinner(), equalTo(unbeatablePlayer));
		ensureThat(fightEngine.getWinner(), equalTo(name));

	}
}
