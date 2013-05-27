package gui;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HealthPanel extends JPanel implements VisitableGui{

	public HealthPanel(){
		init();
	}
	
	private void init(){
		this.setBorder(BorderFactory.createTitledBorder("HealthPanel"));
		this.setBounds(0, 0, 200, 100);
		this.setLayout(new FlowLayout());
		this.add(new JLabel("Hello World!"));
		this.setVisible(true);
	}

	@Override
	public void accept(GuiVisitor guiVisitor) {
		guiVisitor.visit(this);
	}

}
