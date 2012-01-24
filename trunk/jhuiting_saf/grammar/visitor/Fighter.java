package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Fighter implements Visitable {
    Options opt;

    /** Constructor. */
    public Fighter(Options o) {
        opt = o;
    }
    
    public Options getOptions()
    {
    	return opt;
    }

	public void accept(FighterVisitor v) {
        v.visit(this);
	}
	
	public static abstract class FighterElement implements Visitable {
        public abstract void accept(FighterVisitor v);
	}
	
	public static class Identifier extends FighterElement {
        public String id;

        /** Constructor. */
        public Identifier(String identifier) {
            id = identifier;
        }
        
        public void accept(FighterVisitor v) {
            v.visit(this);
        }
	}    
	
	public static class Personality extends FighterElement {
		public Fighter.Identifier id;
		public Fighter.Identifier value;
		
		
		public Personality(Fighter.Identifier identifier, Fighter.Identifier value)
		{	
			this.id = identifier;
			this.value = value;
		}
		
        public void accept(FighterVisitor v) {
            v.visit(this);
        }
        
        public String toString()
        {
        	return "Personality prop:" + id.toString() + "Personality val" + value.toString();
        }
	}
	
	public static class Characteristic extends FighterElement {
		
        public void accept(FighterVisitor v) {
            v.visit(this);
        }
		
	}
	
	public static class Options {
	    private List elements;
	
	    public Options(int n) {
	        elements = new ArrayList(n);
	    }
	
	    public Options() {
	        elements = new ArrayList();
	    }
	
	    public void addElement(FighterElement el) {
	        elements.add(el);
	    }
	
	    public int size() {
	        return elements.size();
	    }
	
	    public Iterator iterator() {
	        return elements.iterator();
	    }
	
	    public void setElements(List collection) {
	        elements.clear();
	        elements.addAll(collection);
	    }
	}
}