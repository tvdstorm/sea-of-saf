package test;

import java.util.ArrayList;
import java.util.List;

public class SafList {

	private String type;
	private List<String> items = new ArrayList<String>();
	
	public SafList(String type, String[] items) {
		this.type = type;
		
		for (String item : items)
			this.items.add(item);
	} 
	
	public boolean inList(String item) {
		return items.contains(item);
	}
	
	public String getType() {
		return this.type;
	}
	
	public List<String> getItems() {
		return this.items;
	}
	
	public String getSuggestion(String item) {
		int min = item.length();
		String suggestion = "no suggestion";
				
		for (String listItem : items) {
			int ld = computeDistance(item, listItem);
			if (ld < min) {
				min = ld;
				suggestion = listItem;
			}
		}
		
		return suggestion;
	}
 
	/*
	 * Levenstein distance, for giving suggestions
	 * http://en.wikibooks.org/wiki/Algorithm_Implementation/Strings/Levenshtein_distance
	 */
	public static int computeDistance(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
 
		int[] costs = new int[s2.length() + 1];
		for (int i = 0; i <= s1.length(); i++) {
			int lastValue = i;
			
			for (int j = 0; j <= s2.length(); j++) {
				if (i == 0)
					costs[j] = j;
				else {
					if (j > 0) {
						int newValue = costs[j - 1];
						if (s1.charAt(i - 1) != s2.charAt(j - 1))
							newValue = Math.min(Math.min(newValue, lastValue), costs[j]) + 1;
						costs[j - 1] = lastValue;
						lastValue = newValue;
					}
				}
			}
			if (i > 0)
				costs[s2.length()] = lastValue;
		}
		return costs[s2.length()];
	}
}
 