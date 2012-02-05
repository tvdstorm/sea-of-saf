package game;

import java.util.ArrayList;

import elements.Bot;
import elements.Bots;
import elements.Characteristic;
import game.fighter.Fighter;

public class FightEngine {
	private Fighter firstFighter;
	private Fighter secondFighter;
	
	int currentPlayer;
	int distance;
	
	public FightEngine(Bots bots) {
		initializeFighters(bots);
		currentPlayer = (int) Math.random();
	}

	private void initializeFighters(Bots bots) {
		Bot firstBot = bots.getFirstBot();
		Bot secondBot = bots.getSecondBot();
		
		firstFighter = new Fighter(firstBot.getBotName());
		secondFighter = new Fighter(secondBot.getBotName());

		initializeFighterCharacteristics(firstFighter, firstBot.getCharacteristics());
		initializeFighterCharacteristics(secondFighter, secondBot.getCharacteristics());

	}

	private void initializeFighterCharacteristics(Fighter safFighter, ArrayList<Characteristic> characteristics) {
		for (Characteristic characteristic : characteristics) {
			switch(characteristic.getName())
			{
			case "punchReach" : 
				safFighter.setPunchReach(characteristic.getValue());
				break;
			case "punchPower" : 
				safFighter.setPunchPower(characteristic.getValue());
				break;
			case "kickReach" : 
				safFighter.setKickReach(characteristic.getValue());
				break;
			case "kickPower" : 
				safFighter.setKickPower(characteristic.getValue());
				break;
			}
		}
		
		safFighter.setHealth(100);
		safFighter.setWeight((safFighter.getPunchPower() + safFighter.getKickPower()) /2);
		safFighter.setHeight((safFighter.getPunchReach() + safFighter.getKickReach()) /2);
		safFighter.setSpeed((int) (0.5 * (safFighter.getHeight()- safFighter.getWeight())));
	}
	
	public Fighter getFirstFighter() {
		return firstFighter;
	}

	public void setFirstFighter(Fighter firstFighter) {
		this.firstFighter = firstFighter;
	}

	public Fighter getSecondFighter() {
		return secondFighter;
	}

	public void setSecondFighter(Fighter secondFighter) {
		this.secondFighter = secondFighter;
	}
	
	public void switchCurrentPlayer() {
		if(currentPlayer == 0) {
			currentPlayer = 1;
		}
		else {
			currentPlayer = 0;
		}
	}

	public void doStep() {
		// TODO Auto-generated method stub
		
	}
}
