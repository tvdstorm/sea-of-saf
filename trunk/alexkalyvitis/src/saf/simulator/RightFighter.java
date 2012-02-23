package saf.simulator;

import java.util.ArrayList;

import saf.ast.Fighter;
import saf.ast.base.BaseCondition;
import saf.ast.identifiers.Attacks;
import saf.simulator.base.BaseSimulationFighter;
import saf.simulator.enums.FighterStatus;

public class RightFighter extends BaseSimulationFighter {
	public RightFighter(Fighter f, int windowWidth, int fighterOffsetX, int windowHeight, int fighterOffsetY){
		this.fighter = f;
		this.health = FIGHTER_MAX_HEALTH;
		this.minX = windowWidth - fighterOffsetX;
		this.maxX = windowWidth / 2 + fighterOffsetX;
		this.currentX = this.minX;
		this.minY = fighterOffsetY;
		this.maxY = fighterOffsetY / 2;
		this.currentY = this.minY;
		this.status = FighterStatus.READY;
		this.applicableConditions = new ArrayList<BaseCondition>();
	}
	public boolean canMoveForward(){
		return this.currentX > this.maxX;
	}
	public boolean canMoveBackward(){
		return this.currentX < this.minX;
	}
	public void walkForward(){
		this.currentX -= (this.fighter.getSpeed() + 1) * WALK_MULTIPLIER;
	}
	public void runForward(){
		this.currentX -= (this.fighter.getSpeed() + 1) * RUN_MULTIPLIER;
	}
	public void walkBackward(){
		this.currentX += (this.fighter.getSpeed() + 1) * WALK_MULTIPLIER;
	}
	public void runBackward(){
		this.currentX += (this.fighter.getSpeed() + 1) * RUN_MULTIPLIER;
	}
	public int[][] getStandCoords(){
		int[][] coords = new int[5][];
		coords[0] = new int[] {0, 100, 50};
		coords[1] = new int[] {0, 150, 0, 250};
		coords[2] = new int[] {-50, 175, 50, 175};
		coords[3] = new int[] {-50, 300, 0, 250};
		coords[4] = new int[] {50, 300, 0, 250};
		return coords;
	}
	public int[][] getAttackCoords(){
		Attacks attack = this.getAttack();
		int[][] coords;
		
		switch(attack) {
		case PUNCH_LOW	:
			coords = new int[7][];
			coords[0] = new int[] {0,100,50};
			coords[1] = new int[] {0, 150, 0, 250};
			coords[2] = new int[] {25, 175, -75, 200};
			coords[3] = new int[] {25, 175, 25, 200};
			coords[4] = new int[] {25, 200, 0, 200};
			coords[5] = new int[] {50, 300, 0, 250};
			coords[6] = new int[] {-50, 300, 0, 250};
			return coords;
		case PUNCH_HIGH	: 
			coords = new int[7][];
			coords[0] = new int[] {0,100, 50};
			coords[1] = new int[] {0, 150, 0, 250};
			coords[2] = new int[] {25, 175, -75, 150};
			coords[3] = new int[] {25, 175, 25, 200};
			coords[4] = new int[] {25, 200, 0, 200};
			coords[5] = new int[] {50, 300, 0, 250};
			coords[6] = new int[] {-50, 300, 0, 2500};
			return coords;
		case KICK_LOW	: 
			coords = new int[6][];
			coords[0] = new int[] {0, 100, 50};
			coords[1] = new int[] {0, 150, 0, 250};
			coords[2] = new int[] {35, 175, -35, 175};
			coords[3] = new int[] {35, 250, -75, 250};
			coords[4] = new int[] {35, 250, 35, 275};
			coords[5] = new int[] {35, 275, 0, 275};
			return coords;
		case KICK_HIGH	: 
			coords = new int[6][];
			coords[0] = new int[] {0, 100, 50};
			coords[1] = new int[] {0, 150, 0, 250};
			coords[2] = new int[] {35, 175, -35, 175};
			coords[3] = new int[] {35, 275, -75, 200};
			coords[4] = new int[] {35, 275, 35, 300};
			coords[5] = new int[] {35, 300, 0, 275};
			return coords;
		case BLOCK_LOW	:
			coords = new int[8][];
			coords[0] = new int[] {0, 100, 50};
			coords[1] = new int[] {0, 150, 0, 250};
			coords[2] = new int[] {-50, 175, -50, 210};
			coords[3] = new int[] {25, 175, -50, 175};
			coords[4] = new int[] {25, 175, 25, 200};
			coords[5] = new int[] {25, 200, 0, 200};
			coords[6] = new int[] {50, 300, 0, 250};
			coords[7] = new int[] {-50, 300, 0, 250};
			return coords;
		case BLOCK_HIGH	: 
			coords = new int[8][];
			coords[0] = new int[] {0, 100, 50};
			coords[1] = new int[] {0, 150, 0, 250};
			coords[2] = new int[] {-50, 175, -50, 140};
			coords[3] = new int[] {25, 175, -50, 175};
			coords[4] = new int[] {25, 175, 25, 200};
			coords[5] = new int[] {25, 200, 0, 200};
			coords[6] = new int[] {50, 300, 0, 250};
			coords[7] = new int[] {-50, 300, 0, 250};
			return coords;
		default			: 
			coords = new int[5][];
			coords[0] = new int[] {0, 100, 50};
			coords[1] = new int[] {0, 150, 0, 250};
			coords[2] = new int[] {50, 175, -50, 175};
			coords[3] = new int[] {50, 300, 0, 250};
			coords[4] = new int[] {-50, 300, 0, 250};
			return coords;
		}
	}
}
