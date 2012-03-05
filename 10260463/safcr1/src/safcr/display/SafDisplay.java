package safcr.display;

import java.awt.Dimension;
import javax.swing.JFrame;

public class SafDisplay extends JFrame {
	private static final long serialVersionUID = 1L;
	private String title = "Super Awesome Fighter";
	private Dimension windowSize = new Dimension(1000,600);
	private Board b;
	
	public SafDisplay(){
		b = new Board();
		add(b);
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(windowSize);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
	
	public Board getBoard(){
		return b;
	}
	
}
