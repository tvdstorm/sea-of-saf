package game;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;

public class FightView extends JFrame implements Observer {
	
	FightEngine fightEngine;

	public FightView(FightEngine fightEngine) {
		FightMenuViewController menuController = new FightMenuViewController();
		FightMenuView menuBar = new FightMenuView(menuController);
		setJMenuBar(menuBar);
		setLayout(new BorderLayout());
		
		setTitle("SAF Fighter Vizualisation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fightEngine.addObserver(this);
		addComponentsToPane(this.getContentPane(), fightEngine);
		
		setSize(new Dimension(550, 400));
		setLocationRelativeTo(getRootPane()); //centers frame in the middle
		setResizable(false);
		setVisible(true);
	}

	private void addComponentsToPane(Container contentPane, FightEngine fightEngine) {
		this.fightEngine = fightEngine;
		
		FightProgressView fightProgressView = new FightProgressView(fightEngine);
		add(fightProgressView, BorderLayout.NORTH);
		
		FighterDetailsViewController firstFighterDetailsViewController = new FighterDetailsViewController(fightEngine);
		FighterDetailsView  firstFighterDetailsView = new FighterDetailsView(fightEngine.getLeftFighter(), firstFighterDetailsViewController);
		
		add(firstFighterDetailsView, BorderLayout.WEST);
		
		FighterDetailsViewController secondFighterDetailsViewController = new FighterDetailsViewController(fightEngine);
		FighterDetailsView  secondFighterDetailsView = new FighterDetailsView(fightEngine.getLeftFighter(), secondFighterDetailsViewController);
		
		add(secondFighterDetailsView, BorderLayout.EAST);
		
		FightArenaView fightArenaView = new FightArenaView(fightEngine);
		add(fightArenaView, BorderLayout.CENTER);
		
		FightControlController fightControlController = new FightControlController(fightEngine);
		FightControlView fightControlView = new FightControlView(fightControlController);
		
		add(fightControlView, BorderLayout.SOUTH);		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
	}

}
