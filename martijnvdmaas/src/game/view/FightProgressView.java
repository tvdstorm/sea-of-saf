package game.view;

import game.FightEngine;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class FightProgressView extends JPanel implements Observer {
	private JProgressBar leftFighterHealth;
	private JProgressBar rightFighterHealth;

	public FightProgressView(FightEngine fightEngine) {
		
		fightEngine.addObserver(this);
		initializeGUI();
	}
	
	private void initializeGUI() {
		leftFighterHealth = new JProgressBar(0, 100);
		leftFighterHealth.setValue(100);
		leftFighterHealth.setStringPainted(true);
		
		rightFighterHealth = new JProgressBar(0, 100);
		rightFighterHealth.setValue(100);
		rightFighterHealth.setStringPainted(true);

		this.add(new JLabel("Left player:"));
		this.add(leftFighterHealth);

		this.add(new JLabel("Right player:"));
		this.add(rightFighterHealth);
	}

	@Override
	public void update(Observable fightEngine, Object arg1) {
		FightEngine fightEngineObservable = (FightEngine) fightEngine;

		leftFighterHealth.setValue(fightEngineObservable.getLeftHealth());
		rightFighterHealth.setValue(fightEngineObservable.getRightHealth());
	}
}
