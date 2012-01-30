package model.condition;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import model.enums.ConditionType;

@XmlRootElement(name = "orCondition")
public class Or extends Composite {

	@Override
	public boolean evaluate(List<ConditionType> conditions) {
		return this.getFirstCondition().evaluate(conditions) || 
				this.getSecondCondition().evaluate(conditions);
	}
}
