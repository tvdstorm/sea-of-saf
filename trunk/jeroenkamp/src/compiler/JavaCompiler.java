package compiler;

public class JavaCompiler implements SafVisitor{
	private StringBuffer m_variables;
	private StringBuffer m_Actions;
	
	private JavaCompiler(){}
	
	public static String getJavaCode(String packagename,String name, String saffile){
		JavaCompiler c=new JavaCompiler();
		return "";
	
	}
	
	
	@Override
	public void visit(Action a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ActionStatement st) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(BinCondition c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(ChooseAction a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void visit(Condition c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(IntValue i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SafObject o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(StringValue s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(VariableStatement st) {
		// TODO Auto-generated method stub
		
	}

}
