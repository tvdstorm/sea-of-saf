package game;

public class GameState {

	private final int NEAR = 5;
	private final int FAR = 25;
	
	private final int START_LEFT = 15;
	private final int START_RIGTH = 90;
	
	private FighterState fighter1;
	private FighterState fighter2;
	
	public GameState(FighterState f1, FighterState f2){
		this.fighter1 = new FighterState();
		this.fighter2 = new FighterState();
	}
	
	
	public FighterState getFighter1() {
		return fighter1;
	}

	public void setFighter1(FighterState fighter1) {
		this.fighter1 = fighter1;
	}

	public FighterState getFighter2() {
		return fighter2;
	}

	public void setFighter2(FighterState fighter2) {
		this.fighter2 = fighter2;
	}

	
	
	
}
