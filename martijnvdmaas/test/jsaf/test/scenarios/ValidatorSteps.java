package jsaf.test.scenarios;

import java.io.IOException;
import java.util.List;

import jsaf.astelements.Bots;
import jsaf.constants.ErrorConstants;
import jsaf.grammar.ParseException;
import jsaf.main.Main;
import jsaf.main.Parser;
import jsaf.visitor.SAFElementValidatorVisitor;

import static org.jbehave.util.JUnit4Ensure.ensureThat;
import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.Then;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.steps.Steps;

import static org.hamcrest.CoreMatchers.equalTo;

public class ValidatorSteps extends Steps implements ErrorConstants
{
	private String safFileName;
	private SAFElementValidatorVisitor validator;
	private Bots bots;

	@Given("a SAF file with value $value")
	public void aSAFFileWithValue(String name) throws ParseException, IOException
	{
		safFileName = name;
	}

	@When("I parse the input")
	public void iParseTheInput() throws ParseException, IOException
	{
		bots = new Parser(Main.getRelativeProjectPath() + "input\\" + safFileName).getBots();
	}

	@When("I validate the file")
	public void iValidateTheFile()
	{
		validator = new SAFElementValidatorVisitor();
		bots.accept(validator);
	}

	@Then("the validator should contain a characteristic error")
	public void theValidatorShouldContainACharacteristicError()
	{
		ensureThat(containsError(validator.getErrorMessages(), ErrorConstants.CHARACTERISTIC_INVALID_NAME));
	}

	@Then("the validator should contain a move error")
	public void theValidatorShouldContainAMoveError()
	{
		ensureThat(containsError(validator.getErrorMessages(), ErrorConstants.BEHAVIOUR_INVALID_MOVE_NAME));
	}

	@Then("the validator should contain a condition error")
	public void theValidatorShouldContainAConditionError()
	{
		ensureThat(containsError(validator.getErrorMessages(), ErrorConstants.CONDITION_INVALID_NAME));
	}

	@Then("the validator should contain an attack error")
	public void theValidatorShouldContainAnAttackError()
	{
		ensureThat(containsError(validator.getErrorMessages(), ErrorConstants.BEHAVIOUR_INVALID_ATTACK_NAME));
	}

	@Then("the validator should contain a hasnoalways error")
	public void theValidatorShouldContainAHasnoalwaysError()
	{
		ensureThat(containsError(validator.getErrorMessages(), ErrorConstants.BOT_HAS_NOT_ALWAYS));
	}

	@Then("the validator should contain all validator errors")
	public void theValidatorShouldContainAllValidatorErrors()
	{
		ensureThat(containsError(validator.getErrorMessages(), ErrorConstants.CHARACTERISTIC_INVALID_NAME));
		ensureThat(containsError(validator.getErrorMessages(), ErrorConstants.BEHAVIOUR_INVALID_MOVE_NAME));
		ensureThat(containsError(validator.getErrorMessages(), ErrorConstants.CONDITION_INVALID_NAME));
		ensureThat(containsError(validator.getErrorMessages(), ErrorConstants.BEHAVIOUR_INVALID_ATTACK_NAME));
		ensureThat(containsError(validator.getErrorMessages(), ErrorConstants.BOT_HAS_NOT_ALWAYS));
	}

	@Then("the validator should contain no errors")
	public void theValidatorShouldContainNoErros()
	{
		//ensureThat(true);
	}

	private boolean containsError(List<String> errorMessages, String searchError)
	{
		boolean errorFound = false;
		for (String error : errorMessages)
		{
			if (error.startsWith(searchError))
			{
				errorFound = true;
			}
		}
		return errorFound;
	}

}
