//package saf.astelements.actions.move;
//
//import mvc.models.FighterModel;
//import saf.astelements.actions.IMove;
//
//public abstract class MoveDoingSteps implements IMove{
//	protected void doMoveIfPossible(FighterModel curFighter, FighterModel enemyFighter, int distanceToMove){
//		if(Math.abs(curFighter.getX() - enemyFighter.getX()) >= Math.abs(distanceToMove + MINIMUM_DISTANCE_BETWEEN_FIGHTERS)){
//			if(curFighter.getX() > enemyFighter.getX()){
//				distanceToMove = -distanceToMove;
//			}
//			curFighter.setX(curFighter.getX() + distanceToMove);
//		}
//	}
//}