/* Copyright (c) 2012 Mike Bierlee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package nl.uva.saf.simulation.UI;

import javax.swing.JDialog;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.WindowConstants;

import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

import nl.uva.saf.fdl.ValidationReport;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ValidationErrorsDialog extends JDialog {
	private static final long serialVersionUID = -1006958901591363925L;
	private JTextArea errorTextArea;

	private final ValidationErrorsDialog eventSourceWindow = this;

	private ValidationReport report;

	public ValidationErrorsDialog() {
		setProperties();

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel, BorderLayout.SOUTH);

		JButton btnClose = new JButton("Close");
		btnClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent event) {
				eventSourceWindow.dispose();
			}
		});
		btnClose.setMnemonic('C');
		panel.add(btnClose);

		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FormLayout(new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), }, new RowSpec[] { FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC, RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, }));

		JLabel lblThereWereErrors = new JLabel("There were errors while loading the fighter:");
		panel_1.add(lblThereWereErrors, "2, 2");

		errorTextArea = new JTextArea();
		errorTextArea.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		errorTextArea.setLineWrap(true);
		errorTextArea.setEditable(false);
		panel_1.add(errorTextArea, "2, 4, fill, fill");

		JLabel lblTheSimulationCannot = new JLabel("The simulation cannot start with improperly defined fighters.");
		panel_1.add(lblTheSimulationCannot, "2, 6");
	}

	public ValidationReport getReport() {
		return report;
	}

	private void setProperties() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Validation Errors");
		setModal(true);
		setPreferredSize(new Dimension(690, 360));
		setSize(new Dimension(690, 360));
		getContentPane().setLayout(new BorderLayout(0, 0));
	}
	public void setReport(ValidationReport report) {
		this.report = report;

		if (report != null) {
			String reportText = report.getFighterFile() + ": " + report.getWarnings().size() + " warning(s), "
					+ report.getErrors().size() + " error(s).\n";

			for (String error : report.getErrors()) {
				reportText += "\nError: " + error;
			}

			for (String warning : report.getWarnings()) {
				reportText += "\nWarning: " + warning;
			}

			errorTextArea.setText(reportText);
		}
	}

}
