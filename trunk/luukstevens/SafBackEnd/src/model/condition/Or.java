package model.condition;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "orCondition")
public class Or extends Composite {

	@Override
	public boolean evaluate() {
		// TODO Auto-generated method stub
		return false;
	}
}
