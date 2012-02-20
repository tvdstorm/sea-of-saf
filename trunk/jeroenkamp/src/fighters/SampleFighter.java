package fighters;

import java.util.*;

import common.*;

import game.Fighter;

public class SampleFighter extends Fighter {

	@Override
	public List<ActionPair> doSomething() {
		List<ActionPair> list =new ArrayList<ActionPair>();
		// TODO Auto-generated method stub
		list.add(new ActionPair(MoveType.run_towards,ActionType.punch_high));
		return list;
	}

}
