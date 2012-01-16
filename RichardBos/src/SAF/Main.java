package SAF;
import Generated.*;
import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;


public class Main {
	public static void main(String args[]) throws Exception {
		SAFLexer lexer = new SAFLexer(new ANTLRFileStream("C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\src\\SAF\\test.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SAFParser parser = new SAFParser(tokens);
        
        
        parser.setTreeAdaptor(adaptor);
        SAFParser.bots_return ret = parser.bots();
        CommonTree tree = (CommonTree)ret.getTree();
        
        /*DOTTreeGenerator gen = new DOTTreeGenerator();
        StringTemplate st = gen.toDOT(tree);
        System.out.println(st);*/
        
        printTree(tree, 0);
    }
	
	public static void printTree(CommonTree tree, int indent) {
		
		if ( tree != null ) {
			
			StringBuffer sb = new StringBuffer(indent);
			for ( int i = 0; i < indent; i++ )
				sb = sb.append("   ");
			
			for ( int i = 0; i < tree.getChildCount(); i++ ) {
				System.out.println(sb.toString() + tree.getChild(i).toString());
				
				printTree((CommonTree)tree.getChild(i), indent+1);
			}
			
		}
		
	}
	
	static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
		public Object create(Token payload) {
			return new CommonTree(payload);
		}
	};
    
    public static void mmmain(String args[]) throws Exception {
		ExprLexer lexer = new  ExprLexer(new ANTLRFileStream("C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\src\\SAF\\test.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        
        
        parser.setTreeAdaptor(adaptor);
        ExprParser.prog_return ret = parser.prog();
        CommonTree tree = (CommonTree)ret.getTree();
        printTree(tree, 0);
    }
    public static void mmain(String args[]) throws Exception {
		HtmlDocLexer lex = new  HtmlDocLexer(new ANTLRFileStream("C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\src\\SAF\\test.txt"));
		TokenRewriteStream tokens = new TokenRewriteStream(lex);
		HtmlDocParser grammar = new HtmlDocParser(tokens);;

        grammar.setTreeAdaptor(adaptor);
		HtmlDocParser.html_doc_return ret = grammar.html_doc();
		CommonTree tree = (CommonTree)ret.getTree();
		printTree(tree, 0);
    }
    public static void __main(String[] args) throws Exception {
        Expr2Lexer lexer = new Expr2Lexer(new ANTLRFileStream("C:\\Users\\r.bos\\Dropbox\\EclipseWorkSpace\\SAF\\SuperAwesomeFighters\\src\\SAF\\test.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Expr2Parser parser = new Expr2Parser(tokens);
        Expr2Parser.prog_return r = parser.prog();

        // walk resulting tree
        CommonTree t = (CommonTree)r.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        Eval2 walker = new Eval2(nodes);
        walker.prog();
    }
}