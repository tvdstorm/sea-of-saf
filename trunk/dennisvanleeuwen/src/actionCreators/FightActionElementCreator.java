package actionCreators;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ast.IActionElement;
import ast.IFightActionElement;
/* TODO: Generics */
public class FightActionElementCreator implements IActionElementCreator{
	private static FightActionElementCreator instance;
	private Map<String, String> factoryMapStrings;
	
	public static FightActionElementCreator getInstance(){
		if(instance == null)
			instance = new FightActionElementCreator();
		return instance;
	}
	
	public void addFightElementFactory(String name, String className) throws Exception{
		try {
			if(IFightActionElement.class.isAssignableFrom((Class.forName("IMoveActionElement")).getClass()))
				factoryMapStrings.put(name, className);
		} catch (ClassNotFoundException e) {
			throw new Exception("Unknown class: " + className);
		}
	}
	
	public IFightActionElement createAction(String action) {
		try {
		    for (Map.Entry<String, String> entry : factoryMapStrings.entrySet()) {
		    	System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		    	if(action == entry.getKey())
		    		return ((IFightActionElement)(Class.forName(entry.getValue())).newInstance());
		    }
		} catch (Exception e) {
		}
	    return null;// throw new Exception("Unknown element creation detected. " + action + " doesn't excists, so it won't be created.");
	}

	private FightActionElementCreator(){
		this.factoryMapStrings = new HashMap<String, String>(){{}};
	}
}