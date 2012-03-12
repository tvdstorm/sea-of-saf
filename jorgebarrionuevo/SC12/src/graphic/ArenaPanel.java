package graphic;
import java.awt.BorderLayout;

import javax.swing.JPanel;

import javax.swing.JFrame;

public class ArenaPanel implements ArenaConfiguration
{
	private JPanel mainPanel = new JPanel();
	
	public ArenaPanel()
	{
		mainPanel.setPreferredSize(SIZE_ARENA);
		mainPanel.setBackground(BACKGROUND_COLOR);
		mainPanel.setLayout(new BorderLayout(5, 5));
		JFrame frame = new JFrame(TITLE);
	    frame.getContentPane().add(mainPanel);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}

}