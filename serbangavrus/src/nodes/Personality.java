package nodes;

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

public class Personality extends SAFTree{
	public Personality(int id) {
		super((Token)new CommonToken(id, "Personality"));
	}
}
