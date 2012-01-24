package SAF.Checker;

public interface SAFElement{
	void accept(SAFElementVisitor visitor) throws SAFValidationException;
}
