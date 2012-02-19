package saf.presentation;

import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class View extends JPanel {

	/**
	 * Create the panel.
	 */
	public View() {
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(100);
		progressBar_1.setOrientation(SwingConstants.VERTICAL);
		add(progressBar_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(100);
		progressBar.setOrientation(SwingConstants.VERTICAL);
		add(progressBar);

	}

}
