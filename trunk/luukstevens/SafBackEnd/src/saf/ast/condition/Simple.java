package saf.ast.condition;

import javax.xml.bind.annotation.*;

import saf.state.BotState;
import saf.variable.Options;

@XmlRootElement(name = "simpleCondition")
public class Simple extends Condition implements Options {

    @XmlAttribute
    String value;
    
    public String getValue() {
    	return value;
    }
    
    @Override
	public boolean evaluate(BotState botState) {
    	assert(value != null): "Condition is null.";
    	
    	if(value.equals(Options.Condition.ALWAYS.getText())) return true;
  	
		for(Options.Condition condition : botState.getCurrentFightConditions()) {
			if(condition.getText().equals(value)) return true;
		}
		
		return false;
	}
}
