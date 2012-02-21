package safGUI;

import javax.swing.*;

public class MainWindow extends JFrame{
    private SAFPanel safPanel;
	
	public MainWindow() {
       initalFrame();
       addJPanels();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainWindow mw = new MainWindow();
                mw.setVisible(true);
            }
        });
    }
    
    private void initalFrame(){
    	setTitle("Super Awesome Fighter");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void addJPanels(){
    	safPanel = new SAFPanel();
    	this.add(safPanel);
    }
}