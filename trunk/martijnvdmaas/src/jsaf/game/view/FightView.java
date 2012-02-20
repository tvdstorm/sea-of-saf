package jsaf.game.view;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import jsaf.constants.SAFConstants;
import jsaf.game.FightEngine;
import jsaf.game.controller.FightControlController;
import jsaf.game.controller.FightMenuViewController;

public class FightView extends JFrame implements Observer
{

	FightEngine fightEngine;

	public FightView(FightEngine fightEngine)
	{
		FightMenuViewController menuController = new FightMenuViewController(this);
		FightMenuView menuBar = new FightMenuView(menuController);
		setJMenuBar(menuBar);
		setLayout(new BorderLayout());

		setTitle("SAF Fighter Vizualisation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fightEngine.addObserver(this);
		addComponentsToPane(this.getContentPane(), fightEngine);

		setSize(new Dimension(750, 400));
		setLocationRelativeTo(getRootPane()); // centers frame in the middle
		setResizable(false);
		setVisible(true);
	}

	private void addComponentsToPane(Container contentPane, FightEngine fightEngine)
	{
		this.fightEngine = fightEngine;

		FightProgressView fightProgressView = new FightProgressView(fightEngine);
		add(fightProgressView, BorderLayout.NORTH);

		FighterDetailsView firstFighterDetailsView = new FighterDetailsView(fightEngine.getLeftFighter());
		add(firstFighterDetailsView, BorderLayout.WEST);

		FighterDetailsView secondFighterDetailsView = new FighterDetailsView(fightEngine.getRightFighter());
		add(secondFighterDetailsView, BorderLayout.EAST);

		FightArenaView fightArenaView = new FightArenaView(fightEngine);
		add(fightArenaView, BorderLayout.CENTER);

		FightControlController fightControlController = new FightControlController(fightEngine);
		FightControlView fightControlView = new FightControlView(fightEngine, fightControlController);

		add(fightControlView, BorderLayout.SOUTH);
	}

	@Override
	public void update(Observable fightEngine, Object arg1)
	{
		FightEngine fightEngineObserverable = (FightEngine) fightEngine;
		if (!fightEngineObserverable.isPlaying())
		{
			showFinishMessage(fightEngineObserverable.getWinner());
		}
		else  {
			if(!(fightEngineObserverable.getLeftCurrentAttack().equals(SAFConstants.ATTACK_TYPE_STAND) && fightEngineObserverable.getRightCurrentAttack().equals(SAFConstants.ATTACK_TYPE_STAND)))
			{
				fightEngineObserverable.playFightSound();
			}
		}
	}

	public void showFinishMessage(String winner)
	{
		JOptionPane.showMessageDialog(this, "Player " + winner + " has won");
	}

}
