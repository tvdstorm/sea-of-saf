package SAF.Structure;

import java.util.ArrayList;

public class Action implements SAFElement {
	public Action()
	{
		values = new ArrayList<String>();
	}
	public Action(String _value){
		values = new ArrayList<String>();
		values.add(_value);
	}
	
    public void accept(SAFElementVisitor visitor) throws Exception {
        visitor.visit(this);
    }
	
	private ArrayList<String> values;
	public ArrayList<String> getValues() {
		return values;
	}
	public void setValues(ArrayList<String> values) {
		this.values = values;
	}
}
