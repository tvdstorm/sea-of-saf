package gui;

import game.FighterAI;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FighterPanel extends JPanel implements VisitableGui {

	private FighterAI fighter;
	
	public FighterPanel(FighterAI fighter){
		this.fighter = fighter;
		init();
	}
	
	private void init(){
		this.setBorder(BorderFactory.createTitledBorder("FighterPanel"));
		this.setBounds(0, 0, 200, 300);
		this.setLayout(new FlowLayout());
		this.add(new JLabel("This is a Fighter!"));
		this.setVisible(true);
	}
	
	public void update() {
		this.setLocation(fighter.getPosition(), this.getY());
		this.repaint();
		this.setVisible(true);
	}
	
	@Override
	public void accept(GuiVisitor guiVisitor) {
		guiVisitor.visit(this);
	}

}
