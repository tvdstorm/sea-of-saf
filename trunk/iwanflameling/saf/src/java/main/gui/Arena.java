package gui;

import game.Jury;

import javax.swing.JFrame;

public class Arena extends JFrame implements UpdatableGui {
	
	private Jury jury;
	private Battlefield battlefield;
	private HealthPanel hp1;
	private HealthPanel hp2;
	private MainPanel mp;
	public static final int WIDTH = 800;
	public static final int HEIGHT = 500;
	
	public Arena(Jury jury){
		this.jury = jury;
		init();
	}

	private void init(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Arena");
		this.setSize(WIDTH, HEIGHT);
		this.setLayout(null);
		
		hp1 = new HealthPanel(jury.getFighterOne());
		hp1.setLocation(0,0);
		this.getContentPane().add(hp1);
		
		hp2 = new HealthPanel(jury.getFighterTwo());
		hp2.setLocation(Arena.WIDTH-HealthPanel.WIDTH, 0);
		this.getContentPane().add(hp2);
		
		mp = new MainPanel(this.jury);
		mp.setLocation(HealthPanel.WIDTH, 0);
		this.getContentPane().add(mp);
		
		battlefield = new Battlefield(jury.getFighterOne(), jury.getFighterTwo());
		battlefield.setLocation(0, HealthPanel.HEIGTH);
		this.getContentPane().add(battlefield);
		
		this.setVisible(true);
	}

	@Override
	public void update() {
		this.battlefield.update();
		this.hp1.update();
		this.hp2.update();
		this.mp.update();
	}


}
