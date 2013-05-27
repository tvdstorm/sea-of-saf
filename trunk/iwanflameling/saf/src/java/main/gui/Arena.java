package gui;

import java.util.List;

import game.Jury;

import javax.swing.JFrame;

public class Arena extends JFrame implements VisitableGui {
	
	private Jury jury;
	private List<VisitableGui> visitableChildren;
	
	public Arena(Jury jury){
		this.jury = jury;
		init();
	}

	private void init(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Arena");
		this.setBounds(0, 0, 800, 500);
		this.setLayout(null);
		this.setVisible(true);
		
		HealthPanel hp1 = new HealthPanel();
		hp1.setBounds(0, 0, 200, 100);
		this.visitableChildren.add(hp1);
		this.getContentPane().add(hp1);
		
		HealthPanel hp2 = new HealthPanel();
		hp2.setBounds(600, 0, 200, 100);
		this.visitableChildren.add(hp2);
		this.getContentPane().add(hp2);
		
		Battlefield bf = new Battlefield(jury.getFighterOne(), jury.getFighterTwo());
		bf.setBounds(0, 100, 800, 400);
		this.visitableChildren.add(bf);
		this.getContentPane().add(bf);
		
		this.setVisible(true);
	}

	public List<VisitableGui> getVisitableChildren() {
		return visitableChildren;
	}

	@Override
	public void accept(GuiVisitor guiVisitor) {
		guiVisitor.visit(this);
	}


}
