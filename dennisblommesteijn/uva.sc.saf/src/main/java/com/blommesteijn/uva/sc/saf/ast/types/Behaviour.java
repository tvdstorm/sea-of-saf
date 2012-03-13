package com.blommesteijn.uva.sc.saf.ast.types;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.blommesteijn.uva.sc.saf.utils.RandUtil;
import com.blommesteijn.uva.sc.saf.utils.StringUtil;
import com.blommesteijn.uva.sc.saf.ast.types.actions.Action;
import com.blommesteijn.uva.sc.saf.ast.types.actions.AttackAction;
import com.blommesteijn.uva.sc.saf.ast.types.actions.BlockAction;
import com.blommesteijn.uva.sc.saf.ast.types.actions.MoveAction;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckIssue;
import com.blommesteijn.uva.sc.saf.checkers.StaticCheckerResult;

public class Behaviour extends AstNode
{
	private static final long serialVersionUID = 2206995385688428837L;
	private Conditions _conditions = null;
	
	//actions container
	private Map<Class<? extends Action>, Action> _actions = new HashMap<Class<? extends Action>, Action>();

	//map of actions, and keywords
	protected static Map<String, Class<? extends Action>> __allActions = getAllActions();
	
	//populating actions map
	private static Map<String, Class<? extends Action>> getAllActions()
	{
		Map<String, Class<? extends Action>> ret = new HashMap<String, Class<? extends Action>>();
		ret.put("jump", MoveAction.class);
		ret.put("crouch", MoveAction.class);
		ret.put("stand", MoveAction.class);
		ret.put("run_towards", MoveAction.class);
		ret.put("run_away", MoveAction.class);
		ret.put("walk_towards", MoveAction.class);
		ret.put("walk_away", MoveAction.class);
		
		ret.put("punch_low", AttackAction.class);
		ret.put("punch_high", AttackAction.class);
		ret.put("kick_low", AttackAction.class);
		ret.put("kick_high", AttackAction.class);
		
		ret.put("block_low", BlockAction.class);
		ret.put("block_high", BlockAction.class);
		return ret;
	}

	/**
	 * 
	 * @param conditions
	 */
	public Behaviour(Conditions conditions)
	{
		super();
		_conditions = conditions;
	}
	
	public Behaviour(int line, Conditions conditions) 
	{
		super(line);
		_conditions = conditions;
		_conditions.setLine(line);
	}

	public void addActions(List<Action> actions) 
	{
		List<Action> specificActions = this.getSpecificOperator(actions);		
		for(Action specificAction : specificActions)
		{
			_actions.put(specificAction.getClass(), specificAction);
		}
	}

	/**
	 * Check presence of actions (actions >= 2, moves >=1, attack/block >= 1)
	 * @param result reference to static checker result
	 */
	protected void checkActions(StaticCheckerResult result)
	{		
		for(Entry<Class<? extends Action>, Action> iter : _actions.entrySet())
		{
			Action action = iter.getValue();
			if(!__allActions.containsKey(action.getName()))
				result.append(new StaticCheckIssue(action, "incorrect keyword"));
		}
		
		//at least two actions
		if(_actions.size() < 2)
			result.append(new StaticCheckIssue(this, "not enough actions (<2)"));
		//at least one move
		List<Action> moves = this.getActionByType(MoveAction.class);
		if(moves.size() < 1)
			result.append(new StaticCheckIssue(this, "no moves (<1)"));
		//at least one block or attack
		List<Action> attacks = this.getActionByType(AttackAction.class);
		List<Action> blocks = this.getActionByType(BlockAction.class);
		if(blocks.size() + attacks.size() < 1)
			result.append(new StaticCheckIssue(this, "no attack/ block (<1)"));
	}



	@Override
	public void staticCheck(StaticCheckerResult result) 
	{
		//validate actions
		this.checkActions(result);
		
		//check actions
		for(Entry<Class<? extends Action>, Action> action : _actions.entrySet())
			action.getValue().staticCheck(result);
		//check conditions
		_conditions.staticCheck(result);
	}
	
	/**
	 * Get Actions by type
	 * @param type derived class of action
	 * @return list of actions of specified type
	 */
	public List<Action> getActionByType(Class<? extends Action> type) 
	{
		List<Action> ret = new LinkedList<Action>();
		for(Entry<Class<? extends Action>, Action> action : _actions.entrySet())
		{
			if(type.equals(action.getKey()))
				ret.add(action.getValue());
		}
		return ret;
	}
	
	private List<Action> getSpecificOperator(List<Action> actions) 
	{
		List<Action> ret = new LinkedList<Action>();
		for(Action action : actions)
			ret.add(this.getSpecificOperator(action));
		return ret;
	}
	
	/**
	 * Get Type specific operator (Operator -> OrOperator)
	 * @param action original action (base class)
	 * @return derived class, matched to keyword
	 */
	private Action getSpecificOperator(Action action)
	{
		Action tmp = null;
		String name = action.getName();
		if(__allActions.containsKey(name))
		{
			Class<? extends Action> o = __allActions.get(name);
			Action newInstance = null;
			try 
			{
				newInstance = o.newInstance();
			} 
			catch (Exception e) 
			{}
			newInstance.setObjectFields(action);
			tmp = newInstance;
		}
		else
			tmp = action;
		return tmp;
	}

	public String getDescription() 
	{
		return "behaviour";
	}
	
	public String toString()
	{
		return this.toString("");
	}
	
	public String toString(String indent) 
	{
		StringBuilder sb = new StringBuilder();
		//append typename
		sb.append(indent).append("[ ").append(this.getClass().getSimpleName());
		sb.append(": ").append(StringUtil.NEW_LINE);	
		
		if(!_actions.isEmpty())
		{
			sb.append(indent).append("( ").append(StringUtil.NEW_LINE);
			for(Entry<Class<? extends Action>, Action> action : _actions.entrySet())
			{
				sb.append(action.getValue().toString(indent + StringUtil.TAB));
			}
			sb.append(indent).append(")");
			sb.append(StringUtil.NEW_LINE);
		}
		if(_conditions != null)
		{
			sb.append(indent).append("( ").append(StringUtil.NEW_LINE);
			sb.append(_conditions.toString(indent + StringUtil.TAB));
			sb.append(indent).append(")");
			sb.append(StringUtil.NEW_LINE);
		}
		
		
		sb.append(indent).append(StringUtil.NEW_LINE);
		return sb.toString();
	}

	public Conditions getConditions() 
	{
		return _conditions;
	}

	public Action getRandomAction(Class<? extends Action> clazz) 
	{
		List<Action> tmp = this.getActionByType(clazz);
		if(tmp.isEmpty())
			return null;
		int random = RandUtil.getRandom(0, tmp.size());
		return tmp.get(random);
	}

}
