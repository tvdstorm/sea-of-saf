package game;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class FightProgressView extends JPanel implements Observer {
	private JProgressBar leftFighterHealth;
	private JProgressBar rightFighterHealth;

	public FightProgressView(FightEngine fightEngine) {
		JPanel progressbars = new JPanel();
		progressbars.setLayout(new FlowLayout());
		
		fightEngine.addObserver(this);

		leftFighterHealth = new JProgressBar(0, 100);
		leftFighterHealth.setValue(100);
		leftFighterHealth.setStringPainted(true);
		
		rightFighterHealth = new JProgressBar(0, 100);
		rightFighterHealth.setValue(100);
		rightFighterHealth.setStringPainted(true);

		progressbars.add(new JLabel("Left player:"));
		progressbars.add(leftFighterHealth);
		
		progressbars.add(new JLabel("Right player:"));
		progressbars.add(rightFighterHealth);
		
		add(progressbars);
	}

	@Override
	public void update(Observable fightEngine, Object arg1) {
		FightEngine fightEngineObservable = (FightEngine) fightEngine;

		leftFighterHealth.setValue(fightEngineObservable.getLeftHealth());
		rightFighterHealth.setValue(fightEngineObservable.getRightHealth());
	}
	
	

}
