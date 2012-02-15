//package saf.astelements.actions.move;
//
//import mvc.models.FighterModel;
//import saf.ISAFElementVisitor;
//import saf.astelements.actions.IMove;
//
//public class Crouch implements IMove{
//	@Override
//	public void accept(ISAFElementVisitor visitor){
//		visitor.visit(this);
//	}
//
//	@Override
//	public void applyActionOn(FighterModel curFighter, FighterModel enemyFighter) {
//		curFighter.setCrouching();		
//	}
//
//	@Override
//	public String getElementName(){
//		return "crouch";
//	}
//}