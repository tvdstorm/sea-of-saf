package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SafFrame extends JFrame implements ActionListener{

	private PlayerPanel m_Panelp1;
	private PlayerPanel m_Panelp2;
	
	private JButton m_Fight;
	
	private SafScreen m_Area;
	
	private static final long serialVersionUID = 1L;
	public SafFrame(IFighter p1,IFighter p2){
		Container c=this.getContentPane();
		c.setLayout(new BorderLayout());
		Container menu=new Container();
		c.add(menu,BorderLayout.NORTH);
		m_Area=new SafScreen(p1,p2);
		c.add(m_Area,BorderLayout.CENTER);
		
		setMenu(menu);
		setSize(400, 400);
		setVisible(true);
		
	}
	private void setMenu(Container menu){
		menu.setLayout(new FlowLayout());
		m_Panelp1=new PlayerPanel();
		menu.add(m_Panelp1);
		
		m_Fight=new JButton("Fight");
		m_Fight.addActionListener(this);
		menu.add(m_Fight);
		
		m_Panelp2=new PlayerPanel();
		menu.add(m_Panelp2);
	}
	public Component getCanvas(){
		return m_Area;
	}
	public void gameOver(){
		//do something with it
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//start the fighting
	}
	
}
