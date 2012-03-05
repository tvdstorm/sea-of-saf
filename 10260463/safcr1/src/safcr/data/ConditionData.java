package safcr.data;

import java.util.ArrayList;
import java.util.List;

public class ConditionData {
	private List<String> condData;
	private String[] defaultConditions = {"stronger", "weaker", "much_stronger", "much_weaker", "even", "near", "far", "always"};
	
	public ConditionData(){
		condData = new ArrayList<String>();
		
		for(String s : defaultConditions){
			condData.add(s);
		}
	}
	
	public List<String> getConditons(){
		return condData;
	}
	
	public String getCondition(int botStrenght1, int botStrenght2){
		int diff = botStrenght1 - botStrenght2;
		
		if(diff > 0 && diff <= 10) return "stronger";
		else if(diff > 10) return "much_stronger";
		else if(diff < 0 && diff >= -10) return "weaker";
		else if(diff < -10) return "much_weaker";
		
		return "even";
	}
	
	public String getDistance(int distance){
		if(distance <= 200 && distance >= -200){
			return "near";
		}
		
		return "far";
	}
	
}
