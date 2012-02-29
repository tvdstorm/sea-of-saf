package ui;

import common.ActionType;
import common.MoveType;

public interface IFighter {
	public int getPosition();
	public int getHealth();
	public int getMaxHealth();
	public MoveType getMoveState();
	public ActionType getActionState();
	public String getName();
}
