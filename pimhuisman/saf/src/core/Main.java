// Copyright © Pim Huisman 2012.
package core;

import data.Fighter;

public class Main {

	public static void main(String[] args) throws Exception {
			
		FighterLoader loader = new ANTLRFighterLoader();
		Fighter fighter = loader.loadFighterByFile("data/jackiechan.saf");
		
		fighter.acceptTreePrinter(new TypeCheckerVisitor());
		fighter.acceptTreePrinter(new ConsoleTreeVisitor());
		
	}
	
}
