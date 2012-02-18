package saf.structure;

public class FightAction extends Check {

	//Constructor
	public FightAction(String fightAction)
	{
		FightActionType fightActionType2;
		try
		{
			fightActionType2 = FightActionType.valueOf(fightAction);
		}
		catch(Exception e)
		{
			//set to default value
			fightActionType2  = FightActionType.block_high;
			addError("Illegal condition");
		}
		this.fightActionType = fightActionType2;
	}
	
	//Attribute
	private final FightActionType fightActionType;

	public FightActionType getFightActionType() {
		return fightActionType;
	}
	
	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}
}
