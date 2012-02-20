package saf;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import saf.Match.VisibleObject;


class MatchGUI extends JFrame implements Observer {

	private static final long serialVersionUID = 1L;

	//TODO support observing Player & clean up
	public void update(Observable obs, Object arg) {
		if(obs instanceof Match) {
			Match match = ((Match) obs);
			
			if(match.hasEnded()) {
				drawGameEndMessage(match.getEndMessage());
			}
			
			if(arg != null) {	//update ONE object
				assert arg instanceof Match.VisibleObject: "Only VisibleObject arguments are expected from Match";
				drawVisibleObject((Match.VisibleObject) arg);
			}else { 			//update ALL objects
				for (Match.VisibleObject object: match.getSimulatedObjects()) {
					drawVisibleObject(object);
				}
			
			}
		}
	}

	private void drawGameEndMessage(String endMessage) {
		// TODO implement gui effect
		//			account for possibility that this method is called more than once!
		System.out.println(endMessage);
		
		System.exit(0); //TODO end more gracefully
	}

	// where screen width corresponds to VisibleObject.MAX_POSITION_VALUE
	private void drawVisibleObject(VisibleObject object) {
		// TODO implement drawing of objects
		System.out.println("Draws "+object); //DEBUG
//		if(object.stretchMe()) { }
//		object.appearance();
//		object.xPosition();
//		object.yPosition();
	}

}
