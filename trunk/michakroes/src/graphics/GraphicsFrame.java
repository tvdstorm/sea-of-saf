package graphics;

import javax.swing.JFrame;
import config.*;

@SuppressWarnings("serial")
public class GraphicsFrame extends JFrame {
	public GraphicsFrame(String title) {
		super(title); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(settings.SCREEN_WIDTH, settings.SCREEN_HEIGHT);
		this.setResizable(false);
	}
	
	public void setPanel(GraphicsPanel gPanel) {
		this.setContentPane(gPanel);          
		this.setVisible(true);
	}
}
