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

	public static void initMessageReporter(JFrame parentFrame) {
		if (singleton == null) {
			singleton = new MessageReporter(parentFrame);
		}
	}

	// TODO improve aspect
	public static void reportMessages(List<Message> messages) {

		JOptionPane.showMessageDialog(singleton.parentFrame,
				messages.toString(), "Errors", JOptionPane.ERROR_MESSAGE);
		singleton.parentFrame.dispose();
	}

	// TODO improve aspect
	public static void reportMessages(Message messages) {
		JOptionPane.showMessageDialog(singleton.parentFrame,
				messages.toString(), "Errors", JOptionPane.ERROR_MESSAGE);
		singleton.parentFrame.dispose();
	}
}
