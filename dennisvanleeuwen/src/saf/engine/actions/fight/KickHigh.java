//package saf.astelements.actions.fight;
//
//import mvc.models.FighterModel.Block;
//import saf.ISAFElementVisitor;
//
//public class KickHigh extends AttackDoingHit{
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
//								curFighter.getKickReach(),
//								curFighter.getKickPower());
//		curFighter.setFrontLegHigh();
//	}
//	
//	@Override
//	public String getElementName(){
//		return "kick_high";
//	}
//}