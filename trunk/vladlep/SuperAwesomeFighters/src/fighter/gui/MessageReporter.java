package fighter.gui;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import fighter.messages.Message;

public class MessageReporter {

	private static MessageReporter singleton = null;
	private JFrame parentFrame;

	private MessageReporter(JFrame parentFrame) {
		this.parentFrame = parentFrame;
	}

	public static MessageReporter getMessageReporter(JFrame parentFrame) {
		if (singleton == null) {
			singleton = new MessageReporter(parentFrame);
		}
		return singleton;
	}

	// TODO improve aspect
	public void reportMessages(List<Message> messages) {

		JOptionPane.showMessageDialog(singleton.parentFrame,
				messages.toString(), "Errors", JOptionPane.ERROR_MESSAGE);
		singleton.parentFrame.dispose();
	}

	// TODO improve aspect
	public  void reportMessages(Message messages) {
		JOptionPane.showMessageDialog(singleton.parentFrame,
				messages.toString(), "Errors", JOptionPane.ERROR_MESSAGE);
		singleton.parentFrame.dispose();
	}
}
