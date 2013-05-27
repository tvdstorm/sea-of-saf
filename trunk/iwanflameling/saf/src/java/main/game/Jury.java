package game;

import gui.Arena;

import java.util.ArrayList;
import java.util.List;

import ast.fighter.Fighter;

public class Jury {
	
	public static final int MIN_FLOOR_POSITION = 1;
	public static final int MAX_FLOOR_POSITION = 200;
	public static final int STANDARD_TIMESTEP = 5;
	
	public enum Outcome{NO_WINNERS, TIE, WINNER};
	private FighterAI fighterOne;
	private FighterAI fighterTwo;
	private List<FighterAI> winners;
	private Arena arena;
	
	public Jury(Fighter fighterOne, Fighter fighterTwo){
		this.fighterOne = new FighterAI(fighterOne, MIN_FLOOR_POSITION);
		this.fighterTwo = new FighterAI(fighterTwo, MAX_FLOOR_POSITION);
		init();
	}
	
	private void init(){
		this.fighterOne.setOpponent(this.fighterTwo);
		this.fighterTwo.setOpponent(this.fighterOne);
		winners = new ArrayList<FighterAI>();
		this.arena = new Arena(this);
	}
	
	public void startFight(){
		while(!fighterIsDefeated()){
			fighterOne.takeAction();
			fighterTwo.takeAction();
			int damageToFighterOne = calculateDamage(fighterOne, fighterTwo);
			int damageToFighterTwo = calculateDamage(fighterTwo, fighterOne);
			fighterOne.setHealth(fighterOne.getHealth()-damageToFighterOne);
			fighterTwo.setHealth(fighterTwo.getHealth()-damageToFighterTwo);
			fighterOne.startRecovery();
			fighterTwo.startRecovery();
			//this.arena.update();
			sleep(10);
		}
		this.winners = winningFighters();
		printOutcome();
	}
	
	private void sleep(long millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// this is just to slow down the fight. If it is
			// interrupted, simply continue the fight.
		}
	}
	
	private void printOutcome(){
		switch (outcome()) {
		case NO_WINNERS:
			System.out.println("Whimps!");
			break;
		case TIE:
			System.out.println("It's a Tie!");
			break;
		case WINNER:
			System.out.println(winners.get(0).ast.getName() + " WINS!");

		default:
			break;
		}
	}
	
	private Outcome outcome(){
		Outcome outcome;
		if(winners.isEmpty()){
			outcome = Outcome.NO_WINNERS;
		} else if (winners.size() >= 2){
			outcome = Outcome.TIE;
		} else if(winners.size() == 1) {
			outcome = Outcome.WINNER;
		} else{
			outcome = Outcome.NO_WINNERS;
		}
		return outcome;
	}
	
	private List<FighterAI> winningFighters(){
		List<FighterAI> winners = new ArrayList<FighterAI>();
		if(fighterOne.isDefeated()){
			winners.add(fighterTwo);
		}
		if(fighterTwo.isDefeated()){
			winners.add(fighterOne);
		}
		return winners;
	}
	
	private boolean fighterIsDefeated(){
		return (fighterOne.isDefeated() || fighterTwo.isDefeated());
	}
	
	/**
	 * Calculates a damage of 5 points if <code>fighter</code> hits <code>opponent</code>.
	 * @param fighter
	 * @param opponent
	 * @return the damage done by <code>fighter</code> to its <code>opponent</code>.
	 */
	private int calculateDamage(FighterAI fighter, FighterAI opponent){
		int damage = 0;
		if(isHit(fighter, opponent) && !isBlocked(fighter, opponent)){
			damage = 5;
		}
		return damage;
	}
	
	/**
	 * 
	 * @param fighter
	 * @param opponent
	 * @return <code>true</code> if <code>fighter</code> attacks high and
	 * <code>opponent</code> blocks high. or when attacked low and blocked low. Otherwise
	 * returns <code>false</code>. In order for the <code>opponent</code> to put up a block,
	 * the <code>opponent</code> needs be done with recovering from a previous fight-action.
	 */
	private boolean isBlocked(FighterAI fighter, FighterAI opponent){
		boolean blocked = false;
		String fighterFightAction = fighter.getCurrentFightAction();
		String opponentFightAction = opponent.getCurrentFightAction();
		if(!opponent.isRecovering()){
			if((fighterFightAction.contains("low") && opponentFightAction.contains("block_low"))
					|| (fighterFightAction.contains("high") && opponentFightAction.contains("block_high"))){
				blocked = true;
			}
		}
		
		return blocked;
	}
	
	/**
	 * A <code>fighter</code> can only hit its <code>opponent</code> if its within
	 * its attack-reach and the <code>fighter</code> is not still busy with recovering
	 * from a previous fight-action.
	 * @param fighter
	 * @param opponent
	 * @return
	 */
	private boolean isHit(FighterAI fighter, FighterAI opponent){
		boolean hit = false;
		String fightAction = fighter.getCurrentFightAction();
		int requiredReach = Math.abs(fighter.getPosition()-opponent.getPosition());
		int attackReach = 0;
		if(fightAction.contains("kick")){
			attackReach = fighter.getKickReach();
		} else if(fightAction.contains("punch")){
			attackReach = fighter.getPunchReach();
		}
		if((requiredReach <= attackReach) && !fighter.isRecovering())
			hit = true;
		return hit;
	}

	public FighterAI getFighterOne() {
		return fighterOne;
	}

	public FighterAI getFighterTwo() {
		return fighterTwo;
	}

}
