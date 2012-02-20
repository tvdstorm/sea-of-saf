package ast;

public class Move {
	public String type;
	public String choice1;
	public String choice2;
	public boolean hasChoices;
	
	public Move(){
		this.type = new String();
		this.choice1 = new String();
		this.choice2 = new String();
	}
	
	public void setMove(String type){
		this.type = type;
		this.hasChoices = false;
		//System.out.println(this.type + " ");
	}
	public void setMoveChoices(String choice1, String choice2){		
		this.choice1 = choice1;
		this.choice2 = choice2;
		this.hasChoices = true;
		//System.out.println(choice1 + " " + choice2 + " ");
	}
	public Move getMove(){
		return this;
	}

	
}
