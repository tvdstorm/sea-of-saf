package ast;

public class AttackChoice extends Choice implements Attack {
	public AttackChoice(AttackAtom c1, AttackAtom c2) {
		super(c1, c2);
	}
}
