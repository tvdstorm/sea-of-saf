package saf.game;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import saf.SAFLexer;
import saf.SAFParser;
import saf.ast.*;
import saf.utils.*;

public class Ring extends JFrame {

	private static final long serialVersionUID = 1L;
	private State fighter1State;
	private State fighter2State;
	private boolean blnGameOver;
	public boolean hasErrors;
	
	public Ring() throws IOException, RecognitionException, InterruptedException{
		
		blnGameOver = false;
		hasErrors = false;
		
		//Get fighters
		Bot fighter1 = GetFighter(Config.FighterPath + "fighter1.saf");
		Bot fighter2 = GetFighter(Config.FighterPath + "fighter2.saf");
	
	   //fighter states
	    fighter1State = new State(fighter1, 0);
	    fighter2State = new State(fighter2, Config.INITIALPOSITION);
	    
	    LoadGraphics();
	    if(!hasErrors) {
	    	Thread.sleep(30);
	    	start();
	    }
	    
	}
	
	public void start() throws InterruptedException{
		
		while(true){
	    	
	    	fighter1State = fighter1State.getNextState(fighter2State);
	    	fighter2State = fighter2State.getNextState(fighter1State);
	    	fighter1State.Fight(fighter2State);
	    	
	    	//exit condition
	    	if(fighter1State.getHealth() <= 0 || fighter2State.getHealth() <= 0) {
	    		blnGameOver = true;
	    		break;
	    	}
	    	
	    	LoadGraphics();
	    	if(!blnGameOver) Thread.sleep(30);
	    }
		
		//Load the graphics with final updates
		LoadGraphics();

	}
	
	private void LoadGraphics(){
	
		ClearPanelContent();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
	    container.add(Box.createRigidArea(new Dimension(fighter1State.getPosition(),0)));
        container.add(GetFighterPanel(fighter1State));
        int position = fighter2State.getPosition() - fighter1State.getPosition();
	    container.add(Box.createRigidArea(new Dimension(position,0)));
	    container.add(GetFighterPanel(fighter2State));
        container.setBackground(Color.white);
        setTitle("Super Awsome Fighters");
        setSize(800,600);
        setLocation(100,100);
        setVisible(true);
        repaint();
	}
	
	private void ClearPanelContent(){
		Container container = getContentPane();
		Component[] components = container.getComponents();
		for(Component c: components){
			container.remove(c);
		}
	}
	
	public Bot GetFighter(String filePath) throws IOException, RecognitionException{
		
		CharStream charStream = new ANTLRFileStream(filePath) ;
		SAFLexer lexer = new SAFLexer(charStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser parser = new SAFParser(tokenStream);
		Bot fighter = parser.bot();
		return fighter;
		
	}

	private JEditorPane getErrorMessagePanel(List<String> errMessages, State state){
		
		String msg = String.format("<b> %s </b><br>", state.getFighter().getName());
		
		for (String error : errMessages) {
			msg += String.format("%s <br>", error);
		}
		
		JEditorPane  area = new JEditorPane("text/html","");
		area.setText(msg);
		area.setEditable(false);
		return area;
	}
	
	public JPanel GetFighterPanel(State state){
	
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		List<String> errMessages = state.getErrorMessages();
		
		if(errMessages.size() > 0){	
			hasErrors =  hasErrors || true;
			panel.add(getErrorMessagePanel(errMessages,state));
		}
		else{
			
			JLabel healthPoint = new JLabel(String.format("Health point : %s", state.getHealth()));
			panel.add(healthPoint);
			JLabel fighterName = new JLabel(state.getFighter().getName());
			panel.add(fighterName);
			JLabel labelImage = new JLabel(new ImageIcon(Helper.getImage(state)));
			
		  	addGameOverGraphics(panel, state, labelImage);
			if(!blnGameOver) panel.add(labelImage);
			
		}
		
        return panel;
        
	}
	
	public void addGameOverGraphics(JPanel panel, State state, JLabel labelImage){
		
		if(blnGameOver){
			String labelText = "Winnnnnnnnnnnnner";
			JLabel gameOverLabel = new JLabel();
			labelImage = new JLabel(new ImageIcon(Helper.getImageByName("winner")));
			gameOverLabel.setFont(new Font("Comic", Font.BOLD, 16));
			gameOverLabel.setForeground(Color.GREEN);
			
			if(state.getHealth() <= 0 ) {
				labelText = "Loooooooooooooooser";
				gameOverLabel.setForeground(Color.RED);
				labelImage = new JLabel(new ImageIcon(Helper.getImageByName("loser")));
			}
			gameOverLabel.setText(labelText);
			panel.add(gameOverLabel);
			panel.add(labelImage);
		}
		
	}
		
	
}
