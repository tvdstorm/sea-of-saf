package saf.util;

import static org.junit.Assert.*;
import org.junit.Test;

import saf.interpreter.Bot;
import java.lang.reflect.Method;

public class ToolTest {
	
	@Test
	public void testGetAnnotatedMethod() {
		Method method = Tool.getAnnotatedMethod(Bot.class, "kickPower", "getStrength");
		assertEquals("getKickPower", method.getName());
	}
}
