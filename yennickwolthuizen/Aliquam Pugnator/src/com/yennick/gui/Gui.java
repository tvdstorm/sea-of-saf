package com.yennick.gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.yennick.fight.Engine;
import com.yennick.fighter.bot.Bot;

@SuppressWarnings("serial")
public class Gui extends JFrame {

	private final Engine engine;
	private final JPanel fightersP;
	private Bot homeFighter;
	private Bot challenger;
	private JButton start;
	
	public Gui(final Engine engine) {
		
		this.engine = engine;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(false);
		setSize(1024,768);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		//title
		JLabel title = new JLabel("Aliquam Pugnator");
		title.setAlignmentX(0.5f);
		title.setFont(new Font("Times", Font.BOLD, 34));
		add(title);
		
		//fighters panel
		fightersP = new JPanel();
		fightersP.setLayout(new BoxLayout(fightersP, BoxLayout.X_AXIS));
		fightersP.setPreferredSize(new Dimension(750, 300));
		
		add(fightersP);
		
		add(addButtons());
		pack();
		setVisible(true);
	}
	
	private void addFighter(String fighterName,boolean isChallenger){
		if(isChallenger){
			challenger = engine.setFighter(fighterName,isChallenger);	
		} else {
			homeFighter = engine.setFighter(fighterName, isChallenger);
		}
		
		//System.out.println(challenger.getFighterName());
		//System.out.println(homeFighter.getFighterName());
		
		JPanel fighter;
		fighter = (isChallenger)? showFighter(challenger) : showFighter(homeFighter);
//		System.out.println(fighter.toString());
		if(isChallenger){
			fightersP.add(fighter);
		} else {
			fightersP.add(fighter, 0);
		}
		
		checkStart();
	 	refresh();
	}
	
	private void checkStart(){
		if(homeFighter != null && challenger != null){
			start.setEnabled(true);
		} else {
			start.setEnabled(false);
		}
	}
	
	public void refresh(){
		
		ActionListener refresher = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

            	fightersP.revalidate();
        		fightersP.repaint();
            }
            };
		Timer timer = new Timer( 100 ,refresher);
        timer.setRepeats(true);
        timer.start();
	}
	
	private JPanel addButtons(){
		JPanel buttonPanel = new JPanel();
		
		//choose home fighter
		final JComboBox<String> homeFighterList = fighterList();
		
		homeFighterList.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	String fighterName = homeFighterList.getSelectedItem().toString();
		    	addFighter(fighterName,false);
		    	homeFighterList.setEnabled(false);
		    }
		});
		buttonPanel.add(new JLabel("HomeFighter: "));
		buttonPanel.add(homeFighterList);
		
		//Start fight button
		start = new JButton("Fight");
		start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(engine.getGameOverStatus()){
					start.setEnabled(false);
				} else {
					engine.fight();
				}
			}
		});
		
		start.setEnabled(false);
		buttonPanel.add(start);

		//choose challenger
		final JComboBox<String> challengerList = fighterList();
		
		challengerList.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
	 	    	String fighterName = challengerList.getSelectedItem().toString();
		    	addFighter(fighterName,true);
		    	challengerList.setEnabled(false);
		    }
		});
		
		buttonPanel.add(new JLabel("Challenger: "));
		buttonPanel.add(challengerList);

		return buttonPanel;
	}
	
	private JComboBox<String> fighterList(){
		JComboBox<String> fighterList = new JComboBox<String>(engine.fight.getFighters());
		fighterList.setSelectedIndex(0);
		
		return fighterList;
	}
	
	public JPanel showFighter(Bot fighter){
		
	//	System.out.println(fighter.toString());
		JPanel fPanel = new JPanel();
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));

		JLabel fighterName;
		if(fighter != null){
			 fighterName = new JLabel(fighter.getFighterName() );
			 infoPanel.add(fighterName);	
			 infoPanel.add(fighter.info());
			 
			 if(!fighter.isChallenger())fPanel.add(infoPanel);
				
			 JPanel fighterPanel = fighter.stickMan();
			 fPanel.add(fighterPanel);
				 
			 if(fighter.isChallenger())fPanel.add(infoPanel);	
			 
		} else {
			 System.out.println("fighter not found...");
		}
		return fPanel;
	}
}