package saf.visitor;

import java.util.ArrayList;
import java.util.List;

import saf.ast.Behaviour;
import saf.ast.Bot;
import saf.ast.Personality;
import saf.ast.action.Action;
import saf.ast.action.ChooseAction;
import saf.ast.action.SingleAction;
import saf.ast.condition.AndCondition;
import saf.ast.condition.CombineCondition;
import saf.ast.condition.Condition;
import saf.ast.condition.OrCondition;
import saf.ast.condition.SingleCondition;

public class FighterPrinter implements IVisitor{
	private List<String> personalities;
	private List<String> behaviours;
	private String con;
	private String act;
	
	public FighterPrinter()
	{
		personalities = new ArrayList<String>();
		behaviours = new ArrayList<String>();
		con = "";
		act = "";
	}
	
	public List<String> getPersonalities()
	{
		return personalities;
	}
	
	public List<String> getBehaviours()
	{
		return behaviours;
	}
	
	@Override
	public void visit(Bot fighter) {
		for(Personality p : fighter.getPersonality())
			p.accept(this);
		for(Behaviour b : fighter.getBehaviour())
			b.accept(this);
	}

	@Override
	public void visit(Personality personality) {
		personalities.add(personality.getCharacterName() + " = " + Integer.toString(personality.getCharacterValue()));
	}

	@Override
	public void visit(Behaviour behaviour) {
		con = "";
		act = "";
		behaviour.getCondition().accept(this);
		behaviour.getAction().accept(this);
		if (con.indexOf("[")>=0)
		{
			con = con.substring(con.indexOf("[")+1, con.lastIndexOf("]"));
		}
		behaviours.add(con + " { " + act.trim() + " } " );
	}

	@Override
	public void visit(Action action) {
		action.getMoveAction().accept(this);
		action.getFightAction().accept(this);
	}

	@Override
	public void visit(ChooseAction chooseAction) {
		act += "choose" + "[";
		for (Action a : chooseAction.getActions())
		{
			a.accept(this);
			act += " ";
		}
		act = act.trim();
		act += "] ";
	}

	@Override
	public void visit(SingleAction singleAction) {
		act += singleAction.getSingleAct() + " ";
	}

	@Override
	public void visit(Condition condition) {
		condition.accept(this);
	}

	@Override
	public void visit(CombineCondition combineCondition) {
		combineCondition.accept(this);
	}

	@Override
	public void visit(OrCondition orCondition) {
		Condition[] cond = orCondition.getCombineConditions();
		con += "[";
		cond[0].accept(this);
		con += " OR ";
		cond[1].accept(this);
		con += "]";
	}

	@Override
	public void visit(AndCondition andCondition) {
		Condition[] cond = andCondition.getCombineConditions();
		con += "[";
		cond[0].accept(this);
		con += " AND ";
		cond[1].accept(this);
		con += "]";
	}
	
	@Override
	public void visit(SingleCondition singleCondition) {
		con += singleCondition.getConditionName();
	}
}
