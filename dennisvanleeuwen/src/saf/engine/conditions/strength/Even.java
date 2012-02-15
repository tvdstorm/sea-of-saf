//package saf.astelements.conditions.strength;
//
//import mvc.models.FighterModel;
//import saf.ISAFElementVisitor;
//import saf.astelements.conditions.StrengthCondition;;
//
//public class Even extends StrengthCondition{
//	@Override
//	public void accept(ISAFElementVisitor visitor){
//		visitor.visit(this);
//	}
//	
//	@Override
//	public Boolean isTrueInModel(FighterModel fighterModel1, FighterModel fighterModel2){
//		return calculateStrength(fighterModel1) == calculateStrength(fighterModel2);
//	}
//	
//	@Override
//	public String getElementName(){
//		return "even";
//	}
//}