package game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ast.fighter.Fighter;

public class FighterAI {

	Fighter ast;
	private int position;
	private int maxPos;
	private int minPos;
	private FighterAI opponent;
	private enum Direction {LEFT, RIGHT};
	
	public FighterAI(Fighter ast, int initialPosition){
		this.ast = ast;
		this.setPosition(initialPosition);
	}
	
	public void setOpponent(FighterAI opponent){
		this.opponent = (opponent);
	}
	
	public void takeAction(){
		pickBehavior("far", "much_stronger");
	}
	
	public int getPosition(){
		return position;
	}
	
	private void setPosition(int position){
		initPositionRange();
		if(position <= minPos)
			this.position = minPos;
		else if (position >= maxPos)
			this.position = maxPos;
		else
			this.position = position;
	}
	
	private void initPositionRange(){
		this.maxPos = Arena.MAX_FLOOR_POSITION;
		this.minPos = Arena.MIN_FLOOR_POSITION;
		if(opponent != null){
			switch (direction()){
			case RIGHT:
				maxPos = opponent.getPosition();
				break;
			case LEFT:
				minPos = opponent.getPosition();
				break;
			default:
				break;
			}
		}
	}
	
	private Direction direction(){
		Direction result = Direction.RIGHT;
		if (opponent != null) {
			if (getPosition() >= opponent.getPosition())
				result = Direction.LEFT;
		}
		return result;
	}
	
	private void pickBehavior(String... conditions){
		Set<String> conditionsSet = new HashSet<String>();
		for(String condition: conditions) {
			conditionsSet.add(condition);
		}
		Populator pop = new Populator();
		List<Rule> result = pop.populate(conditionsSet, this);
		List<Rule> bestResult = getBestFittingRules(result, conditionsSet.size());
		System.out.println(result);
		System.out.println(bestResult);
	}
	
	private List<Rule> getBestFittingRules(List<Rule> behaviors, int numberOfDefinedConditions){
		List<Rule> result = null;
		for(;numberOfDefinedConditions > 0; numberOfDefinedConditions--){
			result = getSetsWithExactSize(behaviors, numberOfDefinedConditions);
			if(result != null)
				break;
		}
		return result;
	}
	
	private List<Rule> getSetsWithExactSize(List<Rule> rules, int setSize){
		List<Rule> result = new ArrayList<Rule>();
		for(Rule rule : rules){
			if(rule.size() == setSize){
				result.add(rule);
			}
		}
		return result;
	}
	
}
