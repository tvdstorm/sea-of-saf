package saf.fightclub;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import saf.SAFLexer;
import saf.SAFParser;
import saf.ast.Action;
import saf.ast.FighterDef;
import saf.simulation.Fighter;

public class FightEngine {
	
	private final Fighter fighter1;
	private final Fighter fighter2;
	
	public FightEngine(String defFile1, String defFile2) throws RecognitionException, IOException {
		this.fighter1 = new Fighter(loadFighterDef(defFile1), 10);
		this.fighter2 = new Fighter(loadFighterDef(defFile2), 314);
	}
	
	private FighterDef loadFighterDef(String file) throws RecognitionException, IOException {
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
	
	public int getFighter1Stance() {
		return resolveStance(this.fighter1.getCurrentStance());
	}
	
	public int getFighter2Stance() {
		return resolveStance(this.fighter2.getCurrentStance());
	}
	
	public Boolean Simulate() {
		int distance = computeDistance();
		// doMove
		
		// doDamage
		computeDamage(fighter1, fighter2, distance);
		computeDamage(fighter2, fighter1, distance);
		
		return this.fighter1.getHealth() > 0 && this.fighter2.getHealth() > 0;
	}
	
	private int computeDamage(Fighter fighterA, Fighter fighterB, int distance) {
		if(!fighterA.isMoving()) {
			if(distance <= fighterA.getCharacteristicValue("punchReach")) {
				//fighterA.getDefinition().
			}
			if(distance <= fighterA.getCharacteristicValue("kickReach")) {
				
			}
		}
		return 0;
	}
	
	private int computeDistance() {
		return this.fighter2.getPosition() - this.fighter1.getPosition(); 
	}
	
	private int resolveStance(Action act) {
		return 0;
	}
}