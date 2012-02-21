package fighter.gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import fighter.IFighter;
import fighter.messages.Message;

@SuppressWarnings("serial")
public class FightArena extends JFrame {
	private static FightArena singleton = null;
	private IFighter firstFighter;
	private IFighter secondFighter;
	private Container masterContainer;

	private FightArena(IFighter firstFighter, IFighter secondFighter) {
		this.firstFighter = firstFighter;
		this.secondFighter = secondFighter;
		setTitle(ArenaConstants.GAME_NAME);
		setSize(ArenaConstants.ARENA_WIDTH, ArenaConstants.ARENA_HEIGHT);
		masterContainer = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}

	public static FightArena initGui(IFighter firstFighter,
			IFighter secondFighter) {
		if (singleton == null)
			singleton = new FightArena(firstFighter, secondFighter);
		return singleton;

	}

	public static void startGame() {
		singleton.drawComponents();
		singleton.setVisible(true);

	}

	private void drawComponents() {
		drawStatusPanel();
		

	}

	private void drawStatusPanel() {
		JPanel statusPanel = new JPanel();
		statusPanel.setLayout(new GridLayout(1, 2));
		statusPanel.add(new FighterStatus(firstFighter));
		statusPanel.add(new FighterStatus(secondFighter));

		masterContainer.add(statusPanel);
	}

}
