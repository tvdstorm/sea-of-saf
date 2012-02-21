package saf.fighter.fdl;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;

import saf.fighter.AIFighter;

public class FDLReaderTest {

	private final static Map<String, String> fdls = new HashMap<String, String>();
	
	@BeforeClass
	public static void readFDLs() throws Exception {
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
				fdl+=line+"\n";
			
			fdls.put(file.getName(), fdl);
		}		
	}
	
	
	@Test
	public void testFDLReader_ParseCorrect() {
		assertEquals("chicken kickReach 9 punchReach 1 kickPower 2 punchPower 2 far run_towards kick_low " +
						"near run_away kick_low always crouch punch_low", testFDLReader("chicken.fdl"));
		assertEquals("Challenging kickReach 10 stronger choose jump run_away choose kick_low block_low far or " +
						"much_weaker choose crouch run_towards choose punch_low punch_high always crouch kick_low", 
																		testFDLReader("challenging.fdl"));
		assertEquals("noProps always crouch kick_low", testFDLReader("no-props.fdl"));		
		assertEquals("precedence a and b and c z z a or b or c z z a and b or c z z a or b and c z z " +
						"a and b or c and d z z a and b or c and d z z a or b and c or d z z " +
						"a or b and c or d z z a and b and c and d z z a or b or c or d z z", 
																		testFDLReader("precedence.fdl"));
	}
	
	@Test (expected = InvalidParameterException.class)
	public void testFDLReader_ParseIncorrect() {
		testFDLReader("misformed.fdl");
	}
	
	@Test
	public void testApplyAttributes_CheckCorrect() {
		assertNull(testApplyAttributes("complex-condition.fdl"));
		assertNull(testApplyAttributes("chicken.fdl"));
		assertNull(testApplyAttributes("chuck.fdl"));
		assertNull(testApplyAttributes("challenging.fdl"));
		assertNull(testApplyAttributes("jackie.fdl"));
		assertNull(testApplyAttributes("kicking.fdl"));
		assertNull(testApplyAttributes("unbeatable.fdl"));
	}
	
	@Test
	public void testApplyAttributes_CheckIncorrect() {
		assertNotNull(testApplyAttributes("all-wrong.fdl"));
		assertNotNull(testApplyAttributes("chicken-invalid-cond.fdl"));
		assertNotNull(testApplyAttributes("chuck-invalid-move.fdl"));
		assertNotNull(testApplyAttributes("challenging-outofbounds.fdl"));
		assertNotNull(testApplyAttributes("jackie-invalid-fight.fdl"));
		assertNotNull(testApplyAttributes("kicking-no-always.fdl"));
	}
	
	@Test
	public void testApplyAttributes_CheckErrorMsgs() {
		testApplyAttributes_CheckIncorrect(); //to ensure error messages exist
		
		assertEquals(9, testApplyAttributes("all-wrong.fdl").size());
		assertTrue(testApplyAttributes("all-wrong.fdl").get(3).toString().startsWith("Warning: use of choose"));
		assertEquals("nar", testApplyAttributes("chicken-invalid-cond.fdl").get(0).getInvalidAttributeName());
		assertEquals("walk_twards", testApplyAttributes("chuck-invalid-move.fdl").get(0).getInvalidAttributeName());
		assertEquals("15", testApplyAttributes("challenging-outofbounds.fdl").get(0).getInvalidAttributeName());
		assertEquals("bock_low", testApplyAttributes("jackie-invalid-fight.fdl").get(0).getInvalidAttributeName());
		assertEquals("Please add an always-rule.", testApplyAttributes("kicking-no-always.fdl").get(0).toString());
	}
	
	@Test
	public void testApplyAttributes_Interpret(){
		AIFighter manualChicken = new AIFighter();
		manualChicken.setName("chicken");
		manualChicken.addProperty("kickReach", 9);
		manualChicken.addProperty("punchReach", 1);
		manualChicken.addProperty("kickPower", 2);
		manualChicken.addProperty("punchPower", 2);
		manualChicken.addBehaviour(Arrays.asList("far","and","or"), Arrays.asList("run_towards"), Arrays.asList("kick_low"));
		manualChicken.addBehaviour(Arrays.asList("near","and","or"), Arrays.asList("run_away"), Arrays.asList("kick_low"));
		manualChicken.addBehaviour(Arrays.asList("always","and","or"), Arrays.asList("crouch"), Arrays.asList("punch_low"));
		
		AIFighter readChicken = new AIFighter(fdls.get("chicken.fdl"));
		
		assertEquals(manualChicken, readChicken);
	}
	
	
	private String testFDLReader(String fileName) throws InvalidParameterException{
		return new FDLReader(fdls.get(fileName)).toString();
	}
	
	private List<InvalidAttributeMessage> testApplyAttributes(String fileName) {
		return new FDLReader(fdls.get(fileName)).applyAttributes(new AIFighter());
	}

}
