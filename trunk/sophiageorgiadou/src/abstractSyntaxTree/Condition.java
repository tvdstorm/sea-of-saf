package abstractSyntaxTree;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import checker.Checker;
import enumCheckerTypes.*;

public class Condition extends Checker{
	
	private ArrayList<String> conditions;
	
	public Condition(){
		this.setConditions(new ArrayList<String>());
	}

	public ArrayList<String> getConditions() {
		return conditions;
	}

	public void setConditions(ArrayList<String> conditions) {
		this.conditions = conditions;
	}
	
	public String toString(){
		String temp="\nConditions: ";
		
		for(int i=0;i<this.conditions.size();i++){
			temp+=this.conditions.get(i)+",";
		}
		return temp;
	}
	
	@Override
	public boolean IsAValidWord() {
		try {
			for(int i=0;i<this.conditions.size();i++){
				if(this.conditions.get(i).toUpperCase().equals("OR") || this.conditions.get(i).toUpperCase().equals("AND"))
					continue;
				ValidConditionWord.valueOf(this.conditions.get(i).toUpperCase());
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null,"CHECKER ERROR: See console for details");
			System.out.println("CHECKER ERROR: A Condition word is not valid\nDetails: "+e.getMessage());
			System.exit(-1);
		}
		System.out.println("Checker status: SUCCEED");
		return true;
	}

}
