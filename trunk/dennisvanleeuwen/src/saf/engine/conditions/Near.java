//package saf.astelements.conditions;
//
//import mvc.models.FighterModel;
//import saf.ISAFElementVisitor;
//import saf.astelements.ICondition;
//
//public class Near implements ICondition{
//	@Override
//	public void accept(ISAFElementVisitor visitor) {
//		visitor.visit(this);
//	}
//	
//	@Override
//	public Boolean isTrueInModel(FighterModel fighterModel1, FighterModel fighterModel2){
//		return Math.abs(fighterModel1.getX() - fighterModel2.getX()) < 4;
//	}
//	
//	@Override
//	public String getElementName(){
//		return "near";
//	}
//}