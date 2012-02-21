package saf.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestPrinter.class,
	TestSimpleEngine.class,
	TestAndORPriority.class
})
public class TestAll {

}