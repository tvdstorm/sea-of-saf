package saf.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import saf.ast.Bot;
import saf.fight.action.SideEnum;
import saf.fight.animation.Fighting;
import saf.fight.animation.Status;
import saf.fight.validate.ValidateCondition;
import saf.message.dialog.ErrorDialog;
import saf.parser.SAFParser;
import saf.visitor.FighterPrinter;
import saf.visitor.TypeChecker;

public class Panel extends JPanel {
	private JLabel lHPJLabel, rHPJLabel, timeJLabel, lFighterNameJLabel, rFighterNameJLabel; 
	private JProgressBar lHPProgressBar, rHPProgressBar; 
	private	JScrollPane lPropertiesScrollPane, lBehaviourScrollPane, rPropertiesScrollPane, rBehaviourScrollPane;
	private JButton controlJButton, reloadJButton;
	private JTextArea rBehaviourJTextArea,  rPropertiesJTextArea;
	private JTextArea lBehaviourJTextArea, lPropertiesJTextArea;
	private FightAreaComponent fac;
	private Bot lFighter, rFighter;
	private Timer lTimer, rTimer;
	private int rHP, lHP;
	private Status lSAFStatus, rSAFStatus;
	private Fighting lSAFFight, rSAFFight;
	private ValidateCondition lSAFCondCheck, rSAFCondCheck;
	private ErrorDialog safErrorDialog; 
	
	private final Point lStartPosition = new Point(7, 350), rStartPosition = new Point(461, 350);
	private final int lBoundX = 7, rBoundX = 461, minDistance = 65;
	private final int healthValue = 100;
	private final String startImg = "stand.png";
	/**
	 * Create the panel.
	 */
	public Panel() {
		setSize(1200, 800);
		setBorder(new EmptyBorder(20, 20, 20, 20));
		initialSAFPanel();
		addActionListenerToControlButton();
		addActionListenerToReloadButton();
	}
	
