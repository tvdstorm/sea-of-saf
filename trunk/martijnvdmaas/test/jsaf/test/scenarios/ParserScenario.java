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
@UseSteps(ParserSteps.class)
@UseConfiguration(ParserScenario.MyJBehaveConfiguration.class)
public class ParserScenario extends JUnitScenario {

    public ParserScenario(final ScenarioReporter reporter) {
	super(new MyJBehaveConfiguration() {
	    @Override
	    public ScenarioReporter forReportingScenarios() {
	        return reporter;
	    }
	}, new ParserSteps());
    }
    
    
    public static class MyJBehaveConfiguration extends MostUsefulConfiguration {
        @Override
        public ClasspathScenarioDefiner forDefiningScenarios() {
        	
        	ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        	System.out.println(contextClassLoader.toString());
            
            return new ClasspathScenarioDefiner(new UnderscoredCamelCaseResolver(), new PatternScenarioParser(this),
                    contextClassLoader);
        }
    }
}
