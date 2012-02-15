//package saf.astelements.conditions;
//
//import mvc.models.FighterModel;
//import saf.ISAFElementVisitor;
//import saf.astelements.ICondition;
//
//public class Always implements ICondition{
//	@Override
//	public void accept(ISAFElementVisitor visitor){
//		visitor.visit(this);
//	}
//	
//	@Override
//	public Boolean isTrueInModel(FighterModel fighterModel1, FighterModel fighterModel2){
//		return true;
//	}
//	
//	@Override
//	public String getElementName(){
//		return "always";
//	}
//}