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
										"	punchPower = 10\r\n" +
										"	kickReach = 1\r\n" +
										"	punchReach = 5\r\n" +
										"	far [run_towards kick_low]\r\n" +
										"	near [crouch choose(punch_low kick_low)]\r\n" +
										"	weaker [choose(run_away walk_away) choose(block_high block_low)]" +
										"	stronger and near or far [stand punch_high]" +
										"}" );
		InputStream stream = new ByteArrayInputStream(sample.getBytes());
		
		saf parser = new saf(stream);
		try
		{
			parser.Start();
		}
		catch (ParseException exception)
	    {
			fail("Code should not have failed");
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
		    }
			catch (TokenMgrError exception)
			{
			}
		}
	}
}
