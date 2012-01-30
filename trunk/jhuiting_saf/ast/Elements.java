package ast;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Elements implements Iterable<FighterNode> {

    private List<FighterNode> elements;

    public Elements(int n) {
        elements = new ArrayList<FighterNode>(n);
    }

    public Elements() {
        elements = new ArrayList<FighterNode>();
    }

    public void addElement(FighterNode el) {
        elements.add(el);
    }

    public int size() {
        return elements.size();
    }

    public Iterator<FighterNode> iterator() {
        return elements.iterator();
    }

    public void setElements(List<FighterNode> collection) {
        elements.clear();
        elements.addAll(collection);
    }
}
