package gui;

import javax.swing.*;

public class MenuScreen extends BaseScreen {

	private static final long serialVersionUID = 1L;
	private static final int START_BUTTON = 0;
	private static final int QUIT_BUTTON = 1;
	private SoundFile backgroundMusic;
	
	public MenuScreen(BaseFrame baseFrame) {
		super(baseFrame, "data\\textures\\menu_background.png");
	}

	@Override
	public void onInitialize() {
	 	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	 	
	 	backgroundMusic = new SoundFile();
	 	backgroundMusic.load("data\\audio\\menu_background.wav");
	 	//backgroundMusic.play();
	 	
	 	setBorder(BorderFactory.createEmptyBorder(220, 0, 0, 0));
	 	
	 	MenuButton startButton = new MenuButton("Start Game", START_BUTTON, this);
	 	MenuButton quitButton = new MenuButton("Quit Game", QUIT_BUTTON, this);
	 	add(startButton);
	 	add(quitButton);
	}

	@Override
	public void onDestroy() {
		backgroundMusic.unload();
	}

	@Override
	public void handleButtonPress(int buttonId) {
		// TODO Auto-generated method stub
		switch ( buttonId ) {
		case START_BUTTON: {
			//baseFrame->switchScreen(new GameScreen(baseFrame));
			getBaseFrame().switchScreen(new GameScreen(getBaseFrame()));
			break;
		}
		case QUIT_BUTTON: {
			getBaseFrame().destroy();
			break;
		}
		}
	}
	
	

}
