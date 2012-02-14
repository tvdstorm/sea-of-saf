//package saf;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class ISAFNodeFactory<T extends ISAFNode>{
//	private Map<String, String> factoryMapStrings;
//
//	public ISAFNodeFactory(){
//		this.factoryMapStrings = new HashMap<String, String>();
//	}
//	
//	public void addElementFactory(String name, String className) throws Exception{
//		//try {
//			//T obj = null; 
//			//String tempClassName = new String(T);
//			//if(T.isAssignableFrom((Class.forName(tempClassName).getClass())))
//				factoryMapStrings.put(name, className);
//		//} catch (ClassNotFoundException e) {
//		//	throw new Exception("Unknown class: " + e.getMessage());
//		//}
//	}
//	
//	public T create(String elementName){
//		T returnObj = null;
//		try {
////		    for (Map.Entry<String, String> entry : factoryMapStrings.entrySet()) {
////		    	if(elementName.equals(entry.getKey())){
////		    		returnObj = ((T)(Class.forName(entry.getValue())).newInstance());
////		    	}
////		    }
//			
//		for (Map.Entry<String, String> entry : factoryMapStrings.entrySet()) {
//			//Class theClass = Class.forName(entry.getValue());
//			//System.out.println(theClass);
//			//System.out.println(((T)theClass.newInstance()).getElementName());
//			//theClass.
//	    	if(elementName.equals(entry.getKey())){
//	    		returnObj = ((T)(Class.forName(entry.getValue())).newInstance());
//	    	}
//	    }
//		} catch (Exception e) {
//			returnObj = null;
//		}
//	    return returnObj;
//	}
//}