package saf.ast;

//import org.antlr.runtime.tree.CommonTree;
import java.util.ArrayList;

public abstract class ASTNode {
    private ArrayList<ASTNode> children = new ArrayList<ASTNode>();
    private ASTNode parent = null;
    
    public abstract String getName() ;

    public abstract boolean accept() ;
    
    public int getChildCount() {
        return children.size();
    }
    
    public void addChild(ASTNode node) {
        children.add(node);
        node.parent = this;
    }
    
    public ASTNode getChild(int i) {
        return children.get(i);
    }
    
    public boolean hasChildren() {
        return !(children.isEmpty());
    }
    
    public String printTree() {
        return printTreeWithIndent(0);
    }
    
    private String printTreeWithIndent(int ind) {
        String result = "";
        for (int i = 0; i < ind; i++) {
            result += "--";
        }
        result += " " + this.getName() + "\n";
        
        // add children with 1 more tab
        for (ASTNode child : children) {
            result += child.printTreeWithIndent(ind + 1);
        }
        return result;
    }
}

