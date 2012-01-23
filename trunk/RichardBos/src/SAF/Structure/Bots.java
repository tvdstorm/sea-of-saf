package SAF.Structure;

import java.util.ArrayList;

public class Bots implements SAFElement {
	public Bots()
	{ 
		this.bots = new ArrayList<Bot>();
	}
	
    public void accept(SAFElementVisitor visitor) throws Exception {
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
