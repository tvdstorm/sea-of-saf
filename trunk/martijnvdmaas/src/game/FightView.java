package game;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class FightView extends JFrame{
	
	FightEngine fightEngine;

	public FightView(FightEngine fightManager) {
		FightMenuViewController menuController = new FightMenuViewController();
		FightMenuView menuBar = new FightMenuView(menuController);
		setJMenuBar(menuBar);
		setLayout(new BorderLayout());
		
		setTitle("SAF Fighter Vizualisation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		addComponentsToPane(this.getContentPane(), fightManager);
	
		setSize(new Dimension(550, 600));
		setLocationRelativeTo(getRootPane()); //centers frame in the middle
		setResizable(false);
		setVisible(true);
	}

	private void addComponentsToPane(Container contentPane, FightEngine fightEngine) {
		this.fightEngine = fightEngine;
		
		FighterDetailsViewController firstFighterDetailsViewController = new FighterDetailsViewController();
		FighterDetailsView  firstFighterDetailsView = new FighterDetailsView(fightEngine.getFirstFighter(), firstFighterDetailsViewController);
		
		add(firstFighterDetailsView, BorderLayout.WEST);
		
		FighterDetailsViewController secondFighterDetailsViewController = new FighterDetailsViewController();
		FighterDetailsView  secondFighterDetailsView = new FighterDetailsView(fightEngine.getFirstFighter(), secondFighterDetailsViewController);
		
		add(secondFighterDetailsView, BorderLayout.EAST);
		
		FightArenaView fightArenaView = new FightArenaView();
		add(fightArenaView);
		
		FightControlController fightControlController = new FightControlController(fightEngine);
		FightControlView fightControlView = new FightControlView(fightControlController);
		
		add(fightControlView, BorderLayout.SOUTH);		
	}

}
