package fighter;

public interface ASTNode {

	void accept(Visitor visitor);
}
