package gui;

import java.io.File;
import java.util.ArrayList;

import javax.swing.*;

public class GameScreen extends BaseScreen {

	private static final long serialVersionUID = 1L;
	private static final int FIGHT_BUTTON = 0;
	private static final int RETURN_BUTTON = 1;
	private SoundFile backgroundMusic;
	
	public GameScreen(BaseFrame baseFrame) {
		super(baseFrame, "data\\textures\\game_background.png");
	}

	@Override
	public void onInitialize() {
	 	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	 	
	 	backgroundMusic = new SoundFile();
	 	backgroundMusic.load("data\\audio\\game_background.wav");
	 	//backgroundMusic.play();
	 	
	 	MenuButton fightButton = new MenuButton("Fight!", FIGHT_BUTTON, this);
	 	MenuButton returnButton = new MenuButton("Return to Menu", RETURN_BUTTON, this);
	 	add(fightButton);
	 	add(returnButton);
	 	
	 	//String[] bla = { "bla bla bla", "hmm ok" };
	 	ArrayList<String> fighters = new ArrayList<String>();
	 	
	 	//Directory directory;
	 	
	 	File directory = new File("data\\fighters\\");
	    File files[] = directory.listFiles();
	    for (File f : files) {
	    // do whatever you want with each File f
	    	fighters.add(f.getName());
	    }
	    
	    String []strArray = new String[fighters.size()];
	    fighters.toArray(strArray);
	 	
	 	JList boxie = new JList();
	 	boxie.setListData(strArray);

	 	boxie.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	 	boxie.setVisibleRowCount(1);
	 	
	 	boxie.setSize(120, 20);
	 	add(boxie);
	 	
	}

	@Override
	public void onDestroy() {
		backgroundMusic.unload();
	}

	@Override
	public void handleButtonPress(int buttonId) {
		switch ( buttonId ) {
		case FIGHT_BUTTON: {
			break;
		}
		case RETURN_BUTTON: {
			getBaseFrame().switchScreen(new MenuScreen(getBaseFrame()));
			break;
		}
		}
	}

}
