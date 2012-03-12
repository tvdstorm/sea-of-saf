package saf.fight.validate;

public interface IConditionVisitable {
	boolean accept(IConditionVisitor visitor);
}
