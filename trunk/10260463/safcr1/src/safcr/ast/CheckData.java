package safcr.ast;

import java.util.ArrayList;
import java.util.List;

import safcr.data.*;

public class CheckData implements VisitorInterface {
	private List<String> errors = new ArrayList<String>();
	private CharacteristicData charsData;
	private ConditionData condData;
	private AttackData attData;
	private MoveData moveData;
	
	private String currentBot = "";
	private int currentRule = 0;
	private int currentAction = 0;
	
	public void setDatas(CharacteristicData cd, ConditionData cod, AttackData ad, MoveData md){
		charsData = cd;
		condData = cod;
		attData = ad;
		moveData = md;
	}
	
	public void addErrorMessage(String s){
		errors.add("(" + currentBot + ") - " + s);
	}
	
	public List<String> getErrors(){
		return errors;
	}
	
	public void printErrors(){
		if(!errors.isEmpty()){
			for(String s : errors)
				System.err.println(s);
		}
	}

	@Override
	public void visit(Saf saf) {
		int botSize = saf.getBots().size();
		if(botSize < 2){
			addErrorMessage("There is not enought bots. 2 bots are needed.");
		}
		if(botSize > 2){
			addErrorMessage("Only 2 bots are allowed.");
		}
		
		for(Bot b : saf.getBots()){
			b.accept(this);
		}
	}

	@Override
	public void visit(Bot bot) {
		currentBot = bot.getName();
		bot.getPersonality().accept(this);
		bot.getBehaviour().accept(this);
	}

	@Override
	public void visit(Personality pers) {
		for(Characteristic c : pers.getCharacteristic()){
			c.accept(this);
		}
	}

	@Override
	public void visit(Characteristic chars) {
		if(!charsData.getChars().contains(chars.getName()))
			addErrorMessage(chars.getName() + " is not a valid characteristic.");
		
		if(chars.getValue() < charsData.getMinValue() || chars.getValue() > charsData.getMaxValue())
			addErrorMessage("Value of " + chars.getName() + ": " + chars.getValue() + 
			" is invalid. Min. value: " + charsData.getMinValue() +
			". Max. value: " + charsData.getMaxValue());
	}

	@Override
	public void visit(Behaviour behave) {
		for(Rule r : behave.getRules()){
			r.accept(this);
		}
	}

	@Override
	public void visit(Rule rule) {
		currentRule += 1;
		rule.getCondition().accept(this);
		rule.getAction().accept(this);
	}

	@Override
	public void visit(Condition con) {
		if(!condData.getConditons().contains(con.getType()))
			addErrorMessage("Rule nr. " + currentRule + " - " + con.getType() + " is not a valid condition.");
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
		if(currentAction == 1){
			if(!moveData.getMoves().contains(actType.getActionType()))
				addErrorMessage("Rule nr. " + currentRule + " - " + actType.getActionType()+ " is not a valid movement.");
		}
		if(currentAction == 2){
			if(!attData.getAttacks().contains(actType.getActionType()))
				addErrorMessage("Rule nr. " + currentRule + " - " + actType.getActionType()+ " is not a valid attack move.");
		}
	}

	@Override
	public void visit(MultiActionType multiActType) {
		multiActType.getTypeChoice1().accept(this);
		multiActType.getTypeChoice2().accept(this);
	}

	@Override
	public void visit(And andStatement) {
		andStatement.getNode1().accept(this);
		andStatement.getNode2().accept(this);
	}

	@Override
	public void visit(Or orStatement) {
		orStatement.getNode1().accept(this);
		orStatement.getNode2().accept(this);
	}
}
