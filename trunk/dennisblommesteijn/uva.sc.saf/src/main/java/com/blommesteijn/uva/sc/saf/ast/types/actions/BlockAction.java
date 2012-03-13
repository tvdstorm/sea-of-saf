package com.blommesteijn.uva.sc.saf.ast.types.actions;


public class BlockAction extends Action 
{
	private static final long serialVersionUID = 1879580942737416332L;

	public BlockAction() 
	{
		super();
	}
	
	public void setObjectFields(Action action) 
	{
		this.setLine(action.getLine());
		_name = action._name;

	}

}
