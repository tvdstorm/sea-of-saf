package safcr.ast;

import safcr.check.*;

public class CheckVisitor implements VisitorInterface {
	Check c;
	
	public void setCheck(Check check){
		c = check;
	}
	
	@Override
	public void visit(Saf saf) {
		c.countCheck("bots",saf.getBots());
	}

	@Override
	public void visit(Bot bot) {
		c.setCurrentBot(bot.getName());
	}

	@Override
	public void visit(Personality pers) {
		c.checkCharacteristics(pers.getCharacteristic());
	}

	@Override
	public void visit(Characteristic chars) {
		c.checkCharacteristicValue(chars.getName(), chars.getValue());
	}

	@Override
	public void visit(Behaviour behave) {
		c.countCheck("rules", behave.getRules());
		
	}

	@Override
	public void visit(Rule rule) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Condition con) {
		// TODO Auto-generated method stub
		
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
