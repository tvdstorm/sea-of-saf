package com.blommesteijn.uva.sc.saf.runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
	public static final String APP = "java -jar /Users/Pinguin/Documents/Dropbox/Private/Programming/UvA/Antlr/uva.sc.saf.runner/target/uva.sc.saf.runner-0.0.1-SNAPSHOT-jar-with-dependencies.jar";

    public void testAppLaunch() throws IOException
    {
    	String ret = this.runExec(APP + " --version" );
    	System.out.println(ret);
    }
    
    
    private String runExec(String command) throws IOException
    {
    	Process p = Runtime.getRuntime().exec(command);
    	InputStream inputStream = p.getInputStream();

    	Writer writer = new StringWriter();
		Reader reader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
		char[] buffer = new char[1024];
		int n = 0;
		while ((n = reader.read(buffer)) != -1)
		{
			writer.write(buffer, 0, n);
		}
		reader.close();
		return writer.toString();
	}
    
    
    

}
