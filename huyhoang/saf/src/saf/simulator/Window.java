package saf.simulator;

import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import saf.ast.Fighter;

public class Window {
	private JFrame frame;
	private Render render;
	public Render getRender() {
		return render;
	}
	
    private List<Fighter> fighters;
    public List<Fighter> getFighters() {
    	if (fighters == null)
    		fighters = new ArrayList<Fighter>();
    	
    	return fighters;
    }

    public Window() {
    	setupFrame();
    	setupRender();
    }
    
    private void setupFrame() {
        frame = new JFrame("Super Awesome Fighters");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1024, 388);
        frame.setVisible(true);
    }
    
    private void setupRender() {
        Container con = frame.getContentPane();
        con.setBackground(Color.black);

        render = new Render();
        con.add(render);
        frame.setVisible(true);
    }
}
