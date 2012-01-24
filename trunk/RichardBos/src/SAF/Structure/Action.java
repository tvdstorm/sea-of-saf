package SAF.Structure;

import java.util.ArrayList;

import SAF.Checker.SAFElement;
import SAF.Checker.SAFElementVisitor;
import SAF.Checker.SAFValidationException;

public class Action implements SAFElement {
	public Action()
	{
		values = new ArrayList<ActionType>();
	}
	public Action(ActionType _value){
		values = new ArrayList<ActionType>();
		values.add(_value);
	}
	
    public void accept(SAFElementVisitor visitor) throws SAFValidationException {
        visitor.visit(this);
    }
	
	private ArrayList<ActionType> values;
	public ArrayList<ActionType> getValues() {
		return values;
	}
	public void setValues(ArrayList<ActionType> values) {
		this.values = values;
	}
}
