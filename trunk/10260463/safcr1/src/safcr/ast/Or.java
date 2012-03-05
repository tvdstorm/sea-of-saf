package safcr.ast;

public class Or implements Node{
	private Node node1;
	private Node node2;
	
	public Or(Node n1, Node n2){
		node1 = n1;
		node2 = n2;
	}
	
	public Node getNode1(){
		return node1;
	}
	
	public Node getNode2(){
		return node2;
	}
	
	@Override
	public void accept(VisitorInterface v) {
		v.visit(this);	
	}
}
