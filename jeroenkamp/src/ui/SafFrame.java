package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SafFrame extends JFrame implements ActionListener{

	private PlayerPanel m_Panelp1;
	private PlayerPanel m_Panelp2;
	
	private JButton m_Fight;
	
	private Canvas m_Area;
	
	private static final long serialVersionUID = 1L;
	public SafFrame(String [] args){
		Container c=this.getContentPane();
		c.setLayout(new BorderLayout());
		Container menu=new Container();
		c.add(menu,BorderLayout.NORTH);
		m_Area=new Canvas();
		c.add(m_Area,BorderLayout.CENTER);
		
		setMenu(menu);
		
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
	public static void main(String[] args){
		SafFrame frame=new SafFrame(args);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//start the fighting
	}
	
}
