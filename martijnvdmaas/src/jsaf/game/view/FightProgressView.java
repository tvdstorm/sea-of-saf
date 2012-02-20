package jsaf.game.view;


import java.util.Observable;
import java.util.Observer;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import jsaf.game.FightEngine;

public class FightProgressView extends JPanel implements Observer {
	private JProgressBar leftFighterHealth;
	private JProgressBar rightFighterHealth;

	public FightProgressView(FightEngine fightEngine) {
		
		fightEngine.addObserver(this);
		initializeGUI(fightEngine);
	}
	
	private void initializeGUI(FightEngine fightEngine) {
		leftFighterHealth 	= createProgressBar(fightEngine.getLeftPlayerName()); 
		rightFighterHealth 	= createProgressBar(fightEngine.getRightPlayerName());
	}

	private JProgressBar createProgressBar(String playerName) {
		JProgressBar progressBar = new JProgressBar(0, 100);
		progressBar.setValue(100);
		progressBar.setStringPainted(true);
		
		add(new JLabel(playerName + ": "));
		add(progressBar);
		
		return progressBar;
	}

	@Override
	public void update(Observable fightEngine, Object arg1) {
		FightEngine fightEngineObservable = (FightEngine) fightEngine;

		leftFighterHealth.setValue(fightEngineObservable.getLeftHealth());
		rightFighterHealth.setValue(fightEngineObservable.getRightHealth());
	}
}
