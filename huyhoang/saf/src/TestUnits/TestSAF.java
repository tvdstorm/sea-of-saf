package TestUnits;

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.*;
import java.util.*;
import safparser.*;

public class TestSAF {
	
	@Test
	public void testWellformedSpecification()
	{
		String sample = String.format(	"JackieChan {\r\n" +
										"	kickPower = 1\r\n" +
										"	punchPower = 2\r\n" +
										"	kickReach = 3\r\n" +
										"	punchReach = 4\r\n" +
										"	far [run_towards kick_low]\r\n" +
										"	near [crouch choose(punch_low kick_low)]\r\n" +
										"	weaker [choose(run_away walk_away) choose(block_high block_low)]" +
										"	stronger and near or far [stand punch_high]" +
										"	even [crouch punch_high]" +
										"}" );
		InputStream stream = new ByteArrayInputStream(sample.getBytes());
		saf parser = new saf(stream);
		try
		{
			SimpleNode node = parser.Start();
			
			// the root node
			assertEquals(1, node.jjtGetNumChildren());
			
			SimpleNode root = (SimpleNode)node.jjtGetChild(0);
			
			// 3 nodes expected: name of the bot, the characteristics, and the rules
			assertEquals(3, root.jjtGetNumChildren());
			
			SimpleNode fighterName = (SimpleNode)root.jjtGetChild(0);
			assertEquals(0, fighterName.jjtGetNumChildren());

			SimpleNode characteristics = (SimpleNode)root.jjtGetChild(1);
			assertEquals(4, characteristics.jjtGetNumChildren());

			SimpleNode rules = (SimpleNode)root.jjtGetChild(2);
			assertEquals(5, rules.jjtGetNumChildren());
		}
		catch (ParseException exception)
	    {
			fail("Code should not have failed");
	    }
	}
	
	@Test
	public void testInvalidRule()
	{
		String sample = String.format(	"ChuckNorris {\r\n" +
										"	even [run_away]" +
										"}"	);
		InputStream stream = new ByteArrayInputStream(sample.getBytes());
		saf parser = new saf(stream);
		try
		{
			parser.Start();
			fail("Code should have raised a ParseException");
		}
		catch (ParseException exception)
	    {
			assert(exception.getMessage().startsWith("Encountered \" \"]\" \"] \"\" at line 2, column 23"));
	    }
	}
	
	@Test
	public void testInvalidProperty()
	{
		String sample = String.format(	"ChuckNorris {\r\n" +
										"	throwPower = 1" +
										"}" );
		InputStream stream = new ByteArrayInputStream(sample.getBytes());
		saf parser = new saf(stream);
		try
		{
			parser.Start();
			fail("Code should have raised a ParseException exception");
		}
		catch (ParseException exception)
		{
			assert(exception.getMessage().startsWith("Encountered \" <IDENTIFIER> \"throwPower \"\" at line 2, column 9."));
		}
	}
	
	@Test
	public void testPropertyValidValues() throws Exception {
		for (int counter=1; counter<11; counter++)
		{
			String sample = String.format("JackieChan { kickPower = %d }", counter);
			InputStream stream = new ByteArrayInputStream(sample.getBytes());
			
			saf parser = new saf(stream);
		    try
		    {
		    	parser.Start();
		    }
		    catch (ParseException exception)
		    {
		    	fail(String.format("Value %d should not cause an exception: %s", counter, sample));
		    }
		}
	}


	@Test
	public void testPropertyInvalidEdgeValues() throws Exception {
		List<Integer> invalidValues = new ArrayList<Integer>(Arrays.asList(0, 11));
		
		for (int invalidValue : invalidValues)
		{
			String sample = String.format("JackieChan { kickPower = %d }", invalidValue);
			InputStream stream = new ByteArrayInputStream(sample.getBytes());
			
			saf parser = new saf(stream);
			try
		    {
		    	parser.Start();
		    	fail(String.format("Value %d should have caused an exception: %s", invalidValue, sample));
		    }
		    catch (ParseException exception)
		    {
		    	assert(exception.getMessage().startsWith("Encountered \" <INTEGER_LITERAL> \"1 \"\" at line 1, column 27."));
		    }
			catch (TokenMgrError exception)
			{
				assert(exception.getMessage().startsWith("Lexical error at line 1, column 26.  Encountered: \"0\" (48), after : \"\""));
			}
		}
	}
}