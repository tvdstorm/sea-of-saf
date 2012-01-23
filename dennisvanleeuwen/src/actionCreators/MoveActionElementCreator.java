package actionCreators;

import java.util.HashMap;
import java.util.Map;

import ast.IMoveActionElement;
/* TODO: Generics */
public class MoveActionElementCreator implements IActionElementCreator{
	private static MoveActionElementCreator instance;
	private Map<String, String> factoryMapStrings;
	
	public static MoveActionElementCreator getInstance(){
		if(instance == null)
			instance = new MoveActionElementCreator();
		return instance;
	}
	
	public void addFightElementFactory(String name, String className) throws Exception{
		try {
			if(IMoveActionElement.class.isAssignableFrom((Class.forName("IMoveActionElement")).getClass()))
				factoryMapStrings.put(name, className);
		} catch (ClassNotFoundException e) {
			throw new Exception("Unknown class: " + className);
		}
	}
	
	public IMoveActionElement createAction(String action) {
		try {
		    for (Map.Entry<String, String> entry : factoryMapStrings.entrySet()) {
		    	if(action == entry.getKey())
		    		return ((IMoveActionElement)(Class.forName(entry.getValue())).newInstance());
		    }
		} catch (Exception e) {
		}
	    return null;
	}

	private MoveActionElementCreator(){
		this.factoryMapStrings = new HashMap<String, String>(){{}};
	}
}