package saf.junit;

import java.util.List;

public abstract class TestHelpers {
	public static String convertToReadableString(List<String> listString)
	{
		String returnString= "";
		for (String str : listString) {
			returnString += "\n" + str;
		}	
		return returnString;
	}
	
	
}
