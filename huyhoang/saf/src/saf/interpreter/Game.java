package saf.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;
import saf.ast.Fighter;

public class Game extends Observable {
	private List<Bot> bots;
	
	public List<Bot> getBots() {
		return this.bots;
	}
	
	public Game() {
		bots = new ArrayList<Bot>();
	}
	
	private Bot getLastOpponent() {
		if (this.getBots().size() == 0)
			return null;

		return this.getBots().get(this.getBots().size()-1);
	}
	
	public void addFighter(Fighter fighter) {
		Random random = new Random();
		int location = random.nextInt(3);
		
		Bot opponent = getLastOpponent();
		if (opponent != null)
			location += 1 + random.nextInt(7);
		
		Bot bot = new Bot(fighter, location);
		if (opponent != null) {
			opponent.setOpponentBot(bot);
		}
		
		this.getBots().add(bot);
	}
	
	public void EvaluateBots() {
		InterpreterVisitor interpreter = new InterpreterVisitor();
		for (int counter=0; counter<2; counter++) {
			interpreter.setBot(bots.get(counter));
			interpreter.Evaluate(bots.get(counter).getFighter());
		}
		
		this.setChanged();
		this.notifyObservers();
	}
}
