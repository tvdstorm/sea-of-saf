package abstractSyntaxTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Behavior {

	private ArrayList<BehaviorRule> behaviorRules;
	ArrayList<String> validMoves;
	ArrayList<String> validAttacks;

	public static HashSet<String> union(HashSet<String> x, HashSet<String> y) {
		HashSet<String> t = new HashSet<String>(x);
		t.addAll(y);
		return t;
	}

	public static HashSet<String> intersection(HashSet<String> x,
			HashSet<String> y) {
		HashSet<String> t = new HashSet<String>(x);
		t.retainAll(y);
		return t;
	}

	public Behavior() {
		behaviorRules = new ArrayList<BehaviorRule>();
	}

	public void addRule(BehaviorRule rule) {
		this.behaviorRules.add(rule);
	}

	public String toString() {
		String temp = "";
		for (int i = 0; i < this.behaviorRules.size(); i++) {
			temp += this.behaviorRules.get(i) + ",";
		}
		return temp;
	}

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
		for (int i = 0; i < behaviorRules.size(); i++) {
			temp = behaviorRules.get(i).getCondition().getConditions().get(0);
			while (j < behaviorRules.get(i).getCondition().getConditions()
					.size()) {
				if (temp.equals(powerCondition)
						|| temp.equals(locationCondition)) {
					if (j + 2 < behaviorRules.get(i).getCondition()
							.getConditions().size()) {
						if (behaviorRules.get(i).getCondition().getConditions()
								.get(j + 1).equals("and")) {
							if (behaviorRules.get(i).getCondition()
									.getConditions().get(j + 2)
									.equals(powerCondition)
									|| behaviorRules.get(i).getCondition()
											.getConditions().get(j + 2)
											.equals(locationCondition)) {
								flag = true;
								temp = behaviorRules.get(i).getCondition()
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
					if (j + 2 < behaviorRules.get(i).getCondition()
							.getConditions().size()) {
						if (behaviorRules.get(i).getCondition().getConditions()
								.get(j + 1).equals("or")) {
							if (behaviorRules.get(i).getCondition()
									.getConditions().get(j + 2)
									.equals(powerCondition)
									|| behaviorRules.get(i).getCondition()
											.getConditions().get(j + 2)
											.equals(locationCondition)) {
								flag = true;
								temp = behaviorRules.get(i).getCondition()
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
				if (behaviorRules.get(i).getMove().getMoves().size() == 1) {
					validMoves.add(behaviorRules.get(i).getMove().getMoves()
							.get(0));
					System.out.println("Move: "
							+ behaviorRules.get(i).getMove().getMoves().get(0));
				} else {
					rand = generator.nextInt(2);
					validMoves.add(behaviorRules.get(i).getMove().getMoves()
							.get(rand));
					System.out.println("Move: "
							+ behaviorRules.get(i).getMove().getMoves().get(rand));
				}
				if (behaviorRules.get(i).getAttack().getAttacks().size() == 1) {
					validAttacks.add(behaviorRules.get(i).getAttack()
							.getAttacks().get(0));
					System.out.println("Attack: "
							+ behaviorRules.get(i).getAttack().getAttacks()
									.get(0));
				} else {
					rand = generator.nextInt(2);
					validAttacks.add(behaviorRules.get(i).getAttack()
							.getAttacks().get(rand));
					System.out.println("Attack: "
							+ behaviorRules.get(i).getAttack().getAttacks()
									.get(rand));
				}
				flag = false;
			}
		}

		if (validMoves.size() == 0) {
			for (int i = 0; i < behaviorRules.size(); i++) {
				temp = behaviorRules.get(i).getCondition().getConditions()
						.get(0);
				while (j < behaviorRules.get(i).getCondition().getConditions()
						.size()) {
					if (temp.equals("always")) {
						if (behaviorRules.get(i).getMove().getMoves().size() == 1) {
							validMoves.add(behaviorRules.get(i).getMove()
									.getMoves().get(0));
						} else {
							rand = generator.nextInt(2);
							validMoves.add(behaviorRules.get(i).getMove()
									.getMoves().get(rand));
						}
						if (behaviorRules.get(i).getMove().getMoves().size() == 1) {
							validAttacks.add(behaviorRules.get(i).getAttack()
									.getAttacks().get(0));
						} else {
							rand = generator.nextInt(2);
							validAttacks.add(behaviorRules.get(i).getAttack()
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
