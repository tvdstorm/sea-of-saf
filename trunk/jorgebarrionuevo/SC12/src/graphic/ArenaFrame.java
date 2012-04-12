package graphic;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

import graphic.ArenaConfiguration;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ArenaFrame extends JFrame implements ArenaConfiguration{

	private GameGraphicController graphicController;
	private static final long serialVersionUID = 1L;

	public ArenaFrame(GameGraphicController gc){
		super();
		this.graphicController = gc;
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
		setVisible(true);

	}

}