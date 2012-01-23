package saf.classes;

import java.util.List;

public class Behaviour {
	
	private String _type = "";
	private List<BehaviourAction> _moveActions = null;
	private List<BehaviourAction> _fightActions = null;
	
	public String get_type() {
		return _type;
	}

	public List<BehaviourAction> get_moveActions() {
		return _moveActions;
	}

	public List<BehaviourAction> get_fightActions() {
		return _fightActions;
	}

	
	public Behaviour(String type, List<BehaviourAction> moveActions, List<BehaviourAction> fightActions){
		this._type = type;
		this._moveActions = moveActions;
		this._fightActions = fightActions;
	}

}