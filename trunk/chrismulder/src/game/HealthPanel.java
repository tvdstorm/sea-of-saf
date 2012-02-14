package game;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HealthPanel extends JPanel{
	private JLabel score1, score2;
	
	public HealthPanel(String name1, String name2) {
		score1 = new JLabel("100");
		score2 = new JLabel("100");
		
		add(new JLabel(name1));
		add(score1);
		add(new JLabel(name2));
		add(score2);
	}
	

	public void updateHealth(int health1, int health2) {
		score1.setText(Integer.toString(health1));
		score2.setText(Integer.toString(health2));
	}

}
