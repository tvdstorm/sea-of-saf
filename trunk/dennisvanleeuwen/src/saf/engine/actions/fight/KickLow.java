//package saf.astelements.actions.fight;
//
//import mvc.models.FighterModel;
//import mvc.models.FighterModel.Block;
//import saf.ISAFElementVisitor;
//
//public class KickLow extends AttackDoingHit{
//	@Override
//	public void accept(ISAFElementVisitor visitor){
//		visitor.visit(this);
//	}
//
//	@Override
//	public void applyActionOn(FighterModel curFighter, FighterModel enemyFighter) {
//		this.doAttackIfPossible(curFighter, 
//								enemyFighter, 
//								enemyFighter.getBlock() != Block.LOW, 
//								curFighter.getKickReach(),
//								curFighter.getKickPower());
//		curFighter.setFrontLegLow();		
//	}
//	
//	@Override
//	public String getElementName(){
//		return "kick_low";
//	}
//}