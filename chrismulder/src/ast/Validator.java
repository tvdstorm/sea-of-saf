package ast;

import java.util.List;

public interface Validator  {
	public List<String> validate(List<String> messages);
}
