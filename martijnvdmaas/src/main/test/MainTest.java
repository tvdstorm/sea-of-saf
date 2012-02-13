package main.test;

import grammar.test.InvalidBehaviourTest;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;


public class MainTest extends TestCase {

	public void setUp() {
		System.out.println("Per Test Case Setup");
	}

	public void tearDown() {
		System.out.println("Per Test Case Teardown");
	}

	public void testA() {
		System.out.println("Test A");
	}

	public void testB() {
		System.out.println("Test B");
	}
	
	public static Test suite() {
		TestSuite ts = new TestSuite();
		ts.addTestSuite(InvalidBehaviourTest.class);
		ts.addTestSuite(InvalidBehaviourTest.class);
		ts.addTestSuite(InvalidBehaviourTest.class);
		return new MainTestSetup(ts);
	}

	public static void main(String[] args) {
		TestRunner.run(suite());
	}
}