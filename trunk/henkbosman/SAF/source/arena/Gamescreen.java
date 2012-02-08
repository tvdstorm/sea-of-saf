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


import fighter.Combatmove;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.io.IOException;

public class Gamescreen extends JFrame implements ActionListener{

	private static final long serialVersionUID = 3204571424404600487L;
	private JPanel contentPane;
	private JPanel panel;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel label;
	private JLabel label_1;
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

	public Gamescreen() {
		
		_timer = new Timer(1000, this);
		_graphics = new Graphics();
		
		setTitle("Super Awesome Fighter Arena");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFighterA = new JLabel("Fighter A");
		lblFighterA.setBounds(10, 11, 46, 14);
		contentPane.add(lblFighterA);
		
		textField = new JTextField();
		textField.setBounds(66, 8, 267, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Fighter B");
		lblNewLabel.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(66, 33, 267, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Fight!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					beginFight();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (RecognitionException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(343, 8, 89, 46);
		contentPane.add(btnNewButton);
		
		JLabel lblHealthFighterA = new JLabel("Fighter A");
		lblHealthFighterA.setBounds(10, 69, 83, 14);
		contentPane.add(lblHealthFighterA);
		
		JLabel lblHealthFighterB = new JLabel("Fighter B");
		lblHealthFighterB.setBounds(10, 83, 83, 14);
		contentPane.add(lblHealthFighterB);
		
		label = new JLabel("100%");
		label.setBounds(103, 69, 46, 14);
		contentPane.add(label);
		
		label_1 = new JLabel("100%");
		label_1.setBounds(103, 83, 46, 14);
		contentPane.add(label_1);
		
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
		//_fighter1.setIcon(_graphics.getImage(new Combatmove(Movement.Movements.stand, Action.Actions.nothing), 1));
		_fighter1.setBounds(10, 10, 63, 48);
		panel.add(_fighter1);
		
		_fighter2 = new JLabel();
		//_fighter2.setIcon(_graphics.getImage(new Combatmove(Movement.Movements.stand, Action.Actions.nothing), 2));
		_fighter2.setBounds(10, 10, 63, 48);
		panel.add(_fighter2);
	
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 101, 422, 154);
		contentPane.add(panel);
	}
	
	private void drawFighter(Combatmove combatmove, int fighter)
	{
		switch (fighter)
		{
			case 1:
				_fighter1.setIcon(_graphics.getImage(combatmove, 1));
				_fighter1.setBounds(_engine.getPosition(1)-12, 100, 63, 48);
				break;
			case 2:
				_fighter2.setIcon(_graphics.getImage(combatmove, 2));
				_fighter2.setBounds(_engine.getPosition(2)+12, 100, 63, 48);
				break;
		}
		
	}
	
	private void beginFight() throws IOException, RecognitionException
	{
		_engine = new Engine(textField.getText(), textField_1.getText());
		_timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (!_engine.doMoves())
		{
			label.setText(_engine.getHealth(1)+"%");
			label_1.setText(_engine.getHealth(2)+"%");
		}
		else
		{
			if (_engine.getHealth(1)<1)
			{
				label.setText("LOST");
				drawFighter(null,1);
			}
			else
			{
				label_1.setText("LOST");
				drawFighter(null,2);
			}
			_timer.stop();
			contentPane.repaint();
			return;
		}
		drawFighter(_engine.getCombatmove(1),1);
		drawFighter(_engine.getCombatmove(2),2);
		contentPane.repaint();
	}
}
