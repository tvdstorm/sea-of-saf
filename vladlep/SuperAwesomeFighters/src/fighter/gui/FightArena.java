package fighter.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import fighter.algorithm.FighterDescription;

@SuppressWarnings("serial")
public class FightArena extends JFrame {
	private static FightArena singleton = null;
	private static final int WIDTH_FRAME = ArenaConstants.ARENA_WIDTH;
	private static final int HEIGHT_FRAME = ArenaConstants.ARENA_HEIGHT + 50;

	private FighterDescription firstFighter;
	private Container masterContainer;
	private ScenePanel scenePanel;
	private FighterDescription secondFighter;
	private StatusPanel statusPanel;

	private FightArena(FighterDescription firstFighter,
			FighterDescription secondFighter) {
		this.firstFighter = firstFighter;
		this.secondFighter = secondFighter;
		setTitle(ArenaConstants.GAME_NAME);
		setSize(WIDTH_FRAME, HEIGHT_FRAME);
		masterContainer = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}

	public static FightArena getFightArena(FighterDescription firstFighter,
			FighterDescription secondFighter) {
		if (singleton == null)
			singleton = new FightArena(firstFighter, secondFighter);
		return singleton;

	}

	private void drawComponents() {
		masterContainer.setLayout(new BorderLayout());
		drawStatusPanel();
		drawScenePanel();
		masterContainer.repaint();
		masterContainer.validate();

	}

	private void drawScenePanel() {
		scenePanel = new ScenePanel(firstFighter.getFighterState(),
				secondFighter.getFighterState());
		masterContainer.add(scenePanel, BorderLayout.CENTER);

	}

	private void drawStatusPanel() {
		statusPanel = new StatusPanel(firstFighter, secondFighter);
		masterContainer.add(statusPanel, BorderLayout.NORTH);
	}

	public void intiArena() {
		singleton.drawComponents();
		singleton.setVisible(true);
	}

	public void showWinner(String name) {
		JOptionPane.showMessageDialog(singleton, "WINNER : " + name);
	}
}
