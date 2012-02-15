//package saf.astelements.actions.move;
//
//import mvc.models.FighterModel;
//import saf.ISAFElementVisitor;
//import saf.astelements.actions.IMove;
//
//public class Jump implements IMove{
//	@Override
//	public void accept(ISAFElementVisitor visitor){
//		visitor.visit(this);
//	}
//
//	@Override
//	public void applyActionOn(FighterModel curFighter, FighterModel enemyFighter) {
//		curFighter.setJumping();
//	}
//	
//	@Override
//	public String getElementName(){
//		return "jump";
//	}
//}