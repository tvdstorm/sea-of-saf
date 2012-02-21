package safFightAnimation.config;

import java.awt.Point;

import safAST.action.Action;
import safAST.action.SelectAction;
import safAST.action.SingleAction;
import safAST.enumType.MoveActionType;

public class SAFMoveAnimationConfig extends SAFAnimationConfig{
	private int originalY;
	private String side;
	
	private final int walkSpeed = 1, runSpeed = 2;
	private final int moveDistance = 5, jumpHeight = 70, crouch = 70;
	private final int lBoundX = 8;
	
	public SAFMoveAnimationConfig(Point p)
	{
		position = p;
		originalY = position.y;
		if (position.x == lBoundX)
			side = "left";
		else
			side = "right";
	}
	
	public void setSAFMoveAct(Action act)
	{
		if (act.getMoveAction() instanceof SelectAction)
		{
			singleMoveAct = getRandomAction((SelectAction)act.getMoveAction());
			setFighterPosition(singleMoveAct.getActionName());
		}else
		{
			singleMoveAct = (SingleAction)act.getMoveAction();
			setFighterPosition(singleMoveAct.getActionName());
		}
	}
	
	private void setFighterPosition(String moveActName)
	{
		switch (MoveActionType.valueOf(moveActName))
		{
			case walk_towards: 
			if (position.y < originalY)
				position.setLocation(position.x, originalY);
			fighterMove(moveDistance,  walkSpeed); 
			break;
			
			case walk_away: 
			if (position.y < originalY)
				position.setLocation(position.x, originalY);
			fighterMove(-moveDistance,  walkSpeed);
			break;
			
			case run_towards: 
			position.setLocation(position.x, originalY); 
			fighterMove(moveDistance,  runSpeed);
			break;
			
			case run_away:  
			position.setLocation(position.x, originalY); 
			fighterMove(-moveDistance,  runSpeed);
			break;
			
			case jump: 
			if (position.y < originalY)
				position.setLocation(position.x, originalY);
			fighterJump();
			break;
			
			case crouch: 
			if (position.y > originalY)
				position.setLocation(position.x, originalY);
			fighterCrouch();
			break;
			
			case stand: 
			position.setLocation(position.x, originalY);
			break;
			
			default: 
			break;
		}
	}
	
	private void fighterMove(int mDistance, int speed)
	{
		if (side.equalsIgnoreCase("left"))
			position.setLocation(position.x + (mDistance*speed), position.y);
		else
			position.setLocation(position.x - (mDistance*speed), position.y);
	}
		
	private void fighterJump()
	{
		position.setLocation(position.x, position.y - jumpHeight);
	}
	
	private void fighterCrouch()
	{
		position.setLocation(position.x, position.y + crouch);
	}
}
