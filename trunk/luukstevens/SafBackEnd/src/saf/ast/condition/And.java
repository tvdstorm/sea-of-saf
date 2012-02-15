package saf.ast.condition;

import javax.xml.bind.annotation.XmlRootElement;

import saf.state.BotState;

@XmlRootElement(name = "andCondition")
public class And extends Composite {
	
	@Override
	public boolean evaluate(BotState botState) {
		return this.getFirstCondition().evaluate(botState) && 
				this.getSecondCondition().evaluate(botState);
	}
}