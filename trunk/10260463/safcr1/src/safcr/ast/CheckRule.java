package safcr.ast;

import java.util.Random;

public class CheckRule implements VisitorInterface {
	private String searchCondition;
	private String searchDistance;
	private Boolean foundConditions = false;
	private Boolean found = false;
	private String condition;
	private String distance;
	private String moveAction;
	private String attackAction;
	private int currentAction;
	
	public Boolean isFound(){
		return found;
	}
	
	public String getMoveAction(){
		return moveAction;
	}
	
	public String getAttackAction(){
		return attackAction;
	}
	
	public void setCondition(String s){
		searchCondition = s;
	}
	
	public void setDistance(String s){
		searchDistance = s;
	}

	@Override
	public void visit(Saf saf) {}

	@Override
	public void visit(Bot bot) {}

	@Override
	public void visit(Personality pers) {}

	@Override
	public void visit(Characteristic chars) {}

	@Override
	public void visit(Behaviour behave) {}

	@Override
	public void visit(Rule rule) {
		condition = "";
		distance = "";
		found = false;
		foundConditions = false;
		rule.getCondition().accept(this);
		rule.getAction().accept(this);
	}

	@Override
	public void visit(Condition con) {
		if(con.getType().equals(searchCondition)){
			foundConditions = true;
			found = true;
			condition = con.getType();
		}
		else if(con.getType().equals(searchDistance)){
			foundConditions = true;
			found = true;
			distance = con.getType();
		}
	}

	@Override
	public void visit(Action act) {
		currentAction = 1;
		act.getAction1().accept(this);
		
		currentAction = 2;
		act.getAction2().accept(this);
	}

	@Override
	public void visit(ActionType actType) {
		if(currentAction == 1 && found)
			moveAction = actType.getActionType();
		if(currentAction == 2 && found)
			attackAction = actType.getActionType();
	}

	@Override
	public void visit(MultiActionType multiActType) {
		Random generator = new Random();
		int rn = generator.nextInt(2) + 1;
		if(rn == 1) multiActType.getTypeChoice1().accept(this);
		else multiActType.getTypeChoice2().accept(this);
	}

	@Override
	public void visit(And andStatement) {
		andStatement.getNode1().accept(this);
		andStatement.getNode2().accept(this);
		if(condition.equals(searchCondition) && distance.equals(searchDistance)) found = true;
		else{ found = false; foundConditions = false;}
	}

	@Override
	public void visit(Or orStatement) {
		orStatement.getNode1().accept(this);
		orStatement.getNode2().accept(this);
		if(foundConditions) found = true;
	}

}
