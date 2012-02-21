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

import javax.swing.JFrame;
import java.awt.Dimension;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import nl.uva.saf.simulation.FightEndEvent;
import nl.uva.saf.simulation.FightInProgressException;
import nl.uva.saf.simulation.FighterBot;
import nl.uva.saf.simulation.IFightEndEventListener;
import nl.uva.saf.simulation.IFightSimulator;
import nl.uva.saf.simulation.IRenderer;
import nl.uva.saf.simulation.PlayfieldFullException;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowListener;
import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.util.List;

public class MainWindow extends JFrame implements WindowListener, IFightEndEventListener {
	private static final long serialVersionUID = 8456781004070435366L;
	final MainWindow eventSourceWindow = this;
	private final IFightSimulator fightSimulator;
	private RenderSurface rendereSurface;

	public MainWindow(IFightSimulator simulator, IRenderer renderer) {
		fightSimulator = simulator;

		fightSimulator.addEventListener(this);

		setProperties();

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		mnFile.setMnemonic('F');
		menuBar.add(mnFile);

		JMenuItem mntmNewFight = new JMenuItem("New Fight");
		addNewFightAction(mntmNewFight);

		mntmNewFight.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mnFile.add(mntmNewFight);

		JMenuItem mntmStopFight = new JMenuItem("Stop Fight");
		mntmStopFight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent event) {
				fightSimulator.stop();
			}
		});

		JMenuItem mntmRestartFight = new JMenuItem("Restart Fight");
		mntmRestartFight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent event) {
				if (fightSimulator.getContestantCount() == 2) {
					fightSimulator.stop();
					fightSimulator.start();
				}
			}
		});
		mnFile.add(mntmRestartFight);
		mnFile.add(mntmStopFight);

		JMenuItem menuItem = new JMenuItem("-");
		mnFile.add(menuItem);

		JMenuItem mntmExit = new JMenuItem("Exit");

		mntmExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent event) {
				eventSourceWindow.dispose();
				event.consume();
			}
		});

		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mnFile.add(mntmExit);

		rendereSurface = new RenderSurface(renderer);
		getContentPane().add(rendereSurface, BorderLayout.CENTER);

		addWindowListener(this);
	}

	private void addNewFightAction(JMenuItem mntmNewFight) {
		mntmNewFight.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent event) {
				FighterLoadDialog loadDialog = new FighterLoadDialog();
				loadDialog.setLocationRelativeTo(eventSourceWindow);
				loadDialog.setVisible(true);
				List<FighterBot> loadedFighters = loadDialog.getLoadedFighters();
				if (loadedFighters.size() == 2) {
					try {
						fightSimulator.stop();
						fightSimulator.join();
						fightSimulator.clearContestants();
						for (FighterBot fighter : loadedFighters) {
							fightSimulator.addContestant(fighter);
						}
						fightSimulator.start();
					} catch (PlayfieldFullException e) {
						JOptionPane.showMessageDialog(eventSourceWindow,
								"Could not load players, the playfield is reported to be full.",
								"Playfield full error", JOptionPane.ERROR_MESSAGE);
						e.printStackTrace();
					} catch (FightInProgressException e) {
						JOptionPane.showMessageDialog(eventSourceWindow,
								"Cannot load fighters, the fight is still in progress.");
						e.printStackTrace();
					}
				}
			}
		});
	}

	@Override
	public void fightEnd(FightEndEvent e) {
		String message = "The fight has ended.";
		if (e.getWinner() != null) {
			message += " And the winner is......." + e.getWinner().getName() + "!";
		} else {
			message += " There is no winner.";
		}

		JOptionPane.showMessageDialog(this, message, "End of fight", JOptionPane.PLAIN_MESSAGE);
	}

	private void setProperties() {
		setSize(new Dimension(854, 480));
		setPreferredSize(new Dimension(854, 480));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Super Awesome Fighters");
		setResizable(false);
		setLocationRelativeTo(null);
	}

	@Override
	public void windowActivated(WindowEvent event) {
	}

	@Override
	public void windowClosed(WindowEvent event) {
		fightSimulator.dispose();
		rendereSurface.unbindRenderer();
	}

	@Override
	public void windowClosing(WindowEvent event) {
	}

	@Override
	public void windowDeactivated(WindowEvent event) {
	}

	@Override
	public void windowDeiconified(WindowEvent event) {
	}

	@Override
	public void windowIconified(WindowEvent event) {
	}

	@Override
	public void windowOpened(WindowEvent event) {
	}
}
