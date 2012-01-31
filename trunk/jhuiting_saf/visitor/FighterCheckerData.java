package visitor;

import java.util.Arrays;
import java.util.List;

public class FighterCheckerData {
	
	protected String[] personalyCharacteristics = {
		"kickPower",
		"punchPower",
		"kickReach",
		"punchReach"
	}; 
	
	protected String[] moveActionVals = {
		"run_towards",
		"run_away",
		"walk_towards",
		"walk_away",
		"jump",
		"crouch",
		"stand"
	};  

	protected String[] fightActionVals = {
		"block_low",
		"block_high",
		"punch_low",
		"punch_high",
		"kick_low",
		"kick_high"
	};
	
	protected String[] conditionVals = {
		"always",			
		"near",
		"far",
		"much_stronger",
		"stronger",
		"even",
		"weakers",
		"much_weaker"
	};
	
	public List<String> personalities;
	public List<String> moveActions;
	public List<String> fightActions;
	public List<String> conditions;
	

	public FighterCheckerData()
	{
		this.personalities = Arrays.asList(this.personalyCharacteristics);
		this.moveActions = Arrays.asList(this.moveActionVals);
		this.fightActions = Arrays.asList(this.fightActionVals);
		this.conditions = Arrays.asList(this.conditionVals);
	}


}
