package model.condition;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "simpleCondition")
public class Simple extends Condition {

    @XmlAttribute
    String value;

}
