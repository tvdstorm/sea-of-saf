package arena;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Popupscreen extends JFrame
{
	private final static String newline = "\n";

	private static final long serialVersionUID = -8944872185331109788L;
	private JPanel contentPane;
	private JTextArea textArea;
	 
	public void addMessage(String msg)
	{
		textArea.append(msg+newline);
	}
	
	public void addMessage(List<String> list)
	{
		for (String s : list)
		{
			addMessage(s);
		}
	}
	
	public boolean hasMessages()
	{
		return !textArea.getText().isEmpty();
	}
	
	public Popupscreen()
	{
		setTitle("Message");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout()); 
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

		contentPane.add(textArea, BorderLayout.CENTER);
	}
	
	
}
