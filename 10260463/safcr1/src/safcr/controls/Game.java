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

		b1 = saf.getBots().get(0);
		b2 = saf.getBots().get(1);
		
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
	}

	@Override
	public void run() {
		while (!stopMe) {
			botUpdates(b1,bot1,bot2);
			botUpdates(b2,bot2,bot1);
			
			if(bot1.getX() < 30){
				bot1.setX(45);
				bot2.setX(200);
			}
			
			if(bot2.getX() > 970){
				bot1.setX(800);
				bot2.setX(945);
			}
			
			if(bot1.getHp() < 1) bot1.setCurrentImage("dead");
			if(bot2.getHp() < 1) bot2.setCurrentImage("dead");
			
			disp.getBoard().reloadDisplay();	
			
			if(bot1.getHp() < 1 || bot2.getHp() < 1){
				stopMe = true;
			}		
        }
	}
	
	public void botUpdates(Bot b, BotChar bota, BotChar botb){
		String move = "";
		String attack  = "";
		String dist = "";
		String condition = "";
		String img = "";
		int speed = 0;
		int newPos = 0;
		int distance = 0;
		
		bota.setStrenghtCondition(condData.getCondition(bota.getHp(), botb.getHp()));
		
		if(bota.getX() > botb.getX()) distance = bota.getX() - botb.getX();
		else distance = botb.getX() - bota.getX();
		
		dist = condData.getDistance(distance);
		condition = bota.getCondition();
		
		if(dist.equals("near")){
			String cImg1 = bota.getCurrentImage();
			String cImg2 = botb.getCurrentImage();
			if(doDamage(cImg1, cImg2)){
				for(Characteristic c : b.getCharacteristic()){
					if(c.getName().equals("punchPower") && cImg1.contains("punch"))
						botb.decreaseHp(c.getValue());
					if(c.getName().equals("kickPower") && cImg1.contains("kick"))
						botb.decreaseHp(c.getValue());
				}
			}
		}
		
		cr.setCondition(condition);
		cr.setDistance(dist);

		for(Rule r : b.getRules()){
			r.accept(cr);
			if(cr.isFound()) break;
		}
		
		move = cr.getMoveAction();
		attack = cr.getAttackAction();
		
		if(bota.getX() - botb.getX() > 1) img = attack + "_left";
		else img = attack + "_right";
		
		bota.setCurrentImage(img);
		
		if(bota.isJumped())
			bota.fall();
		
		if(move.equals("jump") && !bota.isJumped())
			bota.jump();
		else if(move.equals("crouch")) 
			speed = 2; 
		else if(move.contains("walk")) 
			speed = 5 * bota.getSpeed();
		else if(move.contains("run"))
			speed =  10 * bota.getSpeed();
		
		if(move.contains("_towards")){
			if(bota.getX() - botb.getX() > 1) newPos = bota.getX() - speed;
			else newPos = bota.getX() + speed;
			bota.setX(newPos);
		}
		else if(move.contains("_away")){
			if(bota.getX() - botb.getX() > 1) newPos = bota.getX() + speed;
			else newPos = bota.getX() - speed;
			bota.setX(newPos);
		}
		
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		
	}
	
	public Boolean doDamage(String a1, String a2){
		if(a1.contains("block")){
			return false;
		}
		
		if(a2.equals("block_low") && a1.contains("_low")){
			return false;
		}
		
		if(a2.equals("block_high") && a1.contains("_high")){
			return false;
		}
		
		return true;
	}
}
