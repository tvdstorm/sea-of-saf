package saf.mvc.views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

import saf.mvc.FighterModel;
import saf.mvc.IView;
import saf.mvc.views.twodfighters.IFighterFigure;
import saf.mvc.views.twodfighters.IFigtherFigureFactory;
import saf.mvc.views.twodfighters.fighterfigures.PencilFigure;

public class SimpleFighterArenaView extends JPanel implements IView {
	private FighterModel leftFighter;
	private FighterModel rightFighter;
	private IFigtherFigureFactory fighterFactory;
	
	static final int APPLICATION_WIDTH = 600;
	static final int APPLICATION_HEIGHT = 350; 
	static final int APPLICATION_X_POSITION = 100;
	static final int APPLICATION_Y_POSITION = 100;
	
	private JFrame f;
	//private JApplet applet;
	//private ArenaRenderer arena;
	
	public SimpleFighterArenaView(IFigtherFigureFactory factory, FighterModel leftFighter, FighterModel rightFighter){		
		this.leftFighter = leftFighter;
		this.rightFighter = rightFighter;
		this.fighterFactory = factory;
		
		f = new JFrame("SAF Fight Area");
//        f.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {System.exit(0);}
//        }); TODO: ???

		f.setTitle("Super Awesome Fighters");
		f.setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);//Size of the total window
		f.setVisible(true);
		f.setBackground(Color.white);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setOpaque(true);//To make the background white!
		
		f.add(this);//Because this is a JPanel add this so the paint event will be called in this class.
	}
	
	public void render() {
		this.repaint();
	}
	
	public void paint(Graphics g) {
		g.clearRect(0, 0, APPLICATION_WIDTH, APPLICATION_HEIGHT);
		g.setColor(Color.BLACK);
		
		g.drawRect(0, 0, APPLICATION_WIDTH, APPLICATION_HEIGHT);
		
		//If one of the fighters disappears out of the window, place them both back in the middle!
		if(this.leftFighter.getX() < 0 || this.leftFighter.getX()* 20 > APPLICATION_WIDTH || 
		   this.rightFighter.getX() < 0 || this.rightFighter.getX()* 20 > APPLICATION_WIDTH){
			
			int toMove = APPLICATION_WIDTH /20/2;//Move half of the size of the window, to get in the middle
			
			this.leftFighter.setX((this.leftFighter.getX() + toMove)%(APPLICATION_WIDTH/20));
			this.rightFighter.setX((this.rightFighter.getX() + toMove)%(APPLICATION_WIDTH/20));
		}
			
		
		//IFighterFigure left = new PencilFigure(leftFighter.getX(), y, moveAction, fightAction)
		
	    this.fighterFactory.createFighterFigure(leftFighter).draw(g);
		this.fighterFactory.createFighterFigure(rightFighter).draw(g);
		System.out.println("rendered!");
	 }
	
//	private void render(Graphics g){
//		fighterFactory.createFighterFigure(leftFighter).draw(g);
//		fighterFactory.createFighterFigure(rightFighter).draw(g);
//	}
//	
//	private class Initializer extends JFrame{
//		private Renderer renderer;
//		private JPanel p;
//		public void initComponents() {
//			p = new JPanel();
//			renderer = new Renderer(this);
//			p.add("Center", renderer);
//		}
//		
//		private class Renderer extends Component {
//			private FighterArenaView.Initializer myView;
//			
//			public Renderer(FighterArenaView.Initializer initializer){
//				this.myView = initializer;
//			}
//			
//			public void paint(Graphics g) {
//				//this.myView.render(g);
//			}
//		}		
//	}
	

}