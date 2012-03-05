package safcr.ast;

public interface Node {
	void accept(VisitorInterface v);
}
