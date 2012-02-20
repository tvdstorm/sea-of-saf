package saf;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

import saf.Match.VisibleObject;


class MatchGUI extends JFrame implements Observer {

	private static final long serialVersionUID = 1L;

	private boolean endGameMsgShown;
	
	
	public MatchGUI() {
		this.endGameMsgShown = false;
	}
	
	
	public void update(Observable obs, Object arg) {
		if(obs instanceof Match) {
			Match match = ((Match) obs);
			
			if(match.hasEnded() && !endGameMsgShown) {
				endGameMsgShown=true;
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
		System.out.println("\n    "+endMessage);
		
		System.exit(0); //TODO end more gracefully
	}

	// where screen width corresponds to VisibleObject.MAX_POSITION
	private void drawVisibleObject(VisibleObject object) {
		// TODO implement drawing of objects
//		System.out.println("Draws "+object); //DEBUG
//		if(object.stretchMe()) { }
//		object.appearance();
//		object.xPosition();
//		object.yPosition();
	}

}
