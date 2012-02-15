//package saf.astelements.conditions;
//
//import mvc.models.FighterModel;
//import saf.ISAFElementVisitor;
//import saf.astelements.ICondition;
//
//public class ANDConditionComposite extends ConnectiveConditionComposite{
//	public ANDConditionComposite(ICondition lhsCondition, ICondition rhsCondition){
//		super(lhsCondition, rhsCondition);
//	}
//	
//	@Override
//	public Boolean isTrueInModel(FighterModel fighterModel1, FighterModel fighterModel2){
//		return this.getLhsCondition().isTrueInModel(fighterModel1, fighterModel2) &&
//			   this.getRhsCondition().isTrueInModel(fighterModel1, fighterModel2);
//	}
//
//	@Override
//	public void accept(ISAFElementVisitor visitor){
//		visitor.visit(this);			
//	}
//	
//	@Override
//	public String getElementName(){
//		return "and";
//	}
//}