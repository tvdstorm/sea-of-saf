package com.blommesteijn.uva.sc.saf.runner.view.app;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.SpringLayout;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTree;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.ComponentOrientation;
import javax.swing.border.EtchedBorder;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeModel;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;

public class GuiApplication
{
	private JFrame _frame;
	private JTextPane _outputPaneLeft;
	private JTextField _score;
	private JTextField _action;
	private JTextPane _outputPaneRight;

	/**
	 * Create the application.
	 */
	public GuiApplication()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		_frame = new JFrame();
		_frame.setTitle("Super Awesome Fighter GUI");
		_frame.setBounds(100, 100, 624, 461);
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_frame.getContentPane().setBounds(100, 100, 100, 100);
		_frame.getContentPane().setLayout(new BorderLayout(0, 0));
		_frame.setMinimumSize(new Dimension(400, 200));
		
		JPanel bottom = new JPanel();
		_frame.getContentPane().add(bottom, BorderLayout.SOUTH);
		
		Dimension minimumSize = new Dimension(100, 50);
		
		JPanel top = new JPanel();
		_frame.getContentPane().add(top, BorderLayout.NORTH);

		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("SAF 0.0.1") {
				{
					add(new DefaultMutableTreeNode("D. Blommesteijn"));
					add(new DefaultMutableTreeNode("UvA id: 10276726"));
				}
			}
		));
		tree.setBackground(new Color(250,250,250));
		tree.setRootVisible(false);
		tree.setShowsRootHandles(true);
		tree.setAlignmentX(Component.LEFT_ALIGNMENT);
		tree.setAlignmentY(Component.TOP_ALIGNMENT);
		tree.setMinimumSize(minimumSize);
		tree.repaint();
		
		JScrollPane scrollPane = new JScrollPane(tree);
		scrollPane.setBorder(null);
		scrollPane.setMinimumSize(minimumSize);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		JPanel contentScrollPane = new JPanel();
		contentScrollPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		contentScrollPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		contentScrollPane.setBackground(Color.WHITE);
		contentScrollPane.setMinimumSize(minimumSize);
		contentScrollPane.setLayout(new BorderLayout(0, 0));
				
		
		_outputPaneLeft = new JTextPane();
		_outputPaneLeft.setFont(new Font("Courier", Font.PLAIN, 13));
		_outputPaneLeft.setText("center");
		_outputPaneLeft.setEditable(false);
		contentScrollPane.add(_outputPaneLeft, BorderLayout.WEST);
		
		
		JSplitPane center = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane, contentScrollPane);
		
		_score = new JTextField();
		_score.setFont(new Font("Courier", Font.PLAIN, 13));
		contentScrollPane.add(_score, BorderLayout.NORTH);
		_score.setColumns(10);
		
		_action = new JTextField();
		_action.setFont(new Font("Courier", Font.PLAIN, 10));
		_action.setColumns(10);
		contentScrollPane.add(_action, BorderLayout.SOUTH);
		
		_outputPaneRight = new JTextPane();
		_outputPaneRight.setText("center");
		_outputPaneRight.setFont(new Font("Courier", Font.PLAIN, 13));
		_outputPaneRight.setEditable(false);
		contentScrollPane.add(_outputPaneRight, BorderLayout.EAST);
		center.setBackground(new Color(250,250,250));
		center.setForeground(Color.LIGHT_GRAY);
		center.setContinuousLayout(true);
		center.setDividerLocation(200);
		center.scrollRectToVisible(new Rectangle(10,10));
		
		
		_frame.getContentPane().add(center, BorderLayout.CENTER);
		
		
		
	}

	/**
	 * @return the frame
	 */
	public JFrame getFrame()
	{
		return _frame;
	}
	
	
	
	public void setOutputPaneLeft(String text)
	{
		_outputPaneLeft.setText(text);
	}
	
	public void setActionText(String text)
	{
		_action.setText(text);
	}
	
	public void setScoreText(String text)
	{
		_score.setText(text);
	}

	public void setOutputPaneRight(String text) 
	{
		_outputPaneRight.setText(text);
	}

}
