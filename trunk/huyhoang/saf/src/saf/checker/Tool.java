package saf.checker;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

import javax.lang.model.element.*;

import saf.ast.Function;
import Game.MethodAnnotation;

public class Tool {
	public static ArrayList<Method> getAnnotatedMethods(String className) {
		ArrayList<Method> result = new ArrayList<Method>();
		try {
			Class aClass = Class.forName(className);
			for (Method method : aClass.getMethods()) {
				MethodAnnotation annotation = method.getAnnotation(MethodAnnotation.class);
				if (annotation != null) {
					result.add(method);
				}
			}
		}
		catch (Exception ex) {
			return new ArrayList<Method>();
		}
		return result;
	}
	
	public static ArrayList<MethodAnnotation> getAnnotations(String className) {
		ArrayList<MethodAnnotation> result = new ArrayList<MethodAnnotation>();
		for (Method method : getAnnotatedMethods(className)) {
			result.add(method.getAnnotation(MethodAnnotation.class));
		}
		return result;
	}
	
	/**
	 * Returns a list of String. The list is created by using reflection to read the specified class
	 * and collect methods that are annotated to be saf functions.
	 * 
	 * @param className
	 * @return a list of of "SAF actions"
	 */
	public static ArrayList<String> getAnnotatedSafnamesFromClass(String className, String keywordType) {
		ArrayList<String> result = new ArrayList<String>();
		
		for (Method method : getAnnotatedMethods(className)) {
			MethodAnnotation annotation = method.getAnnotation(MethodAnnotation.class);
			if (annotation.keywordType().equals(keywordType)) {
				result.add(annotation.safName());
			}
		}
		return result;
	}
	
	/**
	 * Gets a list of MethodAnnotation objects if the safName and keywordType matches its argument counterpart.
	 * If the argument is null, then it is ignored.
	 * 
	 * @param safName
	 * @param keywordType
	 * @return
	 */
	/*public static ArrayList<MethodAnnotation> getAnnotation(String safName, String keywordType) {
		ArrayList<MethodAnnotation> result = new ArrayList<MethodAnnotation>();
		HashMap<Method, MethodAnnotation> annotatedMethods = getAnnotatedMethods("Game.FigherBot");
		for (Method key : annotatedMethods.keySet()) {
			MethodAnnotation annotation = annotatedMethods.get(key);
			boolean isMatch = true;
			if (safName != null) {
				isMatch = isMatch && safName.equals(annotation.safName());
			}
			if (keywordType != null) {
				isMatch = isMatch && keywordType.equals(annotation.keywordType());
			}
			if (isMatch) {
				result.add(annotation);
			}
		}
		return result;
	}*/
	
	/*public static boolean methodExistsInClass(String className, String annotatedSafname, String annotatedKeywordType) {
		ArrayList<String> listOfMethods = getAnnotatedSafnamesFromClass(className, annotatedKeywordType);
		return listOfMethods.indexOf(annotatedSafname) != -1;
	}*/
	
	public static void determineFunctionKeywordType(Function function) {
		for (MethodAnnotation key : getAnnotations("Game.FighterBot")) {
			if (key.safName().equals(function.getFunctionName())) {
				function.setKeywordType(key.keywordType());
			}
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
			Class c = Class.forName("Game.Bot");
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
