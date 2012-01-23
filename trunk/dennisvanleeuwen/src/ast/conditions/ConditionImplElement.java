//package ast.conditions;
//
//import ast.IConditionElement;
//import saf.ISAFElementVisitor;
//
//
//public class ConditionImplElement implements IConditionElement{
//	private String name;
//	public ConditionImplElement(String name){
//		this.name = name;
//	}
//	
//	public String getName() {
//		return name;
//	}
//
//	@Override
//	public Boolean isConditionValid() {
//		return false;
//	}
//	
//	@Override
//	public void accept(ISAFElementVisitor visitor) {
//		visitor.visit(this);		
//	}
//}