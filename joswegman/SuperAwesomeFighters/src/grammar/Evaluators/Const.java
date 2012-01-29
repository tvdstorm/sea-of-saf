package grammar.Evaluators;

public class Const extends Condition {
	private final String name;

	public Const(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Const [name=" + name + "]";
	}
	

}
