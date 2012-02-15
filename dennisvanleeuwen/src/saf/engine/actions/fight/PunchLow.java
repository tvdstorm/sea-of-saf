//package saf.astelements.actions.fight;
//
//import mvc.models.FighterModel;
//import mvc.models.FighterModel.Block;
//import saf.ISAFElementVisitor;
//
//public class PunchLow extends AttackDoingHit{
//	@Override
//	public void accept(ISAFElementVisitor visitor){
//		visitor.visit(this);
//	}
//
//	@Override
//	public void applyActionOn(FighterModel curFighter, FighterModel enemyFighter) {
//		this.doAttackIfPossible(curFighter, 
//								enemyFighter, 
//								enemyFighter.getBlock() != Block.HIGH, 
//								curFighter.getPunchReach(),
//								curFighter.getPunchPower());
//		curFighter.setFrontArmLow();
//	}
//	
//	@Override
//	public String getElementName(){
//		return "punch_low";
//	}
//}