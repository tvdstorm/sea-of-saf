package saf.simulator;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import saf.interpreter.Arena;
import saf.interpreter.Bot;

public class Window {
	private JFrame frame;
    private Arena arenaLogic;
	
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	new Window();
            }
        });
    }

    public Window() {
    	setupFrame();
    	setupGame();
    	setupRenderCanvas();

    	int delay = 1000; //milliseconds
    	ActionListener taskPerformer = new ActionListener() {
    		public void actionPerformed(ActionEvent evt) {
    			arenaLogic.EvaluateBots();
    		}
    	};
    	new Timer(delay, taskPerformer).start();
    }
    
    protected void setupFrame() {
        frame = new JFrame("Super Awesome Fighters");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 768);
        frame.setVisible(true);
    }
    
    protected void setupGame() {
    	this.arenaLogic = new Arena();
    }
    
    protected void setupRenderCanvas() {
        Container con = frame.getContentPane();
        con.setBackground(Color.white);

        Render render = new Render();
        con.add(render); frame.setVisible(true);
        arenaLogic.addObserver(render);
    }
}
