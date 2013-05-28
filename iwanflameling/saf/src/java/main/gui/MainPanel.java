package gui;

import game.Jury;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingWorker;

public class MainPanel extends JPanel implements UpdatableGui {
	
	private Jury jury;
	private JButton startButton;
	private JLabel infoLabel;
	public static final int WIDTH = Arena.WIDTH-(2*HealthPanel.WIDTH);
	public static final int HEIGHT = Arena.HEIGHT-Battlefield.HEIGHT;;
	
	public MainPanel(Jury jury){
		this.jury = jury;
		init();
	}
	
	private void init(){
		//this.setBorder(BorderFactory.createTitledBorder("MainPanel"));
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.startButton = createStartButton();
		this.startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.infoLabel = new JLabel();
		this.infoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		infoLabel.setFont(new Font("Arial Black", Font.BOLD, 26));
		this.add(startButton);
		this.add(infoLabel);
	}
	
	private JButton createStartButton(){
		final JButton startButton = new JButton("Start");
		startButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				startButton.setEnabled(false);
				SwingWorker<Void, Void> sw = new SwingWorker<Void, Void>() {

					@Override
					protected Void doInBackground() throws Exception {
						jury.startFight();
						return null;
					}
				};
				sw.execute();
			}
		});
		return startButton;
	}

	@Override
	public void update() {
		switch(jury.outcome()){
		case NO_WINNERS:
			break;
		case TIE:
			infoLabel.setText("It's a tie.");
			break;
		case WHIMPS:
			infoLabel.setText("Fight stopped\ndue to cowardice");
			break;
		case WINNER:
			infoLabel.setText(jury.getWinningFighters().get(0).getAst().getName() + " WINS!");
			break;
		default:
			break;
		
		}
	}

}
