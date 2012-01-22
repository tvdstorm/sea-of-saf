package cb.saf.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;


import cb.saf.game.Behaviour;
import cb.saf.game.BehaviourRules.Attacks;
import cb.saf.game.BehaviourRules.Conditions;
import cb.saf.game.BehaviourRules.Moves;
import cb.saf.game.Characteristics;
import cb.saf.game.Fighter;

/**
 * @author Mpounta
 *
 */
public class FighterFactory {
	
	/**
	 * fields
	 */
	public Fighter fighter=null;
	private String name="NotInitialized";
	private Characteristics characteristics=new Characteristics();
	private List<Behaviour> behaviourList=new ArrayList<Behaviour>();
	private Behaviour behaviour;
	boolean inTree=false;
	boolean inBehaviourRule=false;
	boolean inCharacteristic=false;
	/**
	 * Constructor
	 * @param fighterTree
	 */
	public FighterFactory(CommonTree fighterTree){
		visitTree(fighterTree);
	}
	
	public Fighter getFighter(){
		return new Fighter(name,characteristics,behaviourList);
	}
	
	public void visitTree(CommonTree fighterTree){
		String pointing="";
		for(int i=0;i<fighterTree.getChildCount();i++){
			pointing=fighterTree.getChild(i).getText();
			System.out.println(pointing);
			if(inTree){
				this.name=name;
			}else if(inBehaviourRule){
				manageBehaviour(fighterTree.getChild(i-2).getText(),pointing,fighterTree.getChild(i+1).getText());
				inBehaviourRule=false;
			}else if(inCharacteristic){
				i++;
				manageCharacteristic(pointing,fighterTree.getChild(i).getText());
				inCharacteristic=false;
			}
			
		
		
		if(pointing.equals("{")){
			inTree=true;
		}else if(pointing.equals("}")){
			inTree=false;
		}else if(pointing.equals("[")){
			inBehaviourRule=true;
			behaviour=new Behaviour();
		}else if(pointing.equals("]")){
			inBehaviourRule=false;
		}
		}
	}

	private void manageCharacteristic(String pointing,String val) {
		int value=Integer.parseInt(val);
		if(pointing.equals("kickPower")){
			characteristics.setKickPower(value);
		}else if(pointing.equals("kickReach")){
			characteristics.setKickReach(value);
		}else if(pointing.equals("punchReach")){
			characteristics.setPunchReach(value);
		}else if(pointing.equals("punchPower")){
			characteristics.setPunchPower(value);
		}	
	}

	private void manageBehaviour(String condition, String move, String attack) {
		behaviour.setAttack(getAttackEnum(attack));
		behaviour.setMove(getMoveEnum(move));
		behaviour.setCondition(getConditionEnum(condition));
		behaviourList.add(behaviour);
		
	}

	private Conditions getConditionEnum(String condition) {
		if(condition.equals("stronger")){
			return Conditions.stronger;
		}else if(condition.equals("always")){
			return Conditions.always;
		}
		else if(condition.equals("even")){
			return Conditions.even;
		}
		else if(condition.equals("far")){
			return Conditions.far;
		}else if(condition.equals("much_stronger")){
			return Conditions.much_stronger;
		}
		else if(condition.equals("much_weaker")){
			return Conditions.much_weaker;
		}
		else if(condition.equals("near")){
			return Conditions.near;
		}
		else if(condition.equals("weaker")){
			return Conditions.weaker;
		}
		return null;

	}


	private Moves getMoveEnum(String move) {
		if(move.equals("crouch")){
			return Moves.crouch;
		}else if(move.equals("jump")){
			return Moves.jump;
		}
		else if(move.equals("run_away")){
			return Moves.run_away;
		}
		else if(move.equals("run_towards")){
			return Moves.run_towards;
		}else if(move.equals("stand")){
			return Moves.stand;
		}
		else if(move.equals("walk_away")){
			return Moves.walk_away;
		}
		else if(move.equals("walk_towards")){
			return Moves.walk_towards;
		}
		return null;
	}

	private Attacks getAttackEnum(String attack) {
		if(attack.equals("block_high")){
			return Attacks.block_high;
		}else if(attack.equals("block_low")){
			return Attacks.block_low;
		}
		else if(attack.equals("kick_high")){
			return Attacks.kick_high;
		}
		else if(attack.equals("kick_low")){
			return Attacks.kick_low;
		}else if(attack.equals("punch_high")){
			return Attacks.punch_high;
		}
		else if(attack.equals("punch_low")){
			return Attacks.punch_low;
		}
		return null;
	}
	
}
