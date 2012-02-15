//package saf.astelements.actions.fight;
//
//import mvc.models.FighterModel;
//import saf.ISAFElementVisitor;
//import saf.astelements.actions.IFight;
//
//public class BlockHigh implements IFight{
//	@Override
//	public void accept(ISAFElementVisitor visitor){
//		visitor.visit(this);
//	}
//
//	@Override
//	public void applyActionOn(FighterModel curFighter, FighterModel enemyFighter) {
//		curFighter.setBlockHigh();
//	}
//	
//	@Override
//	public String getElementName(){
//		return "block_high";
//	}
//}