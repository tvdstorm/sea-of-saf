package saf.fighters;

import java.util.*;

import saf.common.ActionPair;
import saf.common.ActionType;
import saf.common.MoveType;
import saf.game.Fighter;


public class SampleFighter extends Fighter {

	public SampleFighter(){
		m_Name="Sample";
		
	}
	@Override
	public List<ActionPair> doSomething() {
		List<ActionPair> list =new ArrayList<ActionPair>();
		list.add(new ActionPair(MoveType.run_towards,ActionType.punch_high));
		return list;
	}
}
