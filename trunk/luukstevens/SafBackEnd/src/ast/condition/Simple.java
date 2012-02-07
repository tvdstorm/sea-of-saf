package ast.condition;

import java.util.List;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "simpleCondition")
public class Simple extends Condition {

    @XmlAttribute
    String value;
    
    public String getValue() {
    	return value;
    }
    
    @Override
	public boolean evaluate(List<enums.Condition> conditions) {
    	if(value == null) return false;
    	
    	if(value.equals(enums.Condition.ALWAYS.getText())) return true;
  	
		for(enums.Condition condition : conditions) {
			if(condition.getText().equals(value)) return true;
		}
		
		return false;
	}
}
