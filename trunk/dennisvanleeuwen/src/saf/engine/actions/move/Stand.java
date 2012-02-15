//package saf.astelements.actions.move;
//
//import mvc.models.FighterModel;
//import saf.ISAFElementVisitor;
//import saf.astelements.actions.IMove;
//
//public class Stand implements IMove{
//	@Override
//	public void accept(ISAFElementVisitor visitor){
//		visitor.visit(this);
//	}
//
//	@Override
//	public void applyActionOn(FighterModel curFighter, FighterModel enemyFighter) {
//		//If you stand you're not supposed to do something, right?
//	}
//	
//	@Override
//	public String getElementName(){
//		return "stand";
//	}
//}