package saf.game.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import saf.game.BotState;
import saf.game.GameEventListener;
import saf.game.event.EventSource;
import saf.game.gui.component.GameArena;
import saf.structure.Behavior;
import saf.structure.Characteristic;
import saf.structure.intelligence.BehaviorIntelligence;

public class GameController {

	private static final String CONST_LEFT = "left";
	private static final String CONST_RIGHT = "right";
	private String side;

	private final GameForm gameForm;
	private final GameArena gameArena;
	private final EventSource eventSource;
	private final DefaultListModel botLeftCharModel;
	private final DefaultListModel botLeftBehaviorModel;
	private final DefaultListModel botRightBehaviorModel;
	private final DefaultListModel botRightCharModel;

	public GameController(GameEventListener gameEventListener) {
		gameForm = new GameForm();
		gameForm.setVisible(true);

		gameArena = (GameArena) gameForm.jPanelGameArena;

		botLeftCharModel = new DefaultListModel();
		gameForm.jListBotLeftChars.setModel(botLeftCharModel);

		botLeftBehaviorModel = new DefaultListModel();
		gameForm.jListBotLeftBehaviors.setModel(botLeftBehaviorModel);

		botRightCharModel = new DefaultListModel();
		gameForm.jListBotRightChars.setModel(botRightCharModel);

		botRightBehaviorModel = new DefaultListModel();
		gameForm.jListBotRightBehaviors.setModel(botRightBehaviorModel);

		eventSource = new EventSource();
		eventSource.addEventListener(gameEventListener);

		gameForm.jButtonBotLeftLoad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				botFileActionPerformed(CONST_LEFT);
			}
		});

		gameForm.jButtonBotRightLoad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				botFileActionPerformed(CONST_RIGHT);
			}
		});
		gameForm.jButtonStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				eventSource.fireGameStartEvent();
			}
		});
		

	}

	private void botFileActionPerformed(String side) {
		JFileChooser jFileChooser = new JFileChooser();
		jFileChooser.showOpenDialog(null);
		File botfile = jFileChooser.getSelectedFile();
		if (botfile != null)
			eventSource.fireNewBotEvent(botfile.getPath(), side);
	}

	public void addGameEventListener(GameEventListener gameEventListener) {
		eventSource.addEventListener(gameEventListener);
	}

	public void displayMessage(String Msg) {
		JOptionPane.showMessageDialog(null, Msg);
	}

	public void setBot(BotState botState) {
		side = botState.getSide();

		if (side.equals(CONST_LEFT))
			gameForm.jLabelBotLeftName.setText(botState.getBot().getName());
		else
			gameForm.jLabelBotRightName.setText(botState.getBot().getName());

		if (side.equals(CONST_LEFT)) {
			botLeftCharModel.clear();
			for (Characteristic character : botState.getBot().getCharacteristics()) 
			{
				botLeftCharModel.addElement(character.getName() + " = " + character.getValue());
			}
		} else {
			botRightCharModel.clear();
			for (Characteristic character : botState.getBot().getCharacteristics()) 
			{
				botRightCharModel.addElement(character.getName() + " = " + character.getValue());
			}
		}

		if (side.equals(CONST_LEFT)) {
			botLeftBehaviorModel.clear();
			for (Behavior behavior : botState.getBot().getBehaviors()) {
			botLeftBehaviorModel.addElement(BehaviorIntelligence.toString(behavior));
			}
		} else {
			botRightBehaviorModel.clear();
			for (Behavior behavior : botState.getBot().getBehaviors()) {
			botRightBehaviorModel.addElement(BehaviorIntelligence.toString(behavior));
			}
		}
		
	}

	public void addBotState(BotState botState) {
		side = botState.getSide();

		setBot(botState);
		gameArena.createNewBot(side);
		// gameForm.repaint();
	}

	public void setJumping(BotState botState) {
		side = botState.getSide();

	}

	public void setHitpoints(BotState botState) {
		side = botState.getSide();

	}

	public void setDistance(int distance) {
		gameForm.jLabelDistance.setText(Integer.toString(distance));
	}

	public void displayWinnerMessage(String result) {
		// TODO Auto-generated method stub
		
	}

}
