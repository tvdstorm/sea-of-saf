package nodes;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class SAFTree extends CommonTree
{
	public SAFTree(Token token)
	{
		this.token = token;
	}
	
	public void consistencyCheck()
	{
		System.out.println(this.getChildren());
	}
}