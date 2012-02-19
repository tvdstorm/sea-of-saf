/* Copyright (c) 2012 Mike Bierlee
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
 * and associated documentation files (the "Software"), to deal in the Software without restriction, 
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial 
 * portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. 
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package nl.uva.saf.fdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import nl.uva.saf.fdl.ast.Action;
import nl.uva.saf.fdl.ast.Behaviour;
import nl.uva.saf.fdl.ast.FightAction;
import nl.uva.saf.fdl.ast.FightChoice;
import nl.uva.saf.fdl.ast.ITreeNode;
import nl.uva.saf.fdl.ast.MoveAction;
import nl.uva.saf.fdl.ast.MoveChoice;
import nl.uva.saf.fdl.ast.Rule;
import nl.uva.saf.fdl.types.ConditionType;
import nl.uva.saf.fdl.types.FightActionType;
import nl.uva.saf.fdl.types.MoveActionType;
import nl.uva.saf.fdl.types.TypeTranslator;

public class ActionSelector extends TreeVisitor {
	private ITreeNode fighter;
	private MoveActionType moveAction;
	private FightActionType fightAction;
	private HashMap<ConditionType, Boolean> truthTable;
	private List<Behaviour> candidateBehaviours;
	private final Random numberGenerator;

	public ActionSelector(Random numberGenerator) {
		

		if (numberGenerator == null) {
			throw new IllegalArgumentException("numberGenerator");
		}

		
		this.numberGenerator = numberGenerator;
		moveAction = MoveActionType.unknown;
		fightAction = FightActionType.unknown;
		candidateBehaviours = new ArrayList<Behaviour>();
	}

	public void selectActions(ITreeNode fighterNode, HashMap<ConditionType, Boolean> truthTable) {
		if (fighterNode == null) {
			throw new IllegalArgumentException("fighterNode");
		}
		
		this.fighter = fighterNode;
		this.truthTable = truthTable;
		fighter.accept(this);

		if (candidateBehaviours.size() > 0) {
			int ruleSelection = numberGenerator.nextInt(candidateBehaviours.size());
			Behaviour selectedBehaviour = candidateBehaviours.get(ruleSelection);
			Rule selectedRule = selectedBehaviour.getRule();

			FightChoice fightChoice = selectedRule.getFightChoice();
			List<Action> fightActions = fightChoice.getActions();
			if (fightActions.size() > 0) {
				int fightActionSelection = numberGenerator.nextInt(fightActions.size());
				FightAction selectedFightAction = (FightAction) fightActions.get(fightActionSelection);
				fightAction = TypeTranslator.getFightActionType(selectedFightAction.getActionType());
			}

			MoveChoice moveChoice = selectedRule.getMoveChoice();
			List<Action> moveActions = moveChoice.getActions();
			if (moveActions.size() > 0) {
				int moveActionSelection = numberGenerator.nextInt(moveActions.size());
				MoveAction selectedMoveAction = (MoveAction) moveActions.get(moveActionSelection);
				moveAction = TypeTranslator.getMoveActionType(selectedMoveAction.getActionType());
			}
		}
	}

	public MoveActionType getMoveAction() {
		return moveAction;
	}

	public FightActionType getFightAction() {
		return fightAction;
	}

	@Override
	public void visit(Behaviour node) {
		ExpressionEvaluator evaluator = new ExpressionEvaluator(node.getCondition(), truthTable);

		if (evaluator.evaluate() == true) {
			candidateBehaviours.add(node);
		}
	}

	public void selectAlways(ITreeNode fighterNode) {
		HashMap<ConditionType, Boolean> truthTable = new HashMap<ConditionType, Boolean>();
		truthTable.put(ConditionType.always, true);
		selectActions(fighterNode, truthTable);
	}
}
