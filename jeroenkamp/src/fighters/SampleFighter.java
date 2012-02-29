package fighters;

import java.util.*;

import common.*;

import game.Fighter;

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
