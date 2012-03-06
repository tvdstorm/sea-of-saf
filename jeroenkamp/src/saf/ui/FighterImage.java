package saf.ui;

import java.awt.*;

import saf.common.MoveType;


public abstract class FighterImage{
	public abstract Image createImage(IFighter f);
	public static FighterImage createImage(MoveType type){
		if(type==MoveType.jump){
			return new FighterJumpImage();
		}
		else if(type==MoveType.crouch){
			return new FighterCrouchImage();
		}
		else{
			return new FighterStandImage();
		}
	}
}


