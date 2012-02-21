package gui;

import java.awt.Graphics;
import javax.swing.*;

import logic.FightSimulation;

public class GameScreen extends BaseScreen {

	private static final long serialVersionUID = 1L;
	private static final int FIGHT_BUTTON = 0;
	private static final int RETURN_BUTTON = 1;
	private SoundFile backgroundMusic;
	
	MenuButton fightButton;
	MenuButton returnButton;
	private FightSimulation simulation;
	
	public GameScreen(BaseFrame baseFrame) {
		super(baseFrame, "data\\textures\\game_background.png");
		simulation = null;
		fightButton = null;
		returnButton = null;
	}

	@Override
	protected void onInitialize() {
	 	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	 	
	 	backgroundMusic = new SoundFile();
	 	backgroundMusic.load("data\\audio\\game_background.wav");
	 	backgroundMusic.play();
	 	
	 	fightButton = new MenuButton("Fight!", FIGHT_BUTTON, this);
	 	returnButton = new MenuButton("Return to Menu", RETURN_BUTTON, this);
	 	add(fightButton);
	 	add(returnButton);
	 	
	 	/*ArrayList<String> fighters = new ArrayList<String>();
	 	File directory = new File("data\\fighters\\");
	    File files[] = directory.listFiles();
	    for (File f : files) {
	    	fighters.add(f.getName());
	    }
	    
	    String []strArray = new String[fighters.size()];
	    fighters.toArray(strArray);
	 	
	 	JList boxie = new JList();
	 	boxie.setListData(strArray);

	 	boxie.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	 	boxie.setVisibleRowCount(1);
	 	
	 	boxie.setSize(120, 20);
	 	add(boxie);*/
	 	
	 	simulation = new FightSimulation();
	}
	
	@Override
	protected boolean onUpdate() {
		if ( simulation != null ) {
			return simulation.update();
		}
		return true;
	}
	
	@Override
	protected void onDraw(Graphics g) {
		if ( simulation != null ) {
			simulation.draw(g);
		}
	}

	@Override
	protected void onDestroy() {
		backgroundMusic.unload();
	}

	@Override
	protected void handleButtonPress(int buttonId) {
		switch ( buttonId ) {
		case FIGHT_BUTTON: {
			if ( simulation.isMatchStarted() ) {
				simulation.stop();
				fightButton.setText("Fight!");				
			} else {
				simulation.start();
				fightButton.setText("Stop!");
			}
			break;
		}
		case RETURN_BUTTON: {
			getBaseFrame().switchScreen(new MenuScreen(getBaseFrame()));
			break;
		}
		}
	}

}
