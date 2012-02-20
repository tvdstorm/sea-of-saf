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

public class GuiApplication
{
	private JFrame _frame;

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

        final CustomTreeCellRenderer renderer = new CustomTreeCellRenderer();

		JTree tree = new JTree();
		tree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				System.out.println("mouse release");
			}
		});
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Config") {
				{
					add(new DefaultMutableTreeNode("Fighters"));
				}
			}
		));
		tree.setBackground(new Color(250,250,250));
		tree.setRootVisible(false);
		tree.setShowsRootHandles(true);
		tree.setAlignmentX(Component.LEFT_ALIGNMENT);
		tree.setAlignmentY(Component.TOP_ALIGNMENT);
		tree.setMinimumSize(minimumSize);
		renderer.setRendererIcon(new EmptyIcon());
		tree.setCellRenderer(renderer);
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
		
				
		JSplitPane center = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane, contentScrollPane);
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

	@SuppressWarnings("serial")
	private static class CustomTreeCellRenderer extends DefaultTreeCellRenderer
	{

		Icon rendererIcon;

		public void setRendererIcon(Icon myIcon)
		{
			this.rendererIcon = myIcon;
		};

		public Component getTreeCellRendererComponent(JTree tree, Object value,
				boolean selected, boolean expanded, boolean leaf, int row,
				boolean hasFocus)
		{

			Component ret = super.getTreeCellRendererComponent(tree, value,
					selected, expanded, leaf, row, hasFocus);

			JLabel label = (JLabel) ret;

			label.setIcon(rendererIcon);

			return ret;
		}
	}

	private final class EmptyIcon implements Icon
	{

		private int width;
		private int height;

		public EmptyIcon()
		{
			this(0, 0);
		}

		public EmptyIcon(int width, int height)
		{
			this.width = width;
			this.height = height;
		}

		public int getIconHeight()
		{
			return height;
		}

		public int getIconWidth()
		{
			return width;
		}

		public void paintIcon(Component c, Graphics g, int x, int y)
		{
		}

	}

}
