import org.antlr.runtime.tree.*;
import org.antlr.runtime.Token;

public class FDLAST extends CommonTree {
	public String text; 
	
	public FDLAST(Token t) {
		super(t);
		text = (t != null? t.getText(): "[]");
	}

//	public String toString() {
//		return text + super.toString();
//	}
}