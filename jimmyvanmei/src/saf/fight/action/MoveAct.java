package saf.fight.action;

import java.awt.Point;

import saf.ast.action.Action;
import saf.ast.action.ChooseAction;
import saf.ast.action.SingleAction;
import saf.ast.enumType.MoveActionType;

public class MoveAct extends FAction{
	private int originalY;
	private SideEnum side;
	
	private final int walkSpeed = 1, runSpeed = 3;
	private final int moveDistance = 5, jumpHeight = 70, crouch = 70;
	
	public MoveAct(Point p, SideEnum s)
	{
		position = p;
		originalY = position.y;
		side = s;
	}
	
	public void setSAFMoveAct(Action act)
	{
		if (act.getMoveAction() instanceof ChooseAction)
		{
			singleMoveAct = getRandomAction((ChooseAction)act.getMoveAction());
			setFighterPosition(singleMoveAct.getSingleAct());
		}else
		{
			singleMoveAct = (SingleAction)act.getMoveAction();
			setFighterPosition(singleMoveAct.getSingleAct());
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
		switch (side)
		{
			case left: 
			position.setLocation(position.x + (mDistance*speed), position.y);
			break;
			
			case right:
			position.setLocation(position.x - (mDistance*speed), position.y);
			break;
			
			default: break;
		}
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
