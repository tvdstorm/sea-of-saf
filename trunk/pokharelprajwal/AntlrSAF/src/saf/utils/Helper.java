package saf.utils;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;

import saf.game.State;

public class Helper {

	public static Image getImage(State state){
		
		String action = state.getActionPair().getFight();
		switch (state.getImageType()) {
			case Flipped:		
				action += "_f";
				break;
			default:
				break;
		}
		
		if(state.getActionPair().getMove().equals("jump") || state.getActionPair().getMove().equals("crouch") ) {
			action = state.getActionPair().getMove();
		}
		
		return getImageByName(action);
	}
	
	public static Image getImageByName(String action){
		
		String filePath = Config.ImagePath + action + ".jpg";
		File f = new File(filePath);
		if(!f.exists()) filePath = Config.ImagePath + "stand.jpg";
		return Toolkit.getDefaultToolkit().getImage(filePath);
		
	}

	
}
