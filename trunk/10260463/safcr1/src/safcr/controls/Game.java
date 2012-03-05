package safcr.controls;

import safcr.ast.*;
import safcr.data.*;
import safcr.display.BotChar;
import safcr.display.SafDisplay;

public class Game implements Runnable{
	private CharacteristicData charsData;
	private ConditionData condData;
	private Bot b1;
	private Bot b2;
	private SafDisplay disp;
	private Saf saf;
	private BotChar bot1;
	private BotChar bot2;
	private Boolean stopMe = false;
	private CheckRule cr;
	private Thread animator;
	
	public Game(Saf s){
		saf = s;
		disp = new SafDisplay();
		cr = new CheckRule();
		
		int i = 0;
		for(Bot b : saf.getBots()){
			if(i == 0) b1 = b;
			else b2 = b;
			i++;
			if(i >= 2) break;
		}
		
		bot1 = disp.getBoard().getBot1();
		bot2 = disp.getBoard().getBot2();
	}
	
	public void setDatas(CharacteristicData cd, ConditionData cod){
		charsData = cd;
		condData = cod;
	}
	
	public void initGame(){
		setProperty(b1,bot1);
		setProperty(b2,bot2);
		
		bot1.setStrenghtCondition(condData.getCondition(bot1.getStrenght(), bot2.getStrenght()));
		bot2.setStrenghtCondition(condData.getCondition(bot2.getStrenght(), bot1.getStrenght()));
		
		animator = new Thread(this);
		animator.start();
	}
	
	public void setProperty(Bot b, BotChar bot){
		int pPower = charsData.getDefaultValue();
		int kPower = charsData.getDefaultValue();
		int pReach = charsData.getDefaultValue();
		int kReach = charsData.getDefaultValue();
		
		for(Characteristic c : b.getCharacteristic()){
			String s = c.getName();
			if(s.equals("punchPower")) pPower = c.getValue();
			if(s.equals("kickPower")) kPower = c.getValue();
			if(s.equals("punchReach")) pReach = c.getValue();
			if(s.equals("kickReach")) kReach = c.getValue();
		}

		bot.setSpeed(charsData.calculateSpeed(pPower, kPower, pReach, kReach));
		bot.setStrenght(pPower+kPower);
	}

	@Override
	public void run() {
		while (!stopMe) {
			botUpdates(b1,bot1,bot2);
			botUpdates(b2,bot2,bot1);

			disp.getBoard().reloadDisplay();			
        }
	}
	
	public void botUpdates(Bot b, BotChar bota, BotChar botb){
		String move = "";
		String attack  = "";
		String dist = "";
		String condition = "";
		String img = "";
		int speed = 1;
		int newPos = 0;
		int distance = 0;
		
		if(bota.getX() > botb.getX()) distance = bota.getX() - botb.getX();
		else distance = botb.getX() - bota.getX();
		
		dist = condData.getDistance(distance);
		condition = bota.getCondition();
		
		cr.setCondition(condition);
		cr.setDistance(dist);

		for(Rule r : b.getRules()){
			r.accept(cr);
			if(cr.isFound()) break;
		}
		
		move = cr.getMoveAction();
		attack = cr.getAttackAction();
		
		if(bota.isJumped())
			bota.fall();
		
		if(move.equals("jump") && !bota.isJumped())
			bota.jump();
		else if(move.equals("crouch")) 
			speed = 2; 
		else if(move.equals("walk_towards") || move.equals("walk_away")) 
			speed = 4 * bota.getSpeed();
		else if(move.equals("run_towards") || move.equals("run_away"))
			speed =  10 * bota.getSpeed();
		
		if(move.equals("crouch") || move.equals("walk_towards") || move.equals("run_towards")){
			if(bota.getX() - botb.getX() > 1) newPos = bota.getX() - speed;
			else newPos = bota.getX() + speed;
			bota.setX(newPos);
		}
		else if(move.equals("run_away") || move.equals("walk_away")){
			if(bota.getX() - botb.getX() > 1) newPos = bota.getX() + speed;
			else newPos = bota.getX() - speed;
			bota.setX(newPos);
		}

		if(bota.getX() - botb.getX() > 1) img = attack + "_left";
		else img = attack + "_right";
		
		bota.setCurrentImage(img);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		
	}
}
