package saf.game.gui;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import saf.game.GameEventListener;
import saf.game.event.EventSource;
import saf.game.gui.component.GameArena;
import saf.game.state.BotState;
import saf.structure.Behavior;
import saf.structure.Characteristic;

public class GameController {

	private static final String CONST_LEFT = "left";
	private static final String CONST_RIGHT = "right";
	private String side;

	private final GameForm gameForm;
	private GameArena gameArena;
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

	private void setBot(BotState botState) {
		side = botState.getSide();

		if (side.equals(CONST_LEFT))
		{
			gameForm.jLabelBotLeftName.setText(botState.getBot().getName());
			gameForm.jProgressBarLeftHP.setValue(botState.getHitpoints());
			
			botLeftCharModel.clear();
			for (Characteristic character : botState.getBot().getCharacteristics()) 
			{
				botLeftCharModel.addElement(character.getName() + " = " + character.getValue());
			}
			
			botLeftBehaviorModel.clear();
			for (Behavior behavior : botState.getBot().getBehaviors()) {
				botLeftBehaviorModel.addElement(behavior.toString());
			}
		}
		else
		{
			gameForm.jLabelBotRightName.setText(botState.getBot().getName());
			gameForm.jProgressBarRightHP.setValue(botState.getHitpoints());
			
			botRightCharModel.clear();
			for (Characteristic character : botState.getBot().getCharacteristics()) 
			{
				botRightCharModel.addElement(character.getName() + " = " + character.getValue());
			}
			
			botRightBehaviorModel.clear();
			for (Behavior behavior : botState.getBot().getBehaviors()) {
				botRightBehaviorModel.addElement(behavior.toString());
			}
		}
		
	}

	public void addBotState(BotState botState) {
		side = botState.getSide();

		setBot(botState);
		gameArena.createNewBot(side);
	}


	public void setHitpoints(BotState botState) {
		side = botState.getSide();
		
		if(side.equals(CONST_LEFT))
			gameForm.jProgressBarLeftHP.setValue(botState.getHitpoints());
		else
			gameForm.jProgressBarRightHP.setValue(botState.getHitpoints());
	}

	public void setDistance(int distance) {
		gameForm.jProgressBarDistance.setValue(distance);
	}
	
	public void executeActions(String side, Point dPosition, String fightAction)
	{
		this.gameArena.updateBot(side, dPosition, fightAction);
	}
	public void disableButtons() {
		gameForm.jButtonBotLeftLoad.setEnabled(false);
		gameForm.jButtonBotRightLoad.setEnabled(false);
		gameForm.jButtonStart.setEnabled(false);
		
	}

}
