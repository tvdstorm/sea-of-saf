package saf.fight.action;

import java.awt.Point;
import java.awt.image.BufferedImage;

import saf.ast.action.SingleAction;

public interface IFAction {
	BufferedImage getImage();
	Point getPosition();
	SingleAction getFightAct();
	SingleAction getMoveAct();	
}
