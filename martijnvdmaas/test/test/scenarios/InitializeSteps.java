package test.scenarios;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.jbehave.util.JUnit4Ensure.ensureThat;

import java.io.IOException;

import game.FightEngine;
import grammar.ParseException;

import main.Main;
import main.Parser;

import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;
import astelements.Bots;

public class InitializeSteps extends Steps {
    Bots bots;
    String leftBot;
    String unbeatablePlayer;
    String rightBot;
    FightEngine fightEngine;

    @Given("an unbeatable fighter file with value $value")
    public void anUnbeatableFighterFileWithValue(String name) throws ParseException, IOException 
    {
    	bots = new Parser(Main.getRelativeProjectPath() + "input\\" + name).getBots();
    }
    
    @Given("the name of the unbeatable player is $value")
    public void theNameOfTheUnbeatablePlayerIs(String name) {
    	unbeatablePlayer = name;
    }
    
    @Given("a SAF file with value $value")
    public void aPlayerXWithNamse(String name) throws ParseException, IOException {
    	bots = new Parser(Main.getRelativeProjectPath() + "input\\" + name).getBots();
    	leftBot = bots.getFirstBot().getBotName();
    	rightBot = bots.getSecondBot().getBotName();
    }
    
    @When("I start a game")
    public void iStartAGame() {
		fightEngine = new FightEngine(bots);
    }    
    
    @When("I play till the game is finished")
    public void playTillTheGameIsFinished() {
    	while(fightEngine.isPlaying())
    	{
    		fightEngine.doStep();
    	}
    }
  
    @SuppressWarnings("unchecked")
    @Then("there should be a winner")
    public void thereShouldBeAWinner() {
    	ensureThat(fightEngine.getWinner(), anyOf(equalTo(leftBot), equalTo(rightBot)));
    }
    
    @Then("the name of the winner should be $value")
    public void theNameOfTheWinnerShouldBe(String name) {
    	ensureThat(fightEngine.getWinner(), equalTo(unbeatablePlayer));
    	ensureThat(fightEngine.getWinner(), equalTo(name));
    	
    }
}
