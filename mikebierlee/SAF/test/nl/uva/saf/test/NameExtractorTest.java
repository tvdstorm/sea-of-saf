package nl.uva.saf.test;

import junit.framework.Assert;
import nl.uva.saf.fdl.NameExtractor;
import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.ITreeNode;

import org.junit.Before;
import org.junit.Test;

public class NameExtractorTest {
	final String expectedName = "extractNameSuccessfullyTest";
	ITreeNode fighter;
	
	@Before
	public void setup() {
		 fighter = new Fighter(expectedName, null);
	}
	
	@Test
	public void extractNameSuccessfullyTest() {				
		NameExtractor extractor = new NameExtractor(fighter);
		String extractedName = extractor.extract();
		
		Assert.assertEquals(expectedName, extractedName);
	}
	
	@Test
	public void extractWithStaticMethod() {
		String extractedName = NameExtractor.getName(fighter);
		Assert.assertEquals(expectedName, extractedName);
	}
}
