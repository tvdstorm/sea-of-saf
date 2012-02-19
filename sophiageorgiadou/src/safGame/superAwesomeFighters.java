package safGame;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import abstractSyntaxTree.Fighter;

import parser.ParseException;
import parser.Saf;

@SuppressWarnings("serial")
/**
 * This class represents the main class of Super Awesome Fighters application
 * @author Sofia
 *
 */
public class superAwesomeFighters extends JFrame {
	
	private JTextArea textResults;
	private Container container;
	private boolean checkBrowse = false;
	public static File myFile = new File(".");
	
	/**
	 * Parse the file through the parser
	 * @param path
	 * @return
	 */
	public static ArrayList<Fighter> safParser(File path){

		InputStream stream = null;
		ArrayList<Fighter> fighters=null;
		
		try {
		//	safInput = "fighters.saf";
			stream = new FileInputStream(path);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"File ERROR: See console for details");
			System.out.println("SYNTAX ERROR: " + e.getMessage());
//			e.printStackTrace();
			System.exit(-1);
		}

		Saf parser = new Saf(stream);

		System.out.println("Parsing...");

		try {
			fighters = parser.Parse();
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null,"SYNTAX ERROR: See console for details");
			System.out.println("SYNTAX ERROR: " + e.getMessage());
			//e.printStackTrace();
			System.exit(-1);
		}
		JOptionPane.showMessageDialog(null,"Parser status: SUCCEED");	
		System.out.println("Parser status: SUCCEED");	
		
		return fighters;
	}
	
	/**
	 * Shows the main screen of the game
	 */
	public void startGame(){
		this.setTitle("Super Awesome Fighters");
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridBagLayout());

		container = getContentPane();
		container.setLayout(new BorderLayout());
		
		Icon welcomeIcon = new ImageIcon("saf.gif");
		JLabel label = new JLabel(welcomeIcon);
		container.add(label, BorderLayout.CENTER);

		textResults = new JTextArea("");
		textResults.setToolTipText("ver 0.1");

		textResults.setText("Choose a File where the fighters are\n");
		textResults.setEditable(false);
		// container.add(textResults, BorderLayout.NORTH);

		JButton browseButton = new JButton("Browse...");
		// container.add(browseButton,BorderLayout.SOUTH);
		browseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResults.setEditable(true);
				JFileChooser x = new JFileChooser();				
				x.setFileSelectionMode(JFileChooser.FILES_ONLY);
				x.setCurrentDirectory(myFile);
				x.showOpenDialog(superAwesomeFighters.this);
				myFile = x.getSelectedFile();
				if (myFile != null) {
					textResults.setText(myFile.toString());
					checkBrowse = true;
				} else
					checkBrowse = false;
				textResults.setEditable(false);
			}
		});

		JButton nextButton = new JButton("Start!");
		// container.add(nextButton,BorderLayout.SOUTH);
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textResults.setEditable(true);
				if (checkBrowse == true) {
					
					SafThread safthread = new SafThread ();
					safthread.start ();
					
					checkBrowse = false;
					container.removeAll();
				} else
					textResults.setText("You didn't choose a file"
							+ " that contains fighters\n");
				textResults.setEditable(false);
			}
		});

		JButton quitButton = new JButton("EXIT");
		// container.add(quitButton);
		quitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,
						"Thanks For Using SAF");
				System.exit(0);
			}
		});

		GridBagConstraints c = new GridBagConstraints();
		c.weighty = 1;
		// c.weightx=1;
		buttonPanel.add(browseButton, c);

		c.weightx = 2;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = GridBagConstraints.REMAINDER;
		buttonPanel.add(textResults, c);

		c.weightx = 3;

		GridBagConstraints c2 = new GridBagConstraints();
		c2.fill = GridBagConstraints.BOTH;
		c2.weightx = 1.0;
		buttonPanel.add(nextButton, c2);
		buttonPanel.add(new JLabel(), c2);
		buttonPanel.add(new JLabel(), c2);
		c.gridwidth = GridBagConstraints.REMAINDER; // end row
		buttonPanel.add(quitButton, c2);

		container.add(buttonPanel, BorderLayout.SOUTH);
		setSize(500, 500);
		setVisible(true);

		// setVisible(false);
		// container.removeAll();
	}

	
	/**
	 * MAIN
	 * @param args
	 */
	public static void main(String[] args) {
		superAwesomeFighters handler=new superAwesomeFighters();
		handler.startGame();
	}

}

/**
 * This class was build in order to provide a thread
 * @author Sofia
 *
 */
class SafThread extends Thread
{
	/**
	 * Thread run function
	 */
   public void run ()
   {
		safGame game=new safGame();
		ArrayList<Fighter> fighters=null;
		fighters=superAwesomeFighters.safParser(superAwesomeFighters.myFile);
		game.startSimulation(fighters);
   }
}
