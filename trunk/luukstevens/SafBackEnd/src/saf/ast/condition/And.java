package saf.ast.condition;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import saf.variable.IEnums;

@XmlRootElement(name = "andCondition")
public class And extends Composite {
	
	@Override
	public boolean evaluate(List<Condition> conditions) {
		return this.getFirstCondition().evaluate(conditions) && 
				this.getSecondCondition().evaluate(conditions);
	}
}