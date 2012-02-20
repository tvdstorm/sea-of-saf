package saf.fightclub;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

import org.antlr.misc.Barrier;
import org.antlr.runtime.RecognitionException;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.io.IOException;

import javax.swing.border.BevelBorder;
import javax.swing.Timer;

public class FightScreen extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtFighter1Location;
	private JTextField txtFighter2Location;
	private JProgressBar barFighter1Health;
	private JProgressBar barFighter2Health;
	private JLabel lblFighter1;
	private JLabel lblFighter2;
	private final Timer timer = new Timer(1000, (ActionListener) null);
	private FightEngine engine = null;
	private final int fighterBlockSize = 40;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FightScreen frame = new FightScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FightScreen() {
		timer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				timeUpdate();
			}
		});
		setTitle("SAF Fight Club");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblF1 = new JLabel("Fighter 1:");
		lblF1.setBounds(10, 11, 54, 14);
		getContentPane().add(lblF1);
		
		JLabel lblF2 = new JLabel("Fighter 2:");
		lblF2.setBounds(10, 36, 54, 14);
		getContentPane().add(lblF2);
		
		txtFighter1Location = new JTextField();
		txtFighter1Location.setBounds(74, 8, 261, 20);
		getContentPane().add(txtFighter1Location);
		txtFighter1Location.setColumns(10);
		
		txtFighter2Location = new JTextField();
		txtFighter2Location.setBounds(74, 33, 261, 20);
		getContentPane().add(txtFighter2Location);
		txtFighter2Location.setColumns(10);
		
		JButton btnFight = new JButton("FIGHT");
		btnFight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startRound();
			}
		});
		btnFight.setBounds(345, 8, 89, 45);
		getContentPane().add(btnFight);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(10, 61, 424, 200);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		lblFighter1 = new JLabel("F1");
		lblFighter1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFighter1.setBounds(10, 120, fighterBlockSize, fighterBlockSize);
		panel.add(lblFighter1);
		
		lblFighter2 = new JLabel("F2");
		lblFighter2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFighter2.setBounds(374, 120, fighterBlockSize, fighterBlockSize);
		panel.add(lblFighter2);
		
		barFighter1Health = new JProgressBar();
		barFighter1Health.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		barFighter1Health.setForeground(Color.GREEN);
		barFighter1Health.setValue(100);
		barFighter1Health.setBounds(10, 11, 100, 20);
		panel.add(barFighter1Health);
		
		barFighter2Health = new JProgressBar();
		barFighter2Health.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		barFighter2Health.setForeground(Color.GREEN);
		barFighter2Health.setValue(100);
		barFighter2Health.setBounds(314, 11, 100, 20);
		panel.add(barFighter2Health);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{txtFighter1Location, txtFighter2Location, btnFight}));
	}
	
	
	private void startRound() {
		try {
			if(engine == null) {
				// start the fighting round
				this.engine = new FightEngine(this.txtFighter1Location.getText(), this.txtFighter2Location.getText());
				this.timer.start();
			}
		} catch (IOException e) {
			// TODO: handle exception
		} catch (RecognitionException e) {
			// TODO: handle exception
		}
	}
	
	private void timeUpdate() {
		if(engine.Simulate()) {
			
			//health update
			barFighter1Health.setValue(engine.getFighter1Health());
			barFighter2Health.setValue(engine.getFighter2Health());
			
			//fighter redraw
			lblFighter1.setBounds(Math.abs(engine.getFighter1Position() - (fighterBlockSize/2)), 120, fighterBlockSize, fighterBlockSize);
			//lblFighter1.setIcon(icon)
			lblFighter2.setBounds(Math.abs(engine.getFighter2Position() - (fighterBlockSize/2)) , 120, fighterBlockSize, fighterBlockSize);
			//lblFighter1.setIcon(icon)
		}
		else {
			// end of simulation
			timer.stop();
			engine = null;
			
		}
	}
	
}