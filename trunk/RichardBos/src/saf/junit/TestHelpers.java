package saf.junit;

import java.util.List;

public abstract class TestHelpers {
	public static String convertListToReadableString(List<?> listString)
	{
		String returnString= "";
		for (Object item : listString) {
			returnString += "\n" + item.toString();
		}	
		return returnString;
	}
}
