package model.condition;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import model.ConditionType;

@XmlRootElement(name = "simpleCondition")
public class Simple extends Condition {

    @XmlAttribute
    String value;

    @Override
	public boolean evaluate(List<ConditionType> conditions) {
		for(ConditionType condition : conditions) {
			if(condition.getText().equals(value)) return true;
		}
		
		return false;
	}
}
