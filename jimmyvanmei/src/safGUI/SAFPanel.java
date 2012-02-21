package safGUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import safAST.Behaviour;
import safAST.Bot;
import safAST.Personality;
import safAST.condition.AndCombineCondition;
import safAST.condition.CombineCondition;
import safAST.condition.Condition;
import safAST.condition.OrCombineCondition;
import safFightAnimation.SAFFight;
import safFightAnimation.SAFStatus;
import safFightAnimation.conditionCheck.SAFAnimationConditionCheck;
import safMessage.SAFErrorMessageDialog;
import safParser.SAFParser;
import safVisitor.SAFTypeCheckerVisitor;

public class SAFPanel extends JPanel {
	private JLabel lHPJLabel, rHPJLabel, timeJLabel, lFighterNameJLabel, rFighterNameJLabel; 
	private JProgressBar lHPProgressBar, rHPProgressBar; 
	private	JScrollPane lPropertiesScrollPane, lBehaviourScrollPane, rPropertiesScrollPane, rBehaviourScrollPane;
	private JButton controlJButton, reloadJButton;
	private JTextArea rBehaviourJTextArea,  rPropertiesJTextArea;
	private JTextArea lBehaviourJTextArea, lPropertiesJTextArea;
	private FightAreaComponent fac;
	private Bot lFighter, rFighter;
	private int rHP, lHP;
	private Timer lTimer, rTimer;
	private SAFStatus lSAFStatus, rSAFStatus;
	private SAFFight lSAFFight, rSAFFight;
	private SAFAnimationConditionCheck lSAFCondCheck, rSAFCondCheck;
	private SAFErrorMessageDialog safErrorDialog; 
	
	private final Point lStartPosition = new Point(8, 350), rStartPosition = new Point(455, 350);
	private final int lBoundX = 8, rBoundX = 455, minDistance = 65;
	private final int healthValue = 100;
	private final String startImg = "stand.png";
	/**
	 * Create the panel.
	 */
	public SAFPanel() {
		setSize(1200, 800);
		setBorder(new EmptyBorder(20, 20, 20, 20));
		initialSAFPanel();
		addActionListenerToControlButton();
		addActionListenerToReloadButton();
	}
	
	private void initialSAFPanel()
	{
		safErrorDialog = new SAFErrorMessageDialog();
		
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
		try {
			InputStream is =  readFile("/LeftFighter.txt");
			SAFParser lSAFParser = new SAFParser(is);
			lFighter = lSAFParser.StartParser();
			is.close();
			
			is = readFile("/RightFighter.txt");
			SAFParser rSAFParser = new SAFParser(is);
			rFighter = rSAFParser.StartParser();
			is.close();
			
			SAFTypeCheckerVisitor safTypeCheck = new SAFTypeCheckerVisitor();
			
			lFighter.accept(safTypeCheck);
			rFighter.accept(safTypeCheck);
			
			if (safTypeCheck.getInvalidPersonalities().size()>0 || safTypeCheck.getInvalidActions().size()>0 || safTypeCheck.getInvalidConditions().size()>0)
			{
				safErrorDialog.setErrorMessage(safTypeCheck.getTypeCheckMessage());
				safErrorDialog.setVisible(true);
			}
			
			lSAFFight = new SAFFight(lFighter, lStartPosition, startImg);
			rSAFFight = new SAFFight(rFighter, rStartPosition, startImg);
			
			lSAFStatus = lSAFFight.getSAFStatus();
			rSAFStatus = rSAFFight.getSAFStatus();
			
			lSAFCondCheck = new SAFAnimationConditionCheck(healthValue, lStartPosition, rStartPosition);
			rSAFCondCheck = new SAFAnimationConditionCheck(healthValue, lStartPosition, rStartPosition);
		} catch (Exception e) {
			safErrorDialog.setErrorMessage(e.toString());
			safErrorDialog.setVisible(true);
			e.printStackTrace();
		}
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
		for (Personality p : fighter.getPersonality())
			tempS += p.getCharacterName() + " = " + Integer.toString(p.getCharacterValue()) + "\n";
		return tempS;
	}
	
	private String getSAFBehaviour(Bot fighter)
	{
		String tempS = "";
		
		for (Behaviour b : fighter.getBehaviour())
		{
			Condition tempCond = b.getCondition();
			if (tempCond instanceof CombineCondition)
				tempS += getSAFCondition(tempCond) + " { " + b.getAction().toString() + " } "+ "\n";
			else
				tempS += b.getCondition() + " { " + b.getAction().toString() + " } "+ "\n";
		}
		tempS = tempS.replace("(", "");
		tempS = tempS.replace(")", "");
		tempS = tempS.replace("[", "(");
		tempS = tempS.replace("]", ")");
		tempS = tempS.replace("{", "[");
		tempS = tempS.replace("}", "]");
		return tempS; 
	}
	
