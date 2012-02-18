package game.view;

import game.FightEngine;
import game.controller.FightControlController;

import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FightControlView extends JPanel implements Observer {
	
	FightControlController fightControlController;
	private JButton nextStepButton;
	private JButton restartButton;
	
	public FightControlView(FightEngine fightEngine, FightControlController fightControlController) {
		this.fightControlController = fightControlController;
		fightEngine.addObserver(this);
		initializeGUI();
	}

	private void initializeGUI() {
		restartButton = new JButton("(Re) Start");
		restartButton.setSize(new Dimension(100,10));
		restartButton.addActionListener(fightControlController);
		add(restartButton);

		nextStepButton = new JButton("Next step");
		nextStepButton.setSize(new Dimension(100,10));
		nextStepButton.addActionListener(fightControlController);
		add(nextStepButton);
	}

	@Override
	public void update(Observable fightEngineObservable, Object arg1)
	{
		FightEngine fightEngine = (FightEngine) fightEngineObservable;
		
		nextStepButton.setEnabled(true);
		
		/* Disable the next step button after a fight */ 
		if(!fightEngine.getWinner().equals("") && !fightEngine.isPlaying())
		{
			nextStepButton.setEnabled(false);
		}
	}

}
