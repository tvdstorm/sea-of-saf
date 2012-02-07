package ast.condition;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import enums.Condition;

@XmlRootElement(name = "andCondition")
public class And extends Composite {
	
	@Override
	public boolean evaluate(List<Condition> conditions) {
		return this.getFirstCondition().evaluate(conditions) && 
				this.getSecondCondition().evaluate(conditions);
	}
}