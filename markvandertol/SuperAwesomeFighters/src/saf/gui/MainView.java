package saf.gui;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import saf.Arena;

public class MainView extends JFrame {
	private static final String TITLE = "Super Awesome Fighters";
	private final FighterComponent[] fighters = new FighterComponent[2];
	
	private final Arena arena;
	
	private final JLabel distanceLabel;
	private JCheckBox checkbox;
	
	public MainView(Arena arena) {
		this.arena = arena;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle(TITLE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		JLabel title = new JLabel(TITLE);
		title.setAlignmentX(0.5f);
		title.setFont(new Font("Arial", Font.BOLD, 24));
		add(title);
		
		JLabel author = new JLabel("by Mark van der Tol");
		author.setAlignmentX(0.5f);
		author.setFont(new Font("Arial", Font.PLAIN, 16));
		add(author);
		
		JPanel fightersPanel = new JPanel();
		
		fighters[0] = new FighterComponent(arena, 0, false);
		fighters[1] = new FighterComponent(arena, 1, true);
		
		fightersPanel.add(fighters[0]);
		fightersPanel.add(fighters[1]);
		
		add(fightersPanel);
		
		distanceLabel = new JLabel("Load two Fighters to start.");
		distanceLabel.setAlignmentX(0.5f);
		add(distanceLabel);
		
		add(getLoadButtons());	
		add(getMenuButtons());
		pack();
		setVisible(true);
		setTimer();
	}
	
	private void setTimer()
	{
		new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (checkbox.isSelected()) {
					arena.doMoves();
					updateView();
				}
			}
		}).start();
	}
	
	private void updateView() {
		fighters[0].repaint();
		fighters[1].repaint();
		
		distanceLabel.setText("Distance: " + Math.round(arena.getDistanceBetweenBots()));
	}
	
	private JPanel getLoadButtons() {
		JPanel buttonPanel = new JPanel();
		
		JButton loadFighter1 = new JButton("Load fighter 1");
		loadFighter1.addMouseListener(new LoadFighterClickHandler(this, 0));
		buttonPanel.add(loadFighter1);
		
		buttonPanel.add(Box.createHorizontalStrut(150));
		
		JButton loadFighter2 = new JButton("Load fighter 2");
		loadFighter2.addMouseListener(new LoadFighterClickHandler(this, 1));
		buttonPanel.add(loadFighter2);
		
		
		return buttonPanel;
	}
	
	private JPanel getMenuButtons() {
		JPanel buttonPanel = new JPanel();
		
		checkbox = new JCheckBox("Step automaticly");
		buttonPanel.add(checkbox);
		
		JButton stepButton = new JButton("Do step");
		stepButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				arena.doMoves();
				updateView();
			}
		});
		buttonPanel.add(stepButton);
		
		JButton restartButton = new JButton("Restart");
		restartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				arena.restartRound();
				updateView();
			}
		});
		buttonPanel.add(restartButton);
		
		JButton closeButton = new JButton("Close");
		closeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		buttonPanel.add(closeButton);
		
		return buttonPanel;
	}
	
	private class LoadFighterClickHandler extends MouseAdapter {		
		private final int index;
		private final Component parent;
		
		public LoadFighterClickHandler(Component parent, int index) {
			this.parent = parent;
			this.index = index;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			JFileChooser fc = new JFileChooser();
			
			fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
			fc.addChoosableFileFilter(new SafFileFilter());
			if (fc.showOpenDialog(parent) == JFileChooser.APPROVE_OPTION) {
				String result = arena.openBotDefinition(index, fc.getSelectedFile());
				
				if (result == null)
					updateView();
				else
					JOptionPane.showMessageDialog(parent, result, TITLE, JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}
