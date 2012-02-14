package saf.ast.condition;

import java.util.List;

import javax.xml.bind.annotation.*;

import saf.variable.Options;

@XmlRootElement(name = "simpleCondition")
public class Simple extends Condition implements Options {

    @XmlAttribute
    String value;
    
    public String getValue() {
    	return value;
    }
    
    @Override
    //TODO: Logic to bot state
	public boolean evaluate(List<Options.Condition> conditions) {
    	assert(value != null): "Condition is null.";
    	
    	if(value.equals(Options.Condition.ALWAYS.getText())) return true;
  	
		for(Options.Condition condition : conditions) {
			if(condition.getText().equals(value)) return true;
		}
		
		return false;
	}
}
