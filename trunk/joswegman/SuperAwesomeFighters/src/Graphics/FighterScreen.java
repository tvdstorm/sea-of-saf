package Graphics;

import grammar.SafLexer;
import grammar.SafParser;
import grammar.Evaluators.Bot;
import grammar.Evaluators.BotChecker;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
//import javax.swing.Timer;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.BevelBorder;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Timer;

import javax.swing.filechooser.FileNameExtensionFilter;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import program.Engine;
import program.Fight;

public class FighterScreen extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	//FightImages fightimages;
	private JPanel cPanel,panel;
	private JTextField txtBotLeft,txtBotRight;
	private JLabel lblBotLeft, lblBotRight;
	private JButton btnStart, btnBotLeft, btnBotRight;
	private JLabel lblHealthBotLeft, lblHealthBotRight;
	private JLabel lblLifeBotLeft, lblLifeBotRight;
	private JLabel fighterLeft;
	private JLabel fighterRight;
	//private Engine _engine;
	//private Timer _timer;
	//private Graphics _graphics;
	
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
		//_timer = new Timer(1000, this);
		//_graphics = new Graphics();
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
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startFight();
			}
		});
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
		btnBotLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBotLeft.setText(actionFileChooser());
				checkStart();
			}
		});

		btnBotLeft.setBounds(485, 8, 45, 20);
		cPanel.add(btnBotLeft);
		
		btnBotRight = new JButton("...");
		btnBotRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBotRight.setText(actionFileChooser());
				checkStart();
			}
		});
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
		fighterLeft.setIcon(fightimages.getImages(17));
		fighterLeft.setBounds(10, 10, 166,379);
		panel.add(fighterLeft);
		
		fighterRight = new JLabel();
		fighterRight.setIcon(fightimages.getImages(18));
		fighterRight.setBounds(500, 10, 166, 379);
		panel.add(fighterRight);
	
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 110, 780, 554);
		cPanel.add(panel);
		
	}

	
	private String actionFileChooser (){
		String filename = File.separator+"home/jos/workspace/SuperAwesomeFighters/src/program";
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
			JOptionPane.showMessageDialog(null,st);
		}
		if (botEnable) {
			return btmp;
		} else {
			return null;
		}
	}
	
	
	private void startFight(){
		Bot bLeft = getBot(txtBotLeft.getText());
		Bot bRight = getBot(txtBotRight.getText());
		 
		if (!(bLeft == null ) && !(bRight == null)){
		  String end = doFight(bLeft, bRight);
		   JOptionPane.showMessageDialog(null, end);
		}
	}

	 
	
	
	private String doFight(Bot bLeft,Bot bRight){
		Fight fight = new Fight (bLeft,bRight);
		Engine engine = new Engine (fight);
		while (engine.stillAlive()) {
			engine.doAction();
			lblLifeBotLeft.setText(Integer.toString(engine.getLifeLeft()) + " %");
			lblLifeBotRight.setText(Integer.toString(engine.getLifeRight())+ " %");
			drawFighters();
			
		}
		if ( engine.getLifeLeft() == 0 ){
			return "Fighter rechts heeft gewonnen!";
		}else {
			return "Fighter links heeft gewonnen!";
		}
	}
	
	private void drawFighters(){
		FightImages fightimages = new FightImages();
		fighterLeft.setIcon(fightimages.getImages(new Random().nextInt(18)));
		fighterRight.setIcon(fightimages.getImages(new Random().nextInt(18)));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		 
	}
	
	private void checkStart(){
		if ((!txtBotLeft.getText().equalsIgnoreCase("")) && (!txtBotRight.getText().equalsIgnoreCase("")) ){
			btnStart.setEnabled(true);
		}else{
			btnStart.setEnabled(false);
		}
	}

}
