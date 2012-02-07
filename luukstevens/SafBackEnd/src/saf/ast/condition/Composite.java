package saf.ast.condition;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Composite extends Condition {

    @XmlElementRef
    private saf.ast.condition.Condition[] condition = new saf.ast.condition.Condition[2];

    public saf.ast.condition.Condition getFirstCondition() {
        return condition[0];
    }

    public void setFirstCondition(saf.ast.condition.Condition firstCondition) {
        condition[0] = firstCondition;
    }

    public saf.ast.condition.Condition getSecondCondition() {
        return condition[1];
    }

    public void setSecondCondition(saf.ast.condition.Condition secondCondition) {
        condition[1] = secondCondition;
    }
}
