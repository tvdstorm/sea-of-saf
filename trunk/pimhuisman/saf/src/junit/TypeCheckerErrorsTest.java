package junit;
import static org.junit.Assert.*;
import org.junit.Test;

import core.FighterLoader;
import core.ANTLRFighterLoader;
import core.TypeCheckerVisitor;
import data.Fighter;

public class TypeCheckerErrorsTest {

	@Test
	public void testGetErrors() {
		
		FighterLoader fighterLoader = new ANTLRFighterLoader();
		TypeCheckerVisitor typeChecker = new TypeCheckerVisitor();
		
		Fighter fighter1 = fighterLoader.loadFighterByFile("data/chicken.saf");
		fighter1.acceptTreeVisitor(typeChecker);
		assertTrue(typeChecker.getErrors().isEmpty());
		
		Fighter fighter2 = fighterLoader.loadFighterByFile("data/fighter.saf");
		fighter2.acceptTreeVisitor(typeChecker);
		assertTrue(typeChecker.getErrors().isEmpty());
		
		Fighter fighter3 = fighterLoader.loadFighterByFile("data/jackiechan.saf");
		fighter3.acceptTreeVisitor(typeChecker);
		assertTrue(typeChecker.getErrors().isEmpty());
		
		Fighter fighter4 = fighterLoader.loadFighterByFile("data/wrong_personality.saf");
		fighter4.acceptTreeVisitor(typeChecker);
		assertEquals(2, typeChecker.getErrors().size());
		
	}

}
