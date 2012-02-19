package safcr.ast;

import java.util.List;

public interface Node {
	void addNode(Node n);
	List<String> getErrors();
	String toTreeString(String indent);
}
