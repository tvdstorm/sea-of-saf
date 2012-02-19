package safGame;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import parser.ParseException;
import parser.Saf;
import safVisualization.FighterVisualization;
import safVisualization.StdDraw;

import abstractSyntaxTree.Fighter;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class safGame {

	// arena 0-90
	int distance = 0;
	String locationCondition="far";
	
	public void initScreen(){
		StdDraw.setCanvasSize(800, 600);
		StdDraw.setXscale(0, 10.0);
		StdDraw.setYscale(0, 10.0);
		refreshScreen();
	}
	
	public void refreshScreen(){
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledSquare(0, 0, 20.0);
	}
	
	public void calculateHealth(Fighter f1, Fighter f2) {

		distance = calculateDistance(f1,f2);

		String attack1 = f1.getCurrentAttack();
		String attack2 = f2.getCurrentAttack();
		if ((((attack1.equals("punch_low") || attack1.equals("kick_low")) && attack2
				.equals("block_low")) || ((attack2.equals("punch_low") || attack2
				.equals("kick_low")) && attack1.equals("block_low")))
				|| (((attack1.equals("punch_high") || attack1
						.equals("kick_high")) && attack2.equals("block_high")) || ((attack2
						.equals("punch_high") || attack2.equals("kick_high")) && attack1
						.equals("block_high"))) || (attack1.equals("none") && attack2.equals("none"))) {
			return;
		}else if(attack1.equals("none")){
			if((distance / 10) <= f2.getCurrentAttackReach()){
				f1.setHealth(f1.getHealth() - f2.getCurrentAttackPower());
			}
		}else if(attack2.equals("none")){
			if((distance / 10) <= f1.getCurrentAttackReach()){
				f2.setHealth(f2.getHealth() - f1.getCurrentAttackPower());
			}
		}
		else {
			if ((distance / 10) <= f1.getCurrentAttackReach()) {
				f2.setHealth(f2.getHealth() - f1.getCurrentAttackPower());
			}
			if ((distance / 10) <= f2.getCurrentAttackReach()) {
				f1.setHealth(f1.getHealth() - f2.getCurrentAttackPower());
			}
		}
	}

	public void updateLocation(Fighter f1, Fighter f2) {
		
		int temp=0;
		
		if (f1.getCurrentMove().equals("run_towards")) {
			f1.setLocation(f1.getLocation() + ((int) (f1.getSpeed()+0.5) * 5));
		} else if (f1.getCurrentMove().equals("walk_towards")) {
			f1.setLocation(f1.getLocation() + ((int) (f1.getSpeed()+0.5) * 2));
		} else if (f1.getCurrentMove().equals("run_away")) {
			f1.setLocation(f1.getLocation() + ((int) (f1.getSpeed()+0.5) * 5));
		} else if (f1.getCurrentMove().equals("walk_away")) {
			f1.setLocation(f1.getLocation() + ((int) (f1.getSpeed()+0.5) * 2));
		}

		if (f2.getCurrentMove().equals("run_towards")) {
			f2.setLocation(f2.getLocation() - ((int) (f2.getSpeed()+0.5) * 5));
		} else if (f2.getCurrentMove().equals("walk_towards")) {
			f2.setLocation(f2.getLocation() - ((int) (f2.getSpeed()+0.5) * 2));
		} else if (f2.getCurrentMove().equals("run_away")) {
			f2.setLocation(f2.getLocation() - ((int) (f2.getSpeed()+0.5) * 5));
		} else if (f2.getCurrentMove().equals("walk_away")) {
			f2.setLocation(f2.getLocation() - ((int) (f2.getSpeed()+0.5) * 2));
		}

		
		if(f1.getLocation()==f2.getLocation()){
			f1.setLocation(f1.getLocation()-1);
			f2.setLocation(f2.getLocation()+1);
		}
		
		else if(f1.getLocation()>f2.getLocation()){
			temp=f1.getLocation();
			f1.setLocation(f2.getLocation());
			f2.setLocation(temp);
		}
		
		if (f1.getLocation() > 90)
			f1.setLocation(90);
		else if (f1.getLocation() < 0)
			f1.setLocation(0);
		if (f2.getLocation() > 90)
			f2.setLocation(90);
		else if (f2.getLocation() < 0)
			f2.setLocation(0);
		
		updateLocationCondition(f1,f2);
	}

	public int calculateDistance(Fighter f1, Fighter f2) {
		int distance = Math.abs(f1.getLocation() - f2.getLocation());
		return distance;
	}
	
	public void updateLocationCondition(Fighter f1, Fighter f2){
		int distance=calculateDistance(f1,f2);
		if(distance>10){
			f1.setLocationCondition("far");
			f2.setLocationCondition("far");
		}else{
			f1.setLocationCondition("near");
			f2.setLocationCondition("near");
		}		
		return;
	}
	
	public void updatePowerCondition(Fighter f1, Fighter f2){
		if(f1.getHealth()==f2.getHealth()){
			f1.setPowerCondition("even");
			f2.setPowerCondition("even");
		}
		else if(f1.getHealth()>f2.getHealth()){
			if(f1.getHealth()-f2.getHealth() > 20){
				f1.setPowerCondition("much_stronger");
				f2.setPowerCondition("much_weaker");
			}
			else if(f1.getHealth()-f2.getHealth() < 20){
				f1.setPowerCondition("stronger");
				f2.setPowerCondition("weaker");
			}				
		}else{
			if(f2.getHealth()-f1.getHealth() > 20){
				f2.setPowerCondition("much_stronger");
				f1.setPowerCondition("much_weaker");
			}
			else if(f2.getHealth()-f1.getHealth() < 20){
				f2.setPowerCondition("stronger");
				f1.setPowerCondition("weaker");
			}	
		}		
		return;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String safInput;
		InputStream stream = null;
		ArrayList<Fighter> fighters = null;
		
		safGame game=new safGame();
		
		try {
			safInput = "fighters.saf";
			stream = new FileInputStream(safInput);
		} catch (IOException e) {
			System.out.println("Parser status:\nERROR: " + e.getMessage());
			e.printStackTrace();
			System.exit(-1);
		}

		Saf parser = new Saf(stream);

		System.out.println("Parsing...");

		try {
			fighters = parser.Parse();
		} catch (ParseException e) {
			System.out.println("Parser status:\nERROR: " + e.getMessage());
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Parser status: SUCCEED");

		// Calculate values
		for (int i = 0; i < fighters.size(); i++)
			fighters.get(i).calibrateAttributes();
		
		System.out.println(fighters);

		fighters.get(0).setLocation(0);
		fighters.get(1).setLocation(90);


		Fighter f1=fighters.get(0);
		Fighter f2=fighters.get(1);
		
		//Graphics
		game.initScreen();
		FighterVisualization p1=new FighterVisualization(f1.getHeight(),1,f1.getName(),f1.getLocation());		
		FighterVisualization p2=new FighterVisualization(f2.getHeight(),2,f2.getName(),f2.getLocation());
		p1.drawFighter();
		p2.drawFighter();
		game.refreshScreen();
		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.text(1, 9.0, f1.getName());
		StdDraw.text(9.0, 9.0, f2.getName());
		StdDraw.text(1.0, 9.5, "Health = "+f1.getHealth());
		StdDraw.text(9.0, 9.5, "Health = "+f2.getHealth());
		p1.drawFighter();
		p2.drawFighter();
		
		int i=0;
		while(f1.getHealth()>0 && f2.getHealth()>0){
			System.out.println("\nPlay cycle: "+i+"\n=============");	
						
			System.out.println(f1.getName());
			f1.getBehavior().calculateActualMoves(f1.getLocationCondition()+" "+f1.getPowerCondition());
			System.out.println("\n"+f2.getName());		
			f2.getBehavior().calculateActualMoves(f2.getLocationCondition()+" "+f2.getPowerCondition());
			f1.calculateCurrentAttackandMove();
			f2.calculateCurrentAttackandMove();
			
			game.calculateHealth(f1, f2);
			game.updatePowerCondition(f1, f2);
			game.updateLocation(f1, f2);

			System.out.println("\n"+f1.getName()+": Health="+f1.getHealth()+": Position="+f1.getLocation());
			System.out.println("Condition: "+f1.getLocationCondition()+" "+f1.getPowerCondition());

			System.out.println("\n"+f2.getName()+": Health="+f2.getHealth()+": Position="+f2.getLocation());
			System.out.println("Condition: "+f2.getLocationCondition()+" "+f2.getPowerCondition());
			
			i++;
			
			/**Graphics**/
			game.refreshScreen();
			StdDraw.setPenColor(StdDraw.MAGENTA);
			StdDraw.text(1, 9.0, f1.getName());
			StdDraw.text(9.0, 9.0, f2.getName());
			StdDraw.text(1.0, 9.5, "Health = "+f1.getHealth());
			StdDraw.text(9.0, 9.5, "Health = "+f2.getHealth());
			p1.updateFighterPosition(f1.getLocation());
			p2.updateFighterPosition(f2.getLocation());
			
			game.chooseVisualization(p1,f1);
			game.chooseVisualization(p2,f2);
			
			p1.drawFighter();
			p2.drawFighter();			
			/*****/
			// display and pause for 20 ms
			StdDraw.show(300);
			p1.initializeBodyHandsLegs();
			p2.initializeBodyHandsLegs();
			game.refreshScreen();
			StdDraw.setPenColor(StdDraw.MAGENTA);
			StdDraw.text(1, 9.0, f1.getName());
			StdDraw.text(9.0, 9.0, f2.getName());
			StdDraw.text(1.0, 9.5, "Health = "+f1.getHealth());
			StdDraw.text(9.0, 9.5, "Health = "+f2.getHealth());
			p1.drawFighter();
			p2.drawFighter();	
			StdDraw.show(700);
			
			
			if(f1.getHealth()<=0 && f2.getHealth()<=0){
				System.out.println("\n=============\n=IT'S A TIE!=\n=============\n=============\n=GAME OVER ==\n=============\n");
				break;//System.exit(1);				
			}
			if(f1.getHealth()<=0){
				System.out.println("\n============\n"+f2.getName()+" WON\n============\n============\nGAME OVER ==\n============\n");
				break;//System.exit(1);
			}
			if(f2.getHealth()<=0){
				System.out.println("\n============\n"+f1.getName()+" WON\n============\n============\nGAME OVER ==\n============\n");
				break;//System.exit(1);
			}
		}
	}
	
	public void chooseVisualization(FighterVisualization f, Fighter fighter){
		if(fighter.getCurrentMove().equals("crouch")){
			f.moveUpDown(FighterVisualization.CROUCH);
		}else if(fighter.getCurrentMove().equals("jump")){
			f.moveUpDown(FighterVisualization.JUMP);
		}
		
		if(fighter.getCurrentAttack().equals("punch_low")){
			f.lowPunch();
		}else if (fighter.getCurrentAttack().equals("punch_high")){
			f.highPunch();
		}else if (fighter.getCurrentAttack().equals("kick_low")){
			f.lowKick();
		}else if (fighter.getCurrentAttack().equals("kick_high")){
			f.highKick();
		}else if (fighter.getCurrentAttack().equals("block_high")){
			f.block(FighterVisualization.HIGH);
		}else if (fighter.getCurrentAttack().equals("block_low")){
			f.block(FighterVisualization.LOW);
		}
	}

}
