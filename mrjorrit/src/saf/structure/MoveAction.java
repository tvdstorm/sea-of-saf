package saf.structure;

public class MoveAction extends Check {

	//Constructor
	public MoveAction(String moveAction)
	{
		MoveActionType moveActionType2;
		try
		{
			moveActionType2 = MoveActionType.valueOf(moveAction);
		}
		catch(Exception e)
		{
			//set to default value
			moveActionType2  = MoveActionType.crouch;
			addError("Illegal condition");
		}
		this.moveActionType = moveActionType2;
	}
	
	//Attribute
	private final MoveActionType moveActionType;

	public MoveActionType getMoveActionType() {
		return moveActionType;
	}
	
	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}
}
