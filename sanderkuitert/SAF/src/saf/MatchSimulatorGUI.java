package saf;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import saf.MatchSimulator.VisibleObject;


class MatchSimulatorGUI extends JFrame implements Observer {

	private static final long serialVersionUID = 1L;
	
	private boolean endGameMsgShown;
	
	
	public MatchSimulatorGUI(String title, int width, int height) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(width, height);
		this.setLocation(50, 150);
		this.getLayeredPane().setDoubleBuffered(true);
		
		this.endGameMsgShown = false;
	}
	
	public void update(Observable obs, Object arg) {
		if(obs instanceof MatchSimulator) {
			MatchSimulator matchSimulator = ((MatchSimulator) obs);
			
			if(matchSimulator.hasEnded() && !endGameMsgShown) {
				endGameMsgShown=true;
				drawGameEndedMessage(matchSimulator.getEndMessage());
			}
			
			this.getLayeredPane().removeAll();
			for (MatchSimulator.VisibleObject object: matchSimulator.getVisibleObjects()) {
				drawVisibleObject(object);
				this.getLayeredPane().validate();
			}
		}
	}

	private void drawGameEndedMessage(String endMessage) {
		System.out.println("\n    "+endMessage); //LOG
		
		JOptionPane.showMessageDialog(this, endMessage);
		
		System.exit(0);
	}

	// where screen width corresponds to VisibleObject.MAX_POSITION
	private void drawVisibleObject(VisibleObject object) {
		
		if(object.isBackGround()) { //stretch iff window is larger than image
			JLabel backGround = new JLabel(object.appearance());
			backGround.setBounds(0, 0, this.getWidth(), this.getHeight());
			this.getLayeredPane().add(backGround, -1);
		} else {
			int x = (this.getWidth() / VisibleObject.MAX_POSITION) * object.xPosition();
			int y = this.getHeight() - (this.getHeight() / VisibleObject.MAX_POSITION) * object.yPosition();
			JLabel foreGround = new JLabel(object.appearance());
			foreGround.setBounds(x, y, object.appearance().getIconWidth(), object.appearance().getIconHeight());
			this.getLayeredPane().add(foreGround, 0);
		}
	}

}
