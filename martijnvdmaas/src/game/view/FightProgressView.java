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
		initializeGUI(fightEngine);
	}
	
	private void initializeGUI(FightEngine fightEngine) {
		leftFighterHealth 	= createProgressBar(); 
		rightFighterHealth 	= createProgressBar(); 

		this.add(new JLabel(fightEngine.getLeftFighter().getFighterName() + ": "));
		this.add(leftFighterHealth);

		this.add(new JLabel(fightEngine.getRightFighter().getFighterName() + ": "));
		this.add(rightFighterHealth);
	}

	private JProgressBar createProgressBar() {
		JProgressBar progressBar = new JProgressBar(0, 100);
		progressBar.setValue(100);
		progressBar.setStringPainted(true);
		return progressBar;
	}

	@Override
	public void update(Observable fightEngine, Object arg1) {
		FightEngine fightEngineObservable = (FightEngine) fightEngine;

		leftFighterHealth.setValue(fightEngineObservable.getLeftHealth());
		rightFighterHealth.setValue(fightEngineObservable.getRightHealth());
	}
}
