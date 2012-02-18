package Graphics;

import grammar.SafLexer;
import grammar.SafParser;
import grammar.Evaluators.Bot;
import grammar.Evaluators.BotChecker;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.Timer;

import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.filechooser.FileNameExtensionFilter;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import program.Fight;

public class FighterScreen extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private JPanel cPanel,panel;
	private JTextField txtBotLeft,txtBotRight;
	private JLabel lblBotLeft, lblBotRight;
	private JButton btnStart, btnBotLeft, btnBotRight;
	private JLabel lblHealthBotLeft, lblHealthBotRight;
	private JLabel lblLifeBotLeft, lblLifeBotRight;
	private JLabel fighterLeft;
	private JLabel fighterRight;
	private Bot bLeft;
	private Bot bRight;
	
	private Timer timer;
	FightImages fightimages = new FightImages();
	Fight fight;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FighterScreen frame = new FighterScreen(); 
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FighterScreen() {
		timer = new Timer(100,this);
		FightImages fightimages = new FightImages();
		setTitle("Super Fighters");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		cPanel = new JPanel();
		cPanel.setBorder(new EmptyBorder(10, 20, 10, 10));
		setContentPane(cPanel);
		cPanel.setLayout(null);
		
		btnStart = new JButton("Start!");
		btnStart.setEnabled(false);
		btnStart.addActionListener(this);
		btnStart.setBounds(10, 8, 89, 46);
		cPanel.add(btnStart);
		
		
		lblBotLeft = new JLabel("Left Fighter");
		lblBotLeft.setBounds(105, 11, 100, 14);
		cPanel.add(lblBotLeft);
		
		txtBotLeft = new JTextField();
		txtBotLeft.setBounds(210, 8, 267, 20);
		txtBotLeft.setEditable(false);
		cPanel.add(txtBotLeft);
		
		lblBotRight = new JLabel("Right Fighter");
		lblBotRight.setBounds(105, 36, 100, 14);
		cPanel.add(lblBotRight);
		
		txtBotRight = new JTextField();
		txtBotRight.setBounds(210, 33, 267, 20);
		txtBotRight.setEditable(false);
		cPanel.add(txtBotRight);
		
		btnBotLeft = new JButton("...");
		btnBotLeft.addActionListener(this);
		btnBotLeft.setBounds(485, 8, 45, 20);
		cPanel.add(btnBotLeft);
		
		btnBotRight = new JButton("...");
		btnBotRight.addActionListener(this);
		btnBotRight.setBounds(485, 33, 45, 20);
		cPanel.add(btnBotRight);
		
		lblHealthBotLeft = new JLabel("Fighter Left");
		lblHealthBotLeft.setBounds(10, 69, 130, 20);
		cPanel.add(lblHealthBotLeft);
		
		lblHealthBotRight = new JLabel("Fighter Right");
		lblHealthBotRight.setBounds(10, 83, 130, 20);
		cPanel.add(lblHealthBotRight);
		
		lblLifeBotLeft = new JLabel("100%");
		lblLifeBotLeft.setBounds(153, 69, 46, 20);
		cPanel.add(lblLifeBotLeft);
		
		lblLifeBotRight = new JLabel("100%");
		lblLifeBotRight.setBounds(153, 83, 46, 20);
		cPanel.add(lblLifeBotRight);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(10, 58, 422, 0);
		cPanel.add(horizontalStrut);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalGlue_1.setBounds(431, 252, 1, -143);
		cPanel.add(verticalGlue_1);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		fighterLeft = new JLabel();
		fighterLeft.setIcon(fightimages.getImage("standLeft"));
		fighterLeft.setBounds(10, 10, 166,379);
		panel.add(fighterLeft);
		
		fighterRight = new JLabel();
		fighterRight.setIcon(fightimages.getImage("standRight"));
		fighterRight.setBounds(500, 10, 166, 379);
		panel.add(fighterRight);
	
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 110, 780, 554);
		cPanel.add(panel);
	}

	
	private String actionFileChooser (){
		String filename = File.separator+"home/jos/workspace/SuperAwesomeFighters/src/safs";
		Component frame = new JFrame();
		JFileChooser fc = new JFileChooser(new File(filename));
		FileNameExtensionFilter filter = new FileNameExtensionFilter(".saf files", "saf");
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		fc.setFileFilter(filter);
		int code = fc.showOpenDialog(frame);
		File selFile = fc.getSelectedFile();
		if (code == JFileChooser.APPROVE_OPTION) {
			return selFile.getAbsolutePath();
		} else {
			return "";
		}
	}
	
	private Bot getBot(String botfile){
		boolean botEnable = true; 
		ANTLRFileStream fileStream = null;
		try {
			fileStream = new ANTLRFileStream (botfile);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		SafLexer lexer = new SafLexer(fileStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SafParser parser = new SafParser(tokenStream);
		Bot btmp = null;
		try {
			btmp = parser.bot();
		} catch (RecognitionException e1) {
			e1.printStackTrace();
		}
		BotChecker bCheck = new BotChecker();
		btmp.accept(bCheck);
		if (!bCheck.getErrorMessages().isEmpty()){
			botEnable = false;
			List<String> st=bCheck.getErrorMessages();
			String ms = "";
			for (String s: st){
				ms += s + "\n";
			}
			JOptionPane.showMessageDialog(null,ms,btmp.getName(),JOptionPane.ERROR_MESSAGE);
		}
		if (!bCheck.getWarningMessages().isEmpty()){
			List<String> st=bCheck.getWarningMessages();
			JOptionPane.showMessageDialog(null,st,btmp.getName()+" warning", JOptionPane.WARNING_MESSAGE);
		}
		if (botEnable) {
			return btmp;
		} else {
			return null;
		}
	}
	
	private void prepareFight(){
		bLeft = getBot(txtBotLeft.getText());
		bRight = getBot(txtBotRight.getText());
		lblLifeBotLeft.setText("100 %");
		lblLifeBotRight.setText("100 %");
		if( !(bLeft == null)&& !(bRight== null)) {
		fight = new Fight (bLeft,bRight);
		timer.start();
		}
	}

	private void doFight(Bot bLeft,Bot bRight){
		if (fight.stillAlive()) {
			fight.doAction();
			drawFighters(fight);
			drawLive(fight);
		}else{
			timer.stop();
			if ( fight.getLifeLeft() == 0 ){
				fighterLeft.setIcon(fightimages.getImage("deadLeft"));
				JOptionPane.showMessageDialog(null, "Fighter "+ bLeft.getName() +" heeft verloren!", "Fight end",JOptionPane.INFORMATION_MESSAGE);
			}else {
				fighterRight.setIcon(fightimages.getImage("deadRight"));
				JOptionPane.showMessageDialog(null, "Fighter "+ bRight.getName() +" heeft verloren!", "Fight end",JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	private void drawLive(Fight fight){
		lblLifeBotLeft.setText(Integer.toString(fight.getLifeLeft()) + " %");
		lblLifeBotRight.setText(Integer.toString(fight.getLifeRight())+ " %");
	}
	
	private void drawFighters(Fight fight){
		fighterLeft.setIcon(fightimages.getImage(fight.getCurrentFightAction(true)+"Left"));
		fighterRight.setIcon(fightimages.getImage(fight.getCurrentFightAction(false)+"Right"));
		
		fighterLeft.setBounds(fight.getPositionLeft(),10,166,379);
		if (fight.getPositionLeft()+ 166 > fight.getPositionRight()){
			fighterRight.setBounds(fight.getPositionLeft()+166, 10, 166, 379);
		} else{
			fighterRight.setBounds(fight.getPositionRight(), 10, 166, 379);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==timer){
			doFight( bLeft,bRight);
		}
		if (e.getSource()==btnBotRight){
			txtBotRight.setText(actionFileChooser());
			checkStart();
		}
		if (e.getSource()==btnBotLeft){
			txtBotLeft.setText(actionFileChooser());
			checkStart();
		}
		if (e.getSource()==btnStart){
			prepareFight();
			if (!(bLeft == null ) && !(bRight == null)){
				  doFight(bLeft, bRight);
				   
				}
		}
		 cPanel.repaint();
	}
	
	private void checkStart(){
		if ((!txtBotLeft.getText().equalsIgnoreCase("")) && (!txtBotRight.getText().equalsIgnoreCase("")) ){
			btnStart.setEnabled(true);
		}else{
			btnStart.setEnabled(false);
		}
	}
	
	
}
