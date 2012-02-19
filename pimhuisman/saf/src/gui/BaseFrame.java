package gui;
import javax.swing.JFrame;

public abstract class BaseFrame extends JFrame {


	private static final long serialVersionUID = 1L;
	private BaseScreen currentScreen;
	private Boolean initialized;
	
	public BaseFrame() {
		this.currentScreen = null;
		this.initialized = false;
	}
	
	public void switchScreen(BaseScreen newScreen) {
		if ( currentScreen != null && initialized ) {
			remove(currentScreen);
			currentScreen.destroy();
		}
		currentScreen = newScreen;
		// Initialize the screen if the frame has already been initialized.
		if ( currentScreen != null && initialized ) {
			currentScreen.initialize();
			add(currentScreen);
		}
		validate();
		repaint();
	}
	
	public void initialize() {
		onInitialize();
	 	if ( currentScreen != null ) {
	 		currentScreen.initialize();
	 		add(currentScreen);
	 	}
		setResizable(false);
		setVisible(true);
		initialized = true;
	}
	
	public void destroy() {
		onDestroy();
		switchScreen(null);
		initialized = false;
		dispose();
		System.exit(0);
	}
	
	public abstract void onInitialize();
	public abstract void onDestroy();
	
	
}
