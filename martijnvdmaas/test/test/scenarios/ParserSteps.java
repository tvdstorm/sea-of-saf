package test.scenarios;

import jsaf.astelements.Bot;
import jsaf.astelements.Bots;
import grammar.ParseException;

import main.Main;
import main.Parser;

import static org.jbehave.util.JUnit4Ensure.ensureThat;
import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;

import static org.hamcrest.CoreMatchers.equalTo;

public class ParserSteps extends Steps {
    private String safFileName;
    private Bots bots;
    private Exception actualException;

    /* Scenario: Only one player is given */
    @Given("an incorrect SAF file with value $value")
    public void anIncorrectSAFFileWithValue (String name)
    {
    	safFileName = name;
    }

    @When("I parse the file")
    public void iParseTheFile() {
    	try
		{
			bots = new Parser(Main.getRelativeProjectPath() + "input\\" + safFileName).getBots();
		}
		catch (Exception e)
		{
			actualException = e;
		}
    	finally
    	{
    		if(actualException == null) 
    		{
    			actualException = new NullPointerException();
    		}
    	}
    }
    
    @Then("there should be a parse error")
    public void thereShouldBeAParseError()
    {
    	ParseException expectedException 	= new ParseException();
    	String expectedExceptionClassName 	= expectedException.getClass().getName();
    	String actualExceptionClassName 	= actualException.getClass().getName();
    	
    	ensureThat(actualExceptionClassName, equalTo(expectedExceptionClassName));
    }
    
    /* Scenario: Valid input is given */
    
    @Given("a correct SAF file with value $value")
    public void aCorrectSAFFileWithValue(String name) 
    {
    	safFileName = name; 
    }
    

    @Then("the left player should be initialized")
    public void theLeftPlayerShouldBeInitialized() 
    {
    	Bot expectedClass = new Bot();
    	String expectedClassName = expectedClass.getClass().getName();
    	String actualClassName = bots.getLeftBot().getClass().getName();
    	
    	ensureThat(actualClassName, equalTo(expectedClassName));
    }
    
    @Then("the right player should be initialized")
    public void theRightPlayerShouldBeInitialized() 
    {
    	Bot expectedClass = new Bot();
    	String expectedClassName = expectedClass.getClass().getName();
    	String actualClassName = bots.getRightBot().getClass().getName();
    	
    	ensureThat(actualClassName, equalTo(expectedClassName));
    }
}
