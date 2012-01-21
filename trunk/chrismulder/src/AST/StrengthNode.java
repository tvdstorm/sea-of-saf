package AST;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

public class StrengthNode extends PropertyNode {
	public StrengthNode(int i, Token t1, Token t2) {
		super(t1);

		setName(t1.getText());
		setValue(Integer.parseInt(t2.getText()));
		
		// TODO Auto-generated constructor stub
	}
	private String name;
	private int value;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString() {
		return getName() + ":" + getValue();
	}
	
    public StrengthNode(StrengthNode node) { super(node); }             // for dupNode
    public Tree dupNode() { return new StrengthNode(this); } // for dup'ing type
}
