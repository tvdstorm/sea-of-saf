package gui;

import game.FighterAI;
import game.FighterAI.Direction;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ast.TypeValues;

public class FighterPanel extends JPanel implements UpdatableGui {
	
	private static final int WIDTH = 203;
	private static final int HEIGHT = 330;

	private FighterAI fighter;
	private JLabel fighterLabel;
	private JLabel fighterNameLabel;
	
	public FighterPanel(FighterAI fighter){
		this.fighter = fighter;
		init();
	}
	
	private void init(){
		//this.setBorder(BorderFactory.createTitledBorder("FighterPanel"));
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.fighterLabel = new JLabel();
		this.fighterLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.fighterNameLabel = new JLabel(fighter.getAst().getName());
		this.fighterNameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.fighterNameLabel.setVisible(false);
		this.add(fighterNameLabel);
		this.add(fighterLabel);
	}
	
	
	
	@Override
	public void setLocation(int x, int y) {
		x += WIDTH;
		if(fighter.direction() == Direction.RIGHT){
			x = x - WIDTH;
		}
		super.setLocation(x, y);
	}

	@Override
	public void update() {
		this.setLocation(fighter.getPosition()*(Battlefield.WIDTH/(Battlefield.WIDTH-(2*WIDTH))), this.getY());
		if(!this.fighterNameLabel.isVisible())
			this.fighterNameLabel.setVisible(true);
		setCurrentImageIcon();
	}
	
	private void setCurrentImageIcon(){
		ImageIcon imageIcon;
		if(fighter.direction() == Direction.RIGHT){
			imageIcon = new ImageIcon(getCurrentImage());
		} else {
			imageIcon = new MirroredImageIcon(getCurrentImage());
		}
		this.fighterLabel.setIcon(imageIcon);
	}
	
	private Image getCurrentImage(){
		String moveAction = fighter.getCurrentMoveAction();
		String fightAction = fighter.getCurrentFightAction();
		Image image = null;
		if(moveAction != null && fightAction != null){
			if(TypeValues.MOVES.contains(moveAction) && TypeValues.ATTACKS.contains(fightAction)){
				image = ImageLoader.getInstance().getImage(moveAction, fightAction);
			}
		}
		return image;
	}
	

}
