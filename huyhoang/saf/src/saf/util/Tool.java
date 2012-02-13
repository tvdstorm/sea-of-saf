package saf.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

import javax.lang.model.element.*;

import saf.ast.definition.Action;
import saf.interpreter.*;

public class Tool {
	public static ArrayList<Method> getAnnotatedMethods(Class aClass) {
		ArrayList<Method> result = new ArrayList<Method>();
		try {
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
	
	public static ArrayList<MethodAnnotation> getAnnotations(Class aClass) {
		ArrayList<MethodAnnotation> result = new ArrayList<MethodAnnotation>();
		for (Method method : getAnnotatedMethods(aClass)) {
			result.add(method.getAnnotation(MethodAnnotation.class));
		}
		return result;
	}
	
	public static ArrayList<String> getAnnotatedSafnamesFromClass(Class aClass, String keywordType) {
		ArrayList<String> result = new ArrayList<String>();
		
		for (Method method : getAnnotatedMethods(aClass)) {
			MethodAnnotation annotation = method.getAnnotation(MethodAnnotation.class);
			if (annotation.keywordType().equals(keywordType)) {
				result.add(annotation.safName());
			}
		}
		return result;
	}
}
