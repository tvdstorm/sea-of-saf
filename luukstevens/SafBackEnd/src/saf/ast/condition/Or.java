package saf.ast.condition;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import saf.enums.Condition;

@XmlRootElement(name = "orCondition")
public class Or extends Composite {

	@Override
	public boolean evaluate(List<Condition> conditions) {
		return this.getFirstCondition().evaluate(conditions) || 
				this.getSecondCondition().evaluate(conditions);
	}
}
