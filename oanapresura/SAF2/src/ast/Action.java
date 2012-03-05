package ast;

import constants.*;

public class Action implements CorrectValues{
		
	private Choice choice1,choice2;
	private int type;
	private int flag;
				
	public class Choice{
		
		private String choice;
		
		
		public Choice(String choice){			
			this.choice = choice;			
		}
		
		public void setChoice(String type){
			this.choice = type;
		}
		
		public String getChoiceType(){
			return this.choice;
		}
		
		public boolean isValid(int flag, String type){
			
			switch(flag){
			case CorrectValues.MOVE_TYPE:
				return (CorrectValues.moves.contains(type));
			case CorrectValues.ATTACK_TYPE:
				return (CorrectValues.attacks.contains(type));
			default:
				return true;
			}								
		}
		
		
	}

	
	public Action(String type){
				
		this.choice1 = new Choice(type);
		this.type = CorrectValues.SINGLE;
		
	}
	
	public Action(String type1, String type2){
		
		this.choice1 = new Choice(type1);
		this.choice2 = new Choice(type2);
		this.type = CorrectValues.CHOICE;
	}
	
	public Choice getChoice() {
		return choice1;
	}

	public void setChoice(Choice choice1) {
		this.choice1 = choice1;
	}

	public void setChoices(Choice choice1, Choice choice2){
		this.choice1 = choice1;
		this.choice2 = choice2;
	}
	
	public boolean isValid(){
		
		if (type == CorrectValues.SINGLE)
			return (choice1.isValid(flag, choice1.choice));
		else
			return (choice2.isValid(flag, choice2.choice)&&choice1.isValid(flag, choice1.choice));		
	}
	
	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

}
