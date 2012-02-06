// Copyright © Pim Huisman 2012.
package core;
import data.Fighter;

public class Main {

	public static void main(String[] args) throws Exception {
			
		FighterLoader loader = new ANTLRFighterLoader();
		Fighter fighter = loader.loadFighterByFile("data/wrong_personality.saf");
		
		TypeCheckerVisitor typeChecker = new TypeCheckerVisitor();
		ConsoleTreeVisitor consolePrinter = new ConsoleTreeVisitor();
		
		fighter.acceptTreeVisitor(typeChecker);
		fighter.acceptTreeVisitor(consolePrinter);
		
		typeChecker.printErrorsInConsole();
		
	}
	
}
