package saf.fightclub;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import saf.SAFLexer;
import saf.SAFParser;
import saf.ast.Behaviour;
import saf.ast.FighterDef;
import saf.ast.action.Action;
import saf.simulation.Fighter;
import saf.simulation.Rules;

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
		return this.fighter1.getCurrentStance();
	}

	public String getFighter2Stance() {
		return this.fighter2.getCurrentStance();
	}

	public Boolean Simulate() {
		Behaviour b1 = fighter1.getBehaviour(fighter2);
		Behaviour b2 = fighter2.getBehaviour(fighter1);
		String fighter1Attack = b1.getFightAction().getType();
		String fighter2Attack = b2.getFightAction().getType();
		String fighter1Movement = b1.getMoveAction().getType();
		String fighter2Movement = b2.getMoveAction().getType();
		int distance;
		int fighter1AttackDamage;
		int fighter2AttackDamage;
		Boolean fighter1Moved = false; 
		Boolean fighter2Moved = false;
		
		fighter1.setCurrentStance(fighter1Attack);
		fighter2.setCurrentStance(fighter2Attack);
		
		distance = computeDistance();

		// doMove
		fighter1Moved = fighter1.doMove(move(fighter1Movement, distance));
		fighter2Moved = fighter2.doMove(move(fighter2Movement, distance));
		
		distance = computeDistance();
		
		// doDamage
		fighter1AttackDamage = attack(fighter1, fighter2, distance);
		fighter2.doDamage(fighter1AttackDamage);
		
		fighter2AttackDamage = attack(fighter2, fighter1, distance);
		fighter1.doDamage(fighter2AttackDamage);
		
		
		if (fighter1Moved && fighter1AttackDamage == 0) {
			fighter1.setCurrentStance(fighter1Movement);
		}else if(!fighter1Moved && fighter1AttackDamage == 0) {
			fighter1.setCurrentStance("stand");
		}
		
		if (fighter2Moved && fighter2AttackDamage == 0) {
			fighter2.setCurrentStance(fighter2Movement);
		}else if(!fighter2Moved && fighter2AttackDamage == 0) {
			fighter2.setCurrentStance("stand");
		}
		
		return this.fighter1.getHealth() > 0 && this.fighter2.getHealth() > 0;
	}

	private int move(String moveAction, int distance) {
		int movement = roe.ResolveMovement(moveAction);

		if (distance - movement <= 1) {
			movement = 0;
		}

		return movement;
	}

	private int attack(Fighter attacker, Fighter defender, int distance) {

		if (distance <= attacker.getCharacteristicValue("punchReach")) {
			
			if ((attacker.getCurrentStance().equals("punch_low") && !defender.getCurrentStance().equals("block_low"))
					|| (attacker.getCurrentStance().equals("punch_high") && !defender.getCurrentStance().equals("block_high"))) {
				System.out.println(attacker.getDefinition().getName() + " attacks with " + attacker.getCurrentStance());
				return attacker.getCharacteristicValue("punchPower");
			}
			
		}

		if (distance <= attacker.getCharacteristicValue("kickReach")) {
			
			if ((attacker.getCurrentStance().equals("kick_low") && !defender.getCurrentStance().equals("block_low"))
					|| (attacker.getCurrentStance().equals("kick_high") && !defender.getCurrentStance().equals("block_high"))) {
				System.out.println(attacker.getDefinition().getName() + " attacks with " + attacker.getCurrentStance());
				return attacker.getCharacteristicValue("kickPower");
			}

		}
		return 0;
	}

	private int computeDistance() {
		return (this.fighter2.getPosition() - 20) - (this.fighter1.getPosition() + 20);
	}

}