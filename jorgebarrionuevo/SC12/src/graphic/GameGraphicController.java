package graphic;

import game.FighterStatus;

//import game.controller.MainController;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGraphicController implements ArenaConfiguration{

	ArenaFrame arenaFrame = new ArenaFrame(this);
	private FighterPanel fighterPanelL;
	private FighterPanel fighterPanelR;
	private FighterStatus fighterStatusLeft;
	private FighterStatus fighterStatusRight;

	public GameGraphicController(FighterStatus fighterStatusLeft, FighterStatus fighterStatusRight) {
		this.fighterStatusLeft = fighterStatusLeft;
		this.fighterStatusRight = fighterStatusRight;
		fighterPanelL = new FighterPanel();
		fighterPanelR = new FighterPanel();
		arenaFrame.setVisible(true);
		this.startFighters();
	}

	public void startFighters(){
		System.out.println("StartFighters");
		//arenaFrame.repaint();
		
		//fighterPanelL.SetImage(ArenaConfiguration.relaxed);
		//fighterPanelR.SetImage(ArenaConfiguration.relaxed);
		//arenaFrame.getContentPane().add(fighterPanelL);  
		//arenaFrame.getContentPane().add(fighterPanelR);

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

	public void updateLeftImage(String actualAction) {
		// TODO Auto-generated method stub
		if(actualAction.equals("block_low")){fighterPanelL.SetImage(ArenaConfiguration.blockLowL);}
		if(actualAction.equals("block_high")){fighterPanelL.SetImage(ArenaConfiguration.blockHighL);}
		if(actualAction.equals("punch_low")){fighterPanelL.SetImage(ArenaConfiguration.punchLowL);}
		if(actualAction.equals("punch_high")){fighterPanelL.SetImage(ArenaConfiguration.punchkHighL);}
		if(actualAction.equals("kick_low")){fighterPanelL.SetImage(ArenaConfiguration.kickLowL);}
		if(actualAction.equals("kick_high")){fighterPanelL.SetImage(ArenaConfiguration.kickHighL);}
		if(actualAction.equals("stand")){fighterPanelL.SetImage(ArenaConfiguration.relaxed);}
		if(actualAction.equals("jump")){fighterPanelL.SetImage(ArenaConfiguration.relaxed);}
		if(actualAction.equals("crouch")){fighterPanelL.SetImage(ArenaConfiguration.relaxed);}
		if(actualAction.equals("death")){
			System.out.println("death Left!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
			fighterPanelL.SetImage(ArenaConfiguration.deadL);}
		
	}

	public void updateRightImage(String actualAction) {
		// TODO Auto-generated method stub
		if(actualAction.equals("block_low")){fighterPanelR.SetImage(ArenaConfiguration.blockLowR);}
		if(actualAction.equals("block_high")){fighterPanelR.SetImage(ArenaConfiguration.blockHighR);}
		if(actualAction.equals("punch_low")){fighterPanelR.SetImage(ArenaConfiguration.punchLowR);}
		if(actualAction.equals("punch_high")){fighterPanelR.SetImage(ArenaConfiguration.punchkHighR);}
		if(actualAction.equals("kick_low")){fighterPanelR.SetImage(ArenaConfiguration.kickLowR);}
		if(actualAction.equals("kick_high")){fighterPanelR.SetImage(ArenaConfiguration.kickHighR);}
		if(actualAction.equals("stand")){fighterPanelR.SetImage(ArenaConfiguration.relaxed);}
		if(actualAction.equals("jump")){fighterPanelR.SetImage(ArenaConfiguration.relaxed);}
		if(actualAction.equals("crouch")){fighterPanelR.SetImage(ArenaConfiguration.relaxed);}
		if(actualAction.equals("death")){
			System.out.println("death Right!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
			fighterPanelR.SetImage(ArenaConfiguration.deadR);}
		
	}
	
	public void updateLeftXPosition() {
		// TODO Auto-generated method stub
		
	}

	public void updateRightXPosition() {
		// TODO Auto-generated method stub
		
	}
}