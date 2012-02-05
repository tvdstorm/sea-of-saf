package visitor;

public interface SAFElement {
	void accept(SAFElementVisitor visitor) throws Exception;
}
