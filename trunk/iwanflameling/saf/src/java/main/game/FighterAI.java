package game;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import ast.action.Action;
import ast.action.Choose;
import ast.action.SimpleAction;
import ast.checker.DelegateVisitor;
import ast.fighter.Behavior;
import ast.fighter.Fighter;

public class FighterAI {

	Fighter ast;
	private int position;
	private int maxPos;
	private int minPos;
	private int timestepBlock;
	private int speed;
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
		pickRule("far", "much_stronger");
	}
	
	public int getPosition(){
		return position;
	}
	
	private void executeRule(Rule rule){
		Behavior behavior = rule.getBehavior();
		if(behavior != null){
			Action action = behavior.getMoveAction();
			ActionPicker ap = new ActionPicker();
			executeMoveAction(ap.pick(action));
		}
	}
	
	private void executeMoveAction(SimpleAction action){
		timestepBlock = (Arena.STANDARD_TIMESTEP * speed);
		action.getAction();
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
	
	private Rule pickRule(String... conditions){
		Set<String> conditionsSet = new HashSet<String>();
		for(String condition: conditions) {
			conditionsSet.add(condition);
		}
		Populator pop = new Populator();
		List<Rule> result = pop.populate(conditionsSet, this);
		List<Rule> bestResult = getBestFittingRules(result, conditionsSet.size());
		System.out.println(bestResult);
		Random rand = new Random();
		int index = rand.nextInt(bestResult.size());
		Rule rule = bestResult.get(index);
		return rule;
	}
	
	private List<Rule> getBestFittingRules(List<Rule> rules, int numberOfDefinedConditions){
		List<Rule> result = null;
		for(;numberOfDefinedConditions > 0; numberOfDefinedConditions--){
			result = getRulesWithExactSize(rules, numberOfDefinedConditions);
			if(result != null)
				break;
		}
		return result;
	}
	
	private List<Rule> getRulesWithExactSize(List<Rule> rules, int setSize){
		List<Rule> result = new ArrayList<Rule>();
		for(Rule rule : rules){
			if(rule.size() == setSize){
				result.add(rule);
			}
		}
		return result;
	}
	
	private class ActionPicker extends DelegateVisitor{
		SimpleAction returnValue;
		
		public SimpleAction pick(Action action){
			this.returnValue = null;
			action.accept(this);
			return returnValue;
		}

		/* (non-Javadoc)
		 * @see ast.checker.DelegateVisitor#visit(ast.action.SimpleAction)
		 */
		@Override
		public void visit(SimpleAction simpleAction) {
			returnValue = simpleAction;
			super.visit(simpleAction);
		}

		/* (non-Javadoc)
		 * @see ast.checker.DelegateVisitor#visit(ast.action.Choose)
		 */
		@Override
		public void visit(Choose choose) {
			Random rand = new Random();
			List<SimpleAction> simpleActions = choose.getChoices();
			int index = rand.nextInt(simpleActions.size());
			SimpleAction simpleAction = simpleActions.get(index);
			this.visit(simpleAction);
		}
		
	}
	
}
