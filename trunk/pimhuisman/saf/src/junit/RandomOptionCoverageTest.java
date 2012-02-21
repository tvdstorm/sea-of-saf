package junit;

import static org.junit.Assert.*;
import java.util.List;
import java.util.LinkedList;
import org.junit.Test;
import data.Actions;

public class RandomOptionCoverageTest {

	@Test
	public void testGetRandomMoveOption() {
		List<String> moveOptions = new LinkedList<String>();
		moveOptions.add("option1");
		moveOptions.add("option2");
		moveOptions.add("option3");
		List<String> notCoveredOptions = new LinkedList<String>(moveOptions);
		
		Actions actions = new Actions(moveOptions, null);
		for (int i=0; i<100; i++) {
			String action = actions.getRandomMoveOption();
			assertTrue(moveOptions.contains(action));
			if ( notCoveredOptions.contains(action) ) {
				notCoveredOptions.remove(action);
			}
		}
		assertEquals(0, notCoveredOptions.size());
	}

}
