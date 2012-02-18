package safcr.ast;

public interface Node {
	void addNode(Node n);
	String toTreeString(String indent);
}
