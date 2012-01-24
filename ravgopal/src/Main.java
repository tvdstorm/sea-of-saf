import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.StringTemplate;

import java.io.*;

public class Main {
	
	static final String fighterFile = "models/jackiechan.saf";
	static final String dotFile = "AST.dot";

	public static void main(String[] args) {
		try {
			ANTLRFileStream filestream = new ANTLRFileStream(fighterFile);
			SAFLexer lexer = new SAFLexer(filestream);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SAFParser grammar = new SAFParser(tokens);
			
			grammar.setTreeAdaptor(adaptor);
			SAFParser.fighter_return ret = grammar.fighter();
			CommonTree tree = (CommonTree) ret.getTree();
			
			DOTTreeGenerator gen = new DOTTreeGenerator();
			StringTemplate st = gen.toDOT(tree);
			saveDotGraph(dotFile, st.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RecognitionException re) {
			re.printStackTrace();
		}
	}
	
	static final TreeAdaptor adaptor = new CommonTreeAdaptor() {
		public Object create(Token payload) {
			return new CommonTree(payload);
		}
	};	
	
	public static void saveDotGraph(String file, String content) {
	    try {
	            FileWriter fstream = new FileWriter(file);
	            BufferedWriter out = new BufferedWriter(fstream);
	            out.write(content);
	            out.close();
	    } catch (IOException e) {
	            e.printStackTrace();
	    }
	}
	
}
