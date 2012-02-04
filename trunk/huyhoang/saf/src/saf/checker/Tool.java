package saf.checker;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.lang.model.element.*;

import saf.ast.Function;
import Game.MethodAnnotation;

public class Tool {
	/**
	 * Returns a list of String. The list is created by using reflection to read the specified class
	 * and collect methods that are annotated to be saf functions.
	 * 
	 * @param className
	 * @return a list of of "SAF actions"
	 */
	public static ArrayList<String> getSafFunctionsFromClass(String className, String keywordType) {
		ArrayList<String> result = new ArrayList<String>();
		
		try {
			Class c = Class.forName(className);
			for (Method method : c.getMethods()) {
				MethodAnnotation annotation = method.getAnnotation(MethodAnnotation.class);
				if (annotation != null && annotation.keywordType().equals(keywordType)) {
					result.add(annotation.safName());
				}
			}
			return result;
		}
		catch (Exception ex) {
			return new ArrayList<String>();
		}
	}
	
	/**
	 * Returns a list of "SAF fighter bot strength"-variable names.
	 * The list is created by using reflection to read the fields of the FighterBot class. 
	 * 
	 * @return a list of "SAF bot strength"
	 */
	public static ArrayList<String> fetchBotStrengths() {
		ArrayList<String> result = new ArrayList<String>();
		
		try {
			Class c = Class.forName("Game.FighterBot");
			Field fields[] = c.getFields();
			for ( Field field : fields ) {
				result.add(field.getName());
			}
			
			return result;
		}
		catch (Exception ex) {
			return new ArrayList<String>();
		}
	}
}
