
public class FighterVisitor implements FighterGrammarVisitor {

	@Override
	public Object visit(SimpleNode node, Object data) {
		System.out.println(node.value);
		System.out.println(node.jjtGetValue());
		System.out.println(data);
		System.out.println((Object)data);
		// TODO Auto-generated method stub
		return data;
	}
		
	@Override
	public Object visit(ASTFighterNode node, Object data) {
		System.out.println(node.value);
		System.out.println(node.jjtGetValue());
		System.out.println(data);
		System.out.println((Object)data);
	    data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public Object visit(ASTFighter node, Object data) {
	    data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public Object visit(ASTFighterPersonality node, Object data) {
	    data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public Object visit(ASTFighterCharactaristic node, Object data) {
	    data = node.childrenAccept(this, data);
		return data;
	}

	@Override
	public Object visit(ASTIdentifier node, Object data) {
	    data = node.childrenAccept(this, data);
		System.out.println(node.jjtGetValue());
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public Object visit(ASTAssignment node, Object data) {
	    data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public Object visit(ASTNumber node, Object data) {
	    data = node.childrenAccept(this, data);
		// TODO Auto-generated method stub
		return data;
	}

}
