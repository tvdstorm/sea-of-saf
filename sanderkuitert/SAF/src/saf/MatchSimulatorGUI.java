package saf;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;


public class MatchSimulatorGUI extends JFrame implements Observer {

	private static final long serialVersionUID = 1L;

	public void update(Observable o, Object arg) {
		assert arg instanceof MatchSimulator.Player: "Invalid parameter: "+arg;
		
		MatchSimulator.Player player = (MatchSimulator.Player) arg;
	
		// TODO implement
		System.out.println("Imagine "+player.fighter.getName()+" "+player.lastAction.moveName+" and "+
				player.lastAction.attackName);
	}

}
