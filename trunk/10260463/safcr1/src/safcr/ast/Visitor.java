package safcr.ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import safcr.check.*;
import safcr.controls.CrazyBot;

public class Visitor implements VisitorInterface {
	private Check c;
	private Map<String,CrazyBot> cbots = new HashMap<String,CrazyBot>();
	private List<String> botsName = new ArrayList<String>();
	private String currentBot = "";
	
	public void setCheck(Check check){
		c = check;
	}
	
	public Map<String,CrazyBot> getBots(){
		return cbots;
	}
	
	public List<String> getBotsName(){
		return botsName;
	}
	
	@Override
	public void visit(Saf saf) {
		c.countCheck("bots",saf.getBots());
		
		for(Node n : saf.getBots()){
			Bot b = (Bot) n;
			CrazyBot cb = new CrazyBot(b.getName());
			cbots.put(b.getName(), cb);
			botsName.add(b.getName());
		}
	}

	@Override
	public void visit(Bot bot) {
		c.setCurrentBot(bot.getName());
		currentBot = bot.getName();
	}

	@Override
	public void visit(Personality pers) {
		c.checkCharacteristics(pers.getCharacteristic());
	}

	@Override
	public void visit(Characteristic chars) {
		c.checkCharacteristicValue(chars.getName(), chars.getValue());
		cbots.get(currentBot).addCharacteristic(chars.getName(), chars.getValue());
	}

	@Override
	public void visit(Behaviour behave) {
		c.countCheck("rules", behave.getRules());
	}

	@Override
	public void visit(Rule rule) {
		cbots.get(currentBot).addRule(rule);
	}

	@Override
	public void visit(Condition con) {
		c.checkCondition(con.getType());
	}

	@Override
	public void visit(Action act) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ActionType actType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(MultiActionType multiActType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(And andStatement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Or orStatement) {
		// TODO Auto-generated method stub
		
	}

}
