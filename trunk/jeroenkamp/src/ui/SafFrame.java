package ui;

import java.awt.*;
import javax.swing.*;

public class SafFrame extends JFrame{
	private SafScreen m_Area;
	
	private static final long serialVersionUID = 1L;
	public SafFrame(IFighter p1,IFighter p2){
		Container c=this.getContentPane();
		c.setLayout(new BorderLayout());
		m_Area=new SafScreen(p1,p2);
		c.add(m_Area,BorderLayout.CENTER);
		
		setSize(400, 400);
		setVisible(true);
	}
	public Component getCanvas(){
		return m_Area;
	}
	public void gameOver(){
		//do something with it
		m_Area.setGameover(true);
	}
	
}