	private void initialSAFPanel()
	{
		safErrorDialog = new ErrorDialog();
		
		initialSAFS();
		initialJLabels();
		initialJProgressBars();
		initialJTextAreas();
		initialJButtons();
		initialFightAreaComponent();
		
		GroupLayout gl_safPane = new GroupLayout(this);
		gl_safPane.setHorizontalGroup(
			gl_safPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_safPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_safPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_safPane.createSequentialGroup()
							.addComponent(lFighterNameJLabel)
							.addPreferredGap(ComponentPlacement.RELATED, 1140, Short.MAX_VALUE)
							.addComponent(rFighterNameJLabel))
						.addGroup(gl_safPane.createSequentialGroup()
							.addGroup(gl_safPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lBehaviourScrollPane)
								.addComponent(lPropertiesScrollPane, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
							.addGap(18)
							.addComponent(fac, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
							.addGap(18)
							.addGroup(gl_safPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_safPane.createSequentialGroup()
									.addComponent(rBehaviourScrollPane, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
									.addGap(0))
								.addComponent(rPropertiesScrollPane, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_safPane.createSequentialGroup()
							.addGroup(gl_safPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_safPane.createSequentialGroup()
									.addComponent(lHPJLabel)
									.addGap(18)
									.addComponent(lHPProgressBar, GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE))
								.addComponent(controlJButton))
							.addGap(18)
							.addComponent(timeJLabel)
							.addGap(18)
							.addGroup(gl_safPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_safPane.createSequentialGroup()
									.addComponent(rHPProgressBar, GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(rHPJLabel))
								.addComponent(reloadJButton))))
					.addContainerGap())
		);
		gl_safPane.setVerticalGroup(
			gl_safPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_safPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_safPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lHPJLabel)
						.addGroup(gl_safPane.createSequentialGroup()
							.addGap(2)
							.addGroup(gl_safPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rHPJLabel)
								.addGroup(gl_safPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(lHPProgressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(timeJLabel)
									.addComponent(rHPProgressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
					.addGap(31)
					.addGroup(gl_safPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lFighterNameJLabel)
						.addComponent(rFighterNameJLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_safPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_safPane.createSequentialGroup()
							.addGroup(gl_safPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(rPropertiesScrollPane, GroupLayout.PREFERRED_SIZE, 212, Short.MAX_VALUE)
								.addComponent(lPropertiesScrollPane, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
							.addGap(42)
							.addGroup(gl_safPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lBehaviourScrollPane, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
								.addComponent(rBehaviourScrollPane, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)))
						.addComponent(fac, GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
					.addGap(33)
					.addGroup(gl_safPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(reloadJButton)
						.addComponent(controlJButton))
					.addContainerGap())
		);
		setLayout(gl_safPane);
	}
	
	private void initialSAFS()
	{
		lFighter = getFighter("/LeftFighter.txt");
		rFighter = getFighter("/RightFighter.txt");
			
		if (!(getTypeCheckResult(lFighter).isEmpty()) || !(getTypeCheckResult(rFighter).isEmpty()))
		{
			safErrorDialog.setErrorMessage(getTypeCheckResult(lFighter) + getTypeCheckResult(rFighter));
			safErrorDialog.setVisible(true);
		}
			
		lSAFFight = new Fighting(lFighter, lStartPosition, startImg, SideEnum.valueOf("left"));
		rSAFFight = new Fighting(rFighter, rStartPosition, startImg, SideEnum.valueOf("right"));
			
		lSAFStatus = lSAFFight.getSAFStatus();
		rSAFStatus = rSAFFight.getSAFStatus();
			
		lSAFCondCheck = new ValidateCondition(healthValue, lStartPosition, rStartPosition);
		rSAFCondCheck = new ValidateCondition(healthValue, lStartPosition, rStartPosition);
	}
	
	private void initialJLabels()
	{
		lHPJLabel= new JLabel("HP");
		rHPJLabel = new JLabel("HP");
		timeJLabel = new JLabel("VS");
		lFighterNameJLabel = new JLabel(lFighter.getName());
		rFighterNameJLabel = new JLabel(rFighter.getName());
	}
	
	private void initialJProgressBars()
	{
		lHPProgressBar = new JProgressBar();
		lHPProgressBar.setValue(healthValue);
		lHPProgressBar.setBackground(Color.WHITE);
		lHPProgressBar.setForeground(Color.GREEN);
		
		rHPProgressBar = new JProgressBar();
		rHPProgressBar.setValue(healthValue);
		rHPProgressBar.setBackground(Color.WHITE);
		rHPProgressBar.setForeground(Color.GREEN);
	}
	
	private void initialJTextAreas()
	{
		lPropertiesScrollPane = new JScrollPane();
		lPropertiesJTextArea = new JTextArea();
		lPropertiesJTextArea.setEditable(false);
		lPropertiesJTextArea.setText(getSAFPersonality(lFighter));
		lPropertiesScrollPane.setViewportView(lPropertiesJTextArea);
		
		lBehaviourScrollPane = new JScrollPane();
		lBehaviourJTextArea = new JTextArea();
		lBehaviourJTextArea.setEditable(false);
		lBehaviourJTextArea.setLineWrap(true);
		lBehaviourJTextArea.setWrapStyleWord(true);
		lBehaviourJTextArea.setText(getSAFBehaviour(lFighter));
		lBehaviourScrollPane.setViewportView(lBehaviourJTextArea);
		
		
		rPropertiesScrollPane = new JScrollPane();
		rPropertiesJTextArea = new JTextArea();
		rPropertiesJTextArea.setEditable(false);
		rPropertiesJTextArea.setText(getSAFPersonality(rFighter));
		rPropertiesScrollPane.setViewportView(rPropertiesJTextArea);
		
		rBehaviourScrollPane = new JScrollPane();
		rBehaviourJTextArea = new JTextArea();
		rBehaviourJTextArea.setEditable(false);
		rBehaviourJTextArea.setEditable(false);
		rBehaviourJTextArea.setLineWrap(true);
		rBehaviourJTextArea.setText(getSAFBehaviour(rFighter));
		rBehaviourScrollPane.setViewportView(rBehaviourJTextArea);
	}
	
	private String getSAFPersonality(Bot fighter)
	{
		String tempS = "";
		FighterPrinter fPrinter = new FighterPrinter();
		fighter.accept(fPrinter);
		for (String s : fPrinter.getPersonalities())
			tempS += s + "\n";
		return tempS;
	}
	
	private String getSAFBehaviour(Bot fighter)
	{
		String tempS = "";
		FighterPrinter fPrinter = new FighterPrinter();
		fighter.accept(fPrinter);
		for (String s : fPrinter.getBehaviours())
			tempS += s + "\n";
		tempS = tempS.replace("(", "");
		tempS = tempS.replace(")", "");
		tempS = tempS.replace("[", "(");
		tempS = tempS.replace("]", ")");
		tempS = tempS.replace("{", "[");
		tempS = tempS.replace("}", "]");
		return tempS; 
	}
	
	private void initialJButtons()
	{
		controlJButton = new JButton("Ready");
		reloadJButton = new JButton("Try Again");
	}
	
	private void initialFightAreaComponent()
	{
		fac = new FightAreaComponent(lSAFStatus.getFightStatus().getImage(), lStartPosition, rSAFStatus.getFightStatus().getImage(), rStartPosition);
		fac.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	private void addActionListenerToControlButton(){
		int delay = 400;
		
		Animation updateAnimation = new Animation();
		
		lTimer = new Timer(setDelay(delay, lSAFStatus.getSpeed()), updateAnimation);
        rTimer = new Timer(setDelay(delay, rSAFStatus.getSpeed()), updateAnimation);
        
        controlJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (lTimer.isRunning() && rTimer.isRunning()) {
                    lTimer.stop();
                    rTimer.stop();
                    controlJButton.setText("Go");
                } else if (controlJButton.getText() != "End") {
                    lTimer.start();
                    rTimer.start();
                    controlJButton.setText("Pause");
                }
            }
        });
	}
	
	private int setDelay(int delay, double speed)
	{
		if (speed!=0.0)
			return (int)(delay/speed);
		return delay;
	}
	
	private void addActionListenerToReloadButton(){
		reloadJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	removeAll();
            	initialSAFPanel();
            	addActionListenerToControlButton();
            	addActionListenerToReloadButton();
            }
        });
	}
		
