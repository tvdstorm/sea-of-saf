package model.condition;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "simpleCondition")
public class Simple extends Condition {
	String condition;

	@Override
	public boolean check() {
		// TODO Auto-generated method stub
		return false;
	}
}
