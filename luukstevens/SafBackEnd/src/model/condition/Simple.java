package model.condition;

import java.util.List;

import javax.xml.bind.annotation.*;

import model.enums.ConditionType;

@XmlRootElement(name = "simpleCondition")
public class Simple extends Condition {

    @XmlAttribute
    String value;

    @Override
	public boolean evaluate(List<ConditionType> conditions) {
    	if(value.equals(ConditionType.ALWAYS.getText())) return true;
    	
		for(ConditionType condition : conditions) {
			if(condition.getText().equals(value)) return true;
		}
		
		return false;
	}
}
