/*
 * Form.java
 *
 * Created on __DATE__, __TIME__
 */

package saf.game.gui;

/**
 *
 * @author  __USER__
 */
public class GameForm extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form Form */
	public GameForm() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabelHeader = new javax.swing.JLabel();
		jPanelContent = new javax.swing.JPanel();
		jPanelBotOne1 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabelBotRightName = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jListBotRightChars = new javax.swing.JList();
		jScrollPane4 = new javax.swing.JScrollPane();
		jListBotRightBehaviors = new javax.swing.JList();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jButtonBotRightLoad = new javax.swing.JButton();
		jPanelBotOne = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabelBotLeftName = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jListBotLeftChars = new javax.swing.JList();
		jScrollPane2 = new javax.swing.JScrollPane();
		jListBotLeftBehaviors = new javax.swing.JList();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jButtonBotLeftLoad = new javax.swing.JButton();
		jPanelGameArea = new javax.swing.JPanel();
		jPanelGameButtons = new javax.swing.JPanel();
		jButtonStart = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jProgressBarDistance = new javax.swing.JProgressBar();
		jProgressBarLeftHP = new javax.swing.JProgressBar();
		jProgressBarRightHP = new javax.swing.JProgressBar();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabelMaxDistance = new javax.swing.JLabel();
		jPanelGameArena = new saf.game.gui.component.GameArena();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setMinimumSize(new java.awt.Dimension(800, 500));
		setResizable(false);

		jLabelHeader.setFont(new java.awt.Font("Segoe UI", 0, 36));
		jLabelHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabelHeader.setText("Welcome to the Super Awesome Fighters game!");
		jLabelHeader.setFocusable(false);
		jLabelHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		jPanelBotOne1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

		jLabel6.setText("Fighter 2");

		jLabel7.setText("Name");

		jListBotRightChars.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		jListBotRightChars.setPreferredSize(new java.awt.Dimension(150, 100));
		jScrollPane3.setViewportView(jListBotRightChars);

		jListBotRightBehaviors.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		jListBotRightBehaviors.setPreferredSize(new java.awt.Dimension(0, 100));
		jScrollPane4.setViewportView(jListBotRightBehaviors);

		jLabel8.setText("Characteristics");

		jLabel9.setText("Behaviors");

		jButtonBotRightLoad.setText("Load fighter");

		javax.swing.GroupLayout jPanelBotOne1Layout = new javax.swing.GroupLayout(jPanelBotOne1);
		jPanelBotOne1.setLayout(jPanelBotOne1Layout);
		jPanelBotOne1Layout
				.setHorizontalGroup(jPanelBotOne1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelBotOne1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanelBotOne1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jScrollPane4,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE, 432,
																Short.MAX_VALUE)
														.addComponent(jScrollPane3,
																javax.swing.GroupLayout.DEFAULT_SIZE, 432,
																Short.MAX_VALUE)
														.addGroup(
																jPanelBotOne1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanelBotOne1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(jLabel6)
																						.addGroup(
																								jPanelBotOne1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel7)
																										.addGap(18, 18,
																												18)
																										.addComponent(
																												jLabelBotRightName)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				285, Short.MAX_VALUE)
																		.addComponent(jButtonBotRightLoad))
														.addGroup(
																jPanelBotOne1Layout.createSequentialGroup()
																		.addComponent(jLabel8).addGap(188, 188, 188))
														.addComponent(jLabel9)).addContainerGap()));
		jPanelBotOne1Layout
				.setVerticalGroup(jPanelBotOne1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelBotOne1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanelBotOne1Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanelBotOne1Layout
																		.createSequentialGroup()
																		.addComponent(jLabel6)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanelBotOne1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(jLabel7)
																						.addComponent(
																								jLabelBotRightName)))
														.addComponent(jButtonBotRightLoad))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel8)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel9)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanelBotOne.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

		jLabel2.setText("Fighter 1");

		jLabel3.setText("Name");

		jListBotLeftChars.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		jListBotLeftChars.setPreferredSize(new java.awt.Dimension(150, 100));
		jScrollPane1.setViewportView(jListBotLeftChars);

		jListBotLeftBehaviors.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		jListBotLeftBehaviors.setPreferredSize(new java.awt.Dimension(0, 100));
		jScrollPane2.setViewportView(jListBotLeftBehaviors);

		jLabel4.setText("Characteristics");

		jLabel5.setText("Behaviors");

		jButtonBotLeftLoad.setText("Load fighter");

		javax.swing.GroupLayout jPanelBotOneLayout = new javax.swing.GroupLayout(jPanelBotOne);
		jPanelBotOne.setLayout(jPanelBotOneLayout);
		jPanelBotOneLayout
				.setHorizontalGroup(jPanelBotOneLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelBotOneLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanelBotOneLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jScrollPane2,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE, 293,
																Short.MAX_VALUE)
														.addComponent(jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE, 293,
																Short.MAX_VALUE)
														.addGroup(
																jPanelBotOneLayout
																		.createSequentialGroup()
																		.addGroup(
																				jPanelBotOneLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(jLabel2)
																						.addGroup(
																								jPanelBotOneLayout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel3)
																										.addGap(18, 18,
																												18)
																										.addComponent(
																												jLabelBotLeftName)))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				146, Short.MAX_VALUE)
																		.addComponent(jButtonBotLeftLoad))
														.addComponent(jLabel4).addComponent(jLabel5)).addContainerGap()));
		jPanelBotOneLayout
				.setVerticalGroup(jPanelBotOneLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelBotOneLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanelBotOneLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanelBotOneLayout
																		.createSequentialGroup()
																		.addComponent(jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanelBotOneLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(jLabel3)
																						.addComponent(jLabelBotLeftName)))
														.addComponent(jButtonBotLeftLoad))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel5)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		jPanelGameArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

		jPanelGameButtons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

		jButtonStart.setText("Start duel");

		jLabel1.setText("Distance:");

		jLabel10.setText("Fighter 1 HP:");

		jLabel11.setText("Fighter 2 HP:");

		jProgressBarDistance.setMaximum(450);

		jLabel12.setText("0");

		jLabel13.setText("0");

		jLabel14.setText("0");

		jLabel15.setText("100");

		jLabel16.setText("100");

		jLabelMaxDistance.setText("450");

		javax.swing.GroupLayout jPanelGameButtonsLayout = new javax.swing.GroupLayout(jPanelGameButtons);
		jPanelGameButtons.setLayout(jPanelGameButtonsLayout);
		jPanelGameButtonsLayout.setHorizontalGroup(jPanelGameButtonsLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanelGameButtonsLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jButtonStart)
						.addGroup(
								jPanelGameButtonsLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												jPanelGameButtonsLayout
														.createSequentialGroup()
														.addGap(18, 18, 18)
														.addComponent(jLabel14)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jProgressBarDistance,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jPanelGameButtonsLayout.createSequentialGroup().addGap(81, 81, 81)
														.addComponent(jLabel1)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(
								jPanelGameButtonsLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(
												jPanelGameButtonsLayout
														.createSequentialGroup()
														.addGap(5, 5, 5)
														.addComponent(jLabelMaxDistance)
														.addGap(26, 26, 26)
														.addComponent(jLabel13)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jProgressBarLeftHP,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE).addGap(5, 5, 5)
														.addComponent(jLabel16).addGap(29, 29, 29))
										.addGroup(
												javax.swing.GroupLayout.Alignment.TRAILING,
												jPanelGameButtonsLayout
														.createSequentialGroup()
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jLabel10).addGap(92, 92, 92)))
						.addGroup(
								jPanelGameButtonsLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												jPanelGameButtonsLayout
														.createSequentialGroup()
														.addComponent(jLabel12)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jProgressBarRightHP,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel15))
										.addGroup(
												jPanelGameButtonsLayout.createSequentialGroup().addGap(46, 46, 46)
														.addComponent(jLabel11))).addGap(15, 15, 15)));
		jPanelGameButtonsLayout
				.setVerticalGroup(jPanelGameButtonsLayout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelGameButtonsLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanelGameButtonsLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButtonStart)
														.addGroup(
																jPanelGameButtonsLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addGroup(
																				jPanelGameButtonsLayout
																						.createSequentialGroup()
																						.addComponent(jLabel1)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addGroup(
																								jPanelGameButtonsLayout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																										.addComponent(
																												jLabel14)
																										.addComponent(
																												jProgressBarDistance,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addGroup(
																				jPanelGameButtonsLayout
																						.createSequentialGroup()
																						.addGroup(
																								jPanelGameButtonsLayout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																										.addComponent(
																												jLabel10)
																										.addComponent(
																												jLabel11))
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addGroup(
																								jPanelGameButtonsLayout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jLabel12)
																										.addGroup(
																												jPanelGameButtonsLayout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel15)
																														.addComponent(
																																jProgressBarRightHP,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addGroup(
																												jPanelGameButtonsLayout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel13)
																														.addComponent(
																																jProgressBarLeftHP,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																javax.swing.GroupLayout.PREFERRED_SIZE))
																										.addComponent(
																												jLabel16)
																										.addComponent(
																												jLabelMaxDistance)))))
										.addContainerGap(17, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanelGameArenaLayout = new javax.swing.GroupLayout(jPanelGameArena);
		jPanelGameArena.setLayout(jPanelGameArenaLayout);
		jPanelGameArenaLayout.setHorizontalGroup(jPanelGameArenaLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 758, Short.MAX_VALUE));
		jPanelGameArenaLayout.setVerticalGroup(jPanelGameArenaLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 286, Short.MAX_VALUE));

		javax.swing.GroupLayout jPanelGameAreaLayout = new javax.swing.GroupLayout(jPanelGameArea);
		jPanelGameArea.setLayout(jPanelGameAreaLayout);
		jPanelGameAreaLayout.setHorizontalGroup(jPanelGameAreaLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanelGameAreaLayout
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								jPanelGameAreaLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jPanelGameArena, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanelGameButtons, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE))
						.addContainerGap()));
		jPanelGameAreaLayout.setVerticalGroup(jPanelGameAreaLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanelGameAreaLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(jPanelGameButtons, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanelGameArena, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addContainerGap()));

		javax.swing.GroupLayout jPanelContentLayout = new javax.swing.GroupLayout(jPanelContent);
		jPanelContent.setLayout(jPanelContentLayout);
		jPanelContentLayout.setHorizontalGroup(jPanelContentLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanelContentLayout
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								jPanelContentLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(
												jPanelContentLayout
														.createSequentialGroup()
														.addComponent(jPanelBotOne,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jPanelBotOne1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(jPanelGameArea, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));
		jPanelContentLayout.setVerticalGroup(jPanelContentLayout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanelContentLayout
						.createSequentialGroup()
						.addContainerGap()
						.addGroup(
								jPanelContentLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jPanelBotOne1, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jPanelBotOne, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jPanelGameArea, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup().addContainerGap().addComponent(jLabelHeader)
								.addContainerGap(30, Short.MAX_VALUE))
				.addComponent(jPanelContent, javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup()
						.addComponent(jLabelHeader)
						.addGap(18, 18, 18)
						.addComponent(jPanelContent, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GameForm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	protected javax.swing.JButton jButtonBotLeftLoad;
	protected javax.swing.JButton jButtonBotRightLoad;
	protected javax.swing.JButton jButtonStart;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	protected javax.swing.JLabel jLabelBotLeftName;
	protected javax.swing.JLabel jLabelBotRightName;
	public javax.swing.JLabel jLabelHeader;
	private javax.swing.JLabel jLabelMaxDistance;
	protected javax.swing.JList jListBotLeftBehaviors;
	protected javax.swing.JList jListBotLeftChars;
	protected javax.swing.JList jListBotRightBehaviors;
	protected javax.swing.JList jListBotRightChars;
	private javax.swing.JPanel jPanelBotOne;
	private javax.swing.JPanel jPanelBotOne1;
	private javax.swing.JPanel jPanelContent;
	public javax.swing.JPanel jPanelGameArea;
	public javax.swing.JPanel jPanelGameArena;
	private javax.swing.JPanel jPanelGameButtons;
	protected javax.swing.JProgressBar jProgressBarDistance;
	protected javax.swing.JProgressBar jProgressBarLeftHP;
	protected javax.swing.JProgressBar jProgressBarRightHP;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	// End of variables declaration//GEN-END:variables

}