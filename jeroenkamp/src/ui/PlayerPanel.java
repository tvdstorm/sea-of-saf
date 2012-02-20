package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class PlayerPanel extends Container {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton m_Browse;
	private JTextField m_PlayerPath;
	
	public PlayerPanel(){
		this.setLayout(new FlowLayout());
		m_PlayerPath=new JTextField();
		this.add(m_PlayerPath);
		m_Browse=new JButton("Browse");
		this.add(m_Browse);
		m_Browse.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				JFileChooser choser=new JFileChooser();
				int returnVal=choser.showOpenDialog(PlayerPanel.this);
		        if (returnVal == JFileChooser.APPROVE_OPTION) {
		        	m_PlayerPath.setText(choser.getSelectedFile().getAbsolutePath());
		        }
			}
		});
	}
	public String getPath(){
		return m_PlayerPath.getText();
	}
}
