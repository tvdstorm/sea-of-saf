package nl.uva.saf.simulation.UI;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import nl.uva.saf.simulation.IFightSimulator;
import nl.uva.saf.simulation.IRenderer;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowListener;
import java.awt.BorderLayout;
import java.awt.event.WindowEvent;

public class MainWindow extends JFrame implements WindowListener {
	private static final long serialVersionUID = 8456781004070435366L;
	private final IFightSimulator simulator;
	private RenderSurface rendereSurface;

	public MainWindow(IFightSimulator simulator, IRenderer renderer) {
		this.simulator = simulator;

		setSize(new Dimension(854, 480));
		setPreferredSize(new Dimension(854, 480));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Super Awesome Fighters");
		setResizable(false);
		setLocationRelativeTo(null);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		mnFile.setMnemonic('F');
		menuBar.add(mnFile);

		JMenuItem mntmNewFight = new JMenuItem("New Fight");
		mntmNewFight.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,
				InputEvent.CTRL_MASK));
		mnFile.add(mntmNewFight);

		JMenuItem menuItem = new JMenuItem("-");
		mnFile.add(menuItem);

		JMenuItem mntmExit = new JMenuItem("Exit");

		final MainWindow eventSourceWindow = this;

		mntmExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent event) {
				eventSourceWindow.dispose();
				event.consume();
			}
		});

		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4,
				InputEvent.ALT_MASK));
		mnFile.add(mntmExit);

		rendereSurface = new RenderSurface(renderer);
		getContentPane().add(rendereSurface, BorderLayout.CENTER);

		addWindowListener(this);
	}

	@Override
	public void windowActivated(WindowEvent event) {
	}

	@Override
	public void windowClosed(WindowEvent event) {
		simulator.dispose();
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
