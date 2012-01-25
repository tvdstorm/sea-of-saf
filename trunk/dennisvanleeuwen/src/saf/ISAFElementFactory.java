package saf;

import java.util.HashMap;
import java.util.Map;

public class ISAFElementFactory<T extends ISAFElement>{
	private Map<String, String> factoryMapStrings;

	public ISAFElementFactory(){
		this.factoryMapStrings = new HashMap<String, String>();
	}
	
	public void addElementFactory(String name, String className) throws Exception{
		//try {
			//T obj = null; 
			//String tempClassName = new String(T);
			//if(T.isAssignableFrom((Class.forName(tempClassName).getClass())))
				factoryMapStrings.put(name, className);
		//} catch (ClassNotFoundException e) {
		//	throw new Exception("Unknown class: " + e.getMessage());
		//}
	}
	
	public T create(String elementName){
		try {
		    for (Map.Entry<String, String> entry : factoryMapStrings.entrySet()) {
		    	if(elementName.equals(entry.getKey())){
		    		return ((T)(Class.forName(entry.getValue())).newInstance());
		    	}
		    }
		} catch (Exception e) {
			return null;
		}
	    return null;
	}
}