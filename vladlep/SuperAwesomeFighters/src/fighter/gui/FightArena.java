package fighter.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import fighter.IFighter;
import fighter.algorithm.FighterDescription;
import fighter.messages.Message;

@SuppressWarnings("serial")
public class FightArena extends JFrame {
	private static FightArena singleton = null;
	private FighterDescription firstFighter;
	private FighterDescription secondFighter;
	private Container masterContainer;
	JPanel statusPanel;

	private FightArena(FighterDescription firstFighter, FighterDescription secondFighter) {
		this.firstFighter = firstFighter;
		this.secondFighter = secondFighter;
		setTitle(ArenaConstants.GAME_NAME);
		setSize(ArenaConstants.ARENA_WIDTH, ArenaConstants.ARENA_HEIGHT);
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

	public void intiArena() {
		singleton.drawComponents();
		singleton.setVisible(true);

	}

	private void drawComponents() {
		drawStatusPanel();
		drawScenePanel();

	}

	private void drawStatusPanel() {
		statusPanel = new JPanel();
		statusPanel.setLayout(new GridLayout(1, 2));
		statusPanel.add(new FighterStatus(firstFighter));
		statusPanel.add(new FighterStatus(secondFighter));

		masterContainer.add(statusPanel);
	}

	private void drawScenePanel() {

	}

	public void redrawComponents() {

	}

}
