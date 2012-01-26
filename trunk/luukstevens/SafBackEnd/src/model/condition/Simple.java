package model.condition;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "simpleCondition")
public class Simple extends Condition {

    @XmlAttribute
    String value;

	@Override
	public boolean evaluate() {
		// TODO Auto-generated method stub
		return false;
	}
}
