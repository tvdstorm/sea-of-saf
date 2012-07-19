package alert;

import java.util.ArrayList;

public class AlertProcessor {
	public boolean isErrorFound(ArrayList<Alert> alertFighter){
		boolean ret = false;
		Error error=new Error("");
		for (int i=0; i < alertFighter.size();i++){
			Alert alert = alertFighter.get(i);
			if(alert.getClass().isInstance(error)){
				System.out.println("Error found: "+alertFighter.get(i).getAlert());
				ret = true;
			}
			else{
				System.out.println("Warning found: "+alertFighter.get(i).getAlert());
				ret=false;
			}
		}
		return ret;
	}
}
