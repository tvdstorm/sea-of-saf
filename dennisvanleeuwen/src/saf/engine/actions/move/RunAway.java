//package saf.astelements.actions.move;
//
//import mvc.models.FighterModel;
//import saf.ISAFElementVisitor;
//
//public class RunAway extends MoveDoingSteps{
//	@Override
//	public void accept(ISAFElementVisitor visitor){
//		visitor.visit(this);
//	}
//
//	@Override
//	public void applyActionOn(FighterModel curFighter, FighterModel enemyFighter) {
//		this.doMoveIfPossible(curFighter, enemyFighter, -2);
//	}
//	
//	@Override
//	public String getElementName(){
//		return "run_away";
//	}
//}