package test.scenarios;

import org.jbehave.scenario.JUnitScenario;
import org.jbehave.scenario.PropertyBasedConfiguration;
import org.jbehave.scenario.parser.ClasspathScenarioDefiner;
import org.jbehave.scenario.parser.PatternScenarioParser;
import org.jbehave.scenario.parser.UnderscoredCamelCaseResolver;
import org.jbehave.scenario.reporters.ScenarioReporter;
import org.junit.runner.RunWith;

import test.jbehave.JUnitReportingRunner;
import test.jbehave.UseConfiguration;
import test.jbehave.UseSteps;



@RunWith(JUnitReportingRunner.class)
@UseSteps(InitializeSteps.class)
@UseConfiguration(InitializeScenario.MyJBehaveConfiguration.class)
public class InitializeScenario extends JUnitScenario {

    public InitializeScenario(final ScenarioReporter reporter) {
	super(new MyJBehaveConfiguration() {
	    @Override
	    public ScenarioReporter forReportingScenarios() {
	        return reporter;
	    }
	}, new InitializeSteps());
    }
    
    
    public static class MyJBehaveConfiguration extends PropertyBasedConfiguration {
        @Override
        public ClasspathScenarioDefiner forDefiningScenarios() {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            
            return new ClasspathScenarioDefiner(new UnderscoredCamelCaseResolver(), new PatternScenarioParser(this),
                    contextClassLoader);
        }
    }

}
