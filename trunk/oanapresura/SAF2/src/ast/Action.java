package ast;

import visitor.FighterVisitor;
import constants.*;
//import visitor.*;

public class Action implements CorrectValues{
		
	public Choice choice1,choice2;
	//Single/Choice
	public int type;
	//Move/Attack
	public int flag;
				
	public class Choice{
		
		/* Name of choice - jump/stand/ ... */
		public String choiceName;
		/* Index in names list */
		public int choiceType;
		
		
		public int getChoiceType() {
			return choiceType;
		}

		public void setChoiceType(int choiceType) {
			this.choiceType = choiceType;
		}

		public Choice(String choiceName){			
			this.choiceName = choiceName;			
		}
		
		public void setChoiceName(String type){
			this.choiceName = type;
		}
		
		public String getChoiceName(){
			return this.choiceName;
		}
		
		public boolean isValid(int flag, String type){
			
			switch(flag){
			case CorrectValues.MOVE_TYPE:
				this.setChoiceType(CorrectValues.moves.indexOf(type));
				return (CorrectValues.moves.contains(type));
			case CorrectValues.ATTACK_TYPE:
				this.setChoiceType(CorrectValues.attacks.indexOf(type));
				return (CorrectValues.attacks.contains(type));
			default:
				return true;
			}								
		}
		
		public void accept(FighterVisitor v){
			v.visit(this);
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
			return (choice1.isValid(flag, choice1.choiceName));
		else
			return (choice2.isValid(flag, choice2.choiceName)&&choice1.isValid(flag, choice1.choiceName));		
	}
	
	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	public void accept(FighterVisitor v){
		v.visit(this);
	}
	
	public boolean isMove(){
		if (this.flag == CorrectValues.MOVE_TYPE)
			return true;
		return false;
	}
	
	public boolean isAttack(){
		if (this.flag == CorrectValues.ATTACK_TYPE)
			return true;
		return false;
	}
}
