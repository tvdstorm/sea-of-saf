package ccgame;

import ast.fighter.Fighter;

public class Arena {

	private FighterAI fighterOne;
	private FighterAI fighterTwo;
	private int hop = 0;

	private MonitorObject myMonitorObject = new MonitorObject();
	
	public Arena(Fighter fighterOne, Fighter fighterTwo){
		this.fighterOne = new FighterAI(fighterOne, this);
		this.fighterTwo = new FighterAI(fighterTwo, this);
	}
	
	public void startFight(){
		Thread.currentThread().setName("Wasit");
		Thread t1 = new Thread(fighterOne, "Iwan");
		Thread t2 = new Thread(fighterTwo, "Jeroen");
		t1.start();
		t2.start();
		for(int counter = 0; counter < 20; counter++){
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			hop();
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fighterOne.stopMe();
		fighterTwo.stopMe();
		doNotifyAll();
	}
	
	int getHop() {
		return hop;
	}
	
	private void hop(){
		hop++;
		System.out.println(Thread.currentThread().getName() + ": Hop" + hop + "!");
		doNotifyAll();
	}
	
	public void doWait(){
		synchronized (myMonitorObject) {
			try {
				myMonitorObject.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void doNotifyAll(){
		synchronized (myMonitorObject) {
			myMonitorObject.notifyAll();
		}
	}
	
}

class MonitorObject{}
