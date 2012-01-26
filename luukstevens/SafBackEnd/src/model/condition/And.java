package model.condition;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "andCondition")
public class And extends Composite {

	@Override
	public boolean evaluate() {
		// TODO Auto-generated method stub
		return false;
	}
}
