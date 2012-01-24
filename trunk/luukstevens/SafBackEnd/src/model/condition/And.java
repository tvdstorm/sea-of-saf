package model.condition;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "andCondition")
public class And extends Composite {
	
	@Override
	public boolean check() {
		return getFirstCondition().check() && getSecondCondition().check();
	}
}