	private String getSAFCondition(Condition cond)
	{
		String tempS = "", op = " ";
		Condition[] condArray;
		if (cond instanceof AndCombineCondition)
			op = " && ";
		else if (cond instanceof OrCombineCondition)
			op = " || ";
		if (cond instanceof CombineCondition)
		{
			condArray = ((CombineCondition)cond).getCombineConditions();
			if (condArray[0] instanceof CombineCondition)
				tempS += "[" + getSAFCondition(condArray[0])+ op + condArray[1] + "]";
			else if (condArray[1] instanceof CombineCondition)
				tempS += "[" + condArray[0] + op + getSAFCondition(condArray[1]) +  "]";
			else if ((condArray[0] instanceof CombineCondition)&&(condArray[1] instanceof CombineCondition))
				tempS += "[" + getSAFCondition(condArray[0]) + op + getSAFCondition(condArray[1]) +  "]";
			else
				tempS += "[" + condArray[0] + op + condArray[1] +  "]";
		}
		return tempS;
	}
	
	private void initialJButtons()
	{
		controlJButton = new JButton("Ready");
		reloadJButton = new JButton("Try Again");
	}
	
	private void initialFightAreaComponent()
	{
		fac = new FightAreaComponent(lSAFStatus.getSAFFightConfig().getFightImage(), lStartPosition, rSAFStatus.getSAFFightConfig().getFightImage(), rStartPosition);
		fac.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	private void addActionListenerToControlButton(){
		int lDelay = 150, rDelay = 150;
		
		if (lSAFStatus.getFighterSpeed()!=0.0)
			lDelay = (int)(lDelay/lSAFStatus.getFighterSpeed());
		if (rSAFStatus.getFighterSpeed()!=0.0)
			rDelay = (int)(rDelay/lSAFStatus.getFighterSpeed());
		
		rHP = rHPProgressBar.getValue();
        lHP = lHPProgressBar.getValue();
		ActionListener updateAnimation = new ActionListener() {
			int lx = lStartPosition.x;
            int rx = rStartPosition.x;
            
            public void actionPerformed(ActionEvent actionEvent) {
                int rHPLost = 0, lHPLost = 0;
                
                lSAFFight.setSAFStatus(lSAFCondCheck);
                rSAFFight.setSAFStatus(rSAFCondCheck);
                lSAFCondCheck.setConditionCheckerPosition(lHP, lSAFStatus.getSAFMoveConfig().getPosition(), rSAFStatus.getSAFMoveConfig().getPosition());
                rSAFCondCheck.setConditionCheckerPosition(rHP, lSAFStatus.getSAFMoveConfig().getPosition(), rSAFStatus.getSAFMoveConfig().getPosition());
                
                if (Math.abs(lSAFStatus.getSAFMoveConfig().getPosition().x - rSAFStatus.getSAFMoveConfig().getPosition().x)> minDistance)
                {
                	lx = lSAFStatus.getSAFMoveConfig().getPosition().x;
                	rx = rSAFStatus.getSAFMoveConfig().getPosition().x;
                }
                
                if (lx <= lBoundX)
            		lx = lBoundX;
            	else if (lx >= rBoundX)
            		lx = rBoundX;
            	
                if (rx <= lBoundX)
            		rx = lBoundX;
            	else if (rx >= rBoundX)
            		rx = rBoundX;
                
                fac.setLeftFighterPosition(lx, lSAFStatus.getSAFMoveConfig().getPosition().y);
                fac.setRightFighterPosition(rx, rSAFStatus.getSAFMoveConfig().getPosition().y);
                fac.setLeftFighterImage(lSAFStatus.getSAFFightConfig().getFightImage());
                fac.setRightFighterImage(rSAFStatus.getSAFFightConfig().getFightImage());
                Graphics g = fac.getGraphics();
                fac.paintComponent(g);
                fac.repaint();
                
                rHPLost = lSAFFight.SAFPK(rSAFStatus, rSAFFight.getSAFFightAction(), rSAFFight.getSAFMoveAction());
                if (rHPLost < 0)
                {
                	lHP += rHPLost;
                	lHPProgressBar.setValue(lHP);
                }
                else
                {
                	rHP -= rHPLost;
                	rHPProgressBar.setValue(rHP);
                }
                
                lHPLost = rSAFFight.SAFPK(lSAFStatus, lSAFFight.getSAFFightAction(), lSAFFight.getSAFMoveAction());
                if (lHPLost < 0)
                {
                	rHP += lHPLost;
                	rHPProgressBar.setValue(rHP);
                }
                else
                {
                	lHP -= lHPLost;
                	lHPProgressBar.setValue(lHP);
                }
                if (rHP <= 50)
                	rHPProgressBar.setForeground(Color.RED);
                if (lHP <= 50)
                	lHPProgressBar.setForeground(Color.RED);
                
                if (rHP <= 0 || lHP <= 0) 
                {
                    lTimer.stop();
                    rTimer.stop();
                    controlJButton.setText("End");
                	if (rHP <= 0 && lHP <= 0)
                		timeJLabel.setText("DRAW");
                	else
                		timeJLabel.setText("K.O.");
                    return;
                }
            }
        };
        
        lTimer = new Timer(lDelay, updateAnimation);
        rTimer = new Timer(rDelay, updateAnimation);
        
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
		
	private InputStream readFile(String fileName){
		return getClass().getResourceAsStream(fileName);
	}
}
