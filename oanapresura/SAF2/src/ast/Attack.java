package ast;

public class Attack {
	public String type;
	public String choice1;
	public String choice2;
	public boolean hasChoices;
	
	public Attack(){
		this.type = new String();
		this.choice1 = new String();
		this.choice2 = new String();
	}
	public void setAttack(String type){
		this.type = type;
		this.hasChoices = false;
		//System.out.println(this.type + " ");
	}
	public void setAttackChoices(String choice1, String choice2){
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.hasChoices = true;
		//System.out.println(this.choice1 + " " + this.choice2 + " ");
	}
	public Attack getAttack(){
		return this;
	}

	
	
}
