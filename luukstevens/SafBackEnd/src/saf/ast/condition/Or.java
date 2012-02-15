package saf.ast.condition;

import javax.xml.bind.annotation.XmlRootElement;

import saf.state.BotState;

@XmlRootElement(name = "orCondition")
public class Or extends Composite {

	@Override
	public boolean evaluate(BotState botState) {
		return this.getFirstCondition().evaluate(botState) || 
				this.getSecondCondition().evaluate(botState);
	}
}
