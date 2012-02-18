package arena;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.Timer;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.BevelBorder;

import org.antlr.runtime.RecognitionException;

import arena.Engine.Fighters;


import fighter.Combatmove;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.io.IOException;

public class Gamescreen extends JFrame implements ActionListener{

	private static final long serialVersionUID = 3204571424404600487L;
	private JPanel contentPane;
	private JPanel panel;
	private JTextField textFieldA;
	private JTextField textFieldB;
	private JLabel healthLabelA;
	private JLabel healthLabelB;
	private JLabel actionLabelA;
	private JLabel actionLabelB;
	private JButton _fightButton;
	private JLabel _fighter1;
	private JLabel _fighter2;
	private Engine _engine;
	private Timer _timer;
	private Graphics _graphics;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gamescreen frame = new Gamescreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Gamescreen() 
	{
		_timer = new Timer(500, this);
		_graphics = new Graphics();
		
		setTitle("Super Awesome Fighter Arena");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFighterA = new JLabel("Fighter A");
		lblFighterA.setBounds(10, 11, 66, 14);
		contentPane.add(lblFighterA);
		
		textFieldA = new JTextField();
		textFieldA.setBounds(86, 8, 247, 20);
		contentPane.add(textFieldA);
		textFieldA.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Fighter B");
		lblNewLabel.setBounds(10, 36, 66, 14);
		contentPane.add(lblNewLabel);
		
		textFieldB = new JTextField();
		textFieldB.setBounds(86, 33, 247, 20);
		contentPane.add(textFieldB);
		textFieldB.setColumns(10);
		
		_fightButton = new JButton("Fight!");
		_fightButton.addActionListener(this);
		_fightButton.setBounds(343, 8, 89, 46);
		contentPane.add(_fightButton);
		
		JLabel lblHealthFighterA = new JLabel("Fighter A");
		lblHealthFighterA.setBounds(10, 69, 100, 14);
		contentPane.add(lblHealthFighterA);
		
		JLabel lblHealthFighterB = new JLabel("Fighter B");
		lblHealthFighterB.setBounds(10, 83, 100, 14);
		contentPane.add(lblHealthFighterB);
		
		healthLabelA = new JLabel("100%");
		healthLabelA.setBounds(103, 69, 46, 14);
		contentPane.add(healthLabelA);
		
		healthLabelB = new JLabel("100%");
		healthLabelB.setBounds(103, 83, 46, 14);
		contentPane.add(healthLabelB);
		
		actionLabelA = new JLabel("Waiting");
		actionLabelA.setBounds(143, 69, 250, 14);
		contentPane.add(actionLabelA);
		
		actionLabelB = new JLabel("Waiting");
		actionLabelB.setBounds(143, 83, 250, 14);
		contentPane.add(actionLabelB);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(10, 58, 422, 0);
		contentPane.add(horizontalStrut);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalGlue_1.setBounds(431, 252, 1, -143);
		contentPane.add(verticalGlue_1);
		
		panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setLayout(null);
		
		_fighter1 = new JLabel();
		_fighter1.setBounds(10, 10, 63, 48);
		panel.add(_fighter1);
		
		_fighter2 = new JLabel();
		_fighter2.setBounds(10, 10, 63, 48);
		panel.add(_fighter2);
	
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 101, 422, 154);
		contentPane.add(panel);
	}
	
	private void drawFighter(Combatmove combatmove, Fighters fighter)
	{
		switch (fighter)
		{
			case FighterA:
				_fighter1.setIcon(_graphics.getImage(combatmove, Fighters.FighterA));
				_fighter1.setBounds(_engine.getPosition(Fighters.FighterA)-12, 100, 63, 48);
				if (combatmove!=null)
				{
					actionLabelA.setText(combatmove._movement + " " + combatmove._action);
					healthLabelA.setText(_engine.getHealth(Fighters.FighterA)+"%");
				}
				else
				{
					actionLabelA.setText("DEAD");
					healthLabelA.setText("LOST");
				}
				break;
			case FighterB:
				_fighter2.setIcon(_graphics.getImage(combatmove, Fighters.FighterB));
				_fighter2.setBounds(_engine.getPosition(Fighters.FighterB)+12, 100, 63, 48);
				if (combatmove!=null)
				{
					actionLabelB.setText(combatmove._movement + " " + combatmove._action);
					healthLabelB.setText(_engine.getHealth(Fighters.FighterB)+"%");
				}
				else
				{
					actionLabelB.setText("DEAD");
					healthLabelB.setText("LOST");
				}
				break;
		}
		
	}
	
	private void beginFight() throws IOException, RecognitionException
	{
		_engine = new Engine(textFieldA.getText(), textFieldB.getText());
		Popupscreen popupScreen = new Popupscreen();
		if (!_engine.getErrors(Fighters.FighterA).isEmpty())
			popupScreen.addMessage(_engine.getErrors(Fighters.FighterA));
		if (!_engine.getErrors(Fighters.FighterB).isEmpty())
			popupScreen.addMessage(_engine.getErrors(Fighters.FighterB));

		if (popupScreen.hasMessages())
		{
			popupScreen.setVisible(true);
			return;
		}

		_timer.start();
	}
	
	private void doFightMove()
	{
		if (_engine.doMoves())
		{
			if (_engine.getHealth(Fighters.FighterA)<1)
			{
				drawFighter(null,Fighters.FighterA);
			}
			else
			{
				drawFighter(null,Fighters.FighterB);
			}
			_timer.stop();
			contentPane.repaint();
			return;
		}
		drawFighter(_engine.getCombatmove(Fighters.FighterA),Fighters.FighterA);
		drawFighter(_engine.getCombatmove(Fighters.FighterB),Fighters.FighterB);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource().equals(_timer))
			doFightMove();
		if (e.getSource().equals(_fightButton))
		{
			try {
				beginFight();
			} catch (IOException e1) {
				Popupscreen popupScreen = new Popupscreen();
				popupScreen.addMessage("IOException:");
				popupScreen.addMessage(e1.getMessage());
				System.out.println(e1.getMessage());
				popupScreen.setVisible(true);
			} catch (RecognitionException e1) {
				Popupscreen popupScreen = new Popupscreen();
				popupScreen.addMessage("RecognitionException:");
				popupScreen.addMessage(e1.getMessage());
				System.out.println(e1.getMessage());
				popupScreen.setVisible(true);
			}
		}
		contentPane.repaint();
	}
}
