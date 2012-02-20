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

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JList;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.ListSelectionModel;

import nl.uva.saf.ANTLFighterLoader;
import nl.uva.saf.fdl.TreeValidator;
import nl.uva.saf.fdl.ValidationReport;
import nl.uva.saf.fdl.ast.ITreeNode;
import nl.uva.saf.simulation.FighterBot;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class FighterLoadDialog extends JDialog {
	final FighterLoadDialog eventSourceWindow = this;

	private List<FighterBot> loadedFighters;

	public FighterLoadDialog() {
		setProperties();

		loadedFighters = new ArrayList<FighterBot>();

		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel, BorderLayout.SOUTH);

		JButton btnStartFightButton = new JButton("Start Fight");
		addCloseDialogAction(btnStartFightButton);
		btnStartFightButton.setMnemonic('S');
		panel.add(btnStartFightButton);

		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FormLayout(
				new ColumnSpec[] { FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"),
						FormFactory.RELATED_GAP_COLSPEC, ColumnSpec.decode("default:grow"), }, new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC, FormFactory.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"), }));

		JLabel lblBlueFighter = new JLabel("Blue Fighter:");
		panel_1.add(lblBlueFighter, "2, 2");

		JLabel lblRedFighter = new JLabel("Red Fighter:");
		panel_1.add(lblRedFighter, "4, 2");

		ListModel fighterListModel = createFighterListModel();

		blueFightersList = new JList(fighterListModel);
		blueFightersList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		blueFightersList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.add(blueFightersList, "2, 4, fill, fill");

		redFightersList = new JList(fighterListModel);
		redFightersList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		redFightersList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.add(redFightersList, "4, 4, fill, fill");
	}

	private void setProperties() {
		setModal(true);
		setSize(new Dimension(600, 470));
		setPreferredSize(new Dimension(600, 470));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("New Fight");
		getContentPane().setLayout(new BorderLayout(0, 0));
	}

	public List<FighterBot> getLoadedFighters() {
		return loadedFighters;
	}

	private void addCloseDialogAction(JButton btnStartFightButton) {
		btnStartFightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent event) {
				String blueFighterFile = (String) blueFightersList.getSelectedValue();
				String redFighterFile = (String) redFightersList.getSelectedValue();

				if (blueFighterFile == null) {
					JOptionPane.showMessageDialog(eventSourceWindow, "Please select a blue fighter.",
							"No blue fighter selected", JOptionPane.INFORMATION_MESSAGE);
				} else if (redFighterFile == null) {
					JOptionPane.showMessageDialog(eventSourceWindow, "Please select a red fighter.",
							"No red fighter selected", JOptionPane.INFORMATION_MESSAGE);
				} else {					
					FighterBot blue = loadFighter(blueFighterFile);
					if (blue != null) {
						loadedFighters.add(blue);	
					}
					
					FighterBot red = loadFighter(redFighterFile);
					if (red != null) {
						loadedFighters.add(red);	
					}

					eventSourceWindow.dispose();
				}
			}

			private FighterBot loadFighter(String fighterFileName) {
				FighterBot loadedBot = null;
				ANTLFighterLoader loader = new ANTLFighterLoader();
				ITreeNode fighter = loader.loadFighter("data/" + fighterFileName);
				TreeValidator validator = new TreeValidator(fighter);
				ValidationReport report = validator.validate();

				if (!report.isValid()) {
					report.setFighterFile(fighterFileName);
					ValidationErrorsDialog errorsDialog = new ValidationErrorsDialog();
					errorsDialog.setReport(report);
					errorsDialog.setLocationRelativeTo(eventSourceWindow);
					errorsDialog.setVisible(true);
				} else {
					loadedBot = new FighterBot(fighter);
				}

				return loadedBot;
			}
		});
	}

	private ListModel createFighterListModel() {
		DefaultListModel listModel = null;

		File dataDirectory = new File("data");
		if (dataDirectory.isDirectory()) {
			FilenameFilter safFilter = new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return name.endsWith(".saf");
				}
			};

			String[] fighters = dataDirectory.list(safFilter);
			listModel = new DefaultListModel();

			for (String fighterFile : fighters) {
				listModel.addElement(fighterFile);
			}
		}

		return listModel;
	}

	private static final long serialVersionUID = 3769851874203955649L;
	private JList blueFightersList;
	private JList redFightersList;
}
