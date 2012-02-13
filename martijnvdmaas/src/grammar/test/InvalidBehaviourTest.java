package grammar.test;

import elements.Bot;
import junit.framework.TestCase;

public class InvalidBehaviourTest extends TestCase {

	public InvalidBehaviourTest(String name) {
	    super(name);
	  }

	  protected void setUp() { 
		  Bot bot = new Bot();
	  }

	  protected void tearDown() { 
		  
	  }

	  public void testBooleanTrue() {

	    assertTrue(true);

	  }

	  public void testBooleanFalse() {

	    assertTrue(true);

	  } 
}
