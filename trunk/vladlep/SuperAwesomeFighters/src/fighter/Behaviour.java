package fighter;

import java.util.ArrayList;
import java.util.List;

public class Behaviour {

	private List<Rule> rules;
	
	public Behaviour()
	{
		rules = new ArrayList<Rule>();
	}
	public List<Rule> getRules()
	{
		return rules;
	}
}
