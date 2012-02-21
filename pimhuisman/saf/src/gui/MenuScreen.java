package gui;

import java.awt.Graphics;
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
	protected void onInitialize() {
	 	setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
	 	
	 	backgroundMusic = new SoundFile();
	 	backgroundMusic.load("data\\audio\\menu_background.wav");
	 	backgroundMusic.play();
	 	
	 	setBorder(BorderFactory.createEmptyBorder(220, 0, 0, 0));
	 	
	 	MenuButton startButton = new MenuButton("Start Game", START_BUTTON, this);
	 	MenuButton quitButton = new MenuButton("Quit Game", QUIT_BUTTON, this);
	 	add(startButton);
	 	add(quitButton);
	}
	
	@Override
	protected void onDraw(Graphics g) {
				
	}
	
	@Override
	protected boolean onUpdate() {
		return true;
	}
	
	@Override
	protected void onDestroy() {
		backgroundMusic.unload();
	}

	@Override
	protected void handleButtonPress(int buttonId) {
		switch ( buttonId ) {
		case START_BUTTON: {
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
