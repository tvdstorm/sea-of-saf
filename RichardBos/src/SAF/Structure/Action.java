package SAF.Structure;

import java.util.ArrayList;

public class Action {
	public Action()
	{
		values = new ArrayList<String>();
	}
	public Action(String _value){
		value = _value;
	}
	public String value;
	public ArrayList<String> values;
}
