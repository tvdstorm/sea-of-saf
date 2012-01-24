package model.condition;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "orCondition")
public class Or extends Composite {

	@Override
	public boolean check() {
		return getFirstCondition().check() || getSecondCondition().check();
	}
}
