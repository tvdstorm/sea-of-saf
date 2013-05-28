package gui;

import game.Jury;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingWorker;

public class MainPanel extends JPanel implements UpdatableGui {
	
	private Jury jury;
	private JButton startButton;
	private JLabel infoLabel;
	
	public MainPanel(Jury jury){
		this.jury = jury;
		init();
	}
	
	private void init(){
		this.setSize(300, 100);
		this.setLayout(new FlowLayout());
		this.startButton = createStartButton();
		this.infoLabel = new JLabel();
		infoLabel.setFont(new Font("Serif", Font.PLAIN, 14));
		this.add(startButton);
		this.add(infoLabel);
		
		
		this.setVisible(true);
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
			infoLabel.setText(jury.getWinningFighters().get(0).getAst().getName() + "\nWINS!");
			break;
		default:
			break;
		
		}
	}

}