	private Bot getFighter(String fileName){
		Bot fighter = null;
		try {
			InputStream is = getClass().getResourceAsStream(fileName);
			SAFParser lSAFParser = new SAFParser(is);
			fighter = lSAFParser.StartParser();
			is.close();
		} catch (Exception e) {
			safErrorDialog.setErrorMessage(e.toString());
			safErrorDialog.setVisible(true);
			e.printStackTrace();
		}
		return fighter;
	}
	
	private String getTypeCheckResult(Bot fighter)
	{
		TypeChecker typeCheck = new TypeChecker();
		String result = "";
		
		fighter.accept(typeCheck);
		
		if (typeCheck.getTypeErrorMessage().size()>0)
		{
			result += fighter.getName() + ":\n";
			for (String s : typeCheck.getTypeErrorMessage())
				result += s + "\n";
			result += "\n";
		}
		
		return result;
	}
	
	class Animation implements ActionListener{
		private int lx;
        private int rx;
        private int rHPLost, lHPLost;
        
    	public Animation()
		{
    		lx = lStartPosition.x;
    		rx = rStartPosition.x;
    		rHP = rHPProgressBar.getValue();
	        lHP = lHPProgressBar.getValue();
	        rHPLost = 0;
	        lHPLost = 0;
	    }
        
        @Override
		public void actionPerformed(ActionEvent e) 
        {
		    setFighters();
			setFightersPosition();
            drawFighters();
            setFightersHP();
            setFightersProgressBars();
            setEnd();
        }
        
        private void setFighters()
        {
        	lSAFFight.setSAFStatus(lSAFCondCheck);
            rSAFFight.setSAFStatus(rSAFCondCheck);
            lSAFCondCheck.setConditionCheckerPosition(lHP, lSAFStatus.getMoveStatus().getPosition(), rSAFStatus.getMoveStatus().getPosition());
            rSAFCondCheck.setConditionCheckerPosition(rHP, lSAFStatus.getMoveStatus().getPosition(), rSAFStatus.getMoveStatus().getPosition());
        }
        
        private void setFightersPosition()
        {
        	if (Math.abs(lSAFStatus.getMoveStatus().getPosition().x - rSAFStatus.getMoveStatus().getPosition().x)> minDistance)
            {
            	lx = lSAFStatus.getMoveStatus().getPosition().x;
            	rx = rSAFStatus.getMoveStatus().getPosition().x;
            }
            
            lx = confirmInBound(lx);
            rx = confirmInBound(rx);
        }
        
        private int confirmInBound(int x)
        {
        	if (x <= lBoundX)
        		return lBoundX;
        	else if (x >= rBoundX)
        		return rBoundX;
        	return x;
        }
        
        private void drawFighters()
        {
        	fac.setLeftFighterPosition(lx, lSAFStatus.getMoveStatus().getPosition().y);
            fac.setRightFighterPosition(rx, rSAFStatus.getMoveStatus().getPosition().y);
            fac.setLeftFighterImage(lSAFStatus.getFightStatus().getImage());
            fac.setRightFighterImage(rSAFStatus.getFightStatus().getImage());
            Graphics g = fac.getGraphics();
            fac.paintComponent(g);
            fac.repaint();
        }
        
        private void setFightersHP()
        {
        	rHPLost = lSAFFight.SAFPK(rSAFStatus, rSAFFight.getSAFFightAction(), rSAFFight.getSAFMoveAction());
            if (rHPLost < 0)
              	lHP += rHPLost;
            else
              	rHP -= rHPLost;
            
            lHPLost = rSAFFight.SAFPK(lSAFStatus, lSAFFight.getSAFFightAction(), lSAFFight.getSAFMoveAction());
            if (lHPLost < 0)
            	rHP += lHPLost;
            else
            	lHP -= lHPLost;
        }
        
        private void setFightersProgressBars()
        {
        	setHPProgressBar(rHP, rHPProgressBar);
            setHPProgressBar(lHP, lHPProgressBar);
        }
		
        private void setHPProgressBar(int hp, JProgressBar pb)
        {
        	if (hp <= 50)
            	pb.setForeground(Color.RED);
        	pb.setValue(hp);
        }
        
        private void setEnd()
        {
        	if (rHP <= 0 || lHP <= 0) 
            {
                lTimer.stop();
                rTimer.stop();
                controlJButton.setText("End");
            	if (rHP <= 0 && lHP <= 0)
            		timeJLabel.setText("DRAW");
            	else
            		timeJLabel.setText("K.O.");
            }
        }
        
        
	}
}
