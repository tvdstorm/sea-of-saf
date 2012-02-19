package saf;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.*;

import org.antlr.runtime.RecognitionException;

public class Arena{
	private String[] botFileNames;
	private int leftWallPosition;
	private int rightWallPosition;
	private static final int frameHeight = 300;
	private static final int frameWidth = 600;
	
	private HashMap<String, JLabel> fighterIcons;
	private HashMap<String, JComboBox> fighterSelectFields;
	private HashMap<String, JLabel> statusFields;
	private JPanel actionPanel;
	private JButton controlButton;
	private Game controller;
	private ImageResolver imageResolver;
	private String[] colors;
	
	@SuppressWarnings("serial")
	public Arena(Game gameController, String[] fileNames, String[] colors) {
		controller = gameController;
		botFileNames = fileNames;
		this.colors = colors;
		this.leftWallPosition = 25;
		this.rightWallPosition = frameWidth - 25;
		
		fighterIcons = new HashMap<String, JLabel>(){};
		fighterSelectFields = new HashMap<String, JComboBox>(){};
		statusFields = new HashMap<String, JLabel>(){};
		
		imageResolver = new ImageResolver();
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
	
	public void createAndShowGUI() {
		JFrame frame = new JFrame();
		
		frame.setTitle("Super Awesome Fighter Arena");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(getFrameBounds());
		frame.setResizable(false);
		
		JPanel contentPane = createContentPane();
		frame.setContentPane(contentPane);
        frame.setVisible(true);
	}

	public Integer getRightWallPosition(){
		return rightWallPosition;
	}
	
	public Integer getLeftWallPosition(){
		return leftWallPosition;
	}
	
	public void updateScreen(String actionTypeName, String fighterColor, Integer position){
		JLabel fighterIcon = fighterIcons.get(fighterColor);
		ImageIcon icon = imageResolver.getImage(actionTypeName, fighterColor);
		fighterIcon.setIcon(icon);
		fighterIcon.setBounds(position, 130, 63, 48);
	}
	
	public void setImagesRootPath(String imagesRootPath) {
		this.imageResolver.setFiguresRootPath(imagesRootPath);
	}
	
	public void addStatusText(String color, String text) {
		JLabel statusField = statusFields.get(color);
		statusField.setText(text);		
	}
	
	public String getFighterSelectFieldValue(String color){
		JComboBox figterSelectField = fighterSelectFields.get(color); 
		return (String) figterSelectField.getSelectedItem();
	}
	
	public void initFighter(String fighterColor){
		JLabel fighterIcon = new JLabel();
		fighterIcon.setBounds(10, 10, 63, 48);
		actionPanel.add(fighterIcon);

        fighterIcons.put(fighterColor, fighterIcon);
	}

	public void setControlButtonText(String text){
		this.controlButton.setText(text);
	}
	
	@SuppressWarnings("serial")
	public void clearBots() {
		if(fighterIcons.size() == 0){
			return;
		}
		Collection<JLabel> fighterIconLabels = fighterIcons.values();
		for (JLabel fighterIconLabel : fighterIconLabels) {
			Container parent = fighterIconLabel.getParent();
			parent.remove(fighterIconLabel);
			parent.repaint();
		}
		
		fighterIcons = new HashMap<String, JLabel>(){};
	}

	private JPanel createContentPane(){
		JPanel contentPanel = new JPanel(new BorderLayout());
        
		JPanel controlsPanel = createControlsPanel();
        actionPanel = createActionPanel();
        JPanel statusesPanel = createStatusesPanel();
        
        contentPanel.add(controlsPanel, BorderLayout.PAGE_START);
        contentPanel.add(actionPanel, BorderLayout.CENTER);
        contentPanel.add(statusesPanel, BorderLayout.PAGE_END);
        
		return contentPanel;
	}

	private JPanel createControlsPanel(){
		JPanel controlsPanel = new JPanel();
		JPanel selectControlsPanel = createSelectControlsPanel();
		JButton controlButton = createControlButton();
		
		controlsPanel.add(selectControlsPanel, BorderLayout.LINE_START);
		controlsPanel.add(controlButton, BorderLayout.LINE_END);

		return controlsPanel;
	}
	
	private JButton createControlButton() {
		controlButton = new JButton("Fight!");
		controlButton.addActionListener(onFightButtonClickedEventHandler());
        return controlButton;
	}
	
	private JPanel createSelectControlsPanel(){
		JPanel selectControlsPanel = new JPanel();
		selectControlsPanel.setLayout(new BoxLayout(selectControlsPanel, BoxLayout.Y_AXIS));
		
		for (String color : colors) {
			JPanel selectControlPanel = createSelectControlPanel(color);
			selectControlsPanel.add(selectControlPanel);
		}
		
		return selectControlsPanel;
	}
	
	private JPanel createSelectControlPanel(String color) {
		JPanel selectControlPanel = new JPanel();
		selectControlPanel.setLayout(new BoxLayout(selectControlPanel, BoxLayout.X_AXIS));
		String name = String.format("Fighter %s", color);
		
        JLabel label = new JLabel(name);
        selectControlPanel.add(label, BorderLayout.LINE_START);
        
        JComboBox fighterSelectField = new JComboBox(botFileNames);
        fighterSelectField.setSelectedIndex(0);
        selectControlPanel.add(fighterSelectField, BorderLayout.LINE_END);
        
        fighterSelectFields.put(color, fighterSelectField);
		return selectControlPanel;
	}

	private JPanel createActionPanel() {
		JPanel actionPanel = new JPanel();
		actionPanel.setBackground(Color.DARK_GRAY);
		actionPanel.setLayout(null);
		return actionPanel;
	}
	
	private JPanel createStatusesPanel() {
		JPanel statusesPanel = new JPanel();
		statusesPanel.setLayout(new BoxLayout(statusesPanel, BoxLayout.X_AXIS));
		
		for (String color : colors) {
			JPanel statusPanel = createStatusPanel(color);
			statusesPanel.add(statusPanel);
		}
		
		return statusesPanel;
	}
	
	private JPanel createStatusPanel(String color) {
		JPanel statusPanel = new JPanel();
		
		String name = String.format("Health fighter %s", color);
		JLabel statusFieldLabel = new JLabel(name);

		JLabel statusField = new JLabel();
		statusField.setSize(50, 25);
		statusFields.put(color, statusField);
		
		statusPanel.add(statusFieldLabel);
		statusPanel.add(statusField);
		
		return statusPanel;
	}
	
	private ActionListener onFightButtonClickedEventHandler(){
		return new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            try {
					controller.beginFight();
				} catch (RecognitionException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
	        }
		};
	}
	
	private Rectangle getFrameBounds() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width / 2) - (frameWidth / 2);
        int y = (screen.height / 2) - (frameHeight/ 2);
        return new Rectangle(x, y, frameWidth, frameHeight);
    }
}
