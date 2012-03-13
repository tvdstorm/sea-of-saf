package com.blommesteijn.uva.sc.saf.ast.types.actions;


public class MoveAction extends Action 
{
	private static final long serialVersionUID = 1879580942737416332L;

	public MoveAction()
	{
		super();
	}
	
	public void setObjectFields(Action action) 
	{
		this.setLine(action.getLine());
		_name = action._name;
	}
	
	public boolean isType(String type)
	{
		return _name.contains(type);
	}
	
	public double calcNextPosition(double currentPosition, double fighterSpeed, int direction) 
	{
		//walk or run
		if(this.isType("walk"))
			fighterSpeed += 5;
		else if(this.isType("run"))
			fighterSpeed += 10;
		//away or towards
		if(this.isType("away"))
			direction *= -1;
		else if(this.isType("towards"))
			direction *= 1;
		return currentPosition + (direction * fighterSpeed);
	}
	

}
