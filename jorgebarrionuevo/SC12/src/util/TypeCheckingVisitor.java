package util;

import java.util.ArrayList;
import model.Action;
import model.Characteristic;
import model.ConditionType;
import model.DefaultValues;
import model.Fighter;
import model.Behaviour;
import model.MoveAction;
import model.FightAction;
import model.ChooseAction;
import util.util;
import alert.Error;
import alert.Warning;
import alert.Alert;

public class TypeCheckingVisitor extends Visitor implements DefaultValues{
	private ArrayList<Alert> alerts = new ArrayList<Alert>();
	private boolean correctRange(Characteristic characteristic){
		if ( (characteristic.getValue() >= LOWEST_RANGE) && (characteristic.getValue() <= HIGHEST_RANGE))return true;
		else return false;
	}
	public ArrayList<Alert> getAlerts(){
		return this.alerts;
	}
	//Reconsider this use of Class
	private boolean checkSameActionType(Class<? extends Action> a1, Class<? extends Action> a2){
		if(a1.equals(a2)){return true;}
		else{return false;}
	}
	@Override
	public void visit(Characteristic characteristic) {	
		if (util.isIn(characteristic.getNameCharacteristic(), CHARACTERISTICS)){}
		else{this.alerts.add(new Error(characteristic.toString() + " Incorrect characteristic type"));}
		if (correctRange(characteristic)) {}
		else{this.alerts.add(new Error(characteristic.toString() + " Incorrect characteristic range"));}
	}
	@Override
	public void visit(Behaviour behaviour) {
		behaviour.getCondition().accept(this);
		behaviour.getMoveAction().accept(this);
		behaviour.getFightAction().accept(this);	
		if (checkSameActionType(behaviour.getMoveAction().getClass(),behaviour.getFightAction().getClass()) ){
			this.alerts.add(new Warning(behaviour.toString() + " Incorrect behaviour configuration (same type)" + behaviour.getMoveAction().getClass()+ " and " + behaviour.getFightAction().getClass()));
		}	
	}
	@Override
	public void visit(ConditionType conditionType) {	
		if (util.isIn(conditionType.getName(), CONDITION_TYPES)){}
		else{this.alerts.add(new Error(conditionType.toString() + " Incorrect condition type"));}
	}
	@Override
	public void visit(FightAction fightAction) {
		if (util.isIn(fightAction.getName(), FIGHT_ACTION_TYPES)){}
		else{this.alerts.add(new Error(fightAction.getName() + " Incorrect fight action type" ));}
	}
	@Override
	public void visit(MoveAction moveAction) {
		if (util.isIn(moveAction.getName(), MOVE_ACTION_TYPES)){}
		else{this.alerts.add(new Error(moveAction.toString() + " Incorrect move action type"));}
	}
	@Override
	public void visit(ChooseAction chooseAction) {
		chooseAction.getAction1().accept(this);
		chooseAction.getAction2().accept(this);
	}
	@Override
	public void visit(Fighter fighter) {
		boolean missingAlways = true;
		for (Behaviour behaviour: fighter.getBehaviours()) {
			if (behaviour.getCondition().getAlways()){ missingAlways = false;}
			behaviour.accept(this);
		}
		for (Characteristic characteristic: fighter.getCharacteristics()) {
			characteristic.accept(this);
		}
		if(missingAlways){
			this.alerts.add(new Error(fighter.getName() + " always behaviour not present"));
		}
	}
}
