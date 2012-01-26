package model.condition;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlAccessType;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Composite extends Condition {

    @XmlElementRef
    private Condition[] condition = new Condition[2];

    public Condition getFirstCondition() {
        return condition[0];
    }

    public void setFirstCondition(Condition firstCondition) {
        condition[0] = firstCondition;
    }

    public Condition getSecondCondition() {
        return condition[1];
    }

    public void setSecondCondition(Condition secondCondition) {
        condition[1] = secondCondition;
    }
}
