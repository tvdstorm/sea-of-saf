package saf.game.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import saf.game.GameEventListener;
import saf.game.event.source.EventSource;
import saf.structure.Behavior;
import saf.structure.Bot;
import saf.structure.Characteristic;
import saf.structure.intelligence.BehaviorIntelligence;

public class GameController {

	public GameController() {
		gameForm = new GameForm();
		
		botOneCharModel = new DefaultListModel();
		gameForm.jListBotOneChars.setModel(botOneCharModel);

		botOneBehaviorModel = new DefaultListModel();
		gameForm.jListBotOneBehaviors.setModel(botOneBehaviorModel);

		botTwoCharModel = new DefaultListModel();
		gameForm.jListBotTwoChars.setModel(botTwoCharModel);
		
		botTwoBehaviorModel = new DefaultListModel();
		gameForm.jListBotTwoBehaviors.setModel(botTwoBehaviorModel);
		
		
		eventSource = new EventSource();
		
		gameForm.jButtonBotOneLoad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BotFileActionPerformed(true);
			}
		});
		
		gameForm.jButtonBotTwoLoad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BotFileActionPerformed(false);
			}
		});
		
	}

	
	
	private final GameForm gameForm;
	private final EventSource eventSource;
	private final DefaultListModel botOneCharModel;
	private final DefaultListModel botOneBehaviorModel;
	private final DefaultListModel botTwoBehaviorModel;
	private final DefaultListModel botTwoCharModel;

	private void BotFileActionPerformed(boolean IsBotOne)
	{
		JFileChooser jFileChooser = new JFileChooser();
		jFileChooser.showOpenDialog(null);
		File botfile = jFileChooser.getSelectedFile();
		if(botfile != null)
			eventSource.fireEvent(botfile.getPath(), false);
	}
	
	public void addGameEventListener(GameEventListener gameEventListener)
	{
		eventSource.addEventListener(gameEventListener);
	}
	
	public void DisplayMessage(String Msg)
	{
		JOptionPane.showMessageDialog(null, Msg);
	}

	public void setBotOne(Bot bot) {
		gameForm.jLabelBotOneName.setText(bot.getName());
		
		botOneCharModel.clear();
		for (Characteristic character : bot.getCharacteristics()) {
			botOneCharModel.addElement(character.getName() + " = " + character.getValue());				
		}
		
		botOneBehaviorModel.clear();
		for (Behavior behavior : bot.getBehaviors()) {
			botOneBehaviorModel.addElement(BehaviorIntelligence.ToString(behavior));	
		}
		
		InitBot();
	}

	public void setBotTwo(Bot bot) {
		gameForm.jLabelBotTwoName.setText(bot.getName());
		
		botTwoCharModel.clear();
		for (Characteristic character : bot.getCharacteristics()) {
			botTwoCharModel.addElement(character.getName() + " = " + character.getValue());				
		}
		
		botTwoBehaviorModel.clear();
		for (Behavior behavior : bot.getBehaviors()) {
			botTwoBehaviorModel.addElement(BehaviorIntelligence.ToString(behavior));	
		}
	}

	public void InitBot()
	{
		ImageIcon imageIcon = new ImageIcon("Sprites/Light/block_high.png");
	}
}
