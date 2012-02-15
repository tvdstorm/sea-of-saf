package fighter;

import fighter.checker.Visitor;

public interface ASTNode {

	void accept(Visitor visitor);
}
