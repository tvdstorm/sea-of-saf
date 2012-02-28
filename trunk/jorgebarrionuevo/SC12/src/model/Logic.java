package model;

public abstract class Logic extends Condition{
	
	private final Condition leftSide;
	private final Condition rightSide;
	
	public Logic(Condition leftSide, Condition rightSide) {
		this.leftSide = leftSide;
		this.rightSide = rightSide;
	}
	
	public Condition getLeftOper() {
		return leftSide;
	}
	
	public Condition getRightOper() {
		return rightSide;
	}

}

