// Copyright © Pim Huisman 2012.
package core;

public class Main {

	public static void main(String[] args) throws Exception {
			
		FighterLoader loader = new ANTLRFighterLoader();
		loader.loadFighterByFile("data/jackiechan.saf");
		
	}
	
}
