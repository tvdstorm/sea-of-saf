//package saf.astelements.actions.move;
//
//import mvc.models.FighterModel;
//import saf.ISAFElementVisitor;
//
//public class WalkTowards extends MoveDoingSteps{
//	@Override
//	public void accept(ISAFElementVisitor visitor){
//		visitor.visit(this);
//	}
//
//	@Override
//	public void applyActionOn(FighterModel curFighter, FighterModel enemyFighter) {
//		this.doMoveIfPossible(curFighter, enemyFighter, 1);
//	}
//	
//	@Override
//	public String getElementName(){
//		return "walk_towards";
//	}
//}