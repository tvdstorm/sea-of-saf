package main.test;

import junit.extensions.TestSetup;
import junit.framework.Test;

public class MainTestSetup extends TestSetup {

	public MainTestSetup(Test test) {
		super(test);
	}

	public void setUp() {
		System.out.println("Test-wide setup");
	}

	public void tearDown() {
		System.out.println("Test-wide teardown");
	}
}