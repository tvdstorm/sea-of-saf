package safcr.ast;

public interface Node {
	void addNode(Node n);
	void accept(VisitorInterface v);
}
