package safFightAnimation.config;

import java.awt.Point;
import java.awt.image.BufferedImage;
import safAST.action.SingleAction;

public interface ISAFAnimationConfig {
	BufferedImage getFightImage();
	Point getPosition();
	SingleAction getFightAct();
	SingleAction getMoveAct();	
}
