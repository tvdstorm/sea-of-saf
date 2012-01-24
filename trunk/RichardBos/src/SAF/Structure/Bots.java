package SAF.Structure;

import java.util.ArrayList;

import SAF.Checker.SAFElement;
import SAF.Checker.SAFElementVisitor;
import SAF.Checker.SAFValidationException;

public class Bots implements SAFElement {
	public Bots()
	{ 
		this.bots = new ArrayList<Bot>();
	}
	
    public void accept(SAFElementVisitor visitor) throws SAFValidationException {
        visitor.visit(this);
    }
	
	private ArrayList<Bot> bots;
	public ArrayList<Bot> getBots() {
		return bots;
	}
	public void setBots(ArrayList<Bot> bots) {
		this.bots = bots;
	}
}
