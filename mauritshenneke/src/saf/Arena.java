package saf;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import saf.evaluators.Bot;
import saf.evaluators.MoveActionIntelligence;

public class Arena{
	private String[] botFileNames;
	private JComboBox fighterASelectField;
	private JComboBox fighterBSelectField;
	
	private int leftWallPosition;
	private int rightWallPosition;

	private Game controller;
	
	public Arena(Game gameController, String[] fileNames) {
		controller = gameController;
		botFileNames = fileNames;
		build();
	}
	
	public void build() {
		JFrame frame = new JFrame();
		
		frame.setTitle("Super Awesome Fighter Arena");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 470, 300);
        
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        
        frame.setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel labelA = new JLabel("Fighter A");
        labelA.setBounds(10, 11, 76, 14);
        contentPane.add(labelA);
        
        fighterASelectField = new JComboBox(botFileNames);
        fighterASelectField.setBounds(86, 8, 267, 20);
        fighterASelectField.setSelectedIndex(0);
        contentPane.add(fighterASelectField);
        
        JLabel labelB = new JLabel("Fighter B");
        labelB.setBounds(10, 36, 76, 14);
        contentPane.add(labelB);
        
        fighterBSelectField = new JComboBox(botFileNames);
        fighterBSelectField.setBounds(86, 33, 267, 20);
        fighterBSelectField.setSelectedIndex(0);
        contentPane.add(fighterBSelectField);
        
        JButton fightButton = new JButton("Fight!");
        fightButton.addActionListener(onFightButtonClickedEventHandler());
        fightButton.setBounds(363, 8, 89, 46);
        contentPane.add(fightButton);
        
        frame.setVisible(true);
	}

	public String getFighterASelectFieldValue(){
		return (String) fighterASelectField.getSelectedItem();
	}

	public String getFighterBSelectFieldValue(){
		return (String) fighterBSelectField.getSelectedItem();
	}
	
	private ActionListener onFightButtonClickedEventHandler(){
		return new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            controller.beginFight();
	        }
		};
	}

	public void addText(String victorText) {
		// TODO Auto-generated method stub
		
	}
	
	public void setLeftWallPosition(int leftWallPosition) {
		this.leftWallPosition = leftWallPosition;
	}

	public void setRightWallPosition(int rightWallPosition) {
		this.rightWallPosition = rightWallPosition;
	}

	
	public boolean positionChangeAllowed(Bot bot, MoveActionIntelligence moveActionIntelligence) {
		int newBotPosition = bot.getPosition() + moveActionIntelligence.getPositionChange();
		return  !(newBotPosition <= leftWallPosition) || !(newBotPosition >= rightWallPosition);
	}
}
