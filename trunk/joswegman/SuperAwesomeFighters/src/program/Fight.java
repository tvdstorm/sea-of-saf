package program;

import grammar.Evaluators.*;


public class Fight {
	Bot botLeft, botRight;
	private int lifeLeft, lifeRight;
	private int positionLeft, positionRight;
	private String statusLeft, statusRight;
	
	
   
	public Fight(Bot botLeft, Bot botRight) {
		this.botLeft = botLeft;
		this.lifeLeft = 100;
		this.botRight = botRight;
		this.lifeRight =100;
		this.positionLeft = 10;
		this.positionRight = 90;
	}

	public int getPositionLeft() {
		return positionLeft;
	}

	public void setPositionLeft(int positionLeft) {
		this.positionLeft = positionLeft;
	}

	public int getPositionRight() {
		return positionRight;
	}

	public void setPositionRight(int positionRight) {
		this.positionRight = positionRight;
	}


	
	public int getLifeRight(){
		if (this.lifeRight > 0){
			return this.lifeRight;
		}else{
			return 0;
		}
	}
	
	public void setLifeRight(int value) {
		this.lifeRight = value;
	}
	
	public int getLifeLeft(){
		if (this.lifeLeft > 0){
			return this.lifeLeft;
		}else{
			return 0;
		}
	}
	
	public void setLifeLeft(int value) {
		this.lifeLeft = value;
	}
	
	
	public String getStatusLeft() {
		return statusLeft;
	}

	public void setStatusLeft(String statusLeft) {
		this.statusLeft = statusLeft;
	}

	public String getStatusRight() {
		return statusRight;
	}

	public void setStatusRight(String statusRight) {
		this.statusRight = statusRight;
	}

	
}
