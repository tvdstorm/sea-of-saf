//package saf.astelements.actions.fight;
//
//import mvc.models.FighterModel;
//import saf.astelements.actions.IFight;
//
//public abstract class AttackDoingHit implements IFight{
//	public void doAttackIfPossible(FighterModel curFighter, FighterModel enemyFighter, Boolean condition, int reach, int power){
//		if(condition){
//			if(Math.abs(curFighter.getX() - enemyFighter.getX()) <= reach)
//				enemyFighter.setHealth(enemyFighter.getHealth() - (power));
//		}
//	}
//}