package ast;

import java.util.ArrayList;

public class Saf implements Validator {
	private String name;
	private ArrayList<Strength> strengths;
	private ArrayList<Behaviour> behaviours;
	
	public Saf(String name) {
		this.setName(name);
		setStrengths(new ArrayList<Strength>());
		setBehaviours(new ArrayList<Behaviour>());
	}

	public void addStrength(Strength n) {
		getStrengths().add(n);
	}

	public void addBehaviour(Behaviour n) {
		getBehaviours().add(n);
	}

	@Override
	public boolean validate() {
		for(Strength s : getStrengths()) {
			if (!s.validate()) {
				return false;
			}
		}
		for(Behaviour b : getBehaviours()) {
			if (!b.validate()) {
				return false;
			}
		}
		return true;
	}

	public ArrayList<Strength> getStrengths() {
		return strengths;
	}

	public void setStrengths(ArrayList<Strength> strengths) {
		this.strengths = strengths;
	}

	public ArrayList<Behaviour> getBehaviours() {
		return behaviours;
	}

	public void setBehaviours(ArrayList<Behaviour> behaviours) {
		this.behaviours = behaviours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
