package com.yennick.fighter.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.yennick.fight.Fight;
import com.yennick.fighter.bot.Bot;

@SuppressWarnings("serial")
public class Gui extends JFrame {

	private final Fight fight;
	private  Bot fighter;
	
	public Gui() {
		
		fight = new Fight();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("fighter1" +" VS " + "fighter2");
		
		setResizable(true);
		setSize(1024,768);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		add(Box.createHorizontalGlue());

		JLabel title = new JLabel("Aliquam Pugnator");
		title.setAlignmentX(0.5f);
		title.setFont(new Font("Times", Font.BOLD, 34));
		add(title);
			
		JPanel fighters = new JPanel();
		fighters.setLayout(new BoxLayout(fighters, BoxLayout.X_AXIS));
		
		
		Bot fighterOne = fight.getFighter("JackieChan");
		JPanel fighter1 = showFighter(fighterOne, false);
		fighter1.setAlignmentX(0.5f);
		fighter1.setBorder(BorderFactory.createLineBorder(Color.black));
		fighters.add(fighter1);
		
		Bot fighterTwo = fight.getFighter("Chicken");
		JPanel fighter2 = showFighter(fighterTwo, true);
		fighter2.setAlignmentX(0.5f);
		fighter2.setBorder(BorderFactory.createLineBorder(Color.black));
		fighters.add(fighter2);
		
		add(fighters);
		
		pack();
		setVisible(true);
	}
	
	public JPanel showFighter(Bot fighter, boolean challenger){
		
		this.fighter = fighter;
		JPanel fPanel = new JPanel();
		JLabel fighterName = new JLabel("Fighter Not found");
			if(fighter != null){
				 fighterName = new JLabel(fighter.getFighterName());
				 fPanel.add(fighterName);	
				 JPanel fighterPanel = this.buildFighter(challenger);
				 fPanel.add(fighterPanel); 
				 
			} else {
				JOptionPane.showMessageDialog(getContentPane(), "Fighter not found \nUse other fighter.");
				
				//close program
				setVisible(false); 
				dispose();
				System.exit(0);
			}
		
		return fPanel;
	}
	
	public JPanel buildFighter(boolean challenger) {
		StickMan stickMan = new StickMan(fighter.getHeight(),challenger);
		
		JPanel fighter = new JPanel();
	    fighter.add(stickMan);
	    
	    stickMan.kick(true);
	    return fighter;
	}
}
