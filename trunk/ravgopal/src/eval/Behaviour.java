package eval;

import java.util.ArrayList;
import java.util.List;

public class Behaviour {
	private final List<Rule> rules = new ArrayList<Rule>();
	
	public Behaviour(List<Rule> rules) {
		this.rules = rules;
	}
}
