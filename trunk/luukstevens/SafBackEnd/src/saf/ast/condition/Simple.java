package saf.ast.condition;

import java.util.List;

import javax.xml.bind.annotation.*;

import saf.variable.IEnums;

@XmlRootElement(name = "simpleCondition")
public class Simple extends Condition implements IEnums {

    @XmlAttribute
    String value;
    
    public String getValue() {
    	return value;
    }
    
    @Override
	public boolean evaluate(List<IEnums.Condition> conditions) {
    	if(value == null) return false;
    	if(value.equals(IEnums.Condition.ALWAYS.getText())) return true;
  	
		for(IEnums.Condition condition : conditions) {
			if(condition.getText().equals(value)) return true;
		}
		
		return false;
	}
}
