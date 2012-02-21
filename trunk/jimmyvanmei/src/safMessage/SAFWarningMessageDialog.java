package safMessage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SAFWarningMessageDialog extends JDialog {
	private JTextArea textArea;
	
	/**
	 * Create the dialog.
	 */
	public SAFWarningMessageDialog() {
		setBounds(100, 100, 437, 292);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
			getContentPane().add(scrollPane, BorderLayout.CENTER);
			{
				textArea = new JTextArea();
				textArea.setEditable(false);
				textArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
				textArea.setLineWrap(true);
				textArea.setWrapStyleWord(true);
				scrollPane.setViewportView(textArea);
			}
		}
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Warning Dialog");
		setAlwaysOnTop(true);
		setFocusable(true);
	}
	
	public void setWarningMessage(String message)
	{
		textArea.setText(message);
	}
}

