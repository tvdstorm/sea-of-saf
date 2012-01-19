package nl.uva.saf.fdl.ast;

import java.util.List;

public class Fighter extends TreeNode {
	private String name;
	private List<ITreeNode> attributes;
	
	public Fighter(String name, List<ITreeNode> attributes) {
		this.setName(name);
		this.setAttributes(attributes);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ITreeNode> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<ITreeNode> attributes) {
		this.attributes = attributes;
	}
	
	public void addAttribute(ITreeNode attribute) {
		if (attributes != null)
			attributes.add(attribute);
	}
}
