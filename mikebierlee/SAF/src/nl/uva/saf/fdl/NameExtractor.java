package nl.uva.saf.fdl;

import nl.uva.saf.fdl.ast.Fighter;
import nl.uva.saf.fdl.ast.ITreeNode;

public class NameExtractor extends TreeVisitor {
	private String name;
	private final ITreeNode fighter;

	public NameExtractor(ITreeNode fighter) {
		this.fighter = fighter;
	}

	public String extract() {
		fighter.accept(this);
		return name;
	}

	@Override
	public void visit(Fighter node) {
		name = node.getName();
		super.visit(node);
	}

	public static String getName(ITreeNode fighter) {
		NameExtractor extractor = new NameExtractor(fighter);
		return extractor.extract();
	}
}
