package graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import graphic.ArenaConfiguration;
import javax.swing.JFrame;

public class ArenaFrame extends JFrame implements ArenaConfiguration{
	private GameGraphicController graphicController;
	private static final long serialVersionUID = 1L;

	public ArenaFrame(GameGraphicController gc){
		super();
		this.setGraphicController(gc);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(TITLE); 
		this.isOpaque();
		this.setPreferredSize(SIZE_ARENA);
		this.setLayout(new BorderLayout(5, 5));
		this.pack();
		Container container = getContentPane();
		FighterPanel fighterFrameLeft = gc.getFighterPanelL();
		FighterPanel fighterFrameRight = gc.getFighterPanelR();        
		container.add(fighterFrameRight);
		this.revalidate();
		container.add(fighterFrameLeft);
		this.revalidate();
		container.setBackground(Color.WHITE);
		setVisible(true);
	}
	public GameGraphicController getGraphicController() {
		return graphicController;
	}
	public void setGraphicController(GameGraphicController graphicController) {
		this.graphicController = graphicController;
	}
}
