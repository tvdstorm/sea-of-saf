package saf.parser;

import static org.junit.Assert.*;
import org.junit.Test;
import safparser.*;
import java.io.*;

public class ParserTest {

	@Test
	public void testWellformedSpecification() {
		String specification = "JackieChan {\r\n" +
							   "	someStrength = 0\r\n" +
							   "	anotherStrength = 11\r\n" +
							   "	someCondition [someMoveAction someFightAction]\r\n" +
							   "	someCondition [someAction(someAction1 someAction2 someAction3)" +
							   "				   moreAction(fight(kick punch block) superhero(fly crawl))]\r\n" +
							   "}";
		ByteArrayInputStream input = new ByteArrayInputStream(specification.getBytes());
		Parser parser = new Parser(input);
		
		try {
			parser.Root();
		}
		catch ( ParseException ex ) {
			fail("ParseException should not have occurred");
		}
	}
}
