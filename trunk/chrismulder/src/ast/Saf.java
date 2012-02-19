package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import ast.ConditionAtom.Type;

public class Saf implements Validator {
	private String name;
	private ArrayList<Strength> strengths;
	private ArrayList<Behaviour> behaviours;
	
	public Saf(String name) {
		this.name = name;
		strengths =  new ArrayList<Strength>();
		behaviours = new ArrayList<Behaviour>();
	}

	public void addStrength(Strength n) {
		strengths.add(n);
	}

	public void addBehaviour(Behaviour n) {
		behaviours.add(n);
	}

	@Override
	public List<String> validate(List<String> messages) {
		boolean hasAlwaysRule = false;
		
		for(Strength s : strengths) {
			messages = s.validate(messages);
		}
		for(Behaviour b : behaviours) {
			messages = b.validate(messages);
			if (b.getCondition().getType() == ConditionAtom.Type.ALWAYS) {
				hasAlwaysRule = true;
			}
		}
		
		if (!hasAlwaysRule) {
			messages.add("Saf definition does not contain 'always rule'.");
		}
		return messages;
	}

	public String getName() {
		return name;
	}

	public int getStrength(Strength.Type type) {
		for(Strength s : strengths) {
			if (s.getType() == type) {
				return s.getValue();
			}
		}
		return Strength.DEFAULT_VALUE;
	}

	public double getWeight() {
		return (getStrength(Strength.Type.PUNCHPOWER) + getStrength(Strength.Type.KICKPOWER)) / 2;
	}

	public double getHeight() {
		return (getStrength(Strength.Type.PUNCHREACH) + getStrength(Strength.Type.KICKREACH)) / 2;
	}
	
	public int getSpeed() {
		return (int) Math.round( Math.abs(0.5 * (getHeight() - getWeight()) ));
	}
	
	public Behaviour getMatchingBehaviour(HashMap<Type, Boolean> conditions) {
		ArrayList<Behaviour> matchingBehaviours = new ArrayList<Behaviour>();
		for (Behaviour b : behaviours) {
			if (b.isMatching(conditions)) {
				matchingBehaviours.add(b);
			}
		}

		int random = new Random().nextInt(matchingBehaviours.size());
		return matchingBehaviours.get(random);
	}
}
