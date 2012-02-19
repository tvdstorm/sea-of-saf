package abstractSyntaxTree;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class represents the behaviour attributes
 * @author Sofia
 *
 */
public class Behavior {

	private ArrayList<BehaviorRule> behaviorRules;
	ArrayList<String> validMoves;
	ArrayList<String> validAttacks;

	/**
	 * Constructor
	 */
	public Behavior() {
		setBehaviorRules(new ArrayList<BehaviorRule>());
	}

	/**
	 * Add rule to the list
	 * @param rule
	 */
	public void addRule(BehaviorRule rule) {
		this.getBehaviorRules().add(rule);
	}

	public String toString() {
		String temp = "";
		for (int i = 0; i < this.getBehaviorRules().size(); i++) {
			temp += this.getBehaviorRules().get(i) + ",";
		}
		return temp;
	}

	/**
	 * Calculate the valid moves and attacks
	 * @param nowCondition
	 */
	public void calculateActualMoves(String nowCondition) {
		String tempInput[] = nowCondition.split(" ");
		String powerCondition = tempInput[0];
		String locationCondition = tempInput[1];

		validMoves = new ArrayList<String>();
		validAttacks = new ArrayList<String>();

		int rand = 0;
		Random generator = new Random();
		boolean flag = false;
		int j = 0;

		String temp = "";
		for (int i = 0; i < getBehaviorRules().size(); i++) {
			temp = getBehaviorRules().get(i).getCondition().getConditions().get(0);
			while (j < getBehaviorRules().get(i).getCondition().getConditions()
					.size()) {
				if (temp.equals(powerCondition)
						|| temp.equals(locationCondition)) {
					if (j + 2 < getBehaviorRules().get(i).getCondition()
							.getConditions().size()) {
						if (getBehaviorRules().get(i).getCondition().getConditions()
								.get(j + 1).equals("and")) {
							if (getBehaviorRules().get(i).getCondition()
									.getConditions().get(j + 2)
									.equals(powerCondition)
									|| getBehaviorRules().get(i).getCondition()
											.getConditions().get(j + 2)
											.equals(locationCondition)) {
								flag = true;
								temp = getBehaviorRules().get(i).getCondition()
										.getConditions().get(j + 2);
								j = j + 2;
							} else {
								flag = false;
								break;
							}
						} else {
							flag = true;
							j = j + 2;
						}
					} else {
						flag = true;
						break;
					}
				} else {
					if (j + 2 < getBehaviorRules().get(i).getCondition()
							.getConditions().size()) {
						if (getBehaviorRules().get(i).getCondition().getConditions()
								.get(j + 1).equals("or")) {
							if (getBehaviorRules().get(i).getCondition()
									.getConditions().get(j + 2)
									.equals(powerCondition)
									|| getBehaviorRules().get(i).getCondition()
											.getConditions().get(j + 2)
											.equals(locationCondition)) {
								flag = true;
								temp = getBehaviorRules().get(i).getCondition()
										.getConditions().get(j + 2);
								j = j + 2;
							} else {
								flag = false;
								break;
							}
						} else {
							flag = false;
							break;
						}
					} else {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				if (getBehaviorRules().get(i).getMove().getMoves().size() == 1) {
					validMoves.add(getBehaviorRules().get(i).getMove().getMoves()
							.get(0));
					System.out.println("Move: "
							+ getBehaviorRules().get(i).getMove().getMoves().get(0));
				} else {
					rand = generator.nextInt(2);
					validMoves.add(getBehaviorRules().get(i).getMove().getMoves()
							.get(rand));
					System.out.println("Move: "
							+ getBehaviorRules().get(i).getMove().getMoves().get(rand));
				}
				if (getBehaviorRules().get(i).getAttack().getAttacks().size() == 1) {
					validAttacks.add(getBehaviorRules().get(i).getAttack()
							.getAttacks().get(0));
					System.out.println("Attack: "
							+ getBehaviorRules().get(i).getAttack().getAttacks()
									.get(0));
				} else {
					rand = generator.nextInt(2);
					validAttacks.add(getBehaviorRules().get(i).getAttack()
							.getAttacks().get(rand));
					System.out.println("Attack: "
							+ getBehaviorRules().get(i).getAttack().getAttacks()
									.get(rand));
				}
				flag = false;
			}
		}

		if (validMoves.size() == 0) {
			for (int i = 0; i < getBehaviorRules().size(); i++) {
				temp = getBehaviorRules().get(i).getCondition().getConditions()
						.get(0);
				while (j < getBehaviorRules().get(i).getCondition().getConditions()
						.size()) {
					if (temp.equals("always")) {
						if (getBehaviorRules().get(i).getMove().getMoves().size() == 1) {
							validMoves.add(getBehaviorRules().get(i).getMove()
									.getMoves().get(0));
						} else {
							rand = generator.nextInt(2);
							validMoves.add(getBehaviorRules().get(i).getMove()
									.getMoves().get(rand));
						}
						if (getBehaviorRules().get(i).getMove().getMoves().size() == 1) {
							validAttacks.add(getBehaviorRules().get(i).getAttack()
									.getAttacks().get(0));
						} else {
							rand = generator.nextInt(2);
							validAttacks.add(getBehaviorRules().get(i).getAttack()
									.getAttacks().get(rand));
						}
					}
					j++;
				}
			}
		}
	}

	public void printValidMoves() {
		for (int i = 0; i < this.validMoves.size(); i++) {
			System.out.println(this.validMoves.get(i));
		}
	}

	/**
	 * @return the behaviorRules
	 */
	public ArrayList<BehaviorRule> getBehaviorRules() {
		return behaviorRules;
	}

	/**
	 * @param behaviorRules the behaviorRules to set
	 */
	public void setBehaviorRules(ArrayList<BehaviorRule> behaviorRules) {
		this.behaviorRules = behaviorRules;
	}
}
/*
 * 
 * 
 * if (behaviorRules.get(i).getCondition().getConditions() .size() == 1) if
 * (behaviorRules.get(i).getMove().getMoves() .size() == 1) {
 * validMoves.add(behaviorRules.get(i).getMove() .getMoves().get(0)); } else {
 * rand = generator.nextInt(2); validMoves.add(behaviorRules.get(i).getMove()
 * .getMoves().get(rand)); }
 */
