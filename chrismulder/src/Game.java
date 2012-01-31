import ast.Saf;

public class Game {

	private SafState p1state, p2state;
	
	public Game(Saf p1, Saf p2) {
		this.p1state = new SafState(SafState.PlayerType.P1, p1);
		this.p2state = new SafState(SafState.PlayerType.P2, p2);
	}
	
	public void run() {
		int i = 0;
		while(p1state.isAlive() && p2state.isAlive()) {
			p1state.nextStep(p2state);
			p2state.nextStep(p1state);
			
			i++;
//			System.out.println("time: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
