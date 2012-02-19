package safGame;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import parser.ParseException;
import parser.Saf;

import abstractSyntaxTree.Fighter;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;

public class safGame {

	// arena 0-90
	int distance = 0;
	String locationCondition="far";
	
	
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
						.equals("block_high")))) {
			return;
		} else {
			if ((distance / 10) <= f1.getCurrentAttackReach()) {
				f2.setHealth(f2.getHealth() - f1.getCurrentAttackPower());
			}
			if ((distance / 10) <= f2.getCurrentAttackReach()) {
				f1.setHealth(f1.getHealth() - f2.getCurrentAttackPower());
			}
		}
	}

	public void updateLocation(Fighter f1, Fighter f2) {
		if (f1.getCurrentMove().equals("run_towards")) {
			f1.setLocation(f1.getLocation() + ((int) f1.getSpeed() * 2));
		} else if (f1.getCurrentMove().equals("walk_towards")) {
			f1.setLocation(f1.getLocation() + ((int) f1.getSpeed()));
		} else if (f1.getCurrentMove().equals("run_away")) {
			f1.setLocation(f1.getLocation() + ((int) f1.getSpeed() * 2));
		} else if (f1.getCurrentMove().equals("walk_away")) {
			f1.setLocation(f1.getLocation() + ((int) f1.getSpeed()));
		}

		if (f2.getCurrentMove().equals("run_towards")) {
			f2.setLocation(f2.getLocation() + ((int) f2.getSpeed() * 2));
		} else if (f2.getCurrentMove().equals("walk_towards")) {
			f2.setLocation(f2.getLocation() + ((int) f2.getSpeed()));
		} else if (f2.getCurrentMove().equals("run_away")) {
			f2.setLocation(f2.getLocation() + ((int) f2.getSpeed() * 2));
		} else if (f2.getCurrentMove().equals("walk_away")) {
			f2.setLocation(f2.getLocation() + ((int) f2.getSpeed()));
		}

		if (f1.getLocation() > 90)
			f1.setLocation(90);
		else if (f1.getLocation() < 0)
			f1.setLocation(0);
		if (f2.getLocation() > 90)
			f2.setLocation(90);
		else if (f2.getLocation() < 0)
			f2.setLocation(0);
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
		fighters.get(0).setLocation(90);


		Fighter f1=fighters.get(0);
		Fighter f2=fighters.get(1);
				
/*		int i=0;
		while(i<10){
			System.out.println("Play move: "+i);
			game.calculateHealth(f1, f2);
			game.updatePowerCondition(f1, f2);
			f1.getBehavior().calculateActualMoves(f1.getLocationCondition()+" "+f1.getPowerCondition());
			f2.getBehavior().calculateActualMoves(f2.getLocationCondition()+" "+f2.getPowerCondition());
			System.out.println("\nFighter 1=======\n");
			f1.calculateCurrentAttackandMove();
			System.out.println("\n\nFighter 2=======\n");
			f2.calculateCurrentAttackandMove();
			i++;
		}
	*/	
		// System.out.println("Results:");
		// System.out.println(fighters);

	}

}
