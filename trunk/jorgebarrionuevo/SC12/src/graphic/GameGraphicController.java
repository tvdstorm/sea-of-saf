package graphic;

import game.controller.FighterStatus;

//import game.controller.MainController;

import java.awt.BorderLayout;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameGraphicController implements ArenaConfiguration{

	private ArenaFrame arenaFrame;
	private FighterPanel fighterPanelL;
	private FighterPanel fighterPanelR;

	public GameGraphicController() {
		this.fighterPanelL = new FighterPanel("LEFT");
		this.fighterPanelR = new FighterPanel("RIGHT");
		this.arenaFrame = new ArenaFrame(this);
	}
	
	public FighterPanel getFighterPanelL() {
		return fighterPanelL;
	}

	public FighterPanel getFighterPanelR() {
		return fighterPanelR;
	}

	public void updateLeftImage(FighterStatus fighterStatusLeft, String actualAction) {
		if(actualAction.equals("block_low")){fighterPanelL.setImage(ArenaConfiguration.blockLowL);}
		if(actualAction.equals("block_high")){fighterPanelL.setImage(ArenaConfiguration.blockHighL);}
		if(actualAction.equals("punch_low")){fighterPanelL.setImage(ArenaConfiguration.punchLowL);}
		if(actualAction.equals("punch_high")){fighterPanelL.setImage(ArenaConfiguration.punchkHighL);}
		if(actualAction.equals("kick_low")){fighterPanelL.setImage(ArenaConfiguration.kickLowL);}
		if(actualAction.equals("kick_high")){fighterPanelL.setImage(ArenaConfiguration.kickHighL);}
		if(actualAction.equals("stand")){fighterPanelL.setImage(ArenaConfiguration.relaxedL);}
		if(actualAction.equals("jump")){fighterPanelL.setImage(ArenaConfiguration.jumpL);}
		if(actualAction.equals("crouch")){fighterPanelL.setImage(ArenaConfiguration.crouchL);}
		if(actualAction.equals("death")){fighterPanelL.setImage(ArenaConfiguration.deadL);}
		this.updateArena();
	}

	public void updateRightImage(FighterStatus fighterStatusRight,String actualAction) {

		if(actualAction.equals("block_low")){fighterPanelR.setImage(ArenaConfiguration.blockLowR);}
		if(actualAction.equals("block_high")){fighterPanelR.setImage(ArenaConfiguration.blockHighR);}
		if(actualAction.equals("punch_low")){fighterPanelR.setImage(ArenaConfiguration.punchLowR);}
		if(actualAction.equals("punch_high")){fighterPanelR.setImage(ArenaConfiguration.punchkHighR);}
		if(actualAction.equals("kick_low")){fighterPanelR.setImage(ArenaConfiguration.kickLowR);}
		if(actualAction.equals("kick_high")){fighterPanelR.setImage(ArenaConfiguration.kickHighR);}
		if(actualAction.equals("stand")){fighterPanelR.setImage(ArenaConfiguration.relaxedR);}
		if(actualAction.equals("jump")){fighterPanelR.setImage(ArenaConfiguration.jumpR);}
		if(actualAction.equals("crouch")){fighterPanelR.setImage(ArenaConfiguration.crouchR);}
		if(actualAction.equals("death")){fighterPanelR.setImage(ArenaConfiguration.deadR);}
		this.updateArena();
	}
	
	public void updateLeftXPosition(FighterStatus fighterStatusLeft) {
		this.fighterPanelL.updateXPosition(fighterStatusLeft.getXPosition());
		this.updateArena();
	}

	public void updateRightXPosition(FighterStatus fighterStatusRight) {
		this.fighterPanelR.updateXPosition(fighterStatusRight.getXPosition());
		this.updateArena();
	}
	
	public void updateArena() {
		//arenaFrame.repaint();
	}
}