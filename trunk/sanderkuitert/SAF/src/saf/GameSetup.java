package saf;

import saf.fdl.*;
import saf.simulator.*;


public class GameSetup {
	
	protected static GameInput fighterInput;
	protected static GameOutput fighterOutput; 
	
	public GameSetup(){
		fighterInput = new FDLReader();
		fighterOutput = new Simulator(); 
	}
	
	public static void main(String[] args) {
		System.out.println("============[Super Awesome Fighters]==================");
        
        fighterOutput.showFighters(fighterInput.obtainFighters());
        
        System.out.println("======================================================");
	}
	
}
