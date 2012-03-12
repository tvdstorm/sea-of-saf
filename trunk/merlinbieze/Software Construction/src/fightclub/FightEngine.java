package saf.fightclub;

import java.io.IOException;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import saf.SAFLexer;
import saf.SAFParser;
import saf.ast.FighterDef;
import saf.simulation.Fighter;
import saf.simulation.Rules;
import saf.simulation.State;

public class FightEngine {

	private final Fighter fighter1;
	private final Fighter fighter2;
	private final Rules roe;

	public FightEngine(String defFile1, String defFile2)
			throws RecognitionException, IOException {
		this.fighter1 = new Fighter(loadFighterDef(defFile1), 60, 1);
		this.fighter2 = new Fighter(loadFighterDef(defFile2), 350, -1);
		this.roe = new Rules();
	}

	private FighterDef loadFighterDef(String file) throws RecognitionException,
			IOException {
		ANTLRFileStream fileStream = new ANTLRFileStream(file);
		SAFLexer lexer = new SAFLexer(fileStream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SAFParser botParser = new SAFParser(tokenStream);
		FighterDef fighter = botParser.readin();

		return fighter;
	}

	public int getFighter1Health() {
		return this.fighter1.getHealth();
	}

	public int getFighter2Health() {
		return this.fighter2.getHealth();
	}

	public int getFighter1Position() {
		return this.fighter1.getPosition();
	}

	public int getFighter2Position() {
		return this.fighter2.getPosition();
	}

	public String getFighter1Stance() {
		return determineStance(this.fighter1);
	}
	
	public String getFighter2Stance() {
		return determineStance(this.fighter2);
	}

	private String determineStance(Fighter fighter) {
		State current = fighter.getCurrentState();
		State previous = fighter.getPreviousState();
		
		if(computeDistance() <= fighter.getCharacteristicValue("kickReach")) {
			// fighting
			current.setStance(current.getFightType());
		} else {
			// moving
			current.setStance(current.getMoveType());
		}
				
		if(current.getStance().equals(previous.getStance())){
			current.setStance(current.getStance() + "_2");
		}
		
		return current.getStance();	
	}

	public Boolean Simulate() {
		int distance;

		distance = computeDistance();
		fighter1.setCurrentState(fighter2);
		fighter2.setCurrentState(fighter1);

		// doMove
		fighter1.doMove(move(fighter1, distance));
		fighter2.doMove(move(fighter2, distance));
	
		distance = computeDistance();
		
		// doDamage
		fighter1.getCurrentState().setDamageInflicted(attack(fighter1, fighter2, distance));
		fighter2.doDamage(fighter1.getCurrentState().getDamageInflicted());
		
		fighter2.getCurrentState().setDamageInflicted(attack(fighter2, fighter1, distance));
		fighter1.doDamage(fighter2.getCurrentState().getDamageInflicted());
		
		return this.fighter1.getHealth() > 0 && this.fighter2.getHealth() > 0;
	}

	private int move(Fighter fighter, int distance) {
		int movement = roe.resolveMovement(fighter.getCurrentState().getMoveType());

		if (distance - movement <= 1) {
			movement = 0;
		}

		return movement;
	}

	private int attack(Fighter attacker, Fighter defender, int distance) {
		String attack = attacker.getCurrentState().getFightType();
		String block = defender.getCurrentState().getFightType();
		String evade = defender.getCurrentState().getMoveType();
		
		if (distance <= attacker.getCharacteristicValue("punchReach")) {
			if(this.roe.isValidPunch(attack, block, evade)){
				//System.out.println(attacker.getDefinition().getName() + " attacked " + defender.getDefinition().getName() + " with a " + attack + " it was not evaded by " + block + " or " + evade);
				return attacker.getCharacteristicValue("punchPower");				
			}
		}

		if (distance <= attacker.getCharacteristicValue("kickReach")) {
			if(this.roe.isValidKick(attack, block, evade)){
				//System.out.println(attacker.getDefinition().getName() + " attacked " + defender.getDefinition().getName() + " with a " + attack + " it was not evaded by " + block + " or " + evade);
				return attacker.getCharacteristicValue("kickPower");				
			}
		}
		return 0;
	}
	
	
	
	private int computeDistance() {
		return (this.fighter2.getPosition() - 25) - (this.fighter1.getPosition() + 25);
	}

}