package graphic;

import game.FighterStatus;

//import game.controller.MainController;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGraphicController implements ArenaConfiguration{

	ArenaFrame mainFrame = new ArenaFrame();
	private FighterPanel fighterPanelL;
	private FighterPanel fighterPanelR;
	//private MainController mainController;

	public GameGraphicController() {
		//this.mainController = mainController;
		this.startFighters();
	}

	public void startFighters(){
		System.out.println("StartFighters");
		fighterPanelL = new FighterPanel();
		fighterPanelR = new FighterPanel();
		fighterPanelL.SetImage(ArenaConfiguration.relaxed);
		fighterPanelR.SetImage(ArenaConfiguration.relaxed);
		//fighterPanelL.SetFighterStatus(mainController.getFighterStatusLeft());
		//fighterPanelR.SetFighterStatus(mainController.getFighterStatusRight());
		//mainFrame.setGameGraphicController(this);
		//mainFrame.getContentPane().add(fighterPanelL);  
		//mainFrame.getContentPane().add(fighterPanelR);
		//mainFrame.setVisible(true);
	}
	
	

	public JFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(ArenaFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public FighterPanel getFighterPanelL() {
		return fighterPanelL;
	}

	public void setFighterPanelL(FighterPanel fighterPanelL) {
		this.fighterPanelL = fighterPanelL;
	}

	public FighterPanel getFighterPanelR() {
		return fighterPanelR;
	}

	public void setFighterPanelR(FighterPanel fighterPanelR) {
		this.fighterPanelR = fighterPanelR;
	}

//	public MainController getFightController() {
//		return mainController;
//	}
//
//	public void setMainController(MainController mainController) {
//		this.mainController = mainController;
//	}

	//update each fighter panel status
	public void updateFighterPanels(){
		//fighterPanelL.updateStatus(mainController.getFighterStatusLeft());
		//fighterPanelL.updateStatus(mainController.getFighterStatusRight());
		mainFrame.repaint();
	}


}