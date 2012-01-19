package astChecker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ast.*;

public class ASTChecker {
	private static final List<String> possibleCharacteristics = Arrays.asList("punchReach", 
																			  "punchPower", 
																			  "kickReach", 
																			  "kickPower");

	public void check(Arena arena) throws Exception{
		if(arena.bots.isEmpty())
			throw new Exception("No bots specified");
		for(Bot bot: arena.bots)
			check(bot);
	}
	
	private void check(Bot bot) throws Exception {
		
	}

	private void check(Characteristic characteristic) throws Exception{
		if(!possibleCharacteristics.contains(characteristic.item))
			throw new Exception("Unknown characteristic encountered: " + characteristic.item);
		if(characteristic.value > 10 || characteristic.value <= 0)
			throw new Exception("Wrong characteristic encountered, it can only be a value of 1 to 10 inclusive: " + characteristic.value);
	}

}
