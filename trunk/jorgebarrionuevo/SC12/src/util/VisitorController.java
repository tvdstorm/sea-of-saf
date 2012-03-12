package util;

import java.util.ArrayList;

import model.Fighter;
import alert.Alert;
public class VisitorController {
	public ArrayList<Alert> checker(Fighter fighter) {
		TypeCheckingVisitor checker = new TypeCheckingVisitor();
		fighter.accept(checker);
		return checker.getAlerts();
	}	
}
