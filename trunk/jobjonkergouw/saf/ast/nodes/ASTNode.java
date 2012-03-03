package saf.ast.nodes;

//import org.antlr.runtime.tree.CommonTree;
import java.util.ArrayList;
import saf.ast.*;

public abstract class ASTNode {
    private ArrayList<ASTNode> children = new ArrayList<ASTNode>();
    private ASTNode parent = null;
    
    public abstract String getName() ;

    public abstract void accept(Visitor visitor);
    
//     public void accept2(Visitor visitor) {
//         visitor.visit(this);
//     }

    
    public int childCount() {
        return children.size();
    }
    
    public void addChild(ASTNode node) {
        children.add(node);
        node.parent = this;
    }
    
    public ASTNode getChild(int i) {
        if (i >= children.size()) {
            throw new java.lang.IndexOutOfBoundsException();
        } else {
            return children.get(i);
        }
    }
    
    public boolean hasChildren() {
        return !(children.isEmpty());
    }
    
    public String printTree() {
        String result = printTreeWithIndent(0);
    
        // remove last line break
        if (result.length() > 1) {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }
    
    private String printTreeWithIndent(int ind) {
        String result = "";
        for (int i = 0; i < ind; i++) {
            result += "    ";
        }
        result += " " + this.getName() + "\n";
        
        // add children with 1 more tab
        for (ASTNode child : children) {
            result += child.printTreeWithIndent(ind + 1);
        }
        return result;
    }
}

