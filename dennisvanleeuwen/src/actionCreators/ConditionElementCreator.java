package actionCreators;

import java.util.HashMap;
import java.util.Map;

import ast.IConditionElement;

public class ConditionElementCreator{
	private static ConditionElementCreator instance;
	private Map<String, String> factoryMapStrings;
	
	public static ConditionElementCreator getInstance(){
		if(instance == null)
			instance = new ConditionElementCreator();
		return instance;
	}
	
	public void addElementFactory(String name, String className) throws Exception{
		try {
			if(IConditionElement.class.isAssignableFrom((Class.forName("IConditionElement")).getClass()))
				factoryMapStrings.put(name, className);
		} catch (ClassNotFoundException e) {
			throw new Exception("Unknown class: " + className);
		}
	}
	
	public IConditionElement createCondition(String condition){
		try {
		    for (Map.Entry<String, String> entry : factoryMapStrings.entrySet()) {
		    	if(condition == entry.getKey())
		    		return ((IConditionElement)(Class.forName(entry.getValue())).newInstance());
		    }
		} catch (Exception e) {
			return null;
		}
	    return null;
	}

	private ConditionElementCreator(){
		this.factoryMapStrings = new HashMap<String, String>(){{}};
	}
}