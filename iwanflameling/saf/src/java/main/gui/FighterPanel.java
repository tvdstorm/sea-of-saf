package gui;

import game.FighterAI;
import game.FighterAI.Direction;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import ast.TypeValues;

public class FighterPanel extends JPanel implements UpdatableGui {
	
	private static final int WIDTH = 200;
	private static final int HEIGHT = 300;

	private FighterAI fighter;
	private ImageIcon imageIcon;
	private JLabel fighterLabel;
	
	public FighterPanel(FighterAI fighter){
		this.fighter = fighter;
		init();
	}
	
	private void init(){
		this.setBorder(BorderFactory.createTitledBorder("FighterPanel"));
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(new FlowLayout());
		this.imageIcon = new ImageIcon();
		this.fighterLabel = new JLabel();
		this.add(fighterLabel);
		this.setVisible(true);
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
		this.setLocation(fighter.getPosition(), this.getY());
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
