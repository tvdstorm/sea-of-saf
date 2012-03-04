package arena;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Popupscreen extends JFrame
{

	private static final long serialVersionUID = -8944872185331109788L;
	private JPanel _contentPane;
	private JTextArea _textArea;
	 
	public void addMessage(String msg)
	{
		_textArea.append(msg+"\n");
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
		return !_textArea.getText().isEmpty();
	}
	
	public Popupscreen()
	{
		setTitle("Message");
		setBounds(100, 100, 200, 200);
		_contentPane = new JPanel();
		_contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(_contentPane);
		_contentPane.setLayout(new BorderLayout()); 
		
		_textArea = new JTextArea();
		_textArea.setEditable(false);
		_textArea.setLineWrap(true);
		_textArea.setWrapStyleWord(true);

		_contentPane.add(_textArea, BorderLayout.CENTER);
	}
}
