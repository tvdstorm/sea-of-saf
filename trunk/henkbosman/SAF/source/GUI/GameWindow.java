package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;



public class GameWindow
{
	public GameWindow()
	{
		JFrame frame = new JFrame("Super Awesome Fighter Arena");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout()); 
		Container container = frame.getContentPane();
		
		placeControls(container);

		//5. Show it.
		frame.setVisible(true);
    }
	
	private void placeControls(Container container)
	{
		JButton b= new JButton("Select fighter");
		container.add(b);
		
	}
		 
	
}