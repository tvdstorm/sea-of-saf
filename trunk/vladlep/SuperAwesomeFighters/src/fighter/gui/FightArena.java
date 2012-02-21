package fighter.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import fighter.algorithm.FighterDescription;
import fighter.algorithm.ScenePanel;

@SuppressWarnings("serial")
public class FightArena extends JFrame {
	private static FightArena singleton = null;
	public static FightArena getFightArena(FighterDescription firstFighter,
			FighterDescription secondFighter) {
		if (singleton == null)
			singleton = new FightArena(firstFighter, secondFighter);
		return singleton;

	}
	private FighterDescription firstFighter;
	private Container masterContainer;
	private JPanel scenePanel;
	private FighterDescription secondFighter;

	private JPanel statusPanel;

	private FightArena(FighterDescription firstFighter,
			FighterDescription secondFighter) {
		this.firstFighter = firstFighter;
		this.secondFighter = secondFighter;
		setTitle(ArenaConstants.GAME_NAME);
//		setSize(ArenaConstants.ARENA_WIDTH, ArenaConstants.ARENA_HEIGHT);
		masterContainer = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setResizable(false);
	}

	private void drawComponents() {
		masterContainer.setLayout(new BorderLayout());
		drawStatusPanel();
		drawScenePanel();
		masterContainer.repaint();
		masterContainer.validate();

	}

	private void drawScenePanel() {
		scenePanel = new ScenePanel(firstFighter,secondFighter);
		scenePanel.setSize(ArenaConstants.ARENA_WIDTH,
				ArenaConstants.ARENA_HEIGHT);
//		masterContainer.add(scenePanel);
	
	}

	private void drawStatusPanel() {
		statusPanel = new JPanel();
		statusPanel.setLayout(new GridLayout(1, 2));
		statusPanel.add(new FighterStatus(firstFighter));
		statusPanel.add(new FighterStatus(secondFighter));

		masterContainer.add(statusPanel);
	}

	public void intiArena() {
		singleton.drawComponents();
		singleton.pack();
		singleton.setVisible(true);

	}

	public void redrawComponents() {

	}

}
