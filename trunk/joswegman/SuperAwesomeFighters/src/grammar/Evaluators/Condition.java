package grammar.Evaluators;

public class Condition implements Visitable {

	final public String left;
	final public Condition right;
	final public String type;

	public Condition(String left, Condition right, String type) {
		this.left = left;
		this.right = right;
		this.type = type;
	}

	public Condition() {
		this.left = "";
		this.right = null;
		this.type = "";
	}

	public String getLeft() {
		return this.left;
	}

	public Condition getRight() {
		return this.right;
	}

	public String getType() {
		return this.type;
	}

	@Override
	public String toString() {
		return "Condition [left=" + left + ", right=" + right + ", type="
				+ type + "]";
	}

	@Override
	public void accept(BotVisit visitor) {
		visitor.visit(this);
	}
}
