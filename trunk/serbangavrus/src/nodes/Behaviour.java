package nodes;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

public class Behaviour extends SAFTree{
	public Behaviour(int id) {
		super((Token)new CommonToken(id, "Behaviour"));
	}
}
