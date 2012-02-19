package saf.utils;

import saf.ast.INodeVisitable;
import saf.ast.INodeVisitor;

public class Int implements INodeVisitable {

	private final Integer _value;

	private Int(Integer value){
		this._value = value;
	}
	
	@Override
	public void accept(INodeVisitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String GetTreeString() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getValue() {
		return _value;
	}


}
