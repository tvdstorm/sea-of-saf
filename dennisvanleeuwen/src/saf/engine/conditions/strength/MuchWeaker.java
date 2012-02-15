//package saf.astelements.conditions.strength;
//
//import mvc.models.FighterModel;
//import saf.ISAFElementVisitor;
//import saf.astelements.conditions.StrengthCondition;
//
//public class MuchWeaker extends StrengthCondition{
//	@Override
//	public void accept(ISAFElementVisitor visitor){
//		visitor.visit(this);
//	}
//	
//	@Override
//	public Boolean isTrueInModel(FighterModel fighterModel1, FighterModel fighterModel2){
//		return this.calculateStrength(fighterModel1) < this.calculateStrength(fighterModel2) - 3;
//	}
//	
//	@Override
//	public String getElementName(){
//		return "much_weaker";
//	}
//}