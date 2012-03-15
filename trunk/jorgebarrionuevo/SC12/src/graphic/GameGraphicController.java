package graphic;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGraphicController implements ArenaConfiguration{
	private FighterPanel fighterPanelL = new FighterPanel();
	private FighterPanel fighterPanelR = new FighterPanel();
	JFrame mainFrame = new ArenaFrame();
	private JPanel mainPanel = new JPanel();
	
public GameGraphicController() {
		System.out.println("StartGraphicController");
		
		mainPanel.isOpaque();
		mainPanel.setPreferredSize(SIZE_ARENA);
		mainPanel.setBackground(BACKGROUND_COLOR);
		mainPanel.setLayout(new BorderLayout(5, 5));
		mainFrame.getContentPane().add(mainPanel);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.pack();
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);  
		this.startFighters();
	}

public void startFighters(){
	System.out.println("StartFighters");
//	fighterPanelL.SetImage(ArenaConfiguration.relaxed);
//	fighterPanelR.SetImage(ArenaConfiguration.relaxed);
	//mainFrame.paintComponents(fighterPanelR.getGraphics());
	//fighterPanelL.getGraphics().drawImage(fighterPanelL.getImage(), 200, 200, mainPanel);
	//g.drawImage(fighterRPanel.getImage(), 500, 200, rootPane);

}
	
}