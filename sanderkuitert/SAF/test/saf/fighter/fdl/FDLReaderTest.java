package saf.fighter.fdl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.PrintStream;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import saf.fighter.SuperAwesomeFighter;

public class FDLReaderTest {

	private static Map<String, String> fdls;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); //TODO delete if not used
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	@BeforeClass
	public static void readFDLs() throws Exception {
		fdls = new HashMap<String, String>();
		
		FilenameFilter fdlExtention = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith(".fdl") || name.endsWith(".saf"); //include .saf for compatibility
			} 
		};		
		for(File file: new File("./test/saf/fighter/fdl").listFiles(fdlExtention)) {
			String fdl = "";
			
			String line;
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while((line = reader.readLine()) != null)
				fdl+=line;
			
			fdls.put(file.getName(), fdl);
		}		
	}
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}
	
	
	
	@Test
	public void testFDLReader() {
		//Parser
		assertEquals("<expected error msg>", construct("all-wrong.fdl"));
		assertEquals("<expected ast string>", construct("chicken.fdl"));
		//TODO complete
	}
	
	@Test
	public void testApplyAttributes() {
		//Checker
		assertFalse("Missing messages", applyAttributes("all-wrong.fdl", new SuperAwesomeFighter()));
		assertTrue("Unexpected messages", applyAttributes("chicken.fdl", new SuperAwesomeFighter()));
		assertEquals("<expected error msg>", errContent.toString());
		//TODO complete
		
		//Interpreter
		assertEquals(chickenFighter(),applyAttributes("chicken.fdl", new SuperAwesomeFighter()));
	}

	
	
	private String construct(String fileName) {
		FDLReader parser;
		try {
			parser = new FDLReader(fdls.get(fileName));
		} catch (InvalidParameterException e) {
			return e.getMessage();
		}
		return parser.toString();
	}
	
	private boolean applyAttributes(String fileName, DescribableFighter fighter) {
		return new FDLReader(fdls.get(fileName)).applyAttributes(fighter);
	}

	private DescribableFighter chickenFighter() {
		DescribableFighter chickenFighter = new SuperAwesomeFighter();
//		chickenFighter.addBehaviour(condition, moves, attacks); //TODO complete
		return chickenFighter;
	}
	
}
