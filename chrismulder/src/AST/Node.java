package AST;

import java.util.ArrayList;

public abstract class Node {
	private ArrayList<Node> children;
	private String text;
	
	public ArrayList<Node> getChildren() {
		return children;
	}
	
	public void addChild(Node child) {
		children.add(child);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
