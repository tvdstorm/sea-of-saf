package nodes;

import org.antlr.runtime.*;

public class Fighter extends SAFTree
{
	public Fighter(int id, String name) {
		super((Token)new CommonToken(id, name));
	}	
}
