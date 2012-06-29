package test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import org.junit.Test;

import util.util;

public class SimpleTest {

	@Test
	public void testisInCharacteristic() {
		String str = "punchPower";
		String[] charact = {"punchReach", "kickReach", "kickPower", "punchPower"};

		assertTrue(util.isIn(str,charact));
		assertNotNull(util.isIn(str,charact));
		assertEquals(true,util.isIn(str,charact));
	}
}
