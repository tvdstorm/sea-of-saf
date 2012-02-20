package jsaf.test.scenarios;

import jsaf.test.jbehave.JUnitReportingRunner;
import jsaf.test.jbehave.UseConfiguration;
import jsaf.test.jbehave.UseSteps;

import org.jbehave.scenario.JUnitScenario;
import org.jbehave.scenario.MostUsefulConfiguration;
import org.jbehave.scenario.parser.ClasspathScenarioDefiner;
import org.jbehave.scenario.parser.PatternScenarioParser;
import org.jbehave.scenario.parser.UnderscoredCamelCaseResolver;
import org.jbehave.scenario.reporters.ScenarioReporter;
import org.junit.runner.RunWith;


@RunWith(JUnitReportingRunner.class)
@UseSteps(ValidatorSteps.class)
@UseConfiguration(ValidatorScenario.MyJBehaveConfiguration.class)
public class ValidatorScenario extends JUnitScenario {

    public ValidatorScenario(final ScenarioReporter reporter) {
	super(new MyJBehaveConfiguration() {
	    @Override
	    public ScenarioReporter forReportingScenarios() {
	        return reporter;
	    }
	}, new ValidatorSteps());
    }
    
    
    public static class MyJBehaveConfiguration extends MostUsefulConfiguration {
        @Override
        public ClasspathScenarioDefiner forDefiningScenarios() {
        	
        	ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        	
            return new ClasspathScenarioDefiner(new UnderscoredCamelCaseResolver(), new PatternScenarioParser(this),
                    contextClassLoader);
        }
    }
}
